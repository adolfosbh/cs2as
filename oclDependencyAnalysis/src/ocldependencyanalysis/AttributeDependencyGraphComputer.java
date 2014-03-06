package ocldependencyanalysis;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Property;
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
 *  TODO The dependencies are established between features of the
 * </p>
 *
 * 
 * <p>
 * <b>Note:</b> an OCL document based mappings description is based on the notion of an ast operation on source classes.
 * Those operations are meant to return the corresponding target class instance. 
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
		
		FeatureObj from = getTargetFeature(astOpCall);		
		createDependenciesOnFromFeatureObject(astOpCall, from, dependencyGraph);
	}	
	
	/**
	 * Get the initial feature which will be the Edge.from of a dependency graph:
	 * a) It might be an AS property, in case the ast() call belongs to a consctructor part
	 * b) otherwise it should be the ast() operation.
	 * @param astCall
	 * @return
	 */
	private FeatureObj getTargetFeature(OperationCallExp astCall) {
		EObject container = astCall.eContainer();
		Feature fromFeature = null; 
		while (container != null) {
			if (container instanceof ConstructorPart) { // We are in the RHS of a constructor expression
				fromFeature = ((ConstructorPart)container).getReferredProperty();
				break;
			}
			if (container instanceof Operation) {// We found the ast() operation // FIXME make this check more robust
				fromFeature = (Operation) container;
				break;
			}
			container = container.eContainer();
		}
		if (container != null) {
			return new FeatureObj(getElementContext((Element)container), fromFeature);
		}
		throw new RuntimeException("I should have found either a ConstructorPart or an Operation when processing: " + astCall.toString());
	}
	
	/**
	 * It analyses the ast call (OperationCallExp) and it creates the dependencies from the feature object
	 * and the corresponding features (other astCalls or other AS properties) 
	 * 
	 * @param astCall
	 * @param fromFeatureObj
	 * @param dependencyGraph
	 */
	private void createDependenciesOnFromFeatureObject(OperationCallExp astCall, FeatureObj fromFeatureObj,
			IGraph<FeatureObj> dependencyGraph) {
		
		Property opposite = getOppositeProperty(fromFeatureObj);
		
		// The class of the source ast call, i.e. the CS element owning the ast operation
		Class astCallSourceClass = (Class) astCall.getSource().getType();
		Operation astCallSourceClassAstOp = astCall.getReferredOperation();
		
		
		PropertyCallExp propCall = getContainingPropertyCallExp(astCall);
		
		
		// if the operation call exp is not contained in any property call exp 
		// we will depend on ast operation of the astCall source Class   
		if (propCall == null) {
			if (!astCallSourceClass.isAbstract()) {
				dependencyGraph.addEdge(fromFeatureObj, new FeatureObj(astCallSourceClass, astCallSourceClassAstOp));
				if (opposite != null) { // FIXME refactor this add edge and the opposite one
					dependencyGraph.addEdge(new FeatureObj(astCallSourceClass, opposite), fromFeatureObj);
				}
			}
			// We need to consider subtypes of the 
			Set<Class> instantiableSubclasses = getInstantiableSubclasses(astCallSourceClass);
			if (instantiableSubclasses != null) {
				for (Class subType : instantiableSubclasses) {
					dependencyGraph.addEdge(fromFeatureObj, new FeatureObj(subType,  getAstOperation(subType)));
					if (opposite != null) {
						dependencyGraph.addEdge(new FeatureObj(subType, opposite), fromFeatureObj);
					}
					
				}
			}
		} else { 
			// the AS element is navigated => look for the proper AS property
			// We look for the first containing PropertyCallExp of the ast call, which will 
			// correspond with an AS property of a created AS element.
			Property property = propCall.getReferredProperty();
			if (!astCallSourceClass.isAbstract()) {
				FeatureObj asFeatureObj = new FeatureObj(astCallSourceClass, property);
				// Dependency on the AS property in the context of the ast call source class...
				dependencyGraph.addEdge(fromFeatureObj, asFeatureObj);
				// ... and we create the dependency of that AS property and the ast() operation which 
				// should create the corresponding AS element
				dependencyGraph.addEdge(asFeatureObj, new FeatureObj(astCallSourceClass, astCallSourceClassAstOp));
				if (opposite != null) {
					dependencyGraph.addEdge(new FeatureObj(astCallSourceClass, opposite), fromFeatureObj);
				}
			}
			Set<Class> instantiableSubclasses = getInstantiableSubclasses(astCallSourceClass);
			if (instantiableSubclasses != null) {
				for (Class subType : instantiableSubclasses) {
					
					FeatureObj asFeatureObj = new FeatureObj(subType, property);
					// Dependency on the AS property in the context of the ast call source class...
					dependencyGraph.addEdge(fromFeatureObj , asFeatureObj);
					// ... and we create the dependency of that AS property and the ast() operation which 
					// should create the corresponding AS element
					dependencyGraph.addEdge(asFeatureObj, new FeatureObj(subType, getAstOperation(subType)));
					// Dependency between 
					if (opposite != null) {
						dependencyGraph.addEdge(new FeatureObj(subType, opposite), fromFeatureObj);
					}
				}
			}
		}
	}

	private Property getOppositeProperty(FeatureObj featureObject) {
	
		Feature fromFeature = featureObject.getFeature();
		if (fromFeature instanceof Property) {
			Property fromProp = (Property) fromFeature;
			return  fromProp.getOpposite();
//			if (oppositeProp != null) {
//				for (FeatureObj to : toObjs) {
//					dependencyGraph.addEdge(new FeatureObj(to.getContext(), oppositeProp), from);
//				}
//			}
		}
		
		return null;
	}
}