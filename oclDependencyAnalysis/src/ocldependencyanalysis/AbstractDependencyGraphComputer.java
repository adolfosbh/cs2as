package ocldependencyanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ocldependencyanalysis.graph.Graph;
import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.FeatureFilter;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public abstract class AbstractDependencyGraphComputer<C> {

	private Map<Type , Set<Type>> type2superTypes = new HashMap<Type, Set<Type>>();
	
	private Map<Type , Set<Class>> type2instantiableSubClasses = new HashMap<Type, Set<Class>>();
	
	private Map<Type , Set<Type>> asType2csTypes = new HashMap<Type, Set<Type>>();
	
	private MetaModelManager mManager;
		
	private void initializeMaps(Resource resource) {
		Root root = (Root) resource.getContents().get(0) ;
		for (Package aPackage : root.getNestedPackage()) {
			computeType2SuperTypes(aPackage);
			computeAsType2CsType(aPackage);
		}
		for (Type type : type2superTypes.keySet()) {
			computeType2InstantiableClasses(type);
		}
	}
	
	
	private void computeType2SuperTypes(Package p) {
		
		for (Type type : p.getOwnedType()) {
			Type prymaryType = mManager.getPrimaryType(type);
			computeType2SuperTypes(prymaryType);
		}
		for (Package nestedPackage : p.getNestedPackage()) {
			computeType2SuperTypes(nestedPackage);
		}
	}
	
	private Set<Type> computeType2SuperTypes(Type type) {
		
		
		
		Set<Type> result = type2superTypes.get(type);
		if (result != null) {
			return result;
		} else {
			result = new HashSet<Type>();
			type2superTypes.put(type, result);
		}
		
		for (Type superType : type.getSuperClass()) {
			result.add(superType);
			result.addAll(computeType2SuperTypes(superType));
		}
		return result;
	}
	
	private void computeType2InstantiableClasses(Type type) {
		
		if (type instanceof Class
			&& !((Class) type).isAbstract()) {
			Class subClass = (Class) type; 
			for (Type superType : type2superTypes.get(type)) {
				Set<Class> subClasses = type2instantiableSubClasses.get(superType);
				if (subClasses == null) {
					subClasses = new HashSet<Class>();
					type2instantiableSubClasses.put(superType, subClasses);
				}
				subClasses.add(subClass);
			}
		}
	}
	
	private void computeAsType2CsType(Package p) {
		for (Type type : p.getOwnedType()) {
			Operation astOp = getAstOperation(type);
			if (astOp != null) {
				for (TreeIterator<EObject> tit = astOp.eAllContents(); tit.hasNext();) {
					EObject next = tit.next();
					if (next instanceof ConstructorExp) {					
						Type asType = ((ConstructorExp)next).getType();
						Set<Type> csTypes = asType2csTypes.get(asType);
						if (csTypes == null) {
							csTypes = new HashSet<Type>();
							asType2csTypes.put(asType, csTypes);
						}
						csTypes.add(type);
						tit.prune(); // Don't need to explore children
					}
				}	
			}
		}
	}
	public IGraph<C> computeDependencyGraph (Resource pivotResource) {
		
		assert(pivotResource.getContents().get(0) instanceof Root);
		
		mManager = MetaModelManager.getAdapter(pivotResource.getResourceSet());
		initializeMaps(pivotResource);
		IGraph<C> dependencyGraph = createDependencyGraph();
		
		preprocess(pivotResource, dependencyGraph);
		
		for (TreeIterator<EObject> tit = pivotResource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (isAstCall(next)) {
				processAstCall(dependencyGraph, (OperationCallExp) next);
			} else if (isLookupCall(next)) {
				processLookupCall(dependencyGraph, (OperationCallExp) next);
			}
		}
		
		postprocess(pivotResource, dependencyGraph);
		return dependencyGraph;
	}


	protected boolean isAstCall(EObject element) {
		if (element instanceof OperationCallExp) {
			return isAstOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isAstOp(Operation op) {
		return op == null ? false : "ast".equals(op.getName());
	}
	
	protected boolean isLookupCall(EObject element) {
		if (element instanceof OperationCallExp) {
			return isLookupOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isLookupOp(Operation op) {
		if (op == null) return false;
		String opName = op.getName();
		return opName == null ? false : opName.startsWith("lookup");
	}
	
	protected Class getElementContext(Element element) { // FIXME this should return/consider Type rather than just Class
		EObject container = element.eContainer();
		while (container != null) {
			if (container instanceof Class) {
				return (Class) container;
			}
			container = container.eContainer();
		}
		throw new RuntimeException("I should have found the containing Context Class");
	}
	
	
	/**
	 * @param element  
	 * @return the containing {@link PropertyCallExp} if it's contained in any, <code>null</code> otherwise
	 */
	protected PropertyCallExp getContainingPropertyCallExp(Element element) {
		EObject container = element.eContainer();
		while (container != null) {
			if (container instanceof PropertyCallExp) {
				return (PropertyCallExp) container;
			}
			container = container.eContainer();
		}
		return null;
	}

	protected IGraph<C> createDependencyGraph() {
		return new Graph<C>();
	}
		
	protected Set<Class> getInstantiableSubclasses(Type type) {
		Type primaryType = mManager.getPrimaryType(type);
		return type2instantiableSubClasses.get(primaryType);
	}

	protected boolean typeIsSupertypeOf(Type t1, Type t2) {
		Type primaryT1 = mManager.getPrimaryType(t1);
		Type primaryT2 = mManager.getPrimaryType(t2);
		return type2superTypes.get(primaryT1).contains(primaryT2);
	}
	
	/**
	 * @param asType
	 * @return all the CS types which may create the provided AS type
	 */
	protected Set<Type> getCSTypes(Type asType) {
		Type asPrimaryType = mManager.getPrimaryType(asType);
		return asType2csTypes.get(asPrimaryType);
	}
	
	protected Operation getAstOperation(Type opAstClass) {
		Operation bestOp=null;	// The best op will be the one owned by the type the 
								// closer to opAstClass in the class hierarchy 
		// TODO move to mManager ?
		for (DomainOperation op : mManager.getAllOperations(opAstClass, FeatureFilter.SELECT_NON_STATIC, "ast")){
			if (op instanceof Operation
				&& op.getOwnedParameter().isEmpty()) {
				Operation candidateOp = (Operation) op;
				if (bestOp == null) {
					bestOp = candidateOp;
				}else{
					if (typeIsSupertypeOf(candidateOp.getOwningType(), bestOp.getOwningType())) {
						bestOp = candidateOp;
					}
				}
			}
		}
		return bestOp;
	}
	
	
	
//	protected boolean isElementRefCS(Type to) {
//		
//		for (Type type : to.getSuperClass()) {
//			if ("ElementRefCS".equals(type.getName())) {
//				return true;
//			} else {
//				if (isElementRefCS(type)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	abstract protected void processAstCall(IGraph<C> dependencyGraph, OperationCallExp astOpCall);
	
	abstract protected void processLookupCall(IGraph<C> dependencyGraph, OperationCallExp lookupOpCall);
	
	/**
	 * Method called prior to process the resource to look for 
	 * ast calls.
	 * 
	 * By default does nothing.
	 * 
	 * Derived classes may override
	 * 
	 * @param resource
	 * @param dependenyGraph
	 */
	protected void preprocess(Resource resource, IGraph<C> dependencyGraph) {
		
	}
	
	/**
	 * Method called after processing the resource 
	 * 
	 * By default does nothing.
	 * 
	 * Derived classes may override to provide custom
	 * implementation
	 * 
	 * @param resource
	 * @param dependenyGraph
	 */
	protected void postprocess(Resource resource, IGraph<C> dependencyGraph) {
		
	}
}
