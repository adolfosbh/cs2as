package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Type;

public abstract class ComputationType extends Computation {

	private Type type;
	
	public ComputationType(Type context, Type type) {
		super(context, type);
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.getName();
		// return getContext().getName() + '[' + type.getName() + ']';
	}
}
