package ocldependencyanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.pivot.Class;
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
	
	private MetaModelManager mManager;
		
	private void initializeMaps(Resource resource) {
		Root root = (Root) resource.getContents().get(0) ;
		// TODO access to the real packages and types.
		// Be careful with 
		for (Package aPackage : root.getNestedPackage()) {
			computeType2SuperTypes(aPackage);
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
	
	public IGraph<C> computeDependencyGraph (Resource pivotResource) {
		
		assert(pivotResource.getContents().get(0) instanceof Root);
		
		mManager = MetaModelManager.getAdapter(pivotResource.getResourceSet());
		initializeMaps(pivotResource);
		IGraph<C> dependencyGraph = createDependencyGraph();
		
		for (TreeIterator<EObject> tit = pivotResource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (astCall(next)) {
				processAstCall(dependencyGraph, (OperationCallExp) next);
			}
		}
		return dependencyGraph;
	}
	
	protected boolean astCall(EObject element) {
		if (element instanceof OperationCallExp) {
			Operation op = ((OperationCallExp)element).getReferredOperation();
			if (op != null) {
				return "ast".equals(op.getName());
			}
		}
		return false;
	}
	
	protected Class getElementContext(Element element) {
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
	
	protected Operation getAstOperation(Class opAstClass) {
		Operation bestOp=null;	// The best op will be the one owned by the type the 
								// closer to opAstClass in the class hierarchy 
		// TODO move to mManager ?
		for (DomainOperation op : mManager.getAllOperations(opAstClass, false, "ast")){
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
		if (bestOp != null) {
			return bestOp;
		} 
		throw new RuntimeException("I should have found the ast operation");
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
}
