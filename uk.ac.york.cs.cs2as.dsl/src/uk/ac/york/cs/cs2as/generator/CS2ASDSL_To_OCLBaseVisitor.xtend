package uk.ac.york.cs.cs2as.generator

import org.eclipse.emf.ecore.EObject
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl
import uk.ac.york.cs.cs2as.cs2as_dsl.util.Cs2as_dslSwitch

abstract class CS2ASDSL_To_OCLBaseVisitor extends Cs2as_dslSwitch<String> {

	EssentialOCLCSToStringVisitor essentialOclVisitor = new EssentialOCLCSToStringVisitor();
	
	override defaultCase(EObject object) {
		essentialOclVisitor.doSwitch(object);
	}
	
	override caseASDecl(ASDecl object) {
		'''
		«FOR mm : object.metamodels»«mm.doSwitch»
		«ENDFOR»
		''';
	}
	
	override caseCSDecl(CSDecl object) {
		'''
		«FOR mm : object.metamodels»«mm.doSwitch»
		«ENDFOR»
		''';
	}
	
	


}