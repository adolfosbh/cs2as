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
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

/**
 * @author asbh500
 *
 * @param <C>
 */
public abstract class AbstractDependencyGraphComputer<C> {
 		

	private Map<Type , Set<Type>> type2superTypes = new HashMap<Type, Set<Type>>();
	
	private Map<Type , Set<Class>> type2instantiableSubClasses = new HashMap<Type, Set<Class>>();
	
	private Map<Type , Set<Type>> type2directSubTypes = new HashMap<Type, Set<Type>>();
	
	private Map<Type , Set<Type>> asType2csTypes = new HashMap<Type, Set<Type>>();
	
	protected MetaModelManager mManager;
		
	private void initializeMaps(Resource resource) {
		Root root = (Root) resource.getContents().get(0) ;
		for (Package aPackage : root.getNestedPackage()) {
			computeType2SuperTypes(aPackage);
			computeAsType2CsType(aPackage);
		}
		for (Type type : type2superTypes.keySet()) {
			computeType2InstantiableClasses(type);
			computeType2DirectTypes(type);
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
	
	private void computeType2DirectTypes(Type type) {
		
		if (type instanceof Class) {			 
			for (Type superType : type.getSuperClass()) {
				Set<Type> subTypes = type2directSubTypes.get(superType);
				if (subTypes == null) {
					subTypes = new HashSet<Type>();
					type2directSubTypes.put(superType, subTypes);
				}
				subTypes.add(type);
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
	
	protected Set<Class> getInstantiableSubclasses(Type type) {
		Type primaryType = mManager.getPrimaryType(type);
		return type2instantiableSubClasses.get(primaryType);
	}

	protected boolean typeIsSupertypeOf(Type t1, Type t2) {
		Type primaryT1 = mManager.getPrimaryType(t1);
		Type primaryT2 = mManager.getPrimaryType(t2);
		return type2superTypes.get(primaryT1).contains(primaryT2);
	}
	
	protected Set<Type> getDirectSubtypes(Type type) {
		Type primaryType = mManager.getPrimaryType(type);
		return type2directSubTypes.get(primaryType);
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
	
	public IGraph<C> computeDependencyGraph (Resource cs2asResource, Resource lookupResource) {
		
		assert(cs2asResource.getContents().get(0) instanceof Root);
		if (lookupResource != null) { assert(lookupResource.getContents().get(0) instanceof Root);}
		
		mManager = MetaModelManager.getAdapter(cs2asResource.getResourceSet());
		IGraph<C> dependencyGraph = createDependencyGraph();
		
		initializeMaps(cs2asResource);		
		preprocess(cs2asResource, dependencyGraph);			
		updateDependencyGraphFromCS2ASDescription(dependencyGraph, cs2asResource);		
		postprocess(cs2asResource, dependencyGraph);
		
		if (lookupResource != null) {
			initializeMaps(lookupResource);		
			preprocess(lookupResource, dependencyGraph);			
			updateDependencyGraphFromLookupDescription(dependencyGraph, lookupResource);		
			postprocess(lookupResource, dependencyGraph);
		}
		
		mManager = null;
		
		return dependencyGraph;
	}
	
	public IGraph<C> computeDependencyGraph (Resource cs2asResource) {
		return computeDependencyGraph(cs2asResource, null);
	}
	
	protected IGraph<C> createDependencyGraph() {
		return new Graph<C>();
	}
		
	
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
	protected void preprocess(Resource resource, IGraph<C> dependencyGraph) {}
	
	
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
	protected void postprocess(Resource resource, IGraph<C> dependencyGraph) {}
	
	abstract protected void updateDependencyGraphFromCS2ASDescription(IGraph<C> dependencyGraph, Resource cs2asResource);		
	// FIXME Refactor this. Decouple CS2AS/Lookup in different graph udpaters
	abstract protected void updateDependencyGraphFromLookupDescription(IGraph<C> dependencyGraph, Resource lookupDescription);
	
	// Some utility routines
	
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
	
	protected boolean isAstCall(EObject element) {
		if (element instanceof OperationCallExp) {
			return isAstOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isAstOp(Operation op) {
		return op == null ? false : "ast".equals(op.getName()) && op.getOwnedParameter().isEmpty();
	}
	
	protected boolean isAstOp(EObject element) {
		return element instanceof Operation ? isAstOp((Operation) element) : false; 
	}
	
	protected boolean isCstOp(Operation op) {
		return op == null ? false : "cst".equals(op.getName()) && op.getOwnedParameter().isEmpty();
	}
	
	protected boolean isCstOp(EObject element) {
		return element instanceof Operation ? isCstOp((Operation) element) : false; 
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
	
	protected boolean isConstructorExp(EObject element) {
		return element instanceof ConstructorExp;
	}
	
	protected boolean isConstrucorPart(EObject element) {
		return element instanceof ConstructorPart;
	}
	
	protected boolean isPropertyCallExp(EObject element) {
		return element instanceof PropertyCallExp;
	}
	
	/**
	 * If the opCallExp is performed as the right hand side of a constructor part, it will return the corresponding
	 * ConstructorExp, otherwise <code>null</code>. 
	 *
	 * @param callExp a given {@link OperationCallExp}
	 * @return the containing constructor expression, or null
	 */
	protected ConstructorExp getContainingConstructor(Element callExp) {
	
		EObject container = callExp.eContainer();
		while (container != null) {
			if (container instanceof ConstructorExp) {
				return ((ConstructorExp)container);
			}			
			container = container.eContainer();
		}
		return null;
	}
	
	protected ConstructorPart getContainingConstructorPart(Element callExp) {
		
		EObject container = callExp.eContainer();
		while (container != null) {
			if (container instanceof ConstructorPart) {
				return ((ConstructorPart)container);
			}			
			container = container.eContainer();
		}
		return null;
	}
	
	protected Operation getContainingOperation(Element element) {
		
		EObject container = element.eContainer();
		while (container != null) {
			if (container instanceof Operation) {
				return ((Operation)container);
			}			
			container = container.eContainer();
		}
		return null;
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
	
}
