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
 */
public interface Visitor<R>
{
	/**
	 * Returns an object which is an instance of the given class
	 * associated with this object. Returns <code>null</code> if
	 * no such object can be found.
	 *
	 * @param adapter the adapter class to look up
	 * @return an object of the given class, 
	 *    or <code>null</code> if this object does not
	 *    have an adapter for the given class
	 */
	@Nullable <A> A getAdapter(@NonNull Class<A> adapter);

	/**
	 * Return the result of visiting a visitable for which no more specific pivot type method
	 * is available.
	 */
	@Nullable R visiting(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable visitable);

	@Nullable R visitA(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A object);
	@Nullable R visitA1(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A1 object);
	@Nullable R visitA2(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A2 object);
	@Nullable R visitA3(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.A3 object);
	@Nullable R visitB(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.B object);
	@Nullable R visitC(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.C object);
	@Nullable R visitD(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.D object);
	@Nullable R visitNamedElement(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement object);
	@Nullable R visitTRoot(@NonNull uk.ac.york.cs.asbh.lang.cs2as.target.TRoot object);
}
