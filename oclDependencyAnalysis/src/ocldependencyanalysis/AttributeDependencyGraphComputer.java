package ocldependencyanalysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
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
public class AttributeDependencyGraphComputer {
	
	
	public class FeatureObj {
		private static final String SEPARATOR = " -> ";
		private Class context;
		private Feature property;
		/**
		 * @param context the source class context in which this property is being used
		 * @param feature a feature of the dependency graph 
		 */
		public FeatureObj(Class context, Feature property) {
			this.context = context;
			this.property = property;
		}
		
		@Override
		public String toString() {		
			return context.toString() + SEPARATOR + property.toString(); 
		}
	}
	
	public IGraph<FeatureObj> computeDependencyGraph (Resource pivotResource) {
		
		assert(pivotResource.getContents().get(0) instanceof Root);
		
		IGraph<FeatureObj> depedencyGraph = createDependencyGraph();
		
		for (TreeIterator<EObject> tit = pivotResource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof Element
				&& astCall((Element) next)) {
				OperationCallExp astCall = (OperationCallExp) next;
				FeatureObj from = getFromObj(astCall);
				// if (isElementRefCS(to)) {
				List<FeatureObj> toObjs = getToObj(astCall);
				for (FeatureObj to : toObjs) {
					depedencyGraph.addEdge(from, to);	
				}
				
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

	protected IGraph<FeatureObj> createDependencyGraph() {
		return new Graph<FeatureObj>();
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
	
	private Class getContextElement(CallExp astCall) {
		
		EObject container = astCall.eContainer();
		while (container != null) {
			if (container instanceof Class) {
				return (Class) container;
			}
			container = container.eContainer();
		}
		throw new RuntimeException("I should have found the containing Context Class");
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
	
	private List<FeatureObj> getToObj(OperationCallExp callExp) {
		
		List<FeatureObj> result = new ArrayList<FeatureObj>();
		result.add(new FeatureObj(getContextElement(callExp), callExp.getReferredOperation()));
		
		// If the ast call is source of another PropertyCallExp, we 
		// are interested in that AS property rather that AS object 
		EObject container = callExp.eContainer();		
		if (container instanceof PropertyCallExp) {
			PropertyCallExp propCall = (PropertyCallExp) container; 
			result.add(new FeatureObj(getContextElement(propCall), propCall.getReferredProperty()));
		}
		return result;
	}
}