package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Type;

public class CS2ASNodesFactory {
	
	public static CS2ASNodesFactory INSTANCE = new CS2ASNodesFactory();
		
	public ConstructorPartAction createAction(Type context, ConstructorPart cPart) {
		ConstructorPartAction action = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartAction();
		action.setContext(context);
		action.setConstructorPart(cPart);
		action.setProperty(cPart.getReferredProperty());
		action.setReferredElement(cPart.getReferredProperty());
		return action;
	}
	
	public ConstructorPartPropertyInfo createConstructorPropertyInfo(Type context, ConstructorPart cPart) {
		ConstructorPartPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartPropertyInfo();
		propInfo.setContext(context);
		propInfo.setConstructorPart(cPart);
		propInfo.setProperty(cPart.getReferredProperty());
		propInfo.setPropertyType(((ConstructorExp)cPart.eContainer()).getType());
		propInfo.setReferredElement(cPart.getReferredProperty());
		return propInfo;
	}
	
	public ConstructorExpTypeInfo createConstructorTypeInfo(Type context, ConstructorExp cExp) {
		ConstructorExpTypeInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorExpTypeInfo();
		typeInfo.setContext(context);
		typeInfo.setConstructorExp(cExp);
		typeInfo.setType(cExp.getType());
		typeInfo.setReferredElement(cExp.getType());
		return typeInfo;
	}
	
	public TypeInfo createTypeInfo(Type context, Type type) {
		TypeInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createTypeInfo();
		typeInfo.setContext(context);
		typeInfo.setType(type);
		typeInfo.setReferredElement(type);
		return typeInfo;
	}
	
	public PropertyCallExpInfo createPropertyCallExp(Type context, PropertyCallExp propCallExp) {
		PropertyCallExpInfo pceInfo = CS2ASAnalysisFactory.eINSTANCE.createPropertyCallExpInfo();
		pceInfo.setContext(context);
		pceInfo.setPropertyCallExp(propCallExp);
		pceInfo.setProperty(propCallExp.getReferredProperty());
		pceInfo.setReferredElement(propCallExp.getReferredProperty());
		return pceInfo;
	}
	
	public OperationAction createOperationAction(Type context, Operation op) {
		OperationAction opAction = CS2ASAnalysisFactory.eINSTANCE.createOperationAction();
		opAction.setContext(context);
		opAction.setOperation(op);
		opAction.setReferredElement(op);
		return opAction;
	}
	
	
	public ExtendedPropertyInfo createPropertyInfo(Type context, Type type, Property property) {
		ExtendedPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createExtendedPropertyInfo();
		propInfo.setContext(context);
		propInfo.setProperty(property);
		propInfo.setPropertyType(type);
		propInfo.setReferredElement(property);
		return propInfo;
	}

}
