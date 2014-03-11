package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Property;

public class OppositePropertyObj extends FeatureObj {

	private FeatureObj computedFrom;
	
	public OppositePropertyObj(FeatureObj computedFrom, Class context, Property property) {
		super(context, property);
		this.computedFrom = computedFrom;
	}

	public FeatureObj getComputedFromFeatureObj() {
		return computedFrom;
	}
	
}
