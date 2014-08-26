package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;

public abstract class ComputationProperty extends Computation {

	private Property property;
	
	public ComputationProperty(Type context, Property property) {
		super(context, property);
		this.property = property;
	}
	
	public Property getProperty() {
		return property;
	}
	
	@Override
	public String toString() {
		return property.getOwningType().getName() + "::" + property.getName();
		//return getContext().getName() + '[' + property.getOwningType().getName() + "::" + property.getName() + ']';
	}
}
