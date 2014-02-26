package ocldependencyanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Root;

/**
 * <p>
 * Computes a properties dependency graph for a pivot resource. A resource is considered to be
 * pivot if contains a {@link Root} root element
 * </p>
 * 
 * <p>
 * This pivot resource come from loading OCL documents represents a mapping description 
 * between two meta-models.
 * </p>
 * 
 * <p>
 * The dependencies are established between features of the
 *  
 * </p>
 * 
 * <p>
 * There might be cycles between nodes, meaning that those source classes require from each other in order
 * to have a completely defined target element.
 * </p>
 * 
 * <p>
 * <b>Note:</b> an OCL document based mappings description is based on the notion of an ast operation on source classes.
 * Those operations are meant to return the corresponding the target class instance. 
 * </p>
 *  
 * Assumptions:
 * 	  Only the {@link Root} root element will be processed
 * 
 * @author asbh500
 */
public class AttributeDependencyGraphComputer extends AbstractDependencyGraphComputer<FeatureObj> {


	@Override
	protected void processAstCall(IGraph<FeatureObj> dependencyGraph,
			OperationCallExp astOpCall) {
		
		FeatureObj from = getFromObj(astOpCall);
		List<FeatureObj> toObjs = getToObj(astOpCall);
		for (FeatureObj to : toObjs) {
			dependencyGraph.addEdge(from, to);	
		}
	}	
	
	private FeatureObj getFromObj(OperationCallExp astCall) {
				
		EObject container = astCall.eContainer();
		Feature fromFeature = null; 
		while (container != null) {
			if (container instanceof ConstructorPart) { // We are in the RHS of a constructor expression
				fromFeature = ((ConstructorPart)container).getReferredProperty();
				break;
			}
			if (container instanceof Operation) {// We found the ast() operation
				fromFeature = (Operation) container;
			}
			container = container.eContainer();
		}
		if (container != null) {
			return new FeatureObj(getContextElement(astCall), fromFeature);
		}
		throw new RuntimeException("I should have found either a ConstructorPart or an Operation");
	}
	
	private List<FeatureObj> getToObj(OperationCallExp opCall) {
		
		List<FeatureObj> result = new ArrayList<FeatureObj>();
		Class opCallClass = (Class) opCall.getSource().getType();
		if (!opCallClass.isAbstract()) {
			result.add(new FeatureObj(getContextElement(opCall), opCall.getReferredOperation()));	
		}
		Set<Class> instantiableSubclasses = getInstantiableSubclasses(opCallClass);
		if (instantiableSubclasses != null) {
			for (Class subType : instantiableSubclasses) {
				Operation astOp = getAstOperation(subType);
				result.add(new FeatureObj(subType, astOp));
			}
		}
		
		
		// If the ast call is source of another PropertyCallExp, we 
		// are interested in that AS property rather that AS object 
		EObject container = opCall.eContainer();		
		if (container instanceof PropertyCallExp) {
			PropertyCallExp propCall = (PropertyCallExp) container; 
			result.add(new FeatureObj(getContextElement(propCall), propCall.getReferredProperty()));
		}
		return result;
	}
}