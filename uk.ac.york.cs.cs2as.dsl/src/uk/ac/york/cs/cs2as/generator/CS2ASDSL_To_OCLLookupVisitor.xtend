package uk.ac.york.cs.cs2as.generator

import java.util.List
import java.util.Map
import java.util.Set
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef
import uk.ac.york.cs.cs2as.cs2as_dsl.Model
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific
import uk.ac.york.cs.cs2as.cs2as_dsl.Target
import uk.ac.york.cs.cs2as.cs2as_dsl.Targets

class CS2ASDSL_To_OCLLookupVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	val String ALL_CHILDREN = "__all__children" 
	String lookupPck = "lookup"
	String lookupEnv = "LookupEnvironment"
	String targetPckName
	String sourcePckName
	String defaultNE;	// named element
	String defaultNEP;	// named element property
	Map<String, List<String>> element2qualifiers = newHashMap();
	Map<String, FilterDef> element2filter = newHashMap();
	Map<String, ScopeDef> feaName2scopes = newHashMap();
	Map<String, ExportDef> feaName2exports = newHashMap();
	Set<String> normalizedTargetElements = newHashSet();
	Set<String> normalizedExportedElements = newHashSet();
	Set<String> normalizedQualifiedElements = newHashSet();
	
	
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
		
	String baseFileName;
	
	new (String baseFileName) {
		this.baseFileName = baseFileName;
	}
	
	override caseModel(Model object) {
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.csDecl.doSwitch»
		«object.asDecl.doSwitch»
		import 'Lookup.ecore'
		import '«baseFileName»Helpers.ocl'
		
		''');
		
		
		sourcePckName = object.csDecl.metamodels.get(0).name; // FIXME this a temporal workaround
		targetPckName = object.asDecl.metamodels.get(0).name;
		val nameresoSect = object.nameresoSect;
		if (nameresoSect == null) {
			return sb.toString;
		}
		computeInitialMaps(object.nameresoSect);
		computeDefaults(object.nameresoSect);
		
		
		sb.append('''
		«commonLookupInfrastructure»
		
		package «targetPckName»
		
		«object.nameresoSect.doSwitch»		
		
		endpackage
		''').toString
	}
		
	private def commonLookupInfrastructure() {
		
		'''
		package ocl
		
		-- Domain specific default functionality
		context OclElement
		«commonEnvironmentOps»
		-- End of domain specific default functionality
		endpackage 
		
		package «lookupPck»
		-- Some common lookup functionality
		context «lookupEnv»
		def : nestedEnv() : «lookupEnv»[1] =
			«lookupEnv» {
				parentEnv = self
			}
		-- End of common lookup functionality
		endpackage
		''';
	}
	
	private def commonEnvironmentOps( ) {
		'''
		«FOR namedElement : normalizedTargetElements»
		def : unqualified_env_«namedElement»() : lookup::LookupEnvironment[1] =
			_unqualified_env_«namedElement»(null)
		«ENDFOR»
		
		«FOR namedElement : normalizedTargetElements»
		def : _unqualified_env_«namedElement»(child : OclElement) : lookup::LookupEnvironment[1] =
			parentEnv_«namedElement»()
		«ENDFOR»
		
		«FOR namedElement : normalizedTargetElements»
		def : parentEnv_«namedElement»() : lookup::LookupEnvironment[1] =
			let parent = oclContainer() in if parent = null then lookup::LookupEnvironment { } else parent._unqualified_env_«namedElement»(self) endif
		«ENDFOR»
		
		«FOR namedElement : normalizedExportedElements»
		def : _exported_env_«namedElement»(importer : OclElement) : «lookupPck»::«lookupEnv»[1] =
			«lookupPck»::«lookupEnv» { }
		«ENDFOR»
		
		«FOR namedElement : normalizedQualifiedElements»
		def : _qualified_env_«namedElement»(qualifier : OclElement) : «lookupPck»::«lookupEnv»[1] =
			«lookupPck»::«lookupEnv» { }
		«ENDFOR»
		'''
	}
	
	def private computeInitialMaps(NameResolutionSect nrSect) {
		val targetsDef = nrSect.targetsDef;
		if (targetsDef != null) {
			for (target : targetsDef.targets) {
				val className = target.classRef.className.doSwitch;
				val nClassName = className.normalizeString;
				normalizedTargetElements.add(nClassName);
				for ( qDef :  target.qualifications) {
					for (targetClass : qDef.targetsDef.classNames) {
						val qualifiedElement = targetClass.doSwitch;
						var qualifiers = element2qualifiers.get(qualifiedElement);
						if (qualifiers == null) {
							qualifiers = newArrayList();
							element2qualifiers.put(qualifiedElement, qualifiers);
						}
						qualifiers.add(className);
						normalizedQualifiedElements.add(qualifiedElement.normalizeString);
					}
					
				}
				element2filter.put(className, target.filter);
			}	
		}
		
		val providersDef = nrSect.providersDef;
		for (provider : providersDef.providers) {
			val className = provider.classRef.doSwitch;
			for (statemnt : provider.statements) {
				if (statemnt instanceof ScopeDef) {
					addStatement2Map(statemnt, feaName2scopes, statemnt.selectionDef, className)
				} else if (statemnt instanceof ExportDef) {
					for (pDefg : statemnt.provisionDefs) {
						for (targetClass : pDefg.targetsDef.classNames) {
							val exportedElement = targetClass.doSwitch;
							normalizedExportedElements.add(exportedElement.normalizeString);
						}
					}
					addStatement2Map(statemnt, feaName2exports, statemnt.selectionDef, className)
				}
			}
		}
	}
	
	def private computeDefaults(NameResolutionSect nameresoSect) {
		val namedElement = nameresoSect.targetsDef;
		if (namedElement != null) {
			for (target : namedElement.targets) {
				if (target.propRef != null) {
					defaultNE = target.classRef.doSwitch;
					defaultNEP = target.propRef.doSwitch;
				}	
			}
		}
		val nameRef = nameresoSect.inputsDef;
		if (nameRef != null) {
			var foundNR = false;
			var foundNQ = false;
			for (input : nameRef.inputs) { // FIXME so far just the first/one NR and NQ
				if (!foundNR && !input.qualifier) {
					defaultNR = input.classRef.doSwitch;
					defaultNRP = input.propRef.doSwitch;
					foundNR = true;		
				}
				if (!foundNQ && input.qualifier) {
					defaultNQ = input.classRef.doSwitch;
					defaultNQP = input.propRef.doSwitch;
					foundNQ = true;
				}
			}
		}
	}
	
	
	def private <Def extends ProviderStmnt> addStatement2Map (Def statmnt, Map<String, Def> result, SelectionDef selection, String className) {
		
		if (selection instanceof SelectionSpecific) {
			for (property : selection.selectedProperties) {
				result.put('''«className»::«property.doSwitch»''', statmnt);
			}
		} else {
			result.put('''«className»::«ALL_CHILDREN»''', statmnt);	
		}
	}
	
	override caseNameResolutionSect(NameResolutionSect object) {
		
		val sb = new StringBuilder();
		val targetsDef = object.targetsDef;
		if (targetsDef != null) {
			sb.append(targetsDef.doSwitch);
		}
		val providersDef = object.providersDef;
		if (providersDef != null) {
			sb.append(providersDef.doSwitch);
		}
		return sb.toString;
	}
	
	override caseTargets(Targets object) {
		'''
		«FOR target : object.targets»«target.doSwitch»«ENDFOR»
		'''
	}
	
	override caseTarget(Target object) {
		val sb = new StringBuilder();
		val qualificationDefs = object.qualifications;
		val filterDef = object.filter;
		// We generate the target-specific API
		if (! qualificationDefs.empty || filterDef != null) {
			sb.append(
				'''
					
				context «object.classRef.doSwitch»
				'''
			);
			
			for (qualification : qualificationDefs) {
				for (targetClass : qualification.targetsDef.classNames){
					val className = targetClass.doSwitch;
					val nClassName = className.normalizeString;
					val nameParam = className.toLowerCase.charAt(0) + "Name";
					val filter = element2filter.get(className);
					val filterParams = filter.optionalAddedParamsText;
					val filterArgs = filter.optionalAddedArgsText;
					sb.append('''
						
					def : _lookupQualified«nClassName»(«nameParam» : String«filterParams») : «className»[?] =
					   let found«nClassName» = _lookup«nClassName»(_qualified_env_«nClassName»(), «nameParam»«filterArgs»)
					   in  if found«nClassName»->isEmpty()
					      then null
					      else found«nClassName»->first()
					      endif
					def : _qualified_env_«nClassName»() : «lookupPck»::«lookupEnv» =
					   let env = «lookupPck»::«lookupEnv»{}
					   in env
					   «FOR contrib : qualification.contribution»«contrib.doSwitch»
						«ENDFOR»
					«IF defaultNR!=null»«provideLookupByNameReferencerMethod(className, '', 'Qualified'+nClassName, filterParams, filterArgs)»«ENDIF»
					''');
					//qualificationConstribs.addAll(qualification.contribution);	
				} 
			}
			if (filterDef != null) {
				val className = object.classRef.doSwitch;
				val nClassName = className.normalizeString;
				val filterParams = filterDef.paramsText;
				sb.append('''
				   
				def : «nClassName.filterOpName»(«filterParams») : Boolean =
				   «filterDef.expression.doSwitch»
				''')
			}
			sb.toString;
		}
		// We generate the general API to lookup the target
		val className = object.classRef.doSwitch;
		val nClassName = className.normalizeString;
		val nameParam = className.toLowerCase.charAt(0) + "Name";
		val nameProp = if (object.propRef != null) object.propRef.doSwitch else defaultNEP
		val filter = object.filter;
		val filterParams = filter.optionalAddedParamsText
		val filterArgs = filter.optionalAddedArgsText;
		sb.append('''
		context Visitable
		-- «nClassName» unqualified lookup
		def : _lookup«nClassName»(env : «lookupPck»::«lookupEnv», «nameParam» : String«filterParams») : OrderedSet(«className») =
		let found«nClassName» = env.namedElements->selectByKind(«className»)->select(«nameProp» = «nameParam»)
		                                         «IF filter!=null»->select(«nClassName.getFilterOpName»(«filter.argsText»))«ENDIF»
		in  if found«nClassName»->isEmpty() and not (env.parentEnv = null)
		   then _lookup«nClassName»(env.parentEnv, «nameParam»«filterArgs»)
		   else found«nClassName»
		   endif
		   
		-- Note: when calling this method, the source element of the argument passed to this method, will be the contextual 
		-- object on which error reports will be handled
		def : _lookupUnqualified«nClassName»(«nameParam» : String«filterParams») : «className»[?] =
		let found«nClassName» = _lookup«nClassName»(unqualified_env_«nClassName»(), «nameParam»«filterArgs»)
		in  if found«nClassName»->isEmpty()
		   then null
		   else found«nClassName»->first() -- LookupVisitor will report ambiguous result
		   endif
		   
		def : lookup«nClassName»(«nameParam» : String«filterParams») : «className»[?] =
		   _lookupUnqualified«nClassName»(«nameParam»«filterArgs»)
		«IF defaultNR!=null»«provideLookupByNameReferencerMethod(className, 'Unqualified', nClassName, filterParams, filterArgs)»«ENDIF»		
		-- End of «nClassName» unqualified lookup 
		   
		«IF element2qualifiers.get(className) != null»«provideQualifiedLookupMethods(className, nClassName, filterParams, filterArgs)»«ENDIF»
		''');
		sb.toString();
	}
	
	override caseProviders(Providers object) {
		'''
		«FOR provider : object.providers»«provider.doSwitch»«ENDFOR»
		'''
	}
	override caseProvider(Provider object) {
		val sb = new StringBuilder();
		val containsExports = ! object.statements.filter(ExportDef).empty;
		val containsScopes = ! object.statements.filter(ScopeDef).empty;
		// We generate the target-specific API
		if (containsExports || containsScopes) {
			sb.append(
			'''
			context «object.classRef.doSwitch»
			«IF containsScopes»
			«object.provideUnqualifiedEnvMethods»
			«ENDIF»
			«IF containsExports»
			«object.provideExportedEnvMethods»
			«object.provideExporterLookupMethod»
			«ENDIF»
			''');
		}
		// We generate the general API to lookupFrom a target
		if (containsExports) {
			sb.append(
				'''
				context Visitable
				«object.provideLookupFromMethods»
				'''
			);
		}
		return sb.toString;
	}
	
	override caseElementsContribExp(ElementsContribExp object) {
		//val typeFilter = if (object.typeFilter == null) '' else '''->selectByKind(«object.typeFilter.doSwitch»)''' ; 
		if (object.isIsPreceding) {
			val scopeDef = object.eContainer.eContainer.eContainer as ScopeDef;
			val property = (scopeDef.selectionDef as SelectionSpecific).selectedProperties.get(0); // FIXME I'm assuming too much
			val propertyName = property.doSwitch;
			'''.addElements(«object.expression.doSwitch»->select(x | self.«propertyName»->indexOf(x) < self.«propertyName»->indexOf(child)))'''
		} else {
			val exportEnvCall = if (object.isIsImported)  '._exported_env(self).namedElements' else '';
			'''.addElements(«object.expression.doSwitch»«exportEnvCall»)''';
		}
	}
	
	override caseProvisionDef(ProvisionDef object) {
		val sb = new StringBuilder();
		val occludingDefs = object.occludingDefs;
		for (var i = occludingDefs.size -1 ; i>=0; i--) {
			sb.append(occludingDefs.get(i).doSwitch);	
		}
		sb.append(object.contribution.doSwitch);
		sb.toString
	}
	
	override caseOccludingDef(OccludingDef object) {
		'''		
		«object.contribution.doSwitch»
		.nestedEnv()
		'''
	}
	
	override caseContributionDef(ContributionDef object) {
		'''
		«FOR contrib : object.contributions»«contrib.doSwitch»
		«ENDFOR»
		''';
	}
	
	override caseClassRef(ClassRef object) {
		return '''«object.className.doSwitch»'''
	}
	
	def private provideLookupFromMethods(Provider provider) {
		
		val StringBuilder sb = new StringBuilder;
		
		for(statmt : provider.statements) {
			val className = provider.classRef.doSwitch;
			val nClassName = className.normalizeString;
			val nameParam = className.toLowerCase.charAt(0) + "Name";
			if (statmt instanceof ExportDef) {
			for (providerDef : statmt.provisionDefs) {
					val exportedClassName = providerDef.targetsDef.classNames.get(0).doSwitch; // FIXME MANY target classes 
					val nExportedClassName = exportedClassName.normalizeString;
					val filter = element2filter.get(exportedClassName);
					val filterParams = filter.optionalAddedParamsText;
					val filterArgs = filter.optionalAddedArgsText;
					sb.append('''
					-- «nClassName» exports «nExportedClassName»
					   
					«IF defaultNR==null»
					def : lookup«nExportedClassName»From(exporter : «className» , «nameParam» : String«filterParams») : «exportedClassName»[?] =
					   exporter.lookupExported«nExportedClassName»(self, «nameParam»«filterArgs»)
					«ELSE»
					def : lookup«nExportedClassName»From(exporter : «className», a«defaultNR» : «sourcePckName»::«defaultNR»«filterParams») : «exportedClassName»[?] =
					   exporter.lookupExported«nExportedClassName»(self, a«defaultNR»«filterArgs»)
					«ENDIF»
					
					«IF element2qualifiers.get(exportedClassName) != null»«provideQualifiedLookupFromMethods(exportedClassName, nExportedClassName, className, filterParams, filterArgs)»«ENDIF»	
				''')	
				}
				
			}
		}
		sb.toString;
	}
	
	def private provideLookupByNameReferencerMethod(String className, String protocol, String nClassName, String filterParams, String filterArgs) {
		'''
		def : lookup«nClassName»(a«defaultNR» : «sourcePckName»::«defaultNR»«filterParams») : «className»[?] =
		   _lookup«protocol»«nClassName»(a«defaultNR».«defaultNRP»«filterArgs»)
		'''
	}
	
	def private provideQualifiedLookupMethods(String className, String nClassName, String filterParams, String filterArgs) {
		val qualifierSegments = '''OrderedSet(«getElementReferenerType»)''';
		
		'''
		-- «className» qualified-name lookup
		def : lookup«nClassName»(a«defaultNQ» : «sourcePckName»::«defaultNQ»«filterParams») : «className»[?] =
		   lookup«nClassName»(a«defaultNQ» .«defaultNQP»«filterArgs»)
		   
		def : lookup«nClassName»(segments : «qualifierSegments»«filterParams») : «className»[?] =
		   if segments->size() = 1
		   then lookup«nClassName»(segments->first()«filterArgs»)
		   else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),
		            qualifier = «provideQualfiersLookupQuery(element2qualifiers.get(className).clone)»
		        in qualifier?.lookupQualified«nClassName»(segments->last()«filterArgs»)
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
	
	def private String provideQualifiedLookupFromMethods(String className, String nClassName, String exporterClassName,
								String filterParms, String filterArgs) {
		val qualifierSegments = '''OrderedSet(«getElementReferenerType»)''';
		
		'''
		def : lookup«nClassName»From(exporter : «exporterClassName», a«defaultNQ» : «sourcePckName»::«defaultNQ»«filterParms») : «className»[?] =
		   lookup«nClassName»From(exporter, a«defaultNQ».«defaultNQP»«filterArgs»)

		def : lookup«nClassName»From(exporter : «exporterClassName», segments : «qualifierSegments»«filterParms») : «className»[?] =
		   if segments->size() = 1
		   then lookup«nClassName»From(exporter, segments->first()«filterArgs»)
		   else let qualifierSegments = segments->subOrderedSet(1,segments->size()-1),
		            qualifier = «provideQualfiersLookupQuery(element2qualifiers.get(className).clone)»
		        in qualifier?.lookupQualified«nClassName»(segments->last()«filterArgs»)
		   endif
		'''
		
		}
		
			
	def private String provideUnqualifiedEnvMethods(Provider provider) {

		val List<ProvisionDef> provisionDefs = newArrayList();
		for (statmnt : provider.statements.filter(ScopeDef)) {
			provisionDefs.addAll(statmnt.provisionDefs);
		}
		
		val sb = new StringBuilder
		val scopingClassName = provider.classRef.doSwitch
		val scopedClasses = computeTargetClasses(provisionDefs);
		for (scopedClassName : scopedClasses.keySet) {
			sb.append(provideUnqualifiedEnvMethod(scopingClassName, scopedClassName, scopedClasses.get(scopedClassName)))
		}
		sb.toString
	}

	
	def private String provideUnqualifiedEnvMethod(String scopingClassName, String scopedClassName, Set<ProvisionDef> provisionDefs) {
		
		var String allChildrenName = null;
		val List<String> featureNames = newArrayList();		
		for (provisionDef : provisionDefs) {
			val scopeDef = provisionDef.eContainer as ScopeDef
			val propagation = scopeDef.selectionDef;
			if (propagation instanceof SelectionSpecific) {
				for (property : propagation.selectedProperties) {
					featureNames.add('''«scopingClassName»::«property.doSwitch»''');	
				}
			}
			if (propagation == null || propagation instanceof SelectionAll) {
				allChildrenName = '''«scopingClassName»::«ALL_CHILDREN»''';
			}
			
		}
		
		'''
		def : _unqualified_env_«scopedClassName.normalizeString»(child : ocl::OclElement) : «lookupPck»::«lookupEnv» =
		   «provideScopeContributionsQuery(scopedClassName, featureNames, allChildrenName)»
		''';
	}
	
	// FIXME refactor
	def private String provideExportedEnvMethods(Provider provider) {
		
		val List<ProvisionDef> provisionDefs = newArrayList();
		for (statmnt : provider.statements.filter(ExportDef)) {
			provisionDefs.addAll(statmnt.provisionDefs);
		}
		
		val sb = new StringBuilder
		val exportingClassName = provider.classRef.doSwitch
		val exportedClasses = computeTargetClasses(provisionDefs);
		for (exportedClassName : exportedClasses.keySet) {
			sb.append(provideExportedEnvMethod(exportingClassName, exportedClassName, exportedClasses.get(exportedClassName)))
		}
		sb.toString
	}
	
	// FIXME refactor
	def private String provideExportedEnvMethod(String exportingClassName, String exportedClassName, Set<ProvisionDef> provisionDefs) {
		
		var String allChildrenName = null;
		val List<String> featureNames = newArrayList();
		for (provisionDef : provisionDefs) {
			val exportsDef = provisionDef.eContainer as ExportDef
			val propagation = exportsDef.selectionDef;
			if (propagation instanceof SelectionSpecific) {
				for (property : propagation.selectedProperties) {
					featureNames.add('''«exportingClassName»::«property.doSwitch»''');	
				}
			}
			if (propagation == null || propagation instanceof SelectionAll) {
				allChildrenName = '''«exportingClassName»::«ALL_CHILDREN»''';
			}
		}
		
		'''
		def : _exported_env_«exportedClassName.normalizeString»(importer : ocl::OclElement) : «lookupPck»::«lookupEnv» =
		   «provideExportsContributionsQuery(exportedClassName, featureNames, allChildrenName)»
		'''
	}
	
	def private String provideScopeContributionsQuery(String scopedClassName, List<String> featureNames, String allChildrenName) {
				
		val featuresSize = featureNames.size;
		
		
		if (featureNames.size == 0 ) {
			if (allChildrenName == null) {
				'''parentEnv_«scopedClassName»()''';
			} else {
				val scopeDef = feaName2scopes.get(allChildrenName);
				val selectionDef =  scopeDef.selectionDef as SelectionAll;
				val exceptProps = if (selectionDef != null) selectionDef.exceptionProperties else null;
				if (selectionDef == null || exceptProps.isEmpty) {
					provideScopeContributionsQuery(scopeDef, scopedClassName);
				} else {
					'''
					if not («FOR exceptProp : exceptProps»«IF exceptProps.indexOf(exceptProp)>0»and «ENDIF»«exceptProp.doSwitch»->includes(child)
					   «ENDFOR»)
					then «provideScopeContributionsQuery(scopeDef, scopedClassName)»
					else parentEnv_«scopedClassName»()
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
			then «provideScopeContributionsQuery(scopeDef, scopedClassName)»
			else «provideScopeContributionsQuery(scopedClassName, residualFeaNames, allChildrenName)»
			endif
			''';
		}
	}
	
	def private String provideScopeContributionsQuery (ScopeDef object, String scopedClassName) {
		 
		val scope = 
			if (object.emptyScope)
				'''
				let env = «lookupPck»::«lookupEnv» {}
				in env'''
			else {
				val openScope = if (object.sameScope) '' else '.nestedEnv()';
				 '''parentEnv_«scopedClassName»()«openScope»'''
			}  
		 
		'''
			«scope»
			   «object.provisionDefs.provideProvisionDefsContribution(scopedClassName)»
			   
		''';
	}
	
	def private String provideProvisionDefsContribution(List<ProvisionDef> provisionDefs , String targetClassName) {
		'''
		«FOR provisionDef : provisionDefs»«IF provisionDef.targetsDef.classNames.map(x|x.doSwitch).contains(targetClassName)»«provisionDef.doSwitch»«ENDIF»«ENDFOR»
		'''	
	}
	
	def private String provideExportsContributionsQuery(String exportedClassName, List<String> featureNames, String allChildrenName) {
				
		// TODO include SelectionSpecific bits
		
		val allChildrenExpression = 
			if (allChildrenName == null) {
				'''''';
			} else {
				feaName2exports.get(allChildrenName).provideExportContributionsQuery(exportedClassName)	
			}
		'''
		«allChildrenExpression»
		'''
	}
	
	def private String provideExportContributionsQuery (ExportDef object, String exportedClassName) {
		'''
		let env = «lookupPck»::«lookupEnv» {}
		in env
		   «object.provisionDefs.provideProvisionDefsContribution(exportedClassName)»
		
		''';
	}
	
	// FIXME refactor
	def private String provideExporterLookupMethod(Provider provider) {
		
		val exports = provider.statements.filter(ExportDef);
		if (exports.isEmpty) {
			return '';
		} else {
			val sb = new StringBuilder();
			for (provisionDef : exports.map(x|x.provisionDefs).flatten) {
				val className = provisionDef.targetsDef.classNames.get(0).doSwitch; // FIXME MANY targetClasses 
				val nClassName = className.normalizeString;
				val nameParam = className.toLowerCase.charAt(0) + "Name";
				val filter = element2filter.get(className);
				val filterParams = filter.optionalAddedParamsText;
				val filterArgs = filter.optionalAddedArgsText;
				sb.append('''
				   
				def : _lookupExported«nClassName»(importer : ocl::OclElement, «nameParam» : String«filterParams») : «className»[?] =
				   let found«nClassName» = _lookup«nClassName»(_exported_env_«nClassName»(importer), «nameParam»«filterArgs»)
				   in  if found«nClassName»->isEmpty()
				      then null
				      else found«nClassName»->first()
				      endif
				      
				«IF defaultNR==null»
				def : lookupExported«nClassName»(importer : ocl::OclElement, «nameParam» : String«filterParams») : «nClassName»[?] =
				   _lookupExported«nClassName»(importer, nameParam»«filterArgs»)
				«ELSE»
				def : lookupExported«nClassName»(importer : ocl::OclElement, a«defaultNR» : «sourcePckName»::«defaultNR»«filterParams») : «nClassName»[?] =
				   _lookupExported«nClassName»(importer, a«defaultNR».«defaultNRP»«filterArgs»)
				«ENDIF»		
				''');
			}
			sb.toString;	
		}
	}
	

	def private String getElementReferenerType() {
		'''«IF defaultNR==null»String«ELSE»«sourcePckName»::«defaultNR»«ENDIF»'''
	}
	
	def private String getFilterOpName(String filteredClassName) {
		'''_appliesFilter_«filteredClassName»'''
	}
	def private String getOptionalAddedParamsText(FilterDef filter) {
		if (filter == null) '' else	''', «filter.paramsText»'''
	}
	
	
	def private String getParamsText(/*@NonNull*/ FilterDef filter) {
		val params = filter.params;
		'''«FOR param: params»«IF params.indexOf(param)>0», «ENDIF»«param.doSwitch»«ENDFOR»'''
	}
	
	
	def private String getOptionalAddedArgsText(FilterDef filter) {
		if (filter == null) '' else ''', «filter.argsText»'''
	}
	
	def private String getArgsText(/*@NonNull*/ FilterDef filter) {
		val params = filter.params;
		'''«FOR param: params»«IF params.indexOf(param)>0», «ENDIF»«param.name»«ENDFOR»'''
	}
	
		
	def private Map<String, Set<ProvisionDef>> computeTargetClasses(List<ProvisionDef> provisionDefs) {
		val Map<String, Set<ProvisionDef>> targetClasses = newLinkedHashMap();
		for (provisionDef : provisionDefs) {
				for (targetClass : provisionDef.targetsDef.classNames){
					val targetClassName = targetClass.doSwitch
					var scopingDefs = targetClasses.get(targetClassName)
					if (scopingDefs == null) {
						scopingDefs = newLinkedHashSet();
						targetClasses.put(targetClassName, scopingDefs);
					}
					scopingDefs.add(provisionDef);
				}
			}
		return targetClasses;
	} 
	
	def private normalizeString(String string) {
		string.replace("::", "_")
	}
	
}