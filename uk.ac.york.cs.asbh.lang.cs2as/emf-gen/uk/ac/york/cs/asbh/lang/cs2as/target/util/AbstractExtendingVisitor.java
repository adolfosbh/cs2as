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
	protected AbstractExtendingVisitor(@NonNull C context) {
		super(context);
	}	

	@Override
	public @Nullable R visitA(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitA1(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A1 object) {
		return visitA(object);
	}

	@Override
	public @Nullable R visitA2(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A2 object) {
		return visitA(object);
	}

	@Override
	public @Nullable R visitA3(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A3 object) {
		return visitA2(object);
	}

	@Override
	public @Nullable R visitB(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.B object) {
		return visitNamedElement(object);
	}

	@Override
	public @Nullable R visitC(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.C object) {
		return visitNamedElement(object);
	}

	@Override
	public @Nullable R visitD(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.D object) {
		return visitNamedElement(object);
	}

	@Override
	public @Nullable R visitNamedElement(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitTRoot(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.TRoot object) {
		return visiting(object);
	}
}
