package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructorExpTypeInfo extends ComputationType implements IInfoNode {

	private ConstructorExp constructor;
	
	public ConstructorExpTypeInfo(Type context, ConstructorExp cExp) {
		super(context, cExp.getType());
		this.constructor = cExp;
	}
	
	public ConstructorExp getConstructor() {
		return constructor;
	}
}
