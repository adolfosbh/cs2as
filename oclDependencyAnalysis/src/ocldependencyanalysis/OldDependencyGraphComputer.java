package ocldependencyanalysis;

import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.OperationCallExp;

public abstract class OldDependencyGraphComputer<C> extends AbstractDependencyGraphComputer<C> {
	
	protected final void updateDependencyGraphFromCS2ASDescription(IGraph<C> dependencyGraph, Resource cs2asDescription) {
		
		for (TreeIterator<EObject> tit = cs2asDescription.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (isAstCall(next)) {
				processAstCall(dependencyGraph, (OperationCallExp) next);
				tit.prune(); // prune children iteration
			} else if (isLookupCall(next)) {
				processLookupCall(dependencyGraph, (OperationCallExp) next);
				tit.prune(); // prune children iteration
			} else if (isConstructorExp(next)) {
				processConstructorExp(dependencyGraph,(ConstructorExp) next);
			}
		}
	}
	
	abstract protected void processAstCall(IGraph<C> dependencyGraph, 
			OperationCallExp astOpCall);
	
	abstract protected void processLookupCall(IGraph<C> dependencyGraph, 
			OperationCallExp lookupOpCall);
	
	abstract protected void processConstructorExp(IGraph<C> dependencyGraph,
			ConstructorExp next);		
}
