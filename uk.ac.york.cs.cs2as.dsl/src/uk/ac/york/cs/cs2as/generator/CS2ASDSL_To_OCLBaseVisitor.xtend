package uk.ac.york.cs.cs2as.generator

import org.eclipse.emf.ecore.EObject
import uk.ac.york.cs.cs2as.cs2as_dsl.util.Cs2as_dslSwitch
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain

abstract class CS2ASDSL_To_OCLBaseVisitor extends Cs2as_dslSwitch<String> {

	EssentialOCLCSToStringVisitor essentialOclVisitor = new EssentialOCLCSToStringVisitor();
	
	override defaultCase(EObject object) {
		essentialOclVisitor.doSwitch(object);
	}
	
	override caseSourceDomain(SourceDomain object) {
		'''
		«FOR mm : object.metamodels»«mm.doSwitch»
		«ENDFOR»
		''';
	}
	
	override caseTargetDomain(TargetDomain object) {
		'''
		«FOR mm : object.metamodels»«mm.doSwitch»
		«ENDFOR»
		''';
	}
	
	


}