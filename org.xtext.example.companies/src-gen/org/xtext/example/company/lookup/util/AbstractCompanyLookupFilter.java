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
public abstract class AbstractCompanyLookupFilter<C extends Employee> implements CompanyLookupFilter {
	
	@NonNull private Class<C> _class;
	
	public AbstractCompanyLookupFilter(@NonNull Class<C> _class) {
		this._class = _class;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean matches(@NonNull Employee namedElement) {
		return _class.isInstance(namedElement) && _matches((C)namedElement);
	}
	
	abstract protected Boolean _matches(@NonNull C element);
}
