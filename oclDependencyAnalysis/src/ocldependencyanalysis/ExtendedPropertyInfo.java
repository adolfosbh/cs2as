package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;

public class ExtendedPropertyInfo extends ComputationProperty implements IInfoNode {

	private Type propertyType;
	public ExtendedPropertyInfo(Type context, Type narrowType, Property property) {
		super(context, property);
		propertyType = narrowType;
	}
	
	public Type getPropertyType() {
		return propertyType;
	}
	
	
	@Override
	public String toString() {
		return propertyType.getName() + "::" + getProperty().getName();
		//return getContext().getName() + '[' + constructorExp.getType().getName() + "::" + prop.getName() + ']';
	}

}
