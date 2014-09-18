package ocldependencyanalysis.cs2asanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import ocldependencyanalysis.graph2.AbstractGraphComputer;
import ocldependencyanalysis.graph2.AbstractGraphManager;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Graph;
import ocldependencyanalysis.graph2.Node;

import org.eclipse.emf.common.util.EList;
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

public class CS2ASAnalysisGraphComputer extends AbstractGraphComputer {

	// FIXME Quick workaround for ed's requirement 
	// Refactor and increase API to accept options
	public static boolean CLEAN_GRAPH = true;
		
	@Override
	protected void updateDependencyGraphFromCS2ASDescription(
			Graph dependencyGraph, Resource cs2asResource) {
		
		for (Class ownedClass : getUserClassesInvolvedInOCLDocPackages(cs2asResource)) {
			for (DomainOperation op : mManager.getAllOperations(ownedClass, null)) {
				Operation pivotOp = (Operation)op;
				if (isAstOp(pivotOp)) {
					updateGraphFromMappingOperation(ownedClass, pivotOp);
				} else if (isCstOp(pivotOp)) {
					updateGraphFromMappingOperation(ownedClass, pivotOp);
				}
			}
		}
		updateDependencyGraphFromLookupDescription(dependencyGraph);
	}

	private void updateGraphFromMappingOperationBody(Operation operation, MappingAction action) {
		
		ExpressionInOCL expInOCL = (ExpressionInOCL) operation.getBodyExpression();
		if (expInOCL != null) {
			OCLExpression oclExp = expInOCL.getBodyExpression();
			updateGraphFromMappingOpBodyElement(oclExp, action);
			for (TreeIterator<EObject> tit = EcoreUtil.getAllContents(oclExp, false); tit.hasNext(); ) {
				EObject next = tit.next();
				if (updateGraphFromMappingOpBodyElement(next, action)) tit.prune();
			}
		}
	}
	
	private boolean updateGraphFromMappingOpBodyElement(EObject element, ActionNode action) {
		
		if (isPropertyCallExp(element)) {
			updateGraphFromPropertyCallExp((PropertyCallExp) element, action);
		} else if (isAstCall(element)) {
			updateGraphFromAstCallExp((OperationCallExp) element, action);
		} else if (isLookupCall(element) && action instanceof ConstructorPartAction) {
			((ConstructorPartAction)action).setNeedsLookup(true);
		} else if (isOclContainerCall(element)) {
			updateGraphFromOclContainerCallExp((OperationCallExp) element, action);
		} else if (isConstructorExp(element)) {
			updateGraphFromConstructorExp((ConstructorExp) element, action);
		} else if (isConstrucorPart(element)) {
			updateGraphFromConstructorPart((ConstructorPart) element, action);
			return true; // prune
		}
		return false;
	}
	
	private void updateGraphFromAstCallExp(OperationCallExp astCallExp, ActionNode action) {
		ClassInfo astCallClassInfo = createClassInfo(action.getContext(), astCallExp.getType());
		addEdge(astCallClassInfo, action);
	}
	
	private void updateGraphFromOpposite(Class context, ExtendedPropertyInfo propertyInfo) {
		Property opposite = propertyInfo.getProperty().getOpposite();
		if (opposite != null) {
			ExtendedPropertyInfo to = createPropertyInfo(context, opposite.getOwningClass(), opposite);
			addEdge(propertyInfo, to);
		}
	}
	
	private void updateGraphFromMappingOperation(Class context, Operation operation ) {
		
		// We want to ensure some type will be constructed prior to create a dependency
		// with the context and the operation
		boolean constructsAClass = false;
		for (TreeIterator<EObject> tit = operation.eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof ConstructorExp) {
				constructsAClass = true;
			}
		}
		
		MappingAction opAction = createMappingAction(context, operation);
		
		if (constructsAClass) {
			ClassInfo fromInfo = createClassInfo(context, context);								
			addEdge(fromInfo, opAction);
			// Note the dependency with the constructed type will be done when
			// the constructor expression is analyzed
		}
		
		updateGraphFromMappingOperationBody(operation, opAction);
	}

	private void updateGraphFromConstructorExp(ConstructorExp constructorExp, ActionNode action) {
		
		ConstructorExpClassInfo constructedClass = createConstructorClassInfo(action.getContext(),  constructorExp);
		addEdge(action, constructedClass);
	}
	
	private void updateGraphFromConstructorPart(ConstructorPart cPart, ActionNode action ) {
		
		ConstructorExp cExp = (ConstructorExp) cPart.eContainer(); 
		Class context = action.getContext();
		
		ConstructorPartPropertyInfo cPartPropInfo = createConstructorPropertyInfo(context, cPart);
		ConstructorExpClassInfo classInfo = createConstructorClassInfo(context, cExp);		
		ConstructorPartAction cPartAction = createAction(context, cPart);
		
		addEdge(classInfo, cPartAction);
		Property prop = cPart.getReferredProperty();
		ExtendedPropertyInfo propInfo = createPropertyInfo(context, prop.getOwningClass(), prop);
		if (needsToUpdatePropertyInfoUpwardsAggregation( propInfo)) {
			updateGraphFromPropertyUpwardsAggregation( propInfo);			
		}
		addEdge(cPartAction, cPartPropInfo, true); // true to replace the basic ExtendedPropInfo
		
		updateGraphFromOpposite(context, propInfo);
		
		OCLExpression oclExp = cPart.getInitExpression();
		updateGraphFromMappingOpBodyElement(oclExp, cPartAction);
		for (TreeIterator<EObject> tit = EcoreUtil.getAllContents(oclExp, false); tit.hasNext(); ) {
			EObject next = tit.next();
			if (updateGraphFromMappingOpBodyElement(next, cPartAction)) tit.prune();
			
		}
	}
	
	private void updateGraphFromPropertyDownwardsAggregation(Class context, ExtendedPropertyInfo propInfo) {
		Set<Class> propOwnerDirectSubClasses = getDirectSubClasses(propInfo.getPropertyClass());
		if (propOwnerDirectSubClasses != null) {
			for (Class subtype : propOwnerDirectSubClasses) {
				ExtendedPropertyInfo to = createPropertyInfo(context, subtype, propInfo.getProperty());
				addEdge(propInfo, to);
				updateGraphFromPropertyDownwardsAggregation(context, to);
			}
		}
	}
	
	private void updateGraphFromPropertyUpwardsAggregation(ExtendedPropertyInfo propInfo) {
						
		for (Edge edge : new CopyOnWriteArrayList<Edge>(getOutgoing(propInfo))) {
			Node toNode = edge.getTo();
			if (toNode instanceof ExtendedPropertyInfo) {
				ExtendedPropertyInfo fromPropInfo = (ExtendedPropertyInfo) toNode;
				if (fromPropInfo.getProperty().equals(propInfo.getProperty())) {
					updateGraphFromPropertyUpwardsAggregation(fromPropInfo);
					invertEdge(edge);
				}
			}
		}
	}
	
	// check if the property upwards aggregation is already in place or not
	private boolean needsToUpdatePropertyInfoUpwardsAggregation(ExtendedPropertyInfo propInfo ) {
				
		for (Edge edge : getOutgoing(propInfo)) {
			Node toNode = edge.getTo();
			if (toNode instanceof ExtendedPropertyInfo) {
				ExtendedPropertyInfo toPropInfo = (ExtendedPropertyInfo) toNode;
				if (toPropInfo.getProperty().equals(propInfo.getProperty())) { // Same property == property aggregation
					return true;
				}
			}
		}
		return false;
	}
	
	private void updateGraphFromPropertyCallExp(PropertyCallExp propCallExp, ActionNode action) {
		// This propertyCallExp will be a prerequisite of the action
		PropertyCallExpInfo from = createPropertyCallExpInfo(action.getContext(), propCallExp);
		addEdge(from, action);
	}
	
	private void updateGraphFromOclContainerCallExp(OperationCallExp parentEnvCallExp, ActionNode action) {
		
		Class context = parentEnvCallExp.getSource().getType().isClass();
		for (ContainerClass contClass : getContainerClasses(context)) {
			ExtendedPropertyInfo propInfo = createPropertyInfo(action.getContext(), contClass.getContainerClass(), contClass.getContainmentProperty());
			addEdge(propInfo, action);
		}
	}
 
	protected void updateDependencyGraphFromLookupDescription(
			Graph dependencyGraph) {

		Map<ConstructorPartAction, OperationCallExp> lookupCPartAction2Operations = new HashMap<ConstructorPartAction, OperationCallExp>();
		
		for (Node analysisNode : dependencyGraph.getNodes()) {
			if (analysisNode instanceof ConstructorPartAction
				&& ((ConstructorPartAction) analysisNode).getNeedsLookup()) {
				ConstructorPartAction cPartAction = (ConstructorPartAction) analysisNode;
				OCLExpression initExp = cPartAction.getConstructorPart().getInitExpression();
				
				// FIXME can we have more than one lookup operation call ? Why not ?
				if (isLookupCall(initExp)) {
					lookupCPartAction2Operations.put(cPartAction, ((OperationCallExp)initExp));
				} else { 
					for (TreeIterator<EObject> tit = initExp.eAllContents(); tit.hasNext(); ) {
						EObject next = tit.next();
						if (isLookupCall(next)) {
							lookupCPartAction2Operations.put(cPartAction, ((OperationCallExp)next));
						}
					}
				}
			}
		}

		for (Entry<ConstructorPartAction,OperationCallExp> entry : lookupCPartAction2Operations.entrySet()) {
			OperationCallExp lookupCallExp =  entry.getValue();
			Set<EnvironmentAction> visitedActions = new HashSet<EnvironmentAction>();
			Set<Operation> visitedNonEnvOps = new HashSet<Operation>();
			updateGraphFromLookupOpLookupCallExp(visitedActions, visitedNonEnvOps, lookupCallExp, getType(lookupCallExp.getSource()).isClass(), entry.getKey());
		}
	}
	
	private void updateGraphFromLookupOpOperation(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, Class context, Class typeToLookup, Operation op, ActionNode action) {
		ExpressionInOCL expInOCL = (ExpressionInOCL)op.getBodyExpression();
		if (expInOCL != null) {
			OCLExpression oclExp = expInOCL.getBodyExpression();
			updagrGraphFromLookupOpOCLExpression(visitedActions, visitedNonEnvOps, oclExp, context, typeToLookup, op, action);			
			for (TreeIterator<EObject> tit = oclExp.eAllContents(); tit.hasNext(); ) {
				EObject next = tit.next();
				if (next instanceof OCLExpression) {
					updagrGraphFromLookupOpOCLExpression(visitedActions, visitedNonEnvOps, (OCLExpression) next, context, typeToLookup, op, action);
				}
			}
		}
	}
	
	private void updagrGraphFromLookupOpOCLExpression(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, OCLExpression oclExp, 
			Class context, Class typeToLookup, Operation op, ActionNode action) {
		if (isPropertyCallExp(oclExp)) {
			updateGraphFromLookupOpPropertyCallExp((PropertyCallExp) oclExp, action);
		} else if (isLookupCall(oclExp)){
			updateGraphFromLookupOpLookupCallExp(visitedActions, visitedNonEnvOps, (OperationCallExp) oclExp, context, action);
		} else if (isEnvCall(oclExp)) {
			updateGraphFromLookupOpEnvCallExp(visitedActions, visitedNonEnvOps, context,typeToLookup,action);
		} else if (isParentEnvCall(oclExp)) { 
			updateGraphFromParentEnvCallExp(visitedActions, visitedNonEnvOps, (OperationCallExp) oclExp, context, typeToLookup, action);
		} else if (isOclContainerCall(oclExp) ) { 
			updateGraphFromOclContainerCallExp(visitedActions, visitedNonEnvOps, (OperationCallExp) oclExp, context, typeToLookup, action);
		} else if (isOperationCallExp(oclExp)) {
			udpateGraphFromLookupOpOperationCallExp(visitedActions, visitedNonEnvOps, (OperationCallExp) oclExp, context, typeToLookup, action);
		}
	}
	
	private void updateGraphFromLookupOpPropertyCallExp(PropertyCallExp propCallExp, ActionNode action) {	
		Type propertySource = propCallExp.getSource().getType();
		ExtendedPropertyInfo propInfo = createPropertyInfo(propertySource.isClass(), propertySource, propCallExp.getReferredProperty()); // FIXME wait for studying if we finally need the context or not
		addEdge(propInfo, action);
	}

	private void updateGraphFromLookupOpLookupCallExp(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, OperationCallExp lookupCallExp,
			Class context, ActionNode action) {

		Operation lookupOp = lookupCallExp.getReferredOperation();
		if (!visitedNonEnvOps.contains(lookupOp)) {
			visitedNonEnvOps.add(lookupOp);
			Type typeToLookup = getType(lookupOp); // The type of the operation will tell us the partioned type we are interested in
			updateGraphFromLookupOpOperation(visitedActions, visitedNonEnvOps, context, typeToLookup.isClass(), lookupOp, action);
		}
	}
	
	private void updateGraphFromLookupOpEnvCallExp(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, 
			Class context, Class typeToLookup, ActionNode action) {

		Operation contextualOp = getEnvOperation(context, "_env_" + typeToLookup.getName()); // FIXME constant
		EnvironmentAction envAction = createEnvironmentAction(context, context, contextualOp);		
		EnvironmentInfo envInfo = createEnvironmentInfo(context, typeToLookup, context, contextualOp);
		addEdge(envInfo, action);
		addEdge(envAction, envInfo);
		if (!visitedActions.contains(envAction)) { // to control recursive dependencies on the environment computations
			visitedActions.add(envAction);
			ClassInfo classInfo = createClassInfo(context, context);
			addEdge(classInfo, envAction);
			updateGraphFromLookupOpOperation(visitedActions, visitedNonEnvOps, context, typeToLookup, contextualOp, envAction);	
		}
	}
	
	/*
	 * Given:
	 * 
	 * context OclElement
	 * def: parentEnv() : env::Environment =
	 *    let parent = oclContainer() in if parent = null then env::Environment { } else parent._env(self) endif
	 *    
	 * By usual statically analysis of the expression we can't deduce that the _env computation, in which this parentEnv operation is used, 
	 * depends on some env result computed by its SPECIFC containers (when invoking parent._env()). Therefore, we have to manually encode 
	 * these dependencies. 
	 * 
	 * In practice, it turns out to simulate the analysis of 
	 *     - oclContainer() => Dependency on the different properties in which the element may be contained
	 *     - parent._env(self) => calling an envCallExp using those containers types as the new context
	 */
	private void updateGraphFromParentEnvCallExp(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, OperationCallExp parentEnvCallExp,
			Class context, Class typeToLookup, ActionNode action) {
		
		for (ContainerClass contClass : getContainerClasses(context)) {
			ExtendedPropertyInfo propInfo = createPropertyInfo(context, contClass.getContainerClass(), contClass.getContainmentProperty());
			addEdge(propInfo, action);
			updateGraphFromLookupOpEnvCallExp(visitedActions, visitedNonEnvOps, contClass.getContainerClass(), typeToLookup, action);
		}
	}
	
	private void updateGraphFromOclContainerCallExp(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, OperationCallExp parentEnvCallExp,
			Class context, Class typeToLookup, ActionNode action) {
		
		for (ContainerClass contClass : getContainerClasses(context)) {
			ExtendedPropertyInfo propInfo = createPropertyInfo(context, contClass.getContainerClass(), contClass.getContainmentProperty());
			addEdge(propInfo, action);
		}
	}
	
	private void udpateGraphFromLookupOpOperationCallExp(Set<EnvironmentAction> visitedActions, Set<Operation> visitedNonEnvOps, OperationCallExp envCallExp,
			Class context, Class typeToLookup, ActionNode action) {
		
		Operation referredOp = envCallExp.getReferredOperation();
		if (!visitedNonEnvOps.contains(referredOp)) {
			visitedNonEnvOps.add(referredOp);
			updateGraphFromLookupOpOperation(visitedActions, visitedNonEnvOps, context, typeToLookup, referredOp, action);	
		}
			
		
	}

	@Override
	protected CS2ASAnalysisGraph createDependencyGraph() {
		return CS2ASAnalysisFactory.eINSTANCE.createCS2ASAnalysisGraph();
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
	
	protected MappingAction createMappingAction(Class context, Operation op) {
		return CS2ASNodesFactory.INSTANCE.createMappingAction(context, op);
	}
		
	protected ExtendedPropertyInfo createPropertyInfo(Class context, Type type, Property property) {
		return CS2ASNodesFactory.INSTANCE.createPropertyInfo(context, type.isClass(), property);
	}
	
	protected EnvironmentInfo createEnvironmentInfo(Class context, Type lookupType, Type opType, Operation op) {
		return CS2ASNodesFactory.INSTANCE.createEnvironmentInfo(context, lookupType.isClass(), opType.isClass(), op);
	}
	
	protected EnvironmentAction createEnvironmentAction(Class context, Type opType, Operation op) {
		return CS2ASNodesFactory.INSTANCE.createEnvironmentAction(context, opType.isClass(), op);
	}
	
	@Override
	protected void preprocess(Resource resource,
			Graph dependencyGraph) {
		
		Set<Property> computedProperties = new HashSet<Property>();
		Set<Class> computedClasses = new HashSet<Class>();
		// For every class we compute the inheritance base aggregation
		for (Class ownedClass : getUserClassesInvolvedInOCLDocPackages(resource)) {
			ClassInfo constructedClass = createClassInfo(ownedClass, ownedClass);
			updateGraphFromSuperClasses(constructedClass, computedClasses);
			// For every computed property We firstly build the aggregation links
			for (DomainOperation op : mManager.getAllOperations(ownedClass, null)) {
				Operation pivotOp = (Operation)op;
				if (isAstOp(pivotOp)) {
					updateGraphFromInvolvedProperties(pivotOp, computedProperties);
				} else if (isCstOp(pivotOp)) {
					updateGraphFromInvolvedProperties(pivotOp, computedProperties);
				}
			}
		}
	}
	
	private void updateGraphFromInvolvedProperties(Operation op, Set<Property> computedProperties) {
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
				updateGraphFromPropertyDownwardsAggregation(context, propInfo);
				computedProperties.add(property);
			}
		}
	}
	
	private void updateGraphFromSuperClasses( ClassInfo from, Set<Class> computedClasses) {
		
		Class theClass = from.getClass_();
		if (!computedClasses.contains(theClass)) {
			computedClasses.add(theClass);
			for (Class superClass : from.getClass_().getSuperClasses()) {
				ClassInfo to = createClassInfo(superClass, superClass);
				addEdge(from, to);
				updateGraphFromSuperClasses(to, computedClasses);
			}
		}
	}
	
	@Override
	protected void postprocess(Resource resource,
			Graph dependencyGraph) {
		
		if (CLEAN_GRAPH) {
			Set<Node> nodesToRemove = new HashSet<Node>();
			boolean graphChanged = true;
			while (graphChanged) {
				nodesToRemove.clear();
				for (Node node: dependencyGraph.getNodes()) {
					// We remove all the ClassInfo which are not consumed
					if (node instanceof ClassInfo) {
						if(node.getOutgoing().size() == 0) {
							nodesToRemove.add(node);
						}
					}
					
					// We remove all the ExtendedPropertyInfo which are not consumed (and not produced by an action)
					if (node instanceof ExtendedPropertyInfo) {
						if(node.getOutgoing().size() == 0) {
							boolean isOutputOfAction = false;
							for (Edge edge : node.getIncoming()) {
								if (edge.getFrom() instanceof ActionNode) {
									isOutputOfAction = true;
								}
							}
							if (!isOutputOfAction) {
								nodesToRemove.add(node);
							}
						}
					}
				}
				
				for  (Node node: nodesToRemove) {
					removeNode(node);
				}
				graphChanged = nodesToRemove.size() > 0;				
			}
		}
	}
	
	@Override
	protected AbstractGraphManager createGraphManager(Graph graph) {		
		return new CS2ASGraphManager(graph);
	}
	
	protected EList<Edge> getOutgoing(Node node) {
		return gManager.getOutgoing(node);
	}
	
	protected EList<Edge> getIncoming(Node node) {
		return gManager.getIncoming(node);
	}
	protected void addEdge(CS2ASAnalysisNode from, CS2ASAnalysisNode to) { 
		gManager.addEdge(from, to);
	}
	
	protected void addEdge(CS2ASAnalysisNode from, CS2ASAnalysisNode to, boolean replace) { 
		gManager.addEdge(from, to, replace);
	}
	
	protected void removeNode(Node node) {
		gManager.removeNode(node);
	}
	protected void invertEdge(Edge edge) {
		gManager.invertEdge(edge);
	}
}
