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
	public R visiting(uk.ac.york.cs.asbh.lang.cs2as.target.util.@NonNull Visitable visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitA(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A object) {
		return delegate.visitA(object);
	}

	@Override
	public R visitA1(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A1 object) {
		return delegate.visitA1(object);
	}

	@Override
	public R visitA2(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A2 object) {
		return delegate.visitA2(object);
	}

	@Override
	public R visitA3(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A3 object) {
		return delegate.visitA3(object);
	}

	@Override
	public R visitB(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull B object) {
		return delegate.visitB(object);
	}

	@Override
	public R visitC(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull C object) {
		return delegate.visitC(object);
	}

	@Override
	public R visitD(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull D object) {
		return delegate.visitD(object);
	}

	@Override
	public R visitNamedElement(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull NamedElement object) {
		return delegate.visitNamedElement(object);
	}

	@Override
	public R visitNamespace(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull Namespace object) {
		return delegate.visitNamespace(object);
	}

	@Override
	public R visitTRoot(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull TRoot object) {
		return delegate.visitTRoot(object);
	}
}
