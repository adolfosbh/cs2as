package uk.ac.york.cs.cs2as.generator

import uk.ac.york.cs.cs2as.cs2as_dsl.Model
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef
import java.util.Map
import java.util.List
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef

class CS2ASDSL_To_OCLLookupVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	val String ALL_CHILDREN = "__all__children" 
	String lookupPck = "lookup"
	String lookupEnv = "LookupEnvironment"
	String targetPckName
	String sourcePckName
	String defaultNE;	// named element
	String defaultNEP;	// named element property
	Map<String, List<String>> element2qualifiers;
	Map<String, ScopeDef> feaName2scopes = newHashMap();
	Map<String, ExportDef> feaName2exports = newHashMap();
	
	/**
	 * default name referencer
	 */
	String defaultNR;	// name referencer
	
	/**
	 * default name referencer property
	 */
	String defaultNRP;
	
	/**
	 * default name qualifier
	 */
	String defaultNQ;
	
	/**
	 * default name qualifier property
	 */
	String defaultNQP;
		
	override caseModel(Model object) {
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.csDecl.doSwitch»
		«object.asDecl.doSwitch»
		import 'Lookup.ecore'
		
		''');
		
		
		sourcePckName = object.csDecl.metamodels.get(0).name; // FIXME this a temporal workaround
		targetPckName = object.asDecl.metamodels.get(0).name;
		element2qualifiers = computeQualifiers(object.nameresoSect)
		computeFeatName2Contribs(object.nameresoSect,feaName2scopes, feaName2exports);
		defaultNE = object.nameresoSect.namedElement.nameElement;
		defaultNEP = object.nameresoSect.namedElement.nameProperty.doSwitch;
		defaultNR = object.nameresoSect.nameReferencer.nameReferencer;
		defaultNRP = object.nameresoSect.nameReferencer.nameProperty.doSwitch;
		defaultNQ = object.nameresoSect.nameQualifier.nameQualifier;
		defaultNQP = object.nameresoSect.nameQualifier.segmentsProp.doSwitch;
		
		sb.append('''
		«commonLookupInfrastructure»
		
		package «targetPckName»
		
		«object.nameresoSect.doSwitch»
		
		context Visitable
		«object.nameresoSect.provideLookupMethods»
		
		
		endpackage
		''').toString
	}
		
	private def commonLookupInfrastructure() {
		
		'''
		package ocl
		---- Default Environment related functionality
		context OclElement
		--	
		def : env() : «lookupPck»::«lookupEnv» =
			_env(null)
		
		def : _env(child : OclElement) : «lookupPck»::«lookupEnv» =
			parentEnv()
			
		def : _exported_env(from : OclElement) : «lookupPck»::«lookupEnv» =
			«lookupPck»::«lookupEnv» { }
			
		def : parentEnv() : «lookupPck»::«lookupEnv» =
			let parent = oclContainer() in if parent = null then «lookupPck»::«lookupEnv» { } else parent._env(self) endif
		endpackage 
		
		package «lookupPck»
				
		context «lookupEnv»
		def : nestedEnv() : «lookupEnv» = 
			«lookupEnv» {
				parentEnv = self
			}
		
		def : addElementsOf(element : ocl::OclElement) : «lookupEnv» =
			let newEnv = element._env(null)
			in «lookupEnv» {
				namedElements = self.namedElements->including(newEnv.namedElements)
			}
		
		def : addElementsOf(elements : Collection(ocl::OclElement)) : «lookupEnv» =
			elements->iterate(element ; acc : «lookupEnv» = self 
				| acc.addElementsOf(element))
		
		endpackage
		''';
	}
	
	private def computeQualifiers(NameResolutionSect nrSect) {
		
		val Map<String, List<String>> result = newLinkedHashMap();
		for (nameResolution : nrSect.nameResolutions) {
			for (statemnt : nameResolution.statements) {
				if (statemnt instanceof NamedElementDef) {
					for (QualificationDef qDef :  statemnt.qualification) {
						val qualifiedElement = qDef.qualifiedClass.doSwitch;
						var qualifiers = result.get(qualifiedElement);
						if (qualifiers == null) {
							qualifiers = newArrayList();
							result.put(qualifiedElement, qualifiers);
						}
						qualifiers.add(nameResolution.class_.doSwitch);
					}
				}
			}
		}
		return result;
	}
	
	def private computeFeatName2Contribs(NameResolutionSect nrSect, Map<String,ScopeDef> scopes, Map<String,ExportDef> exports ) {
		
		for (nameReso : nrSect.nameResolutions) {
			val className = nameReso.class_.doSwitch;
			for (statmnt : nameReso.statements) {
				if (statmnt instanceof ScopeDef) {
					addStatement2Map(statmnt, scopes, statmnt.selectionDef, className)	
				} else if (statmnt instanceof ExportDef) {
					addStatement2Map(statmnt, exports, statmnt.selectionDef, className)
				}
			}
		}
	}
	
	def private <Def extends ClassNameResolutionStmnt> addStatement2Map (Def statmnt, Map<String, Def> result, SelectionDef selection, String className) {
		
		if (selection instanceof SelectionSpecific) {
			for (property : selection.selectedProperties) {
				result.put('''«className»::«property.doSwitch»''', statmnt);
			}
		} else {
			result.put('''«className»::«ALL_CHILDREN»''', statmnt);	
		}
	}	

	
	override caseNameResolutionSect(NameResolutionSect object) {
		
		'''
		«FOR nameResolution : object.nameResolutions»«nameResolution.doSwitch»«ENDFOR»
		''' 
	}
	
	override caseClassNameResolution(ClassNameResolution object) {
		val containsExports = ! object.statements.filter(ExportDef).empty;
		'''
			
		context «object.class_.doSwitch»
		«FOR statement : object.statements.filter(NamedElementDef)»«statement.doSwitch»«ENDFOR»
		«provideEnvMethod(object)»
		«IF containsExports»
		«provideExportedEnvMethod(object)»
		«provideExporterLookupMethod(object)»
		«ENDIF»
		'''
	}
		
	override caseNamedElementDef(NamedElementDef object) {
		val qualifications = object.qualification;
		if (qualifications == null) {
			return '';
		} else {
			val StringBuilder sb = new StringBuilder();
			val List<ElementsContribExp> qualificationConstribs = newArrayList(); 
			for (qualification : qualifications) {
				val className = qualification.qualifiedClass.doSwitch;
				val nClassName = className.normalizeString;
				val nameParam = className.toLowerCase.charAt(0) + "Name";
				sb.append('''
					
				def : _lookupQualified«nClassName»(«nameParam» : String) : «className»[?] =
					let found«nClassName» = _lookup«nClassName»(_qualified_env(), «nameParam»)
					in  if found«nClassName»->isEmpty()
						then null
						else found«nClassName»->first()
						endif
				«IF defaultNR!=null»«provideLookupByNameReferencerMethod(className, 'Qualified'+nClassName)»«ENDIF»
				''');
				qualificationConstribs.addAll(qualification.contribution);
			}

			if (! qualificationConstribs.empty) {
				sb.append('''
					
				def : _qualified_env() : «lookupPck»::«lookupEnv» =
					let env = «lookupPck»::«lookupEnv»{}
					in env
						«FOR contrib : qualificationConstribs»«contrib.doSwitch»
						«ENDFOR»
				''')	
			}	
			
			sb.toString;
		}
	}
	
	override caseElementsContribExp(ElementsContribExp object) {
		//val typeFilter = if (object.typeFilter == null) '' else '''->selectByKind(«object.typeFilter.doSwitch»)''' ; 
		if (object.isFollowing) {
			val scopeDef = object.eContainer.eContainer as ScopeDef;
			val property = (scopeDef.selectionDef as SelectionSpecific).selectedProperties.get(0); // FIXME I'm assuming too much
			val propertyName = property.doSwitch;
			'''.addElements(«object.expression.doSwitch»->select(x | self.«propertyName»->indexOf(x) < self.«propertyName»->indexOf(child)))'''
		} else {
			val exportEnvCall = if (object.isIsImported)  '._exported_env(self).namedElements' else '';
			'''.addElements(«object.expression.doSwitch»«exportEnvCall»)''';
		} 
	}
	
	override caseScopeDef(ScopeDef object) {
		val scope = if (object.emptyScope)
						'''
						let env = «lookupPck»::«lookupEnv»
						in env'''
					else {
						val openScope = if (object.sameScope) '' else '.nestedEnv()';
						 '''parentEnv()«openScope»'''
					}  
		 
		'''
			«scope»
				«object.contribution.doSwitch»
		''';
	}
	
	override caseExportDef(ExportDef object) {
		'''
		let env = «lookupPck»::«lookupEnv» {}
		in env
			«object.contribution.doSwitch»
		'''
	}
	
	override caseContributionDef(ContributionDef object) {
		'''
		«FOR contrib : object.contributions»«contrib.doSwitch»
		«ENDFOR»
		''';
	}
	
	def private provideLookupMethods(NameResolutionSect nameResoSect) {
		
		val StringBuilder sb = new StringBuilder;
		for (resolution : nameResoSect.nameResolutions) {
			for(statmt : resolution.statements) {
				val className = resolution.class_.doSwitch;
				val nClassName = className.normalizeString;
				val nameParam = className.toLowerCase.charAt(0) + "Name";
				if (statmt instanceof NamedElementDef) {	
					val nameProp = if (statmt.namePoperty != null) statmt.namePoperty.doSwitch else defaultNEP
					sb.append('''
					-- «nClassName» lookup
					def : _lookup«nClassName»(env : «lookupPck»::«lookupEnv», «nameParam» : String) : OrderedSet(«className») =
					let found«nClassName» = env.namedElements->selectByKind(«className»)->select(«nameProp» = «nameParam»)
					in  if found«nClassName»->isEmpty() and not (env.parentEnv = null)
						then _lookup«nClassName»(env.parentEnv, «nameParam»)
						else found«nClassName»
						endif
						
					-- Note: when calling this method, the source element of the argument passed to this method, will be the contextual 
					-- object on which error reports will be handled
					def : _lookup«nClassName»(«nameParam» : String) : «className»[?] =
					let found«nClassName» = _lookup«nClassName»(env(), «nameParam»)
					in  if found«nClassName»->isEmpty()
						then null
						else found«nClassName»->first() -- LookupVisitor will report ambiguous result
						endif
					«IF defaultNR!=null»«provideLookupByNameReferencerMethod(className, nClassName)»«ENDIF»
					
					«IF element2qualifiers.get(className) != null»«provideQualifiedLookupMethods(className, nClassName)»«ENDIF»
					''');
				} else if (statmt instanceof ExportDef) {
					val exportedClassName = statmt.exportedClass.doSwitch;
					val nExportedClassName = exportedClassName.normalizeString;
					sb.append('''
					-- «nClassName» exports «nExportedClassName»
						
					«IF defaultNR==null»
					def : lookup«nExportedClassName»From(exporter : «className» , «nameParam» : String) : «exportedClassName»[?] =
						exporter.lookupExported«nExportedClassName»(self, «nameParam»)
					«ELSE»
					def : lookup«nExportedClassName»From(exporter : «className», a«defaultNR» : «sourcePckName»::«defaultNR») : «exportedClassName»[?] =
						exporter.lookupExported«nExportedClassName»(self, a«defaultNR»)
					«ENDIF»
					
					«IF element2qualifiers.get(exportedClassName) != null»«provideQualifiedLookupFromMethods(exportedClassName, nExportedClassName, className)»«ENDIF»	
					''')
				}
			}
		}
		sb.toString;
	}
	
	def private provideLookupByNameReferencerMethod(String className, String nClassName) {
		'''
		def : lookup«nClassName»(a«defaultNR» : «sourcePckName»::«defaultNR») : «className»[?] =
		   _lookup«nClassName»(a«defaultNR».«defaultNRP»)
		   
		'''
	}
	
	def private provideQualifiedLookupMethods(String className, String nClassName) {
		val qualifierSegments = '''OrderedSet(«getElementReferenerType»)''';
		
		'''
		-- QN «className» lookup
		def : lookup«nClassName»(a«defaultNQ» : «sourcePckName»::«defaultNQ») : «className»[?] =
		   lookup«nClassName»(a«defaultNQ» .«defaultNQP»)

		def : lookup«nClassName»(segments : «qualifierSegments») : «className»[?] =
		   if segments->size() = 1
		   then lookup«nClassName»(segments->first())
		   else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),
		            qualifier = «provideQualfiersLookupQuery(element2qualifiers.get(className).clone)»
		        in qualifier?.lookupQualified«nClassName»(segments->last())
		   endif
		'''
	}
	
	def private String provideQualfiersLookupQuery(List<String> qualifiers) {
				
		val qualifier = qualifiers.get(0);
		val isQualifierQualified = element2qualifiers.get(qualifier) != null
		val qualifierLookup = '''lookup«qualifier»(qualifierSegments«IF ! isQualifierQualified»->first()«ENDIF»)'''
		if (qualifiers.size == 1) {
			qualifierLookup
		} else {
			val letVar = '''qualifier«qualifiers.size»'''
			'''
			let «letVar» = «qualifierLookup»
			in if «letVar» = null
			   then «provideQualfiersLookupQuery(qualifiers.subList(1,qualifiers.size))»
			   else «letVar»
			   endif
			'''
		}
	}
	
	def private String provideQualifiedLookupFromMethods(String className, String nClassName, String exporterClassName) {
		val qualifierSegments = '''OrderedSet(«getElementReferenerType»)''';
		
		'''
		def : lookup«nClassName»From(exporter : «exporterClassName», a«defaultNQ» : «sourcePckName»::«defaultNQ») : «className»[?] =
		   lookup«nClassName»From(exporter, a«defaultNQ».«defaultNQP»)

		def : lookup«nClassName»From(exporter : «exporterClassName», segments : «qualifierSegments») : «className»[?] =
		   if segments->size() = 1
		   then lookup«nClassName»From(exporter, segments->first())
		   else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),
		            qualifier = «provideQualfiersLookupQuery(element2qualifiers.get(className).clone)»
		        in qualifier?.lookupQualified«nClassName»(segments->last())
		   endif
		'''
		
		}
	def private String provideEnvMethod(ClassNameResolution nameReso) {
		
		var String allChildrenName = null;
		val List<String> featureNames = newArrayList();
		val className = nameReso.class_.doSwitch;
		for (statmnt : nameReso.statements.filter(typeof(ScopeDef))) {
			val propagation = statmnt.selectionDef;
			if (propagation instanceof SelectionSpecific) {
				for (property : propagation.selectedProperties) {
					featureNames.add('''«className»::«property.doSwitch»''');	
				}
			}
			if (propagation == null || propagation instanceof SelectionAll) {
				allChildrenName = '''«className»::«ALL_CHILDREN»''';
			}
		}
		'''
		def : _env(child : ocl::OclElement) : «lookupPck»::«lookupEnv» =
			«provideScopeContributionsQuery(featureNames, allChildrenName, nameReso)»
		''';
	}
	
	// FIXME refactor
	def private String provideExportedEnvMethod(ClassNameResolution nameReso) {
		
		var String allChildrenName = null;
		val List<String> featureNames = newArrayList();
		val className = nameReso.class_.doSwitch;
		for (statmnt : nameReso.statements.filter(typeof(ExportDef))) {
			val propagation = statmnt.selectionDef;
			if (propagation instanceof SelectionSpecific) {
				for (property : propagation.selectedProperties) {
					featureNames.add('''«className»::«property.doSwitch»''');	
				}
			}
			if (propagation == null || propagation instanceof SelectionAll) {
				allChildrenName = '''«className»::«ALL_CHILDREN»''';
			}
		}
		
		'''
		def : _exported_env(from : ocl::OclElement) : «lookupPck»::«lookupEnv» =
			«provideExportsContributionsQuery(featureNames, allChildrenName,nameReso)»
		'''
	}
	
	def private String provideScopeContributionsQuery(List<String> featureNames, String allChildrenName, ClassNameResolution nameReso) {
				
		val featuresSize = featureNames.size;
		
		
		if (featureNames.size == 0 ) {
			if (allChildrenName == null) {
				'''parentEnv()''';
			} else {
				val scopeDef = feaName2scopes.get(allChildrenName);
				val selectionDef =  scopeDef.selectionDef as SelectionAll;
				val exceptProps = if (selectionDef != null) selectionDef.exceptionProperties else null;
				if (selectionDef == null || exceptProps.isEmpty) {
					scopeDef.doSwitch;
				} else {
					'''
					if not («FOR exceptProp : exceptProps»«IF exceptProps.indexOf(exceptProp)>0»and «ENDIF»«exceptProp.doSwitch»->includes(child)
					   «ENDFOR»)
					then «scopeDef.doSwitch»
					else parentEnv()
					endif
					''';	
				}
			}
		} else {
			val featureName = featureNames.get(0);
			val scopeDef = feaName2scopes.get(featureName);
			val residualFeaNames = if (featureNames.size ==1) newArrayList() else featureNames.subList(1,featuresSize-1);
			'''
			if «featureName.split("::").get(1)»->includes(child)
			then «scopeDef.doSwitch»
			else «provideScopeContributionsQuery(residualFeaNames, allChildrenName, nameReso)»
			endif
			''';
		}
	}
	
	def private String provideExportsContributionsQuery(List<String> featureNames, String allChildrenName, ClassNameResolution nameReso) {
				
		// TODO include SelectionSpecific bits
		
		val allChildrenExpression = if (allChildrenName == null) {
				'''''';
			} else {
				feaName2exports.get(allChildrenName).doSwitch	
			}
		'''
		«allChildrenExpression»
		'''
	}
	
	// FIXME refactor
	def private String provideExporterLookupMethod(ClassNameResolution nameReso) {
		
		val exports = nameReso.statements.filter(ExportDef);
		if (exports.isEmpty) {
			return '';
		} else {
			val StringBuilder sb = new StringBuilder();
			for (export : exports) {
				val className = export.exportedClass.doSwitch;
				val nClassName = className.normalizeString;
				val nameParam = className.toLowerCase.charAt(0) + "Name";
				sb.append('''
					
				def : _lookupExported«nClassName»(from : ocl::OclElement, «nameParam» : String) : «className»[?] =
					let found«nClassName» = _lookup«nClassName»(_exported_env(from), «nameParam»)
					in  if found«nClassName»->isEmpty()
						then null
						else found«nClassName»->first()
						endif
						
				«IF defaultNR==null»
				def : lookupExported«nClassName»(from : ocl::OclElement, «nameParam» : String) : «nClassName»[?] =
					_lookupExported«nClassName»(from, nameParam»)
				«ELSE»
				def : lookupExported«nClassName»(from : ocl::OclElement, a«defaultNR» : «sourcePckName»::«defaultNR») : «nClassName»[?] =
					_lookupExported«nClassName»(from, a«defaultNR».«defaultNRP»)
				«ENDIF»		
				''');
			}
			sb.toString;	
		}
	}
	def private String getElementReferenerType() {
		'''«IF defaultNR==null»String«ELSE»«sourcePckName»::«defaultNR»«ENDIF»'''
	}
	
	
	def private normalizeString(String string) {
		string.replace("::", "_")
	}
	
}