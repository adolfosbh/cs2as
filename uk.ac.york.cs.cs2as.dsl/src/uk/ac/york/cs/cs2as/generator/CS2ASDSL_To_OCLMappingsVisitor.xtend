package uk.ac.york.cs.cs2as.generator

import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect
import uk.ac.york.cs.cs2as.cs2as_dsl.Model
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap

class CS2ASDSL_To_OCLMappingsVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	Map<String, ClassMap[]> csElement2AmbiguousRules;	
	String baseFileName;
	
	new (String baseFileName) {
		this.baseFileName = baseFileName;
	}
	
	override caseModel(Model object) {
		// Some initial computations
		csElement2AmbiguousRules = csElementToAmbiguousRules(object.mappingSect, object.disambiguationSect);
		
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.csDecl.doSwitch»
		«object.asDecl.doSwitch»
		import '«baseFileName»Lookup.ocl'
		import '«baseFileName»Disambiguation.ocl'
		''');
		
		// FIXME this a temporal workaround
		sb.append('''
		package «object.csDecl.metamodels.get(0).name»
		
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
	
	override caseClassMap(ClassMap object) {
		val from = object.from.doSwitch;
		val to = object.to.doSwitch;
		
		// FIXME issue with disambiguation mappings: the to should be common supertype of all unambiguous createde elements
		'''
		context «from»
		def : ast() : «to» =
			«object.createClassMapContent»
			'''
	}

	def private CharSequence createClassMapContent(ClassMap object) {
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
	
	def private createNormalCase(ClassMap object) {
		val to = object.to.doSwitch;
		val lastStmnt = object.statements.get(object.statements.size-1);
		'''
		«to» {
			«FOR stmnt : object.statements»«stmnt.doSwitch»«IF stmnt != lastStmnt»,«ENDIF» 
			«ENDFOR»
		}
		'''
	}
	
	def private createAmbiguousCase(ClassMap object, ClassMap nextAmbiguous) {
		val elseCase = if (nextAmbiguous==null) "invalid" else nextAmbiguous.createClassMapContent;
		'''
		if «object.rule»()
		then «createNormalCase(object)»
		else
			«elseCase»
		endif
		'''
	}
		
	override casePropertyMap(PropertyMap object) {
		'''«object.propName» = «object.propInit.doSwitch»'''
	}
	
	def private Map<String, ClassMap[]> csElementToAmbiguousRules(MappingSect mappingSect, DisambiguationSect disambSect) {
			
		// The disambiguation rules drive the order in which disambiguation takes place in the mapping section
		var csName2Map = new HashMap<String,Map<String,Integer>>();
		for (disambiguation : disambSect.disambiguations) {
			val csName = disambiguation.class_.doSwitch
			val ruleName2PosMap = new HashMap<String,Integer>();
			csName2Map.put(csName,ruleName2PosMap);
			for (var i=0, val statements = disambiguation.statements; i < statements.size; i++) {
				val statement = statements.get(i);
				if (statement instanceof DisambiguationDef) {
					ruleName2PosMap.put(statement.name,i);
				}
			}
		}
		
		val result = new LinkedHashMap<String, ClassMap[]>();
		for (classMap : mappingSect.mappings) {
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
		return result;
			
	}
	

}