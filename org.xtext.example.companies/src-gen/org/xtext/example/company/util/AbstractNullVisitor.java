/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.companies/model/Company.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.company.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractNullVisitor provides a default implementation for each
 * visitXxx method that returns null.
 *
 * @deprecated Explicit 'Null' functionality is obsolete with Java 8 @Nullable annotations.  
 */
 @Deprecated
public abstract class AbstractNullVisitor<@Nullable R, C>
	extends AbstractVisitor<R, C>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractNullVisitor(C context) {
		super(context);
	}	

	@Override
	public R visitCompany(org.xtext.example.company.@NonNull Company object) {
		return null;
	}

	@Override
	public R visitDepartment(org.xtext.example.company.@NonNull Department object) {
		return null;
	}

	@Override
	public R visitEmployee(org.xtext.example.company.@NonNull Employee object) {
		return null;
	}
}
