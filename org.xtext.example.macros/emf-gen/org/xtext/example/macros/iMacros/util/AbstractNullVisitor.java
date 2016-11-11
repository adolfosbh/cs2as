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
	public R visitInstruction(org.xtext.example.macros.iMacros.@NonNull Instruction object) {
		return null;
	}

	@Override
	public R visitScript(org.xtext.example.macros.iMacros.@NonNull Script object) {
		return null;
	}

	@Override
	public R visitTab(org.xtext.example.macros.iMacros.@NonNull Tab object) {
		return null;
	}

	@Override
	public R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object) {
		return null;
	}

	@Override
	public R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object) {
		return null;
	}

	@Override
	public R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object) {
		return null;
	}
}
