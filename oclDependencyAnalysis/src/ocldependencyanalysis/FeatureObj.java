package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Feature;

public class FeatureObj {
	private static final String LEFT_BRACKET = "[";
	private static final String RIGHT_BRACKET = "]";
	private Class context;
	private Feature feature;
	/**
	 * @param context the source class context in which this property is being used
	 * @param feature a feature of the dependency graph 
	 */
	public FeatureObj(Class context, Feature property) {
		this.context = context;
		this.feature = property;
	}
	
	@Override
	public String toString() {		
		return context.toString() + 
				LEFT_BRACKET + 
				feature.toString() +
				RIGHT_BRACKET; 
	}
	
	public Class getContext() {
		return context;
	}
	
	public Feature getFeature() {
		return feature;
	}
}
