/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMiniOCLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage.eINSTANCE);
		return result;
	}
	
}