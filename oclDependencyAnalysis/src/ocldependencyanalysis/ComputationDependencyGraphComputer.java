package ocldependencyanalysis;


import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.OCLExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
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
				tit.next();
			} else if (isConstructorExp(next)) {
				updateGraphFromConstructorExp(dependencyGraph, (ConstructorExp) next);
			} else if (isAstOp(next)) {
				updateGraphFromMappingOperation(dependencyGraph, (Operation) next);
			} else if (isCstOp(next)) {
				updateGraphFromMappingOperation(dependencyGraph, (Operation) next); 
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
		dependencyGraph.addEdge(action, propInfo);
		
		updateGraphFromInnerOCLExpression(dependencyGraph, context, action, cPart.getInitExpression());
		for (TreeIterator<EObject> tit = cPart.getInitExpression().eAllContents(); tit.hasNext(); ) {
			EObject next = tit.next();
			if (next instanceof OCLExpression) {
				updateGraphFromInnerOCLExpression(dependencyGraph, context, action, (OCLExpression)next);
			}			
		}
	}
	
	private void  updateGraphFromInnerOCLExpression(IGraph<Computation> dependencyGraph, 
			Type context, ConstructorPartAction action, OCLExpression oclExp) {
		if (isAstCall(oclExp)) {
			ComputationType astCallTypeInfo = createTypeInfo(context, ((OperationCallExp)oclExp).getType());
			dependencyGraph.addEdge(astCallTypeInfo, action);
		} else if (oclExp instanceof PropertyCallExp) {
			PropertyCallExpInfo pcePropInfo = createPropertyCallExp(context, (PropertyCallExp)oclExp);
			dependencyGraph.addEdge(pcePropInfo, action);
		}
	}
	
	private void updateGraphFromMappingOperation(IGraph<Computation> dependencyGraph, Operation operation ) {
		
		Type context = getElementContext(operation);
		
		TypeInfo fromInfo = createTypeInfo(context, context);
		OperationAction opAction = createOperationAction(context, operation);
		TypeInfo toInfo = createTypeInfo(context, operation.getType());
				
		dependencyGraph.addEdge(fromInfo, opAction);
		dependencyGraph.addEdge(opAction, toInfo);
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
		if (isAstOp(op)
			|| isCstOp(op)) {
			
			if (!constructorExp.getType().equals(op.getType())) {	// The created type should be a subtype
				// FIXME What to do if the created type is the same of the ast type. We can't create it twice
				// Note, if we have CS2CS, this should not happen
				ComputationType from = createTypeInfo(csContext, op.getType());
				ConstructorExpTypeInfo to = createConstructorTypeInfo(csContext,  constructorExp);								
				dependencyGraph.addEdge(from, to);
			}
		} 
//		else if (isCstOp(op)) {
//			Type constructedType = constructorExp.getType();
//			FeatureObj from = createFeatureObj(constructedType, getAstOperation(constructedType));
//			FeatureObj to = createConstructionTypeFeatureObj(csContext, op, constructorExp);
//			dependencyGraph.addEdge(from, to);
//		}
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
}
