package uk.ac.york.cs.cs2as.generator

import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule

class CS2ASDSL_To_OCLDisambiguationVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	String baseFileName;
	
	new (String baseFileName) {
		this.baseFileName = baseFileName;
	}

	override caseCS2ASModel(CS2ASModel object) {
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.source.doSwitch»
		«object.target.doSwitch»
		import '«baseFileName»Helpers.ocl'
		import '«baseFileName»Lookup.ocl'
		''');
		
		// FIXME this a temporal workaround
		sb.append('''
		package «object.source.metamodels.get(0).name»
		
		«object.disambiguationSect.doSwitch»
		endpackage
		''').toString
	}
		
	override caseDisambiguationSect(DisambiguationSect object) {
		'''
		«FOR disambiguation : object.disambiguations»«disambiguation.doSwitch»
		«ENDFOR»
		'''
	}

	override caseDisambiguationDef(DisambiguationDef object) {
		val context = object.classRef.doSwitch;
		'''
		context «context»
		«FOR disambiguationRule : object.rules»«disambiguationRule.doSwitch»«ENDFOR»
		'''
	}
	
	override caseDisambiguationRule(DisambiguationRule object) {
		'''
		def : «object.name»() : Boolean =
			«object.exp.doSwitch»
		''';
	}
	
}