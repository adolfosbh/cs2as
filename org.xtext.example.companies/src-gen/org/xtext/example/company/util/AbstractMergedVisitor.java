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

/**
 * An AbstractMergedVisitor merges all visits direct to visiting().
 * This can be used by a decorating visitor to execute shared code before redispatching to a decorated visitor.
 */
public abstract class AbstractMergedVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected AbstractMergedVisitor(C context) {
		super(context);
	}

	@Override
	public R visitCompany(org.xtext.example.company.@NonNull Company object) {
		return visiting(object);
	}

	@Override
	public R visitDepartment(org.xtext.example.company.@NonNull Department object) {
		return visiting(object);
	}

	@Override
	public R visitEmployee(org.xtext.example.company.@NonNull Employee object) {
		return visiting(object);
	}
}
