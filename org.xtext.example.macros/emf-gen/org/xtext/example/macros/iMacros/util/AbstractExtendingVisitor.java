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
 * An AbstractExtendingVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingVisitor(C context) {
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
		return visitInstruction(object);
	}

	@Override
	public R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object) {
		return visitInstruction(object);
	}

	@Override
	public R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object) {
		return visitInstruction(object);
	}

	@Override
	public R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object) {
		return visiting(object);
	}
}
