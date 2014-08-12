package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;

public class OppositePropertyObj extends FeatureObj {

	private FeatureObj computedFrom;
	
	public OppositePropertyObj(FeatureObj computedFrom, Type context, Property property) {
		super(context, property);
		this.computedFrom = computedFrom;
	}

	public FeatureObj getComputedFromFeatureObj() {
		return computedFrom;
	}
	
}
