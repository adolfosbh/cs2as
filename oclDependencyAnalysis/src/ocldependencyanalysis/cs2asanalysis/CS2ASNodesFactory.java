package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.ShadowPart;

public class CS2ASNodesFactory {
	
	public static CS2ASNodesFactory INSTANCE = new CS2ASNodesFactory();
		
	public ConstructorPartAction createAction(Class context, ShadowPart cPart) {
		ConstructorPartAction action = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartAction();
		action.setContext(context);
		action.setShadowPart(cPart);
		action.setProperty(cPart.getReferredProperty());
		action.setAssociatedPackage(((ShadowExp)cPart.eContainer()).getType().getOwningPackage());
		return action;
	}
	
	public ConstructorPartPropertyInfo createConstructorPropertyInfo(Class context, ShadowPart cPart) {
		ConstructorPartPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorPartPropertyInfo();
		propInfo.setContext(context);
		propInfo.setShadowPart(cPart);
		propInfo.setProperty(cPart.getReferredProperty());
		propInfo.setPropertyClass(((ShadowExp)cPart.eContainer()).getType());
		propInfo.setAssociatedPackage(((ShadowExp)cPart.eContainer()).getType().getOwningPackage());
		return propInfo;
	}
	
	public ConstructorExpClassInfo createConstructorClassInfo(Class context, ShadowExp cExp) {
		ConstructorExpClassInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createConstructorExpClassInfo();
		typeInfo.setContext(context);
		typeInfo.setShadowExp(cExp);
		typeInfo.setClass(cExp.getType());
		typeInfo.setAssociatedPackage(cExp.getType().getOwningPackage());
		return typeInfo;
	}
	
	public ClassInfo createClassInfo(Class context, Class aClass) {
		ClassInfo typeInfo = CS2ASAnalysisFactory.eINSTANCE.createClassInfo();
		typeInfo.setContext(context);
		typeInfo.setClass(aClass);
		typeInfo.setAssociatedPackage(aClass.getOwningPackage());
		return typeInfo;
	}
	
	public PropertyCallExpInfo createPropertyCallExp(Class context, PropertyCallExp propCallExp) {
		PropertyCallExpInfo pceInfo = CS2ASAnalysisFactory.eINSTANCE.createPropertyCallExpInfo();
		pceInfo.setContext(context);
		pceInfo.setPropertyCallExp(propCallExp);
		pceInfo.setProperty(propCallExp.getReferredProperty());
		pceInfo.setPropertyClass(propCallExp.getOwnedSource().getType().isClass());
		pceInfo.setAssociatedPackage(propCallExp.getOwnedSource().getType().isClass().getOwningPackage());
		return pceInfo;
	}
	
	public MappingAction createMappingAction(Class context, Operation op) {
		MappingAction opAction = CS2ASAnalysisFactory.eINSTANCE.createMappingAction();
		opAction.setContext(context);
		opAction.setOperation(op);
		opAction.setAssociatedPackage(op.getOwningClass().getOwningPackage());
		return opAction;
	}
	
	public EnvironmentAction createEnvironmentAction(Class context, Class opClass, Operation op) {
		EnvironmentAction opAction = CS2ASAnalysisFactory.eINSTANCE.createEnvironmentAction();
		opAction.setContext(context);
		opAction.setOperationClass(opClass);
		opAction.setOperation(op);
		opAction.setAssociatedPackage(opClass.getOwningPackage());
		return opAction;
	}
	
	
	public ExtendedPropertyInfo createPropertyInfo(Class context, Class propClass, Property property) {
		ExtendedPropertyInfo propInfo = CS2ASAnalysisFactory.eINSTANCE.createExtendedPropertyInfo();
		propInfo.setContext(context);
		propInfo.setProperty(property);
		propInfo.setPropertyClass(propClass);
		propInfo.setAssociatedPackage(propClass.getOwningPackage());
		return propInfo;
	}
	
	public EnvironmentInfo createEnvironmentInfo(Class context, Class lookupClass, Class opClass, Operation op) {
		EnvironmentInfo envInfo = CS2ASAnalysisFactory.eINSTANCE.createEnvironmentInfo();		
		envInfo.setContext(context);
		envInfo.setLookupClass(lookupClass);
		envInfo.setOperation(op);
		envInfo.setOperationClass(opClass);
		envInfo.setAssociatedPackage(lookupClass.getOwningPackage());
		return envInfo;
	}

}
