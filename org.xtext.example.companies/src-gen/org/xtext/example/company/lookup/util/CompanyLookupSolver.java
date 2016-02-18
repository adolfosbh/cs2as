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
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.xtext.example.company.util.CompanyUnqualifiedLookupVisitor;

public class CompanyLookupSolver {
	
	protected final @NonNull Executor executor;
	
	public CompanyLookupSolver (@NonNull Executor executor) {
		this.executor = executor;
	}
	
	
	public CompanyLookupResult<org.xtext.example.company.Employee> _lookupEmployee(org.xtext.example.company.util.Visitable context, java.lang.String eName) {
		CompanySingleResultLookupEnvironment _lookupEnv = new CompanySingleResultLookupEnvironment(executor, org.xtext.example.company.CompanyPackage.Literals.EMPLOYEE,eName);
		CompanyUnqualifiedLookupVisitor _lookupVisitor = new CompanyUnqualifiedLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new CompanyLookupResultImpl<org.xtext.example.company.Employee>
				(_lookupEnv.getNamedElementsByKind(org.xtext.example.company.Employee.class));
	}
}
