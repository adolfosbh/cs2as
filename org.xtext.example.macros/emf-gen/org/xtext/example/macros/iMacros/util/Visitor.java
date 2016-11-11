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
 */
public interface Visitor<R>
{
	/**
	 * Returns an object which is an instance of the given class
	 * associated with this object. Returns <code>null</code> if
	 * no such object can be found.
	 *
	 * @param adapter the adapter class to look up
	 * @return an object of the given class, 
	 *    or <code>null</code> if this object does not
	 *    have an adapter for the given class
	 */
	@Nullable <A> A getAdapter(@NonNull Class<A> adapter);

	/**
	 * Return the result of visiting a visitable for which no more specific pivot type method
	 * is available.
	 */
	R visiting(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable);

	R visitInstruction(org.xtext.example.macros.iMacros.@NonNull Instruction object);
	R visitScript(org.xtext.example.macros.iMacros.@NonNull Script object);
	R visitTab(org.xtext.example.macros.iMacros.@NonNull Tab object);
	R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object);
	R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object);
	R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object);
}
