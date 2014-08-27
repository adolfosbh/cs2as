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
	
	@Override
	public String toString() {
		return propertyCallExp.getSource().getType().getName() + "::" + getProperty().getName();
//		Property prop = getProperty();
//		Property mainProp = getMainProperty(prop);
//		return mainProp == prop ?				
//			 propertyCallExp.getSource().getType().getName() + "::" + mainProp.getName()
//			 : super.toString();
	}
}
