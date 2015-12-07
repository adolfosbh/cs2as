package uk.ac.york.cs.cs2as.generator

import uk.ac.york.cs.cs2as.cs2as_dsl.Model
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation

class CS2ASDSL_To_OCLDisambiguationVisitor extends CS2ASDSL_To_OCLBaseVisitor {

	String baseFileName;
	
	new (String baseFileName) {
		this.baseFileName = baseFileName;
	}

	override caseModel(Model object) {
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.csDecl.doSwitch»
		«object.asDecl.doSwitch»
		import '«baseFileName»Helpers.ocl'
		import '«baseFileName»Lookup.ocl'
		''');
		
		// FIXME this a temporal workaround
		sb.append('''
		package «object.csDecl.metamodels.get(0).name»
		
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

	override caseClassDisambiguation(ClassDisambiguation object) {
		val context = object.class_.doSwitch;
		'''
		context «context»
		«FOR disambiguationRule : object.statements»«disambiguationRule.doSwitch»«ENDFOR»
		'''
	}
	
	override caseDisambiguationDef(DisambiguationDef object) {
		'''
		def : «object.name»() : Boolean =
			«object.exp.doSwitch»
		''';
	}
	
}