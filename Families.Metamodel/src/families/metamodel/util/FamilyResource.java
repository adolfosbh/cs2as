package families.metamodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.spoofax.modelware.emf.resource.SpoofaxEMFResource;

import family.FamilyPackage;

public class FamilyResource extends SpoofaxEMFResource {

	public FamilyResource(URI uri) {
		super(uri);
	}

	@Override
	protected EPackage getEPackage() {
		return FamilyPackage.eINSTANCE;
	}
}
