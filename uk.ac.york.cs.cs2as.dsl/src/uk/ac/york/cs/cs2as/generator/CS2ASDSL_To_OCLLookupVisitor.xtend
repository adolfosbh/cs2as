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
import uk.ac.york.cs.cs2as.cs2as_dsl.PropagationAll
import uk.ac.york.cs.cs2as.cs2as_dsl.PropagationSelective

class CS2ASDSL_To_OCLLookupVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	val String ALL_CHILDREN = "__all__children" 
	String lookupPck = "lookup"
	String lookupEnv = "LookupEnvironment"
	String targetPckName
	String sourcePckName
	String defaultNE;	// named element
	String defaultNEP;	// named element property
	Map<String, List<String>> element2qualifiers;
	Map<String, ScopeDef> feaName2contributions;
	
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
		feaName2contributions = computeFeatName2Contribs(object.nameresoSect);
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
	
	def private computeFeatName2Contribs(NameResolutionSect nrSect) {
		
		val Map<String,ScopeDef> result = newHashMap();
		for (nameReso : nrSect.nameResolutions) {
			val className = nameReso.class_.doSwitch;
			for (statmnt : nameReso.statements.filter(typeof(ScopeDef))) {
				val propagation =  statmnt.propagationDef;
				if (propagation instanceof PropagationSelective) {
					for (property : propagation.propagatingProperties) {
						result.put('''«className»::«property.doSwitch»''', statmnt);
					}
				} else {
					result.put('''«className»::«ALL_CHILDREN»''', statmnt);	
				}
			}
		}
		return result;
	}
	
	override caseNameResolutionSect(NameResolutionSect object) {
		
		'''
		«FOR nameResolution : object.nameResolutions»«nameResolution.doSwitch»«ENDFOR»
		''' 
	}
	
	override caseClassNameResolution(ClassNameResolution object) {
		val noScopeDef = object.statements.filter(typeof(ScopeDef)).empty
		'''
		context «object.class_.doSwitch»
		«FOR statement : object.statements.filter(NamedElementDef)»«statement.doSwitch»«ENDFOR»
		
		def : _env(child : ocl::OclElement) : «lookupPck»::«lookupEnv» =
			«IF noScopeDef»parentEnv()«ELSE»«provideEnvMethod(object)»«ENDIF»
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
					let found«nClassName» = _lookup«nClassName»(_qualification_env(), «nameParam»)
					in  if found«nClassName»->isEmpty()
						then null
						else found«nClassName»->first()
						endif
					
				«IF defaultNR!=null»«provideLookupByNameReferencerMethod(className, 'Qualified'+nClassName)»«ENDIF»
				''');
				qualificationConstribs.addAll(qualification.contribution);
			}
			
			sb.append('''
			def : _qualification_env() : «lookupPck»::«lookupEnv» =
					let env = «lookupPck»::«lookupEnv»{}
					in env
						«FOR contrib : qualificationConstribs»«contrib.doSwitch»
						«ENDFOR»
				
			''')
			sb.toString;
		}
	}
	
	override caseElementsContribExp(ElementsContribExp object) {
		val typeFilter = if (object.typeFilter == null) '' else '''->selectByKind(«object.typeFilter.doSwitch»)''' ; 
		if (object.isFollowing) {
			val scopeDef = object.eContainer as ScopeDef;
			val property = (scopeDef.propagationDef as PropagationSelective).propagatingProperties.get(0); // FIXME I'm assuming too much
			val propertyName = property.doSwitch;
			'''.addElements(«propertyName»->select(x | self.«propertyName»->indexOf(x) < self.«propertyName»->indexOf(child)))'''
		} else {
			'''.addElements(«object.expression.doSwitch»)«typeFilter»''';	
		}
		
	}
	
	override caseScopeDef(ScopeDef object) {
		val openScope = if (object.sameScope) '' else '.nestedEnv()'
		'''
			parentEnv()«openScope»
				«FOR contrib : object.contibution»«contrib.doSwitch»«ENDFOR»
		''';
	}
	
	override caseExportDef(ExportDef object) {
		'''
		-- Exports TODO
		''';
	}
	
	def private provideLookupMethods(NameResolutionSect nameResoSect) {
		
		val StringBuilder sb = new StringBuilder;
		for (resolution : nameResoSect.nameResolutions) {
			for(statmt : resolution.statements) {
				if (statmt instanceof NamedElementDef) {
					val className = resolution.class_.doSwitch;
					val nClassName = className.normalizeString;
					val nameParam = className.toLowerCase.charAt(0) + "Name";
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
					
					«IF element2qualifiers.get(className) != null»«provideQualifyingMethods(className, nClassName)»«ENDIF»
					''');
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
	def private provideQualifyingMethods(String className, String nClassName) {
		val qualifierSegments = '''OrderedSet(«getElementReferenerType»)''';
		
		'''
		-- QN «className» lookup
		def : lookup«nClassName»(a«defaultNQ» : «sourcePckName»::«defaultNQ») : «className»[?] =
		   lookup«nClassName»(a«defaultNQ» .«defaultNQP»)

		def : lookup«nClassName»(segments : «qualifierSegments») : «className»[?] =
		   if segments->size() = 1
		   then lookup«className»(segments->first())
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
			then «provideQualfiersLookupQuery(qualifiers.subList(1,qualifiers.size-1))» 
			else «letVar» 
			'''
		}
	}
	



	
	def private String provideEnvMethod(ClassNameResolution nameReso) {
		
		var String allChildrenName = null;
		val List<String> featureNames = newArrayList();
		
		val className = nameReso.class_.doSwitch;
		val i = 0;
		for (statmnt : nameReso.statements.filter(typeof(ScopeDef))) {
			val propagation = statmnt.propagationDef;
			if (propagation instanceof PropagationSelective) {
				for (property : propagation.propagatingProperties) {
					featureNames.add('''«className»::«property.doSwitch»''');	
				}
			}
			if (propagation == null || propagation instanceof PropagationAll) {
				allChildrenName = '''«className»::«ALL_CHILDREN»''';
			}
		}
	
		provideContributionsQuery(featureNames, allChildrenName, nameReso);
		
	}
	
	def private String provideContributionsQuery(List<String> featureNames, String allChildrenName, ClassNameResolution nameReso) {
				
		val featuresSize = featureNames.size;
		
		
		if (featureNames.size == 0 ) {
			if (allChildrenName == null) {
				'''parentEnv()''';
			} else {
				feaName2contributions.get(allChildrenName).doSwitch	
			}
		} else {
			val featureName = featureNames.get(0);
			val scopeDef = feaName2contributions.get(featureName);
			val residualFeaNames = if (featureNames.size ==1) newArrayList() else featureNames.subList(1,featuresSize-1);
			// TODO single/multiple containment feature
			'''
			if «featureName.split("::").get(1)»->includes(child)	 
			then «scopeDef.doSwitch»
			else «provideContributionsQuery(residualFeaNames, allChildrenName, nameReso)»
			endif
			''';
		}
	}
	
	def private String getElementReferenerType() {
		'''«IF defaultNR==null»String«ELSE»«sourcePckName»::«defaultNR»«ENDIF»'''
	}
	
	
	def private normalizeString(String string) {
		string.replace("::", "_")
	}
	
}