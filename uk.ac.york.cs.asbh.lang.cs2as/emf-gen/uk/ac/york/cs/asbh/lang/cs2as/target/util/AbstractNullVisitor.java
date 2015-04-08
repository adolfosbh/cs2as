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
 */
public abstract class AbstractNullVisitor<R, C>
	extends AbstractVisitor<R, C>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractNullVisitor(@NonNull C context) {
		super(context);
	}	

	@Override
	public @Nullable R visitA(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A object) {
		return null;
	}

	@Override
	public @Nullable R visitA1(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A1 object) {
		return null;
	}

	@Override
	public @Nullable R visitA2(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A2 object) {
		return null;
	}

	@Override
	public @Nullable R visitA3(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A3 object) {
		return null;
	}

	@Override
	public @Nullable R visitB(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.B object) {
		return null;
	}

	@Override
	public @Nullable R visitC(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.C object) {
		return null;
	}

	@Override
	public @Nullable R visitD(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.D object) {
		return null;
	}

	@Override
	public @Nullable R visitNamedElement(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement object) {
		return null;
	}

	@Override
	public @Nullable R visitTRoot(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.TRoot object) {
		return null;
	}
}
