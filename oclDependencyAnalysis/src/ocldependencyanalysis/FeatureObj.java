package ocldependencyanalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Feature;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Type;

public class FeatureObj {
	protected static final String NAMESPACE_SEP = "::";
	protected static final String TYPE_SEP = " : ";
	protected static final String EMPTY_STRING = "";
	protected static final String LEFT_BRACKET = " [";
	protected static final String RIGHT_BRACKET = "]";
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
		Type fType = feature.getType();
		fType = fType instanceof CollectionType ? ((CollectionType)fType).getElementType() : fType;
		return context.getName() + 
				LEFT_BRACKET +
				getFeaturePrefix() +
				feature.getName() +
				TYPE_SEP +
				fType.getName() +
				RIGHT_BRACKET; 
	}
	
	public Type getContext() {
		return context;
	}
	
	public Feature getFeature() {
		return feature;
	}
	
	protected String getFeaturePrefix() {
		EObject container = feature.eContainer();
		return container == null ? EMPTY_STRING : ((NamedElement)container).getName() + NAMESPACE_SEP;
	}

}
