package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructorPartPropertyInfo extends ComputationProperty implements IInfoNode {

	private ConstructorPart constructorPart;
	
	public ConstructorPartPropertyInfo(Type context, ConstructorPart cPart) {
		super(context, cPart.getReferredProperty());
		this.constructorPart = cPart;
	}
	
	@Override
	public String toString() {	
		Property prop = constructorPart.getReferredProperty();
		ConstructorExp constructorExp = (ConstructorExp) constructorPart.eContainer();
		return constructorExp.getType().getName() + "::" + prop.getName();
		//return getContext().getName() + '[' + constructorExp.getType().getName() + "::" + prop.getName() + ']';
	}
		
	public ConstructorPart getConstructorPart() {
		return constructorPart;
	}
}
