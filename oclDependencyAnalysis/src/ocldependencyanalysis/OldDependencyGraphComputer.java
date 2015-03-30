package ocldependencyanalysis;

import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.utilities.OCL;

public abstract class OldDependencyGraphComputer<C> extends AbstractDependencyGraphComputer<C> {
	
	public OldDependencyGraphComputer(OCL ocl) {
		super(ocl);
	}

	protected final void updateDependencyGraphFromCS2ASDescription(IGraph<C> dependencyGraph, Resource cs2asDescription) {
		
		for (TreeIterator<EObject> tit = cs2asDescription.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (isAstCall(next)) {
				processAstCall(dependencyGraph, (OperationCallExp) next);
				tit.prune(); // prune children iteration
			} else if (isLookupCall(next)) {
				processLookupCall(dependencyGraph, (OperationCallExp) next);
				tit.prune(); // prune children iteration
			} else if (isShadowExp(next)) {
				processShadowExp(dependencyGraph,(ShadowExp) next);
			}
		}
	}
	
	abstract protected void processAstCall(IGraph<C> dependencyGraph, 
			OperationCallExp astOpCall);
	
	abstract protected void processLookupCall(IGraph<C> dependencyGraph, 
			OperationCallExp lookupOpCall);
	
	abstract protected void processShadowExp(IGraph<C> dependencyGraph,
			ShadowExp next);		
}
