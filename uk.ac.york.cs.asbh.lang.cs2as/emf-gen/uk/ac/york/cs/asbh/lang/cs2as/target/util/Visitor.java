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
	R visiting(uk.ac.york.cs.asbh.lang.cs2as.target.util.@NonNull Visitable visitable);

	R visitA(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A object);
	R visitA1(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A1 object);
	R visitA2(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A2 object);
	R visitA3(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull A3 object);
	R visitB(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull B object);
	R visitC(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull C object);
	R visitD(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull D object);
	R visitNamedElement(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull NamedElement object);
	R visitNamespace(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull Namespace object);
	R visitTRoot(uk.ac.york.cs.asbh.lang.cs2as.target.@NonNull TRoot object);
}
