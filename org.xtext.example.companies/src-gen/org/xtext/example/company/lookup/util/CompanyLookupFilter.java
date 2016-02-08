/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.companies/model/Company.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.company.lookup.util;

import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.company.Employee;

/**
 * 
 */
public interface CompanyLookupFilter {
	
	boolean matches(@NonNull Employee namedElement);
	
}
