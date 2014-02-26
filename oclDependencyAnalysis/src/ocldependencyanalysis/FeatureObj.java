package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Feature;

public class FeatureObj {
	private static final String SEPARATOR = " -> ";
	private Class context;
	private Feature property;
	/**
	 * @param context the source class context in which this property is being used
	 * @param feature a feature of the dependency graph 
	 */
	public FeatureObj(Class context, Feature property) {
		this.context = context;
		this.property = property;
	}
	
	@Override
	public String toString() {		
		return context.toString() + SEPARATOR + property.toString(); 
	}
}
