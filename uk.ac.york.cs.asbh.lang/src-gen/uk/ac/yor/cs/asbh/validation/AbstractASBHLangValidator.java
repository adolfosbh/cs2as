/*
 * generated by Xtext
 */
package uk.ac.yor.cs.asbh.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractASBHLangValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://uk.ac.york.cs.asbh.lang.cs2as/sourceMM/1.0"));
		return result;
	}
}
