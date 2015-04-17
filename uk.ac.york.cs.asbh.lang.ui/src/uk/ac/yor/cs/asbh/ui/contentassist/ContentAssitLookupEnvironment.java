package uk.ac.yor.cs.asbh.ui.contentassist;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorManager;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;

import uk.ac.york.cs.asbh.lang.cs2as.env.Environment;
import uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentImpl;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

public class ContentAssitLookupEnvironment extends EnvironmentImpl {
	
	private EcoreExecutorManager evaluator;
	
	public ContentAssitLookupEnvironment(EObject object) {
		evaluator = new EcoreExecutorManager(object, new ExecutorStandardLibrary()); // FIXME 
	}
	
	
	@Override
	public Environment addElement( NamedElement namedElement) {
		if (namedElement != null) {
			EList<NamedElement> elements = getNamedElements();
			if (!elements.contains(namedElement)) { 	// FIXME use a set ?
				elements.add(namedElement);
			}
		}
		return this;
	}
	
	@Override
	public <NE extends NamedElement > Environment addElements(EList<NE> namedElements) {
		if (namedElements != null) {
			for (NamedElement namedElement : namedElements) {
				addElement(namedElement);
			}	
		}
		return this;
	}
	
	@Override
	public boolean hasFinalResult() {	
		return false; // So all the possible results are gathered
	}
	
	@Override
	public Evaluator getEvaluator() {
		return evaluator;
	}
}
