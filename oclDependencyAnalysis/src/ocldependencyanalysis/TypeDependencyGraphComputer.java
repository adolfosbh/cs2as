package ocldependencyanalysis;

import java.util.Set;

import ocldependencyanalysis.graph.IGraph;

import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.utilities.OCL;

/**
 * <p>
 * Computes a class dependency graph for pivot resource. A resource is considered to be
 * pivot if contains a {@link Model} root element
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
 * 	  Only the {@link Model} root element will be processed
 *    No cycles in the type hierarchy of the involved source classes
 *  
 * @author asbh500
 */
public class TypeDependencyGraphComputer extends OldDependencyGraphComputer<Type>{

	public TypeDependencyGraphComputer(OCL ocl) {
		super(ocl);
	}

	@Override
	protected void processAstCall(IGraph<Type> dependencyGraph,
			OperationCallExp astOpCall) {
		Class to =  astOpCall.getOwnedSource().getType().isClass();
		// if (isElementRefCS(to)) {
		Class from = getElementContext(astOpCall);
		if (to instanceof Class) {
			Class toClass = (Class) to; 
			if (! toClass.isIsAbstract()) { 
				dependencyGraph.addEdge(from, to);
			}
			
			Set<Class> instantiableSubclasses = getInstantiableSubClasses(to);
			if (instantiableSubclasses != null) {
				for (Class subClass : instantiableSubclasses) {
					dependencyGraph.addEdge(from, subClass);
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
		
		Class asClass =  lookupOpCall.getType().isClass();
		Class from = getElementContext(lookupOpCall);
		for (Class csClass : getCSClasses(asClass)) {
			dependencyGraph.addEdge(from, csClass);
		}
	}
	
	@Override
	protected void processShadowExp(IGraph<Type> dependencyGraph,
			ShadowExp next) {		
		// Not of my interest
	}
}
