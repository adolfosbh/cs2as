package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructorPartPropertyInfo extends ExtendedPropertyInfo implements IInfoNode {

	private ConstructorPart constructorPart;
	
	public ConstructorPartPropertyInfo(Type context, ConstructorPart cPart) {
		super(context, getNarrowerType(cPart), cPart.getReferredProperty());
		this.constructorPart = cPart;
	}
			
	public ConstructorPart getConstructorPart() {
		return constructorPart;
	}
	
	static private Type getNarrowerType(ConstructorPart cPart) {
		ConstructorExp constructorExp = (ConstructorExp) cPart.eContainer();
		return constructorExp.getType();
	}
}
