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
 * An AbstractDelegatingVisitor delegates all visits.
 */
public abstract class AbstractDelegatingVisitor<R, C, @NonNull D extends Visitor<R>>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected final @NonNull D delegate;
	
	protected AbstractDelegatingVisitor(@NonNull D delegate, C context) {
		super(context);
	//	assert delegate != null : "cannot decorate a null visitor"; //$NON-NLS-1$
		this.delegate = delegate;		
	//	delegate.setUndecoratedVisitor(this);
	}

	/**
	 * Delegates to my decorated visitor.
	 */
	//	public @NonNull DecorableVisitor<R> createNestedVisitor() {
	//		return delegate.createNestedVisitor();
	//	}

	/**
	 * Obtains the visitor that I decorate.
	 * 
	 * @return my decorated visitor
	 */
	protected final @NonNull D getDelegate() {
		return delegate;
	}

	@Override
	public R visiting(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitInstruction(org.xtext.example.macros.iMacros.@NonNull Instruction object) {
		return delegate.visitInstruction(object);
	}

	@Override
	public R visitScript(org.xtext.example.macros.iMacros.@NonNull Script object) {
		return delegate.visitScript(object);
	}

	@Override
	public R visitTab(org.xtext.example.macros.iMacros.@NonNull Tab object) {
		return delegate.visitTab(object);
	}

	@Override
	public R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object) {
		return delegate.visitTag(object);
	}

	@Override
	public R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object) {
		return delegate.visitUrl(object);
	}

	@Override
	public R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object) {
		return delegate.visitVersion(object);
	}
}
