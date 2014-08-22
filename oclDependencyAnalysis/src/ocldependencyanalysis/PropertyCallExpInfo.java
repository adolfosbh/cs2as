package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Type;

public class PropertyCallExpInfo extends ComputationProperty implements IInfoNode {

	private PropertyCallExp propertyCallExp;
	
	public PropertyCallExpInfo(Type context, PropertyCallExp propCallExp) {
		super(context, propCallExp.getReferredProperty());
		this.propertyCallExp = propCallExp;
	}
	
	public PropertyCallExp getPropertyCallExp() {
		return propertyCallExp;
	}
}
