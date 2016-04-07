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
	public R visitA(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A object) {
		return null;
	}

	@Override
	public R visitA1(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A1 object) {
		return null;
	}

	@Override
	public R visitA2(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A2 object) {
		return null;
	}

	@Override
	public R visitA3(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A3 object) {
		return null;
	}

	@Override
	public R visitB(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull B object) {
		return null;
	}

	@Override
	public R visitC(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull C object) {
		return null;
	}

	@Override
	public R visitD(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull D object) {
		return null;
	}

	@Override
	public R visitNamedElement(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull NamedElement object) {
		return null;
	}

	@Override
	public R visitNamespace(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull Namespace object) {
		return null;
	}

	@Override
	public R visitTRoot(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull TRoot object) {
		return null;
	}
}
