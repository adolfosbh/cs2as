package ocldependencyanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;

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
public class FeatureDependencyGraphComputer extends OldDependencyGraphComputer<FeatureObj> {

	@Override
	protected void processAstCall(IGraph<FeatureObj> dependencyGraph,
			OperationCallExp astOpCall) {
		
		FeatureObj from = getTargetFeature(astOpCall, false);
		createDependenciesOnFromFeatureObject(astOpCall, from, dependencyGraph);
	}
	
	/** 
	 * postprocess is overriden to prune unused computed opposite properties
	 */
	@Override
	protected void postprocess(Resource resource,
			IGraph<FeatureObj> dependencyGraph) {
		
		List<INode<FeatureObj>> nodesToRemove = new ArrayList<INode<FeatureObj>>();
		for (INode<FeatureObj> node : dependencyGraph.getNodes()) {
			if (node.getObject() instanceof OppositePropertyObj
				&& dependencyGraph.getInputEdges(node).isEmpty()) {
				nodesToRemove.add(node);
			}
		}
				
		for (INode<FeatureObj> node : nodesToRemove) { 
			dependencyGraph.removeNode(node);
		}
	}
	
	/**
	 * Get the initial feature which will be the Edge.from of a dependency graph:
	 * a) It might be an AS property, in case the ast() call belongs to a consctructor part
	 * b) otherwise it should be the ast() operation.
	 * @param astCall
	 * @return
	 */
	private FeatureObj getTargetFeature(OperationCallExp astCall, boolean isNameResolution) {
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
			Class context = getElementContext((Element)container);
			return isNameResolution ? createNameResolutionPropertyObj(context, fromFeature, astCall.getType())
					: createFeatureObj(context, fromFeature);
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
		
		// There is always a dependency between the fromFeatureObj and the the astCallContextClass ast operation
		createDependencyWithAstCallContext(astCall, fromFeatureObj, dependencyGraph);
		
		// The class of the source ast call, i.e. the CS element owning the ast operation // FIXME Class should considered rather than class
		Class astCallSourceClass = astCall.getSource().getType().isClass();		
		Operation astCallSourceClassAstOp = astCall.getReferredOperation();		
		PropertyCallExp propCall = getContainingPropertyCallExp(astCall);

		
		// if the operation call exp is not contained in any property call exp 
		// we will depend on ast operation of the astCall source Class   
		if (propCall == null) {
			FeatureObj astOpFeatureObj = createFeatureObj(astCallSourceClass, astCallSourceClassAstOp);
			dependencyGraph.addEdge(fromFeatureObj, astOpFeatureObj);				
			createDependencyWithOppositeProperty(fromFeatureObj, astCallSourceClass, dependencyGraph);			
			// We create a dependency between the called ast() operation and the overriding ast() operations of the subtypes
			createDependencyWithOverridingAstOps(astOpFeatureObj, astCallSourceClass, dependencyGraph);
		} else { 
			// the AS element is navigated => look for the proper AS property
			// We look for the first containing PropertyCallExp of the ast call, which will 
			// correspond with an AS property of a created AS element.
			Property property = propCall.getReferredProperty();
			FeatureObj asFeatureObj = createFeatureObj(astCallSourceClass, property);
			FeatureObj astOpFeatureObj = createFeatureObj(astCallSourceClass, astCallSourceClassAstOp);
			// Dependency on the AS property in the context of the ast call source class...
			dependencyGraph.addEdge(fromFeatureObj, asFeatureObj);
			// ... and we create the dependency of that AS property and the ast() operation which 
			// should create the corresponding AS element
			dependencyGraph.addEdge(asFeatureObj, astOpFeatureObj);
			createDependencyWithOppositeProperty(fromFeatureObj, astCallSourceClass, dependencyGraph);

			// We create a dependency between the called ast() operation and the overriding ast() operations (subtypes)
			createDependencyWithOverridingAstOps(astOpFeatureObj, astCallSourceClass, dependencyGraph);
		}
	}

	private void createDependencyWithAstCallContext(OperationCallExp astCall, FeatureObj fromFeatureObj,
			IGraph<FeatureObj> dependencyGraph) {

		Class astCallContextClass = getElementContext(astCall);
		Operation astOperation = getAstOperation(astCallContextClass);
		ConstructorExp astCallContainingConstructor= getContainingConstructor(astCall);
		if (astCallContainingConstructor == null) {
			dependencyGraph.addEdge(fromFeatureObj, createFeatureObj(astCallContextClass, astOperation));
		} else {
			dependencyGraph.addEdge(fromFeatureObj, createConstructionTypeFeatureObj(astCallContextClass, astOperation, astCallContainingConstructor)
					, true);
		}
	}
	
	private void createDependencyWithOppositeProperty(FeatureObj fromFeatureObj, Class context, IGraph<FeatureObj> dependencyGraph) {
		
		Property opposite = getOppositeProperty(fromFeatureObj);
		if (opposite != null) {
			dependencyGraph.addEdge(createOppositePropertyObj(fromFeatureObj, context, opposite), 
					fromFeatureObj, true);
		}
	}	
	
	private void createDependencyWithOverridingAstOps(FeatureObj fromFeatureObj, Class astOpContext, IGraph<FeatureObj> dependencyGraph ) {
		
		Set<Class> subClasses = getDirectSubClasses(astOpContext);
		if (subClasses != null) {
			for (Class subClass : subClasses) {
				Operation astOp = getAstOperation(subClass);
				FeatureObj  subClassOpFeatureObj = createFeatureObj(subClass, astOp);
				dependencyGraph.addEdge(fromFeatureObj, subClassOpFeatureObj);
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
//					dependencyGraph.addEdge(createFeatureObj(to.getContext(), oppositeProp), from);
//				}
//			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * Override {@link #createFeatureObj(Class, Feature, boolean)} to return
	 * a derived FeatureObj
	 * 
	 * @param context
	 * @param property
	 * @return
	 */
	protected FeatureObj createFeatureObj(Type context, Feature property) {
		return new FeatureObj(context, property);
	}
	
	/**
	 * Creates a FeatureObj
	 * 
	 * Clients my override.
	 * 
	 * @return
	 */
	protected FeatureObj createOppositePropertyObj(FeatureObj featureObj, Type context, Property property) {
		return new OppositePropertyObj(featureObj, context, property);
	}

	protected FeatureObj createNameResolutionPropertyObj(Type context, Feature property, Type lookupType) {
		return new NameResoPropertyObj(context, property, lookupType);
	}
	
	protected FeatureObj createConstructionTypeFeatureObj(Type context, Operation astOperation, ConstructorExp constructorExp) {
		return new ConstructorExpFeatureObj(context, astOperation, constructorExp);
	}
	
	@Override
	protected void processLookupCall(IGraph<FeatureObj> dependencyGraph,
			OperationCallExp lookupOpCall) {
		
		FeatureObj from = getTargetFeature(lookupOpCall, true);
		
		// There is always a dependency between the fromFeatureObj and the astCallContextClass ast operation
		createDependencyWithAstCallContext(lookupOpCall, from, dependencyGraph);
		
		// createDependencyWithOppositeProperty(from, context, dependencyGraph);
		
		Class asClass =  lookupOpCall.getType().isClass();
		for (Class csClass : getCSClasses(asClass)) {
			Operation astOperation = getAstOperation(csClass); // the CS type ast() operation which creates the required AS type 
			dependencyGraph.addEdge(from, createFeatureObj(csClass, astOperation));
		}
	}
	
	@Override
	protected void processConstructorExp(IGraph<FeatureObj> dependencyGraph,
			ConstructorExp constructorExp) {
		
		Operation op = getContainingOperation(constructorExp);
		Class csContext = op.getOwningClass();
		if (isAstOp(op)) {
			if (!constructorExp.getType().equals(op.getType())) {	// The created type should be a subtype
				// FIXME What to do if the created type is the same of the ast type. We can't create it twice
				// Note, if we have CS2CS, this should not happen
				FeatureObj from = createFeatureObj(csContext, op);
				FeatureObj to = createConstructionTypeFeatureObj(csContext, op, constructorExp);
				dependencyGraph.addEdge(from, to, true);
			}
		} else if (isCstOp(op)) {
			Class constructedClass = constructorExp.getType();
			FeatureObj from = createFeatureObj(constructedClass, getAstOperation(constructedClass));
			FeatureObj to = createConstructionTypeFeatureObj(csContext, op, constructorExp);
			dependencyGraph.addEdge(from, to);
		}
	}
	
	protected boolean isAddElementCall(EObject element) {
		if (element instanceof OperationCallExp) {
			return isAddElementOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isAddElementOp(Operation op) {
		return op == null ? false : "addElement".equals(op.getName()) || "addElements".equals(op.getName());
	}
	
}