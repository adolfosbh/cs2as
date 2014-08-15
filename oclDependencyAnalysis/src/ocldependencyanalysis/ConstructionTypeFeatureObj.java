package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructionTypeFeatureObj extends FeatureObj {

	private Type constructedType;
	
	public ConstructionTypeFeatureObj(Type context, Operation astOperation, Type constructedType) {
		super(context, astOperation);
		this.constructedType = constructedType;
	}
	
	public Type getConstructedType() {
		return constructedType;
	}
	
	@Override
	public String toString() {
		return getContext().getName() + 
				LEFT_BRACKET +
				getFeaturePrefix() +
				getFeature().getName() +
				TYPE_SEP +
				constructedType.getName() +
				RIGHT_BRACKET; 
	}
}