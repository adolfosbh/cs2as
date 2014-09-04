package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;

public class CS2ASNodesFactory {
	
	public static CS2ASNodesFactory INSTANCE = new CS2ASNodesFactory();
		
	public ConstructorPartAction createAction(Class context, ConstructorPart cPart) {
		ConstructorPartAction action = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartAction();
		action.setContext(context);
		action.setConstructorPart(cPart);
		action.setProperty(cPart.getReferredProperty());
		action.setReferredElement(cPart.getReferredProperty());
		return action;
	}
	
	public ConstructorPartPropertyInfo createConstructorPropertyInfo(Class context, ConstructorPart cPart) {
		ConstructorPartPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartPropertyInfo();
		propInfo.setContext(context);
		propInfo.setConstructorPart(cPart);
		propInfo.setProperty(cPart.getReferredProperty());
		propInfo.setPropertyClass(((ConstructorExp)cPart.eContainer()).getType());
		propInfo.setReferredElement(cPart.getReferredProperty());
		return propInfo;
	}
	
	public ConstructorExpClassInfo createConstructorClassInfo(Class context, ConstructorExp cExp) {
		ConstructorExpClassInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorExpClassInfo();
		typeInfo.setContext(context);
		typeInfo.setConstructorExp(cExp);
		typeInfo.setClass(cExp.getType());
		typeInfo.setReferredElement(cExp.getType());
		return typeInfo;
	}
	
	public ClassInfo createClassInfo(Class context, Class aClass) {
		ClassInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createClassInfo();
		typeInfo.setContext(context);
		typeInfo.setClass(aClass);
		typeInfo.setReferredElement(aClass);
		return typeInfo;
	}
	
	public PropertyCallExpInfo createPropertyCallExp(Class context, PropertyCallExp propCallExp) {
		PropertyCallExpInfo pceInfo = CS2ASAnalysisFactory.eINSTANCE.createPropertyCallExpInfo();
		pceInfo.setContext(context);
		pceInfo.setPropertyCallExp(propCallExp);
		pceInfo.setProperty(propCallExp.getReferredProperty());
		pceInfo.setReferredElement(propCallExp.getReferredProperty());
		return pceInfo;
	}
	
	public OperationAction createOperationAction(Class context, Operation op) {
		OperationAction opAction = CS2ASAnalysisFactory.eINSTANCE.createOperationAction();
		opAction.setContext(context);
		opAction.setOperation(op);
		opAction.setReferredElement(op);
		return opAction;
	}
	
	
	public ExtendedPropertyInfo createPropertyInfo(Class context, Class propClass, Property property) {
		ExtendedPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createExtendedPropertyInfo();
		propInfo.setContext(context);
		propInfo.setProperty(property);
		propInfo.setPropertyClass(propClass);
		propInfo.setReferredElement(property);
		return propInfo;
	}

}
