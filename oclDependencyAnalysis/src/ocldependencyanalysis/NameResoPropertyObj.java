package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Type;

public class NameResoPropertyObj extends FeatureObj{

	private Type lookupType;
	
	public NameResoPropertyObj(Type context, Feature property, Type lookupType) {
		super(context, property);
		this.lookupType = lookupType;
	}

	public Type getLookupType() {
		return lookupType;
	}
}
