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
//		Property mainProp = getMainProperty(property);
//		return mainProp.getOwningType().getName() + "::" + mainProp.getName();
//		//return getContext().getName() + '[' + property.getOwningType().getName() + "::" + property.getName() + ']';
	}
	
	protected Property getMainProperty(Property property) {
		
		Property mainProp = property;
		Property opposite = property.getOpposite();
		if (!mainProp.isComposite()	&& opposite != null) {			
			if (opposite.isComposite()) {
				mainProp = opposite;
			} else {
				// We choose from one of them base on the alphabetic name
				if (property.getName().compareTo(opposite.getName()) > 0) {
					mainProp = opposite;
				}
			}
		} 
		return mainProp;
	}
}
