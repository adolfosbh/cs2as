package uk.ac.york.cs.cs2as.generator

import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect
import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef

class CS2ASDSL_To_OCLMappingsVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	Map<String, MappingCreation[]> csElement2AmbiguousRules;	
	String baseFileName;
	
	new (String baseFileName) {
		this.baseFileName = baseFileName;
	}
	
	override caseCS2ASModel(CS2ASModel object) {
		// Some initial computations
		csElement2AmbiguousRules = csElementToAmbiguousRules(object.mappingSect, object.disambiguationSect);
		
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.source.doSwitch»
		«object.target.doSwitch»
		import '«baseFileName»Helpers.ocl'
		import '«baseFileName»Lookup.ocl'
		import '«baseFileName»Disambiguation.ocl'
		''');
		
		// FIXME this a temporal workaround
		sb.append('''
		package «object.source.metamodels.get(0).name»
		
		«object.mappingSect.doSwitch»
		endpackage
		''').toString
	}
	

	
	override caseMappingSect(MappingSect object) {
		val sb = new StringBuilder();
		
		for (classMap : object.mappings) {
			val csName = classMap.from.doSwitch;
			var shouldProcess = true;
			if (csElement2AmbiguousRules.containsKey(csName)) {
				if (csElement2AmbiguousRules.get(csName).get(0) != classMap) {
					shouldProcess = false;
				}
			}
			if (shouldProcess) {
				sb.append(classMap.doSwitch)	
			}
		}
		sb.toString;
	}
	
	def private CharSequence createAstOpDeclaration(MappingDef object) {
		val from = object.from.doSwitch;
		val to = object.to.doSwitch;
		// FIXME issue with disambiguation mappings: the to should be common supertype of all unambiguous created elements
		'''
		context «from»
		def : ast() : «to» =
		'''
	}
	
			
	override caseMappingCreation(MappingCreation object) {
		'''«object.createAstOpDeclaration»«object.createAstOpBody»
		'''
	}
	
	override caseMappingReference(MappingReference object) {
		'''«object.createAstOpDeclaration»«object.createAstOpBody»
		'''
	}
		
	def private CharSequence createAstOpBody(MappingCreation object) {
		val csName = object.from.doSwitch;
		if (csElement2AmbiguousRules.containsKey(csName)) {
			val ambiguousRules = csElement2AmbiguousRules.get(csName);
			val ambiguousMapIndex = ambiguousRules.indexOf(object);
			if (ambiguousMapIndex == ambiguousRules.size-1) {
				object.createAmbiguousCase(null);
			} else {
				object.createAmbiguousCase(ambiguousRules.get(ambiguousMapIndex+1));
			}
		} else {
			object.createNormalCase;
		} 
	}
	
	def private createNormalCase(MappingCreation object) {
		val to = object.to.doSwitch;
		val lastStmnt = object.properties.get(object.properties.size-1);
		'''
		«to» {
			«FOR stmnt : object.properties»«stmnt.doSwitch»«IF stmnt != lastStmnt»,«ENDIF» 
			«ENDFOR»
		}
		'''
	}
	
	def private createAmbiguousCase(MappingCreation object, MappingCreation nextAmbiguous) {
		val elseCase = if (nextAmbiguous==null) "invalid" else nextAmbiguous.createAstOpBody;
		'''
		if «object.rule»()
		then «createNormalCase(object)»
		else
			«elseCase»
		endif
		'''
	}

	def private CharSequence createAstOpBody(MappingReference object) {
		'''«object.expression.doSwitch»'''
	}
	override casePropertyDef(PropertyDef object) {
		'''«object.propRef» = «object.propInit.doSwitch»'''
	}
	
	def private Map<String, MappingCreation[]> csElementToAmbiguousRules(MappingSect mappingSect, DisambiguationSect disambSect) {
			
		// The disambiguation rules drive the order in which disambiguation takes place in the mapping section
		var csName2Map = new HashMap<String,Map<String,Integer>>();
		for (disambiguation : disambSect.disambiguations) {
			val csName = disambiguation.classRef.doSwitch
			val ruleName2PosMap = new HashMap<String,Integer>();
			csName2Map.put(csName,ruleName2PosMap);
			for (var i=0, val statements = disambiguation.rules; i < statements.size; i++) {
				val statement = statements.get(i);
				if (statement instanceof DisambiguationDef) {
					ruleName2PosMap.put(statement.name,i);
				}
			}
		}
		
		val result = new LinkedHashMap<String, MappingCreation[]>();
		for (classMap : mappingSect.mappings) {
			if (classMap instanceof MappingCreation) {
				val csName = classMap.from.doSwitch;
				val ruleName2PosMap = csName2Map.get(csName);
				if (ruleName2PosMap != null) {
					var mappings = result.get(csName);
					if (mappings == null) {
						mappings = newArrayOfSize(ruleName2PosMap.size);
						result.put(csName, mappings);
					}
					mappings.set(ruleName2PosMap.get(classMap.rule),classMap);
				}	
			}
		}
		return result;
			
	}
	

}