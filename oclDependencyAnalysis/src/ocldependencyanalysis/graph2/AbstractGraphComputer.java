package ocldependencyanalysis.graph2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.ConstructorExp;
import org.eclipse.ocl.pivot.ConstructorPart;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.FeatureFilter;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.internal.manager.MetamodelManager;

/**
 * @author asbh500
 *
 * @param <C>
 */
public abstract class AbstractGraphComputer {

	public static class ContainerClass {
		
		private Class containerClass;
		
		private Property containmentProperty;
		
		public ContainerClass(Class containerClass, Property containmentProperty) {
			this.containerClass = containerClass;
			this.containmentProperty = containmentProperty;
		}
		
		public Class getContainerClass() {
			return containerClass;
		}
		
		public Property getContainmentProperty() {
			return containmentProperty;
		}
		
		@Override
		public String toString() {
			
			return containerClass.getName() + " - " + containmentProperty.getName();
		}
	}
	
	private Map<Class, Set<Class>> class2superClasses = new HashMap<Class, Set<Class>>();
		
	private Map<Class, Set<Class>> class2directSubClasses = new HashMap<Class, Set<Class>>();
	
	private Map<Class, Set<ContainerClass>> class2containerClasses = new HashMap<Class, Set<ContainerClass>>();
	
	protected MetamodelManager mManager;
	
	protected AbstractGraphManager gManager;
		
	private void initializeMaps(Resource resource) {
	
		for (Package aPackage : getPackageInvolvedInOCLDoc(resource)) {
			Package primPckg = (Package)mManager.getPrimaryPackage(aPackage);
			computeClass2SuperClasses(primPckg);
		}
		for (Class type : class2superClasses.keySet()) {
			computeClass2DirectSubClasses(type);
		}

		for (Class type : class2superClasses.keySet()) { // subtypes need to be previously computed
			computeClass2ContainerClasses(type);
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
		
		//aClass = mManager.getPrimaryType(aClass);
		Set<Class> result = class2superClasses.get(aClass);
		if (result != null) {
			return result;
		} else {
			result = new HashSet<Class>();
			class2superClasses.put(aClass, result);
		}
		
		for (Class superClass : aClass.getSuperClasses()) {
			//superClass = mManager.getPrimaryType(superClass);
			result.add(superClass);
			result.addAll(computeClass2SuperClasses(superClass));
		}
		return result;
	}
	
	private void computeClass2DirectSubClasses(Class aClass) {
			 
		for (Class superClass : aClass.getSuperClasses()) {
			//superClass = mManager.getPrimaryType(superClass);
			Set<Class> subClass = class2directSubClasses.get(superClass);
			if (subClass == null) {
				subClass = new HashSet<Class>();
				class2directSubClasses.put(superClass, subClass);
			}
			subClass.add(aClass);
		}
	}
	
	private void computeClass2ContainerClasses(Class aClass) {
		 
		for (Property property : aClass.getOwnedProperties()) {
			Type propType = getType(property);
			if (property.isComposite() && propType instanceof Class) {
				addContainerClassForTypeAndSubtypes(aClass, property, propType.isClass());
			}
		}
	}
	
	private void addContainerClassForTypeAndSubtypes(Class containerClass, Property containmentProperty, Class type) {
		
		//type = mManager.getPrimaryType(type);
		Set<ContainerClass> containerClasses = class2containerClasses.get(type);
		if (containerClasses == null) {
			containerClasses = new HashSet<ContainerClass>();
			class2containerClasses.put(type, containerClasses);
		}
		
		containerClasses.add(new ContainerClass(containerClass, containmentProperty));
		
		Set<Class> subTypes = getDirectSubClasses(type);
		if (subTypes != null) {
			for (Class subType : subTypes) {
				addContainerClassForTypeAndSubtypes(containerClass, containmentProperty, subType);
			}	
		}
	}
	
	protected Type getType(TypedElement typedElement) {
		Type type = typedElement.getType();
		if (type instanceof CollectionType) {
			type = ((CollectionType) type).getElementType();
		}
		return type;
	}
	
	protected List<Class> getUserClassesInvolvedInOCLDocPackages(Resource oclResource) {
			
		List<Class> result = new ArrayList<Class>();
		for (Package pckg : getPackageInvolvedInOCLDoc(oclResource)) {
			Package primaryPckg = (Package) mManager.getPrimaryPackage(pckg);
			String pckgName = primaryPckg.getName();
			if (!"ocl".equals(pckgName) && !"pivot".equals(pckgName) &&
				!"env".equals(pckgName)) { // We are ONLY interested in user classes
				for (Class ownedClass : primaryPckg.getOwnedClasses()) {
					result.add(ownedClass);
				}
			}
		}
		return result;
	}
	
	protected List<Package> getPackageInvolvedInOCLDoc(Resource oclResource) {
	
		List<Model> oclRoots = new ArrayList<Model>();
		for (Resource resource : oclResource.getResourceSet().getResources()) {
			for (EObject root : resource.getContents()) {
				if (root instanceof Model) {
					oclRoots.add((Model)root);
				}
			}
		}
		
		List<Package> result = new ArrayList<Package>();
		for (Model root : oclRoots) {
			for (Package pckg : root.getOwnedPackages()) { // FIXME we are not including nested packages, yet
				result.add(pckg);
			}
		}
		return result;
	}

	protected boolean typeIsSupertypeOf(Class t1, Class t2) {
		Type primaryT1 = mManager.getPrimaryType(t1);
		Type primaryT2 = mManager.getPrimaryType(t2);
		return class2superClasses.get(primaryT1).contains(primaryT2);
	}
	
	protected Set<Class> getDirectSubClasses(Class type) {
		Type primaryType = mManager.getPrimaryType(type);
		Set<Class> directSubClasses = class2directSubClasses.get(primaryType);
		return directSubClasses == null ? Collections.<Class>emptySet() : directSubClasses;
	}
	
	protected Set<ContainerClass> getContainerClasses(Class aClass) {
		Type asPrimaryType = mManager.getPrimaryType(aClass);
		Set<ContainerClass> containerClasses = class2containerClasses.get(asPrimaryType);
		return containerClasses == null ? Collections.<ContainerClass>emptySet() : containerClasses;
	}
	
	protected Operation getAstOperation(Class opAstClass) {	
		Operation bestOp=null;	// The best op will be the one owned by the type the 
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
	
	protected Operation getEnvOperation(Class opEnvClass, String envOpName) {
		Operation bestOp=null;	// The best op will be the one owned by the type the 
		// closer to opAstClass in the class hierarchy 
		// TODO move to mManager ?
		for (Operation op : mManager.getAllOperations(opEnvClass, FeatureFilter.SELECT_NON_STATIC, envOpName)){
			if (op instanceof Operation) {
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
	
	public Graph computeDependencyGraph (Resource cs2asResource) {
		assert(cs2asResource.getContents().get(0) instanceof Model);	
		mManager = MetamodelManager.getAdapter(cs2asResource.getResourceSet());
		Graph dependencyGraph = createDependencyGraph();
		gManager = createGraphManager(dependencyGraph);
		
		
		initializeMaps(cs2asResource);		
		preprocess(cs2asResource, dependencyGraph);			
		updateDependencyGraphFromCS2ASDescription(dependencyGraph, cs2asResource);		
		postprocess(cs2asResource, dependencyGraph);
		
		mManager = null;
		
		return dependencyGraph;
	}
	
	protected Graph createDependencyGraph() {
		return GraphFactory.eINSTANCE.createGraph();
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
	protected void preprocess(Resource resource, Graph dependencyGraph) {}
	
	
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
	protected void postprocess(Resource resource, Graph dependencyGraph) {}
	
	
	abstract protected AbstractGraphManager createGraphManager(Graph graph);
	
	abstract protected void updateDependencyGraphFromCS2ASDescription(Graph dependencyGraph, Resource cs2asResource);			
	
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
	
	protected boolean isEnvCall(EObject element) {
		if (isOperationCallExp(element)) {
			return isEnvOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isEnvOp(Operation op) {
		if (op == null) return false;
		String opName = op.getName();
		return opName == null ? false : opName.contains("_env");
	}
	
	protected boolean isParentEnvCall(EObject element) {
		if (isOperationCallExp(element)) {
			return isParenEnvOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	private boolean isParenEnvOp(Operation op) {
		if (op == null) return false;
		String opName = op.getName();
		return opName == null ? false : opName.equals("parentEnv") && op.getOwnedParameters().isEmpty();
	}
	
	protected boolean isOclContainerCall(EObject element) {
		if (isOperationCallExp(element)) {
			return isOclContainerOp(((OperationCallExp)element).getReferredOperation());
		}
		return false;
	}
	
	protected boolean isOclContainerOp(Operation op) {
		if (op == null) return false;
		String opName = op.getName();
		return opName == null ? false : opName.equals("oclContainer") && op.getOwnedParameters().isEmpty();
	}



	
	protected Class getEnvLookupClass(Operation op) {
		String envMark = "_env_";
		String opName = op.getName();
		if (opName.contains(envMark)) {
			String className = opName.substring(opName.indexOf(envMark) + envMark.length());
			for (Class aClass : class2superClasses.keySet()) { // FIXME cache
				if (className.equals(aClass.getName())) {
					return aClass;
				}
			}	
		}
		return (Class) mManager.getOclType("OclElement");
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
