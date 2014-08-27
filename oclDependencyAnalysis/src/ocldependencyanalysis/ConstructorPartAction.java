package ocldependencyanalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructorPartAction extends ComputationProperty implements IActionNode {

	private ConstructorPart constructorPart;
	
	/**
	 * @param context the CS context in which the computation is performed
	 * @param cPart the constructorPart producing this computation action
	 */
	public ConstructorPartAction(Type context, ConstructorPart cPart) {
		super(context, cPart.getReferredProperty());
		this.constructorPart = cPart;
	}
	
	public ConstructorPart getConstructorPart() {
		return constructorPart;
	}
		

	@Override
	public String toString() {
		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
		Operation operation = getContainingOperation();
		return constructorExp.getType().getName() + "_" + operation.getName() + "_" 
			  + (constructorExp.getPart().indexOf(constructorPart)+1);				
//		Property prop = constructorPart.getReferredProperty();
//		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
//		return constructorExp.getType().getName() + "::" + prop.getName() + " (" + getContext().getName() + ")";
	}
	
	
	// FIXME refactor
	private Operation getContainingOperation() {
		EObject container = constructorPart.eContainer();
		while (container != null) {
			if (container instanceof Operation) {
				return (Operation) container;
			}
			container = container.eContainer();
		}
		return null;
	}
}
