package org.spoofax.example.company.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.spoofax.example.company.CompanyPackage;
import org.spoofax.modelware.emf.resource.SpoofaxEMFResource;

public class CompanyResource extends SpoofaxEMFResource {

	public CompanyResource(URI uri) {
		super(uri);
	}

	@Override
	protected EPackage getEPackage() {
		return CompanyPackage.eINSTANCE;
	}
}
