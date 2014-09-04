package ocldependencyanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import ocldependencyanalysis.cs2asanalysis.ActionNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASNodesFactory;
import ocldependencyanalysis.cs2asanalysis.ClassInfo;
import ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartAction;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo;
import ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo;
import ocldependencyanalysis.cs2asanalysis.OperationAction;
import ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.OCLExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Type;

public class CS2ASAnalysisGraphComputer extends AbstractDependencyGraphComputer<CS2ASAnalysisNode>{

	// FIXME Quick workaround for ed's requirement 
	// Refactor and increase API to accept options
	public static boolean CLEAN_GRAPH = true;
	
	@Override
	protected void updateDependencyGraphFromCS2ASDescription(
			IGraph<CS2ASAnalysisNode> dependencyGraph, Resource cs2asResource) {
		
		
		for (Class ownedClass : getClassesInvolvedInOCLDocPackages(cs2asResource)) {
			for (DomainOperation op : mManager.getAllOperations(ownedClass, null)) {
				Operation pivotOp = (Operation)op;
				if (isAstOp(pivotOp)) {
					updateGraphFromMappingOperation(dependencyGraph, pivotOp);
				} else if (isCstOp(pivotOp)) {
					updateGraphFromMappingOperation(dependencyGraph, pivotOp);
				}
			}
		}
		
		updateDependencyGraphFromLookupDescription(dependencyGraph);
	}

	private void updateGraphFromOperationBody(IGraph<CS2ASAnalysisNode> dependencyGraph, Operation operation) {
		
		ExpressionInOCL expInOCL = (ExpressionInOCL) operation.getBodyExpression();
		if (expInOCL != null) {
			OCLExpression exp = expInOCL.getBodyExpression();
			if (isConstructorExp(exp)) {
				updateGraphFromConstructorExp(dependencyGraph, (ConstructorExp) exp);
			} else if (isPropertyCallExp(exp)) {
				updateGraphFromPropertyCallExp(dependencyGraph, (PropertyCallExp) exp);
			}
			for (TreeIterator<EObject> tit = EcoreUtil.getAllContents(exp, false); tit.hasNext(); ) {
				EObject next = tit.next();			
				if (isConstrucorPart(next)) {
					updateGraphFromConstructorPart(dependencyGraph, (ConstructorPart) next);
					tit.prune(); // routine above will process contained relevant expressions-> prune
				} else if (isConstructorExp(next)) {
					updateGraphFromConstructorExp(dependencyGraph, (ConstructorExp) next);
				} 
				else if (isPropertyCallExp(next)) {
					updateGraphFromPropertyCallExp(dependencyGraph, (PropertyCallExp) next);
				}
			}
		}		
	}
	

	private void updateGraphFromConstructorPart(IGraph<CS2ASAnalysisNode> dependencyGraph, ConstructorPart cPart ) {
	
		ConstructorExp cExp = (ConstructorExp) cPart.eContainer(); 
		Class context = getElementContext(cExp);
		
		ConstructorPartPropertyInfo cPartPropInfo = createConstructorPropertyInfo(context, cPart);
		ConstructorExpClassInfo typeInfo = createConstructorClassInfo(context, cExp);		
		ConstructorPartAction action = createAction(context, cPart);
		
		dependencyGraph.addEdge(typeInfo, action);
		Property prop = cPart.getReferredProperty();
		ExtendedPropertyInfo propInfo = createPropertyInfo(context, prop.getOwningClass(), prop);
		if (needsToUpdatePropertyInfoUpwardsAggregation(dependencyGraph, propInfo)) {
			INode<CS2ASAnalysisNode> node = dependencyGraph.getNode(propInfo);
			if (node != null) {
				updateGraphFromPropertyUpwardsAggregation(dependencyGraph, node, propInfo);
			}
			
		}
		dependencyGraph.addEdge(action, cPartPropInfo, true); // true to replace the basic ExtendedPropInfo
		
		updateGraphFromOpposite(dependencyGraph, context, propInfo);
		// updateGraphFromOpposite(dependencyGraph, context, cPartPropInfo, action);
		// updateGraphFromSuperClasssProperty(dependencyGraph, context, cPartPropInfo.getProperty().getOwningType(), cPartPropInfo);
				
		updateGraphFromInnerOCLExpression(dependencyGraph, context, action, cPart.getInitExpression());
		boolean containsLookupCall = isLookupCall(cPart.getInitExpression());
		for (TreeIterator<EObject> tit = cPart.getInitExpression().eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof OCLExpression) {
				updateGraphFromInnerOCLExpression(dependencyGraph, context, action, (OCLExpression)next);
				if (isLookupCall(next)) {
					containsLookupCall = true;
				}
			}
		}
		
		if (containsLookupCall) {
			action.setNeedsLookup(Boolean.TRUE);
		}
	}
	
	private void updateGraphFromOpposite(IGraph<CS2ASAnalysisNode> dependencyGraph,
			Class context, ExtendedPropertyInfo propertyInfo) {
		Property opposite = propertyInfo.getProperty().getOpposite();
		if (opposite != null) {
			ExtendedPropertyInfo to = createPropertyInfo(context, opposite.getOwningClass(), opposite);
//			dependencyGraph.addEdge(action, to, true); // true to replace the basic ExtendedPropInfo
			dependencyGraph.addEdge(propertyInfo, to);
			// updateGraphFromSuperClasssProperty(dependencyGraph, context, opposite.getOwningClass(), to);
		}
	}

	private void  updateGraphFromInnerOCLExpression(IGraph<CS2ASAnalysisNode> dependencyGraph, 
			Class context, ConstructorPartAction action, OCLExpression oclExp) {
		if (isAstCall(oclExp)) {
			ClassInfo astCallClassInfo = createClassInfo(context, ((OperationCallExp)oclExp).getType());
			dependencyGraph.addEdge(astCallClassInfo, action);
		} else if (isPropertyCallExp(oclExp)) {
			PropertyCallExpInfo pcePropInfo = createPropertyCallExpInfo(context, (PropertyCallExp)oclExp);
			dependencyGraph.addEdge(pcePropInfo, action);
		}
	}
	
	private void updateGraphFromMappingOperation(IGraph<CS2ASAnalysisNode> dependencyGraph, Operation operation ) {
		
		// We want to ensure some type will be constructed prior to create a dependency
		// with the context and the operation
		boolean constructsAClass = false;
		for (TreeIterator<EObject> tit = operation.eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof ConstructorExp) {
				constructsAClass = true;
			}
		}
		
		if (constructsAClass) {
			Class context = getElementContext(operation);
			ClassInfo fromInfo = createClassInfo(context, context);
			OperationAction opAction = createOperationAction(context, operation);					
			dependencyGraph.addEdge(fromInfo, opAction);
			// Note the dependency with the constructed type will be done when
			// the constructor expression is analysed
		}
		
		updateGraphFromOperationBody(dependencyGraph,operation);
	}
	
	
//	private void updateGraphFromOperationCallExp(IGraph<Computation> dependencyGraph, ComputationAction action,  OperationCallExp opCall) {
//		
//		Class context = getElementContext(opCall);
//		ConstructorPart cPart = getContainingConstructorPart(opCall);
//				
//		// The action will depend on every containing property call expression (inputs of the action)
//		Element element = opCall;
//		do {
//			PropertyCallExp propCallExp = getContainingPropertyCallExp(element);
//			if (propCallExp != null) {
//				PropCallExpInfo pcePropInfo = createPropertyCallExp(context, propCallExp);
//				dependencyGraph.addEdge(pcePropInfo, action);
//			}
//			element = propCallExp;
//		} while (element != null);
//	}

	private void updateGraphFromConstructorExp(IGraph<CS2ASAnalysisNode> dependencyGraph, ConstructorExp constructorExp) {
		
		
		Operation op = getContainingOperation(constructorExp);
		Class csContext = op.getOwningClass();
		// If the create a narrower type
		if (isAstOp(op)
			|| isCstOp(op)) {
			//if (!constructorExp.getType().equals(op.getType())) {
				OperationAction opAction = createOperationAction(csContext, op);
				ConstructorExpClassInfo constructedClass = createConstructorClassInfo(csContext,  constructorExp);
				dependencyGraph.addEdge(opAction, constructedClass);				
			//}
		}
		// We always create pre-requiste dependency between a constructed type and it's subtypes
		ConstructorExpClassInfo constructedClass = createConstructorClassInfo(csContext,  constructorExp);
		updateGraphFromSuperClasses(dependencyGraph, csContext, constructedClass); 	
	}
	
	private void updateGraphFromSuperClasses(IGraph<CS2ASAnalysisNode> dependencyGraph, Class context, ClassInfo from) {
		
		for (Class superClass : from.getClass_().getSuperClasses()) {
			ClassInfo to = createClassInfo(context, superClass);
			dependencyGraph.addEdge(from, to);
			updateGraphFromSuperClasses(dependencyGraph, context, to);
		}
	}
	
	private void updateGraphFromPropertyDownwardsAggregation(IGraph<CS2ASAnalysisNode> dependencyGraph, Class context, ExtendedPropertyInfo propInfo) {
		Set<Class> propOwnerDirectSubClasses = getDirectSubClasses(propInfo.getPropertyClass());
		if (propOwnerDirectSubClasses != null) {
			for (Class subtype : propOwnerDirectSubClasses) {
				ExtendedPropertyInfo to = createPropertyInfo(context, subtype, propInfo.getProperty());
				dependencyGraph.addEdge(propInfo, to);
				updateGraphFromPropertyDownwardsAggregation(dependencyGraph, context, to);
			}
		}
	}
	
	
	private void updateGraphFromPropertyUpwardsAggregation(IGraph<CS2ASAnalysisNode> dependencyGraph, INode<CS2ASAnalysisNode> node, ExtendedPropertyInfo propInfo) {
						
		for (IEdge<CS2ASAnalysisNode> edge : new CopyOnWriteArrayList<>(dependencyGraph.getOutputEdges(node))) {
			INode<CS2ASAnalysisNode> toNode = edge.getTo();
			if (toNode.getObject() instanceof ExtendedPropertyInfo) {
				ExtendedPropertyInfo fromPropInfo = (ExtendedPropertyInfo) toNode.getObject();
				if (fromPropInfo.getProperty().equals(propInfo.getProperty())) {
					updateGraphFromPropertyUpwardsAggregation(dependencyGraph, toNode, fromPropInfo);
					dependencyGraph.invertEdge(edge);
				}
			}
		}
	}
	
	// check that the property upwards aggregation is already in place or not
	private boolean needsToUpdatePropertyInfoUpwardsAggregation(IGraph<CS2ASAnalysisNode> dependencyGraph, ExtendedPropertyInfo propInfo ) {
				
		INode<CS2ASAnalysisNode> node = dependencyGraph.getNode(propInfo);
		if (node != null) {		
			for (IEdge<CS2ASAnalysisNode> edge : dependencyGraph.getOutputEdges(node)) {
				INode<CS2ASAnalysisNode> toNode = edge.getTo();
				if (toNode.getObject() instanceof ExtendedPropertyInfo) {
					ExtendedPropertyInfo toPropInfo = (ExtendedPropertyInfo) toNode.getObject();
					if (toPropInfo.getProperty().equals(propInfo.getProperty())) { // Same property == property aggregation
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private void updateGraphFromPropertyCallExp(
			IGraph<CS2ASAnalysisNode> dependencyGraph, PropertyCallExp propCallExp) {
		// This propertyCallExp will be a prerequisite of the containing operation (cst/ast)
		Operation op = getContainingOperation(propCallExp);
		Class csContext = op.getOwningClass();
		if (isAstOp(op)
				|| isCstOp(op)) {
			PropertyCallExpInfo from = createPropertyCallExpInfo(csContext, propCallExp);
			OperationAction to = createOperationAction(csContext, op);
			dependencyGraph.addEdge(from, to);
		}
	}
	
 
	protected void updateDependencyGraphFromLookupDescription(
			IGraph<CS2ASAnalysisNode> dependencyGraph) {

		Map<ConstructorPartAction, Operation> lookupCPartAction2Operations = new HashMap<ConstructorPartAction, Operation>();
		
		for (INode<CS2ASAnalysisNode> node : dependencyGraph.getNodes()) {
			CS2ASAnalysisNode analysisNode = node.getObject();
			if (analysisNode instanceof ConstructorPartAction
				&& ((ConstructorPartAction) analysisNode).getNeedsLookup()) {
				ConstructorPartAction cPartAction = (ConstructorPartAction)analysisNode;
				OCLExpression initExp = cPartAction.getConstructorPart().getInitExpression();
				
				// FIXME can we have more that one lookup operation call ? Why not ?
				if (isLookupCall(initExp)) {
					lookupCPartAction2Operations.put(cPartAction, ((OperationCallExp)initExp).getReferredOperation());
				} else { 
					for (TreeIterator<EObject> tit = initExp.eAllContents(); tit.hasNext(); ) {
						EObject next = tit.next();
						if (isLookupCall(next)) {
							lookupCPartAction2Operations.put(cPartAction, ((OperationCallExp)next).getReferredOperation());
						}
					}
				}
			}
		}

		for (Entry<ConstructorPartAction,Operation> entry : lookupCPartAction2Operations.entrySet()) {
			updateGraphFromLookupOperation(dependencyGraph, entry.getKey(), entry.getValue());
		}
	}
	
	private void updateGraphFromLookupOperation(IGraph<CS2ASAnalysisNode> dependencyGraph, ConstructorPartAction action,
								Operation lookupOp) {
		
		Set<ExtendedPropertyInfo> propInfos = new HashSet<ExtendedPropertyInfo>();
		updateExtendedPropertyInfosInvolvedInOperation(propInfos, new HashSet<Operation>(), lookupOp);		
		for (ExtendedPropertyInfo propInfo : propInfos) {
			dependencyGraph.addEdge(propInfo, action);
		}
	}
	
	// FIXME cache
	private void updateExtendedPropertyInfosInvolvedInOperation(Set<ExtendedPropertyInfo> properties, Set<Operation> visitedOps, Operation op) {
		
		visitedOps.add(op);
		ExpressionInOCL expInOCL = (ExpressionInOCL)op.getBodyExpression();
		if (expInOCL != null) {
			OCLExpression oclExp = expInOCL.getBodyExpression();
			for (TreeIterator<EObject> tit = oclExp.eAllContents(); tit.hasNext(); ) {
				EObject next = tit.next();
				if (isPropertyCallExp(next)) {
					PropertyCallExp propCallExp = (PropertyCallExp) next;
					properties.add(createPropertyInfo(null, propCallExp.getSource().getType(), propCallExp.getReferredProperty())); // FIXME wait for studying if we finally need the context or not				
				} else if (isOperationCallExp(next)) {
					Operation referredOp = ((OperationCallExp)next).getReferredOperation();
					if (!visitedOps.contains(referredOp)) {
						updateExtendedPropertyInfosInvolvedInOperation(properties, visitedOps, referredOp);
					}
				}
			}
		}
	}

	protected ConstructorPartAction createAction(Class context, ConstructorPart cPart) {
		return CS2ASNodesFactory.INSTANCE.createAction(context, cPart);
	}
	
	protected ConstructorPartPropertyInfo createConstructorPropertyInfo(Class context, ConstructorPart cPart) {
		return CS2ASNodesFactory.INSTANCE.createConstructorPropertyInfo(context, cPart);
	}
	
	protected ConstructorExpClassInfo createConstructorClassInfo(Class context, ConstructorExp cExp) {
		return CS2ASNodesFactory.INSTANCE.createConstructorClassInfo(context, cExp);
	}
	
	protected ClassInfo createClassInfo(Class context, Type type) {
		return CS2ASNodesFactory.INSTANCE.createClassInfo(context, type.isClass());
	}
	
	protected PropertyCallExpInfo createPropertyCallExpInfo(Class context, PropertyCallExp propCallExp) {
		return CS2ASNodesFactory.INSTANCE.createPropertyCallExp(context, propCallExp);
	}
	
	protected OperationAction createOperationAction(Class context, Operation op) {
		return CS2ASNodesFactory.INSTANCE.createOperationAction(context, op);
	}
	
	protected ExtendedPropertyInfo createPropertyInfo(Class context, Type type, Property property) {
		return CS2ASNodesFactory.INSTANCE.createPropertyInfo(context, type.isClass(), property);
	}
	
	
	@Override
	protected void preprocess(Resource resource,
			IGraph<CS2ASAnalysisNode> dependencyGraph) {
		
		// For every computed property We firstly build the aggregation links
		// FIXME do the same with the types, now ?
		Set<Property> computedProperties = new HashSet<Property>();
		for (Class ownedClass : getClassesInvolvedInOCLDocPackages(resource)) {
			for (DomainOperation op : mManager.getAllOperations(ownedClass, null)) {
				Operation pivotOp = (Operation)op;
				if (isAstOp(pivotOp)) {
					updateGraphFromInvolvedProperties(dependencyGraph, pivotOp, computedProperties);
				} else if (isCstOp(pivotOp)) {
					updateGraphFromInvolvedProperties(dependencyGraph, pivotOp, computedProperties);
				}
			}
		}
	}
	
	private void updateGraphFromInvolvedProperties(IGraph<CS2ASAnalysisNode> dependencyGraph, Operation op, Set<Property> computedProperties) {
		for (TreeIterator<EObject> tit = EcoreUtil.getAllContents(op, true); tit.hasNext(); ) {
			EObject next = tit.next();
			Property property = null;
			if (isConstrucorPart(next)) {
				property =  ((ConstructorPart) next).getReferredProperty();
			} else if (isPropertyCallExp(next))  {
				property = ((PropertyCallExp)next).getReferredProperty();
			}
			
			if (property != null && !computedProperties.contains(property)) {
				Class context = getElementContext((Element)next);
				ExtendedPropertyInfo propInfo = createPropertyInfo(context, property.getOwningClass() , property); 
				updateGraphFromPropertyDownwardsAggregation(dependencyGraph, context, propInfo);
				computedProperties.add(property);
				
//				Property opposite = property.getOpposite();
//				if (opposite != null && !computedProperties.contains(opposite)) {
//					ExtendedPropertyInfo oppPropInfo = createPropertyInfo(context, opposite.getOwningClass(), opposite);
//					updateGraphFromPropertyDownwardsClassHierarchy(dependencyGraph, context, oppPropInfo);					
//					dependencyGraph.addEdge(propInfo, oppPropInfo); // Link between opposites
//					computedProperties.add(opposite);
//				}
			}
		}
	}
	
	@Override
	protected void postprocess(Resource resource,
			IGraph<CS2ASAnalysisNode> dependencyGraph) {
		
		if (CLEAN_GRAPH) {
			List<INode<CS2ASAnalysisNode>> nodesToRemove = new ArrayList<>();
			boolean graphChanged = true;
			while (graphChanged) {
				nodesToRemove.clear();
				for (INode<CS2ASAnalysisNode> node: dependencyGraph.getNodes()) {
					// We remove all the ClassInfo which are not consumed
					if (node.getObject() instanceof ClassInfo) {
						if(dependencyGraph.getOutputEdges(node).size() == 0) {
							nodesToRemove.add(node);
						}
					}
					
					// We remove all the ExtendedPropertyInfo which are not consumed (and not produced by an action)
					if (node.getObject() instanceof ExtendedPropertyInfo) {
						if(dependencyGraph.getOutputEdges(node).size() == 0) {
							boolean isOutputOfAction = false;
							for (IEdge<CS2ASAnalysisNode> edge : dependencyGraph.getInputEdges(node)) {
								if (edge.getFrom().getObject() instanceof ActionNode) {
									isOutputOfAction = true;
								}
							}
							if (!isOutputOfAction) {
								nodesToRemove.add(node);
							}
						}
					}
				}
				
				for  (INode<CS2ASAnalysisNode> node: nodesToRemove) {
					dependencyGraph.removeNode(node);
				}
				graphChanged = nodesToRemove.size() > 0;				
			}
		}
	}
}
