package ocldependencyanalysis.cs2asanalysis;

import ocldependencyanalysis.cs2asanalysis.util.CS2ASAnalysisSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.ConstructorExp;
import org.eclipse.ocl.pivot.ConstructorPart;
import org.eclipse.ocl.pivot.Operation;

public class ToStringSwitch extends CS2ASAnalysisSwitch<String> {
	
	public static final ToStringSwitch INSTANCE = new ToStringSwitch(); 
			
	@Override
	public String caseConstructorExpClassInfo(ConstructorExpClassInfo object) {
		return caseClassInfo(object);
	}	
	
	@Override
	public String caseConstructorPartAction(ConstructorPartAction object) {
		ConstructorPart constructorPart = object.getConstructorPart();
		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
		Operation operation = getContainingOperation(constructorPart);
		return object.getContext().getName() + "_" + operation.getName() +"_" 
			  + (constructorExp.getOwnedParts().indexOf(constructorPart)+1)
			  + "_" + constructorExp.getType().getName();
	}
	
	@Override
	public String caseConstructorPartPropertyInfo(
			ConstructorPartPropertyInfo object) {
		return caseExtendedPropertyInfo(object);
	}
	
	@Override
	public String caseMappingAction(MappingAction object) {
		Operation operation = object.getOperation();
		return operation.getOwningClass().getName() + "_" + operation.getName() + "_0";
	}

	@Override
	public String caseEnvironmentAction(EnvironmentAction object) {		
		return object.getOperationClass().getName() + object.getOperation().getName();
	}
	
	@Override
	public String caseClassInfo(ClassInfo object) {
		return object.getClass_().getName();
	}
	
	@Override
	public String caseExtendedPropertyInfo(ExtendedPropertyInfo object) {		
		return  object.getPropertyClass().getName() + "::" + object.getProperty().getName();
	}
	
	@Override
	public String casePropertyCallExpInfo(PropertyCallExpInfo object) {
		return caseExtendedPropertyInfo(object);
	}
	
	@Override
	public String caseEnvironmentInfo(EnvironmentInfo object) {
		return object.getOperationClass().getName() + "::env_" + object.getLookupClass().getName();
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
