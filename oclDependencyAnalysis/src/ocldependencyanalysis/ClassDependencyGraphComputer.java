package ocldependencyanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Package;

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
 * Those operations are meant to retrugn the corresponding the target class instance. 
 * </p>
 * 
 * Assumptions:
 * 	  Only the {@link Root} root element will be processed
 *    No cycles in the type hierarchy of the involved source classes
 *  
 * @author asbh500
 */
public class ClassDependencyGraphComputer {

	private Map<Type , Set<Type>> type2superTypes = new HashMap<Type, Set<Type>>();
	
	private Map<Type , Set<Class>> type2instantiableSubClasses = new HashMap<Type, Set<Class>>();

	
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
			computeType2SuperTypes(type);
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
	
	
	public IGraph<Class> computeDependencyGraph (Resource pivotResource) {
		
		assert(pivotResource.getContents().get(0) instanceof Root);
		
		initializeMaps(pivotResource);
		IGraph<Class> depedencyGraph = createDepedencyGraph();
		
		for (TreeIterator<EObject> tit = pivotResource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof Element
				&& astCall((Element) next)) {
				OperationCallExp astCall = (OperationCallExp) next;
				org.eclipse.ocl.examples.pivot.Class to = (org.eclipse.ocl.examples.pivot.Class)astCall.getSource().getType();
				// if (isElementRefCS(to)) {
					org.eclipse.ocl.examples.pivot.Class from = getContextElement(astCall);
					if (! to.isAbstract()) {
						depedencyGraph.addEdge(from, to);
					}
					Set<Class> instantiableSubclasses = type2instantiableSubClasses.get(to);
					if (instantiableSubclasses != null) {
						for (Class subType : instantiableSubclasses) {
							depedencyGraph.addEdge(from, subType);
						}
					}
					depedencyGraph.addEdge(from, to);
				// }
			}
		}
		return depedencyGraph;
	}
	
//	private boolean isElementRefCS(Type to) {
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

	protected IGraph<Class> createDepedencyGraph() {
		return new Graph<Class>();
	}
	
	private boolean astCall(Element element) {
		if (element instanceof OperationCallExp) {
			Operation op = ((OperationCallExp)element).getReferredOperation();
			if (op != null) {
				return "ast".equals(op.getName());
			}
		}
		return false;
	}
	
	private Class getContextElement(OperationCallExp astCall) {
		
		EObject container = astCall.eContainer();
		while (container != null) {
			if (container instanceof Class) {
				return (Class) container;
			}
			container = container.eContainer();
		}
		throw new RuntimeException("I should have found the containing Context Class");
	}	
	
}
