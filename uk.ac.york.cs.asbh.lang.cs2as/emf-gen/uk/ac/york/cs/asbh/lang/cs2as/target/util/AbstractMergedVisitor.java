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
 * An AbstractMergedVisitor merges all visits direct to visiting().
 * This can be used by a decorating visitor to execute shared code before redispatching to a decorated visitor.
 */
public abstract class AbstractMergedVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected AbstractMergedVisitor(@NonNull C context) {
		super(context);
	}

	@Override
	public @Nullable R visitA(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitA1(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A1 object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitA2(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A2 object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitA3(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A3 object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitB(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.B object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitC(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.C object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitD(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.D object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitNamedElement(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitNamespace(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.Namespace object) {
		return visiting(object);
	}

	@Override
	public @Nullable R visitTRoot(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.TRoot object) {
		return visiting(object);
	}
}
