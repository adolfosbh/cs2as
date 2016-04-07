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
 * An AbstractMergedVisitor merges all visits direct to visiting().
 * This can be used by a decorating visitor to execute shared code before redispatching to a decorated visitor.
 */
public abstract class AbstractMergedVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected AbstractMergedVisitor(C context) {
		super(context);
	}

	@Override
	public R visitA(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A object) {
		return visiting(object);
	}

	@Override
	public R visitA1(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A1 object) {
		return visiting(object);
	}

	@Override
	public R visitA2(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A2 object) {
		return visiting(object);
	}

	@Override
	public R visitA3(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A3 object) {
		return visiting(object);
	}

	@Override
	public R visitB(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull B object) {
		return visiting(object);
	}

	@Override
	public R visitC(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull C object) {
		return visiting(object);
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
		return visiting(object);
	}

	@Override
	public R visitTRoot(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull TRoot object) {
		return visiting(object);
	}
}
