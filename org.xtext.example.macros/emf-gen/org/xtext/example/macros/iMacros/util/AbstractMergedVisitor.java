/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.macros/model/iMacros.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.macros.iMacros.util;

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
	public R visitInstruction(org.xtext.example.macros.iMacros.@NonNull Instruction object) {
		return visiting(object);
	}

	@Override
	public R visitScript(org.xtext.example.macros.iMacros.@NonNull Script object) {
		return visiting(object);
	}

	@Override
	public R visitTab(org.xtext.example.macros.iMacros.@NonNull Tab object) {
		return visiting(object);
	}

	@Override
	public R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object) {
		return visiting(object);
	}

	@Override
	public R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object) {
		return visiting(object);
	}

	@Override
	public R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object) {
		return visiting(object);
	}
}
