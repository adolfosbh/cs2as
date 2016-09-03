/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.abnf.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.abnf.aBNF.ABNFPackage;
import org.xtext.example.abnf.aBNF.abnf_definition;
import org.xtext.example.abnf.aBNF.attribute;
import org.xtext.example.abnf.aBNF.classId;
import org.xtext.example.abnf.aBNF.hierarchy_rule;
import org.xtext.example.abnf.aBNF.specification_rule;
import org.xtext.example.abnf.aBNF.subclassId;
import org.xtext.example.abnf.services.ABNFGrammarAccess;

@SuppressWarnings("all")
public class ABNFSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ABNFGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ABNFPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ABNFPackage.ABNF_DEFINITION:
				sequence_abnf_definition(context, (abnf_definition) semanticObject); 
				return; 
			case ABNFPackage.ATTRIBUTE:
				sequence_attribute(context, (attribute) semanticObject); 
				return; 
			case ABNFPackage.CLASS_ID:
				sequence_classId(context, (classId) semanticObject); 
				return; 
			case ABNFPackage.HIERARCHY_RULE:
				sequence_hierarchy_rule(context, (hierarchy_rule) semanticObject); 
				return; 
			case ABNFPackage.SPECIFICATION_RULE:
				sequence_specification_rule(context, (specification_rule) semanticObject); 
				return; 
			case ABNFPackage.SUBCLASS_ID:
				sequence_subclassId(context, (subclassId) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     abnf_definition returns abnf_definition
	 *
	 * Constraint:
	 *     rules+=rule*
	 */
	protected void sequence_abnf_definition(ISerializationContext context, abnf_definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     attribute returns attribute
	 *
	 * Constraint:
	 *     (OPTA='['? SEM='<'? NAME=ID TYPE=ID (MULTA='*' | MULTB='+' | OPTB='?')?)
	 */
	protected void sequence_attribute(ISerializationContext context, attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     classId returns classId
	 *
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_classId(ISerializationContext context, classId semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ABNFPackage.Literals.CLASS_ID__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ABNFPackage.Literals.CLASS_ID__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassIdAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns hierarchy_rule
	 *     hierarchy_rule returns hierarchy_rule
	 *
	 * Constraint:
	 *     (classId=classId subclassId+=subclassId+)
	 */
	protected void sequence_hierarchy_rule(ISerializationContext context, hierarchy_rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     rule returns specification_rule
	 *     specification_rule returns specification_rule
	 *
	 * Constraint:
	 *     (classId=classId attribute+=attribute*)
	 */
	protected void sequence_specification_rule(ISerializationContext context, specification_rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     subclassId returns subclassId
	 *
	 * Constraint:
	 *     (id=ID | (isAbstract?=ABSTRACT id=ID))
	 */
	protected void sequence_subclassId(ISerializationContext context, subclassId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}