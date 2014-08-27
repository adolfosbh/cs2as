package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;

public class OppositePropertyInfo extends ComputationProperty implements IInfoNode{
	
	public OppositePropertyInfo(Type context, Property property) {
		super(context, property);
	}

}
