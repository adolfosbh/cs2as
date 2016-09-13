package org.spoofax.example.company.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.spoofax.modelware.emf.resource.SpoofaxResourceFactory;

public class CompanyResourceFactory extends SpoofaxResourceFactory{

	@Override
	public Resource createResource(URI uri) {	
		return new CompanyResource(uri);
	}
}
