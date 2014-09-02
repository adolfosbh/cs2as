package uk.ac.yor.cs.asbh.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import uk.ac.yor.cs.asbh.services.ASBHLangGrammarAccess;
import uk.ac.york.cs.asbh.lang.cs2as.source.SRoot;
import uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage;
import uk.ac.york.cs.asbh.lang.cs2as.source.X;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y1;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y2;
import uk.ac.york.cs.asbh.lang.cs2as.source.Z;

@SuppressWarnings("all")
public abstract class AbstractASBHLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ASBHLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SourcePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SourcePackage.SROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (SRoot) semanticObject); 
					return; 
				}
				else break;
			case SourcePackage.X:
				if(context == grammarAccess.getXRule()) {
					sequence_X(context, (X) semanticObject); 
					return; 
				}
				else break;
			case SourcePackage.Y1:
				if(context == grammarAccess.getYRule() ||
				   context == grammarAccess.getY1Rule()) {
					sequence_Y1(context, (Y1) semanticObject); 
					return; 
				}
				else break;
			case SourcePackage.Y2:
				if(context == grammarAccess.getYRule() ||
				   context == grammarAccess.getY2Rule()) {
					sequence_Y2(context, (Y2) semanticObject); 
					return; 
				}
				else break;
			case SourcePackage.Z:
				if(context == grammarAccess.getZRule()) {
					sequence_Z(context, (Z) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((ownedX+=X ownedX+=X*)?)
	 */
	protected void sequence_Root(EObject context, SRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isA1?='isA1'? ownsY+=Y?)
	 */
	protected void sequence_X(EObject context, X semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING ownsZ=Z?)
	 */
	protected void sequence_Y1(EObject context, Y1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING ownsZ=Z?)
	 */
	protected void sequence_Y2(EObject context, Y2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Z}
	 */
	protected void sequence_Z(EObject context, Z semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
