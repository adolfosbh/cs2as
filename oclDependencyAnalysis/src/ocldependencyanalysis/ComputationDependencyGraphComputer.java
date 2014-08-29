package ocldependencyanalysis;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.OCLExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Type;

public class ComputationDependencyGraphComputer extends AbstractDependencyGraphComputer<Computation>{

	
	@Override
	protected void updateDependencyGraphFromCS2ASDescription(
			IGraph<Computation> dependencyGraph, Resource cs2asResource) {
		
		for (TreeIterator<EObject> tit = cs2asResource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (isConstrucorPart(next)) {
				updateGraphFromConstructorPart(dependencyGraph, (ConstructorPart) next);
				tit.prune(); // routine above will process contained relevant expressions-> prune
			} else if (isConstructorExp(next)) {
				updateGraphFromConstructorExp(dependencyGraph, (ConstructorExp) next);
			} 
			else if (isAstOp(next)) {
				updateGraphFromMappingOperation(dependencyGraph, (Operation) next);
			} else if (isCstOp(next)) {
				updateGraphFromMappingOperation(dependencyGraph, (Operation) next); 
			} 
			else if (isPropertyCallExp(next)) {
				updateGraphFromPropertyCallExp(dependencyGraph, (PropertyCallExp) next);
			}
		}
	}


	private void updateGraphFromConstructorPart(IGraph<Computation> dependencyGraph, ConstructorPart cPart ) {
	
		ConstructorExp cExp = (ConstructorExp) cPart.eContainer(); 
		Type context = getElementContext(cExp);
		
		ConstructorPartPropertyInfo propInfo = createConstructorPropertyInfo(context, cPart);
		ConstructorExpTypeInfo typeInfo = createConstructorTypeInfo(context, cExp);		
		ConstructorPartAction action = createAction(context, cPart);
		
		dependencyGraph.addEdge(typeInfo, action);
		dependencyGraph.addEdge(action, propInfo, true); // true to replace the basic ExtendedPropInfo
		
		// updateGraphFromOpposite(dependencyGraph, context, propInfo, action);
		// updateGraphFromSuperTypesProperty(dependencyGraph, context, propInfo.getProperty().getOwningType(), propInfo);
		
		updateGraphFromInnerOCLExpression(dependencyGraph, context, action, cPart.getInitExpression());
		for (TreeIterator<EObject> tit = cPart.getInitExpression().eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof OCLExpression) {
				updateGraphFromInnerOCLExpression(dependencyGraph, context, action, (OCLExpression)next);
			}			
		}
	}
	
//	private void updateGraphFromOpposite(IGraph<Computation> dependencyGraph,
//			Type context, ConstructorPartPropertyInfo propertyInfo, ConstructorPartAction action) {
//		Property opposite = propertyInfo.getProperty().getOpposite();
//		if (opposite != null) {
//			OppositePropertyInfo to = createOppositePropertyInfo(context, opposite);
//			dependencyGraph.addEdge(action, to, true); // true to replace the basic ExtendedPropInfo
//			dependencyGraph.addEdge(propertyInfo, to);
//			// updateGraphFromSuperTypesProperty(dependencyGraph, context, opposite.getOwningType(), to);
//		}
//	}


	private void  updateGraphFromInnerOCLExpression(IGraph<Computation> dependencyGraph, 
			Type context, ConstructorPartAction action, OCLExpression oclExp) {
		if (isAstCall(oclExp)) {
			ComputationType astCallTypeInfo = createTypeInfo(context, ((OperationCallExp)oclExp).getType());
			dependencyGraph.addEdge(astCallTypeInfo, action);
		} else if (isPropertyCallExp(oclExp)) {
			PropertyCallExpInfo pcePropInfo = createPropertyCallExp(context, (PropertyCallExp)oclExp);
			dependencyGraph.addEdge(pcePropInfo, action);
		}
	}
	
	private void updateGraphFromMappingOperation(IGraph<Computation> dependencyGraph, Operation operation ) {
		
		// We want to ensure some type will be constructed prior to create a dependency
		// with the context and the operation
		boolean constructsAType = false;
		for (TreeIterator<EObject> tit = operation.eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof ConstructorExp) {
				constructsAType = true;
			}
		}
		
		if (constructsAType) {
			Type context = getElementContext(operation);
			TypeInfo fromInfo = createTypeInfo(context, context);
			OperationAction opAction = createOperationAction(context, operation);					
			dependencyGraph.addEdge(fromInfo, opAction);
			// Note the dependency with the constructed type will be done when
			// the constructor expression is analysed
		}
	}
	
	
//	private void updateGraphFromOperationCallExp(IGraph<Computation> dependencyGraph, ComputationAction action,  OperationCallExp opCall) {
//		
//		Type context = getElementContext(opCall);
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

	private void updateGraphFromConstructorExp(IGraph<Computation> dependencyGraph, ConstructorExp constructorExp) {
		
		
		Operation op = getContainingOperation(constructorExp);
		Type csContext = op.getOwningType();
		// If the create a narrower type
		if (isAstOp(op)
			|| isCstOp(op)) {
			//if (!constructorExp.getType().equals(op.getType())) {
				OperationAction opAction = createOperationAction(csContext, op);
				ConstructorExpTypeInfo constructedType = createConstructorTypeInfo(csContext,  constructorExp);
				dependencyGraph.addEdge(opAction, constructedType);				
			//}
		}
		// We always create pre-requiste dependency between a constructed type and it's subtypes
		ConstructorExpTypeInfo constructedType = createConstructorTypeInfo(csContext,  constructorExp);
		updateGraphFromSuperTypes(dependencyGraph, csContext, constructedType); 	
	}
	
	private void updateGraphFromSuperTypes(IGraph<Computation> dependencyGraph, Type context, ComputationType from) {
		
		for (Type superType : from.getType().getSuperClass()) {
			TypeInfo to = createTypeInfo(context, superType);
			dependencyGraph.addEdge(from, to);
			updateGraphFromSuperTypes(dependencyGraph, context, to);
		}
	}
	
	private void updateGraphFromSuperTypesProperty(IGraph<Computation> dependencyGraph, Type context, ExtendedPropertyInfo propInfo) {

		Set<Type> propOwnerDirectSubTypes = getDirectSubtypes(propInfo.getPropertyType());
		if (propOwnerDirectSubTypes != null) {
			for (Type subtype : propOwnerDirectSubTypes) {
				ExtendedPropertyInfo from = createPropertyInfo(context, subtype, propInfo.getProperty());
				dependencyGraph.addEdge(from, propInfo);
				updateGraphFromSuperTypesProperty(dependencyGraph, context, from);
			}
		}
	}
	
	private void updateGraphFromPropertyCallExp(
			IGraph<Computation> dependencyGraph, PropertyCallExp propCallExp) {
		// This propertyCallExp will be a prerequisite of the containing operation (cst/ast)
		Operation op = getContainingOperation(propCallExp);
		Type csContext = op.getOwningType();
		if (isAstOp(op)
				|| isCstOp(op)) {
			PropertyCallExpInfo from = createPropertyCallExp(csContext, propCallExp);
			OperationAction to = createOperationAction(csContext, op);
			dependencyGraph.addEdge(from, to);
		}
	}
	
	@Override
	protected void updateDependencyGraphFromLookupDescription(
			IGraph<Computation> dependencyGraph, Resource lookupDescription) {

	}
	
	protected ConstructorPartAction createAction(Type context, ConstructorPart cPart) {
		return new ConstructorPartAction(context, cPart);
	}
	
	protected ConstructorPartPropertyInfo createConstructorPropertyInfo(Type context, ConstructorPart cPart) {
		return new ConstructorPartPropertyInfo(context, cPart);
	}
	
	protected ConstructorExpTypeInfo createConstructorTypeInfo(Type context, ConstructorExp cExp) {
		return new ConstructorExpTypeInfo(context, cExp);
	}
	
	protected TypeInfo createTypeInfo(Type context, Type type) {
		return new TypeInfo(context, type);
	}
	
	protected PropertyCallExpInfo createPropertyCallExp(Type context, PropertyCallExp propCallExp) {
		return new PropertyCallExpInfo(context, propCallExp);
	}
	
	protected OperationAction createOperationAction(Type context, Operation op) {
		return new OperationAction(context, op);
	}
	
	protected OppositePropertyInfo createOppositePropertyInfo(Type context, Property opposite) {
		return new OppositePropertyInfo(context, opposite);
	}
	
	protected ExtendedPropertyInfo createPropertyInfo(Type context, Type type, Property property) {
		return new ExtendedPropertyInfo(context, type, property);
	}
	
	
	@Override
	protected void preprocess(Resource resource,
			IGraph<Computation> dependencyGraph) {
		
		// For every computed property We firstly build the aggregation links
		// FIXME do the same with the types, now ?
		Set<Property> computedProperties = new HashSet<Property>();
		for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			Property property = null;
			if (isConstrucorPart(next)) {
				property =  ((ConstructorPart) next).getReferredProperty();
			} else if (isPropertyCallExp(next))  {
				property = ((PropertyCallExp)next).getReferredProperty();
			}
			
			if (property != null && !computedProperties.contains(property)) {
				Type context = getElementContext((Element)next);
				ExtendedPropertyInfo propInfo = createPropertyInfo(context, property.getOwningType() , property); 
				updateGraphFromSuperTypesProperty(dependencyGraph, context, propInfo);
				computedProperties.add(property);
				
				Property opposite = property.getOpposite();
				if (opposite != null && !computedProperties.contains(opposite)) {
					ExtendedPropertyInfo oppPropInfo = createPropertyInfo(context, opposite.getOwningType(), opposite);
					updateGraphFromSuperTypesProperty(dependencyGraph, context, oppPropInfo);					
					dependencyGraph.addEdge(propInfo, oppPropInfo); // Link between opposites
					computedProperties.add(opposite);
				}
			}
		}		
	}
	
	
	@Override
	protected void postprocess(Resource resource,
			IGraph<Computation> dependencyGraph) {
		List<INode<Computation>> nodesToRemove = new ArrayList<>();
		boolean graphChanged = true;
		while (graphChanged) {
			nodesToRemove.clear();
			for (INode<Computation> node: dependencyGraph.getNodes()) { 
				// We remove all the TypeInfo which are not consumed			
				if (node.getObject() instanceof TypeInfo) {
					if(dependencyGraph.getOutputEdges(node).size() == 0) {
						nodesToRemove.add(node);
					}
				}
				
//				// We remove all the OppositePropertyInfo which are not computed
//				if (node.getObject() instanceof OppositePropertyInfo) {
//					if(dependencyGraph.getOutputEdges(node).size() == 0) {
//						nodesToRemove.add(node);
//					}
//				}
			}
			
			for  (INode<Computation> node: nodesToRemove) {
				dependencyGraph.removeNode(node);
			}
			graphChanged = nodesToRemove.size() > 0;
		}
	}
}
