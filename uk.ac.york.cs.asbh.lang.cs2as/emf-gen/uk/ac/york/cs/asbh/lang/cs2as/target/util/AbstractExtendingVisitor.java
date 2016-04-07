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
	public R visitA(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A object) {
		return visitNamespace(object);
	}

	@Override
	public R visitA1(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A1 object) {
		return visitA(object);
	}

	@Override
	public R visitA2(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A2 object) {
		return visitA(object);
	}

	@Override
	public R visitA3(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A3 object) {
		return visitA2(object);
	}

	@Override
	public R visitB(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull B object) {
		return visitNamedElement(object);
	}

	@Override
	public R visitC(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull C object) {
		return visitNamedElement(object);
	}

	@Override
	public R visitD(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull D object) {
		return visiting(object);
	}

	@Override
	public R visitNamedElement(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull NamedElement object) {
		return visiting(object);
	}

	@Override
	public R visitNamespace(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull Namespace object) {
		return visitNamedElement(object);
	}

	@Override
	public R visitTRoot(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull TRoot object) {
		return visiting(object);
	}
}
