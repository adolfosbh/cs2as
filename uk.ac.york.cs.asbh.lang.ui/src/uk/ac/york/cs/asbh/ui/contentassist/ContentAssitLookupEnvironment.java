package uk.ac.yor.cs.asbh.ui.contentassist;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorManager;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;

import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl.LookupEnvironmentImpl;

public class ContentAssitLookupEnvironment extends LookupEnvironmentImpl {
	
	private EcoreExecutorManager executor;
	
	public ContentAssitLookupEnvironment(EObject object) {
		executor = new EcoreExecutorManager(object, new ExecutorStandardLibrary()); // FIXME 
	}
	
	
	@Override
	public LookupEnvironment addElement( NamedElement namedElement) {
		if (namedElement != null) {
			EList<NamedElement> elements = getNamedElements();
			if (!elements.contains(namedElement)) { 	// FIXME use a set ?
				elements.add(namedElement);
			}
		}
		return this;
	}
	
	@Override
	public <NE extends NamedElement > LookupEnvironment addElements(EList<NE> namedElements) {
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
	public Executor getExecutor() {
		return executor;
	}
}
