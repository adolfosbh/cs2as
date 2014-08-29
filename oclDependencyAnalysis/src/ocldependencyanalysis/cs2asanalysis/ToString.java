package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Operation;

import ocldependencyanalysis.cs2asanalysis.util.CS2ASAnalysisSwitch;

public class ToString extends CS2ASAnalysisSwitch<String> {
	
	public static final ToString INSTANCE = new ToString(); 
			
	@Override
	public String caseConstructorExpTypeInfo(ConstructorExpTypeInfo object) {
		return caseTypeInfo(object);
	}	
	
	@Override
	public String caseConstructorPartAction(ConstructorPartAction object) {
		ConstructorPart constructorPart = object.getConstructorPart();
		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
		Operation operation = getContainingOperation(constructorPart);
		return object.getContext().getName() + "_" + operation.getName() +"_" 
			  + (constructorExp.getPart().indexOf(constructorPart)+1)
			  + "_" + constructorExp.getType().getName();				
//		Property prop = constructorPart.getReferredProperty();
//		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
//		return constructorExp.getType().getName() + "::" + prop.getName() + " (" + getContext().getName() + ")";
	}
	
	@Override
	public String caseConstructorPartPropertyInfo(
			ConstructorPartPropertyInfo object) {
		return caseExtendedPropertyInfo(object);
	}
	
	@Override
	public String caseOperationAction(OperationAction object) {
		Operation operation = object.getOperation();
		return operation.getOwningType().getName() + "_" + operation.getName() + "_0";
	}
	
	@Override
	public String caseTypeInfo(TypeInfo object) {
		return object.getType().getName();
	}
	
	@Override
	public String caseExtendedPropertyInfo(ExtendedPropertyInfo object) {		
		return  object.getPropertyType().getName() + "::" + object.getProperty().getName();
	}
	
	@Override
	public String casePropertyCallExpInfo(PropertyCallExpInfo object) {
		return object.getPropertyCallExp().getSource().getType().getName() + "::" + object.getProperty().getName();
	}
	
	// FIXME refactor
	private Operation getContainingOperation(EObject eObject) {
			EObject container = eObject.eContainer();
			while (container != null) {
				if (container instanceof Operation) {
					return (Operation) container;
				}
				container = container.eContainer();
			}
			return null;
		}
	
}
