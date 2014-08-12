package ocldependencyanalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Type;

public class FeatureObj {
	private static final String NAMESPACE_SEP = "::";
	private static final String EMPTY_STRING = "";
	private static final String LEFT_BRACKET = " [";
	private static final String RIGHT_BRACKET = "]";
	private Type context;
	private Feature feature;
	/**
	 * @param context the source class context in which this property is being used
	 * @param feature a feature of the dependency graph 
	 */
	public FeatureObj(Type context, Feature property) {
		this.context = context;
		this.feature = property;
	}
	
	@Override
	public String toString() {		
		return context.getName() + 
				LEFT_BRACKET +
				getFeaturePrefix() +
				feature.getName() +
				RIGHT_BRACKET; 
	}
	
	public Type getContext() {
		return context;
	}
	
	public Feature getFeature() {
		return feature;
	}
	
	private String getFeaturePrefix() {
		EObject container = feature.eContainer();
		return container == null ? EMPTY_STRING : ((NamedElement)container).getName() + NAMESPACE_SEP;
	}

}
