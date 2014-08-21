package ocldependencyanalysis;

import java.util.Set;

import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * <p>
 * Computes a class dependency graph for pivot resource. A resource is considered to be
 * pivot if contains a {@link Root} root element
 * </p>
 * 
 * <p>
 * This pivot resource come from loading OCL documents represents a mapping description 
 * between two meta-models.
 * </p>
 * 
 * <p>
 * The dependencies are established between nodes representing classes of the source meta-model, 
 * so that if source class A depends on source class B, that means that in order to have a properly 
 * defined target class created from A, the associated target from B should be previously be created/obtained.
 * </p>
 * 
 * <p>
 * There might be cycles between nodes, meaning that those source classes require from each other in order
 * to have a completely defined target element.
 * </p>
 * 
 * <p>
 * As note, a OCL document based mappings description is based on the notion of an ast operation on source classes.
 * Those operations are meant to return the corresponding target class instance. 
 * </p>
 * 
 * Assumptions:
 * 	  Only the {@link Root} root element will be processed
 *    No cycles in the type hierarchy of the involved source classes
 *  
 * @author asbh500
 */
public class TypeDependencyGraphComputer extends AbstractDependencyGraphComputer<Type>{

	@Override
	protected void processAstCall(IGraph<Type> dependencyGraph,
			OperationCallExp astOpCall) {
		Type to =  astOpCall.getSource().getType();
		// if (isElementRefCS(to)) {
		Class from = getElementContext(astOpCall);
		if (to instanceof Class) {
			Class toClass = (Class) to; 
			if (! toClass.isAbstract()) { 
				dependencyGraph.addEdge(from, to);
			}
			
			Set<Class> instantiableSubclasses = getInstantiableSubclasses(to);
			if (instantiableSubclasses != null) {
				for (Class subType : instantiableSubclasses) {
					dependencyGraph.addEdge(from, subType);
				}
			}	
			dependencyGraph.addEdge(from, to);
		} else { 
			dependencyGraph.addEdge(from, to);
		}
		// }
	}	
	
	@Override
	protected void processLookupCall(IGraph<Type> dependencyGraph,
			OperationCallExp lookupOpCall) {
		
		Type asType =  lookupOpCall.getType();
		Class from = getElementContext(lookupOpCall);
		for (Type csType : getCSTypes(asType)) {
			dependencyGraph.addEdge(from, csType);
		}
	}
	
	@Override
	protected void processConstructorExp(IGraph<Type> dependencyGraph,
			ConstructorExp next) {		
		// Not of my interest
	}
	
	@Override
	protected void updateDependencyGraphFromLookupDescription(
			IGraph<Type> dependencyGraph, Resource lookupDescription) {
		
		// Nothing to do to the dependency graph from the lookup description
	}
}
