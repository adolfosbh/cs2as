package families.metamodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.spoofax.modelware.emf.resource.SpoofaxResourceFactory;

public class FamilyResourceFactory extends SpoofaxResourceFactory{

	@Override
	public Resource createResource(URI uri) {	
		return new FamilyResource(uri);
	}
}
