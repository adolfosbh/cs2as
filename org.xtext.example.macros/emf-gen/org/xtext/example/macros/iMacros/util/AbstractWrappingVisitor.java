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
 * An AbstractWrappingVisitor delegates all visits wrapping the delegation in a call to a preVisit function and a postVisit function.
 */
public abstract class AbstractWrappingVisitor<R, C, @NonNull D extends Visitor<R>, P>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected final @NonNull D delegate;
	
	protected AbstractWrappingVisitor(@NonNull D delegate, C context) {
		super(context);
		this.delegate = delegate;		
	//	delegate.setUndecoratedVisitor(this);
	}

	/**
	 * Intercept an exception thrown by the delegated visit to perform some post-functionality that may use the visitable object,
	 * the result of preVisit and the thrown exception to determine the overall wrapped result.
	 * 
	 * @return a rethrown RuntimeException or a RuntimeException-wrapped non-RuntimeException.
	 */
	protected R badVisit(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable, @Nullable P prologue, @NonNull Throwable e) throws RuntimeException {
		if (e instanceof Exception) {
			throw (RuntimeException)e;
		}
		else {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Obtains the visitor that I wrap.
	 * 
	 * @return my wrapped visitor
	 */
	protected @NonNull D getDelegate() {
		return delegate;
	}

	/**
	 * Intercept the result of the delegated visit to perform some post-functionality that may use the visitable object,
	 * the result of preVisit and the result of the delegated visit to determine the overall wrapped result.
	 * 
	 * @return the epilogue result, which defaults to the delegated result.
	 */
	protected R postVisit(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable, @Nullable P prologue, R result) {
		return result;
	}

	/**
	 * Compute and return some value before performing the delegated visit.
	 * 
	 * @return the prologue result, which defauilts to null.
	 */
	protected @Nullable P preVisit(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable) {
		return null;
	}

	@Override
	public R visiting(org.xtext.example.macros.iMacros.util.@NonNull Visitable visitable) {
		throw new UnsupportedOperationException();		// Cannot happen since all methods delegate.
	}

	@Override
	public R visitInstruction(org.xtext.example.macros.iMacros.@NonNull Instruction object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitInstruction(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitScript(org.xtext.example.macros.iMacros.@NonNull Script object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitScript(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTab(org.xtext.example.macros.iMacros.@NonNull Tab object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTab(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTag(org.xtext.example.macros.iMacros.@NonNull Tag object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTag(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUrl(org.xtext.example.macros.iMacros.@NonNull Url object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUrl(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVersion(org.xtext.example.macros.iMacros.@NonNull Version object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVersion(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}
}
