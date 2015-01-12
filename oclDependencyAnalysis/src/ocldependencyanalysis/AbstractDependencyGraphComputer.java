package ocldependencyanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ocldependencyanalysis.graph.Graph;
import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.ConstructorExp;
import org.eclipse.ocl.pivot.ConstructorPart;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.FeatureFilter;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.manager.MetamodelManager;

/**
 * @author asbh500
 *
 * @param <C>
 */
public abstract class AbstractDependencyGraphComputer<C> {
 		

	private Map<Class , Set<Class>> type2superClasses = new HashMap<Class, Set<Class>>();
	
	private Map<Class , Set<Class>> type2instantiableSubClasses = new HashMap<Class, Set<Class>>();
	
	private Map<Class , Set<Class>> type2directSubClasses = new HashMap<Class, Set<Class>>();
	
	private Map<Class , Set<Class>> asClass2csClasses = new HashMap<Class, Set<Class>>();
	
	protected MetamodelManager mManager;
		
	private void initializeMaps(Resource resource) {
		Model root = (Model) resource.getContents().get(0) ;
		for (Package aPackage : root.getOwnedPackages()) {
			Package primPckg = (Package)mManager.getPrimaryPackage(aPackage);
			computeClass2SuperClasses(primPckg);
			computeAsClass2CsClass(primPckg);
		}
		for (Class type : type2superClasses.keySet()) {
			computeClass2InstantiableClasses(type);
			computeClass2DirectClasses(type);
		}
	}
	
	
	private void computeClass2SuperClasses(Package p) {
		
		for (Class aClass : p.getOwnedClasses()) {
			computeClass2SuperClasses(aClass);
		}
		for (Package nestedPackage : p.getOwnedPackages()) {
			computeClass2SuperClasses(nestedPackage);
		}
	}
	
	private Set<Class> computeClass2SuperClasses(Class aClass) {
		
		Set<Class> result = type2superClasses.get(aClass);
		if (result != null) {
			return result;
		} else {
			result = new HashSet<Class>();
			type2superClasses.put(aClass, result);
		}
		
		for (Class superClass : aClass.getSuperClasses()) {
			result.add(superClass);
			result.addAll(computeClass2SuperClasses(superClass));
		}
		return result;
	}
	
	private void computeClass2InstantiableClasses(Class type) {
		
		if (type instanceof Class
			&& !((Class) type).isAbstract()) {
			Class subClass = (Class) type; 
			for (Class superClass : type2superClasses.get(type)) {
				Set<Class> subClasses = type2instantiableSubClasses.get(superClass);
				if (subClasses == null) {
					subClasses = new HashSet<Class>();
					type2instantiableSubClasses.put(superClass, subClasses);
				}
				subClasses.add(subClass);
			}
		}
	}
	
	private void computeClass2DirectClasses(Class aClass) {
			 
		for (Class superClass : aClass.getSuperClasses()) {
			Set<Class> subClass = type2directSubClasses.get(superClass);
			if (subClass == null) {
				subClass = new HashSet<Class>();
				type2directSubClasses.put(superClass, subClass);
			}
			subClass.add(aClass);
		}
	}
	
	protected List<Class> getClassesInvolvedInOCLDocPackages(Resource oclResource) {
		
		List<Class> result = new ArrayList<Class>();
		Model root = (Model) oclResource.getContents().get(0);
		for (Package pckg : root.getOwnedPackages()) {
			Package primaryPckg = (Package) mManager.getPrimaryPackage(pckg);
			for (Class ownedClass : primaryPckg.getOwnedClasses()) {
				result.add(ownedClass);
			}
		}
		return result;
	}
	private void computeAsClass2CsClass(Package p) {
		for (Class type : p.getOwnedClasses()) {
			Operation astOp = getAstOperation(type);
			if (astOp != null) {
				for (TreeIterator<EObject> tit = astOp.eAllContents(); tit.hasNext();) {
					EObject next = tit.next();
					if (next instanceof ConstructorExp) {					
						Class asClass = ((ConstructorExp)next).getType();
						Set<Class> csClasses = asClass2csClasses.get(asClass);
						if (csClasses == null) {
							csClasses = new HashSet<Class>();
							asClass2csClasses.put(asClass, csClasses);
						}
						csClasses.add(type);
						tit.prune(); // Don't need to explore children
					}
				}	
			}
		}
	}
	
	protected Set<Class> getInstantiableSubClasses(Class type) {
		Class primaryClass = mManager.getPrimaryType(type);
		return type2instantiableSubClasses.get(primaryClass);
	}

	protected boolean typeIsSupertypeOf(Class t1, Class t2) {
		Type primaryT1 = mManager.getPrimaryType(t1);
		Type primaryT2 = mManager.getPrimaryType(t2);
		return type2superClasses.get(primaryT1).contains(primaryT2);
	}
	
	protected Set<Class> getDirectSubClasses(Class type) {
		Type primaryType = mManager.getPrimaryType(type);
		return type2directSubClasses.get(primaryType);
	}
	/**
	 * @param asClass
	 * @return all the CS types which may create the provided AS type
	 */
	protected Set<Class> getCSClasses(Class asClass) {
		Type asPrimaryType = mManager.getPrimaryType(asClass);
		return asClass2csClasses.get(asPrimaryType);
	}
	
	protected Operation getAstOperation(Class opAstClass) {
		Operation bestOp=null;	// The best op will be the one owned by the type the 
								// closer to opAstClass in the class hierarchy 
		// TODO move to mManager ?
		for (Operation op : mManager.getAllOperations(opAstClass, FeatureFilter.SELECT_NON_STATIC, "ast")){
			if (op instanceof Operation
				&& op.getOwnedParameters().isEmpty()) {
				Operation candidateOp = (Operation) op;
				if (bestOp == null) {
					bestOp = candidateOp;
				}else{
					if (typeIsSupertypeOf(candidateOp.getOwningClass(), bestOp.getOwningClass())) {
						bestOp = candidateOp;
					}
				}
			}
		}
		return bestOp;
	}
	
	public IGraph<C> computeDependencyGraph (Resource cs2asResource) {
		assert(cs2asResource.getContents().get(0) instanceof Model);	
		mManager = MetamodelManager.getAdapter(cs2asResource.getResourceSet());
		IGraph<C> dependencyGraph = createDependencyGraph();
		
		initializeMaps(cs2asResource);		
		preprocess(cs2asResource, dependencyGraph);			
		updateDependencyGraphFromCS2ASDescription(dependencyGraph, cs2asResource);		
		postprocess(cs2asResource, dependencyGraph);
		
		mManager = null;
		
		return dependencyGraph;
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
		if (isOperationCallExp(element)) {
			return isAstOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isAstOp(Operation op) {
		return op == null ? false : "ast".equals(op.getName()) && op.getOwnedParameters().isEmpty();
	}
	
	protected boolean isAstOp(EObject element) {
		return element instanceof Operation ? isAstOp((Operation) element) : false; 
	}
	
	protected boolean isCstOp(Operation op) {
		return op == null ? false : "cst".equals(op.getName()) && op.getOwnedParameters().isEmpty();
	}
	
	protected boolean isCstOp(EObject element) {
		return element instanceof Operation ? isCstOp((Operation) element) : false; 
	}
	
	protected boolean isLookupCall(EObject element) {
		if (isOperationCallExp(element)) {
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
	
	protected boolean isOperationCallExp(EObject element) {
		return element instanceof OperationCallExp;
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
