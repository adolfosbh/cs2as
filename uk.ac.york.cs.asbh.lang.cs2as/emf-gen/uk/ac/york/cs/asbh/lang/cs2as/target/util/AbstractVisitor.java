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

/*
 * An AbstractVisitor provides a default implementation of the visitor framework
 * but n implementations of the visitXXX methods..
 */
public abstract class AbstractVisitor<R, C>
	implements Visitor<R>
{
	/**
	 * Context for the AST visitation.
	 */
	protected final C context;

	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractVisitor(C context) {
		this.context = context;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A> @Nullable A getAdapter(@NonNull Class<A> adapter) {
		if (adapter.isAssignableFrom(getClass())) {
			return (A) this;
		}
		else {
			return null;
		}
	}
	
	/**
	 * A null-safe visitation of the specified visitable.
	 * 
	 * @param v a visitable, or <code>null</code>
	 * @return <code>null</code> if the visitable is <code>null</code>;
	 *	 otherwise, the result of visiting it
	 */
	public @Nullable R safeVisit(uk.ac.york.cs.asbh.lang.cs2as.target.util.@Nullable Visitable v) {
		return (v == null) ? null : v.accept(this);
	}
	
	/**
	 * Perform a visit to the specified visitable.
	 * 
	 * @param v a visitable, or <code>null</code>
	 * @return <code>null</code> if the visitable is <code>null</code>;
	 *	 otherwise, the result of visiting it
	 */
	public R visit(uk.ac.york.cs.asbh.lang.cs2as.target.util.@NonNull Visitable v) {
		return v.accept(this);
	}

	//	public R visiting(uk.ac.york.cs.asbh.lang.cs2as.target.util.@NonNull Visitable visitable) {
	//		return null;
	//	}
}
