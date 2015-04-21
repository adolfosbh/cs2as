/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: uk.ac.york.cs.asbh.lang.cs2as/model/TargetMM1.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	uk.ac.york.cs.asbh.lang.cs2as.target.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractWrappingVisitor delegates all visits wrapping the delegation in a call to a preVisit function and a postVisit function.
 */
public abstract class AbstractWrappingVisitor<R, C, D extends Visitor<R>, P>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected final D delegate;
	
	protected AbstractWrappingVisitor(@NonNull D delegate, @NonNull C context) {
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
	protected @Nullable R badVisit(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable visitable, @Nullable P prologue, @NonNull Throwable e) throws RuntimeException {
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
	@SuppressWarnings("null")
	protected @NonNull D getDelegate() {
		return delegate;
	}

	/**
	 * Intercept the result of the delegated visit to perform some post-functionality that may use the visitable object,
	 * the result of preVisit and the result of the delegated visit to determine the overall wrapped result.
	 * 
	 * @return the epilogue result, which defaults to the delegated result.
	 */
	protected @Nullable R postVisit(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable visitable, @Nullable P prologue, @Nullable R result) {
		return result;
	}

	/**
	 * Compute and return some value before performing the delegated visit.
	 * 
	 * @return the prologue result, which defauilts to null.
	 */
	protected @Nullable P preVisit(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable visitable) {
		return null;
	}

	@Override
	public @Nullable R visiting(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable visitable) {
		throw new UnsupportedOperationException();		// Cannot happen since all methods delegate.
	}

	@Override
	public @Nullable R visitA(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitA(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitA1(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A1 object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitA1(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitA2(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A2 object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitA2(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitA3(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A3 object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitA3(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitB(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.B object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitB(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitC(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.C object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitC(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitD(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.D object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitD(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitNamedElement(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitNamedElement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitNamespace(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.Namespace object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitNamespace(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public @Nullable R visitTRoot(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.TRoot object) {
		P prologue = preVisit(object);
		try {
			R result = delegate.visitTRoot(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}
}
