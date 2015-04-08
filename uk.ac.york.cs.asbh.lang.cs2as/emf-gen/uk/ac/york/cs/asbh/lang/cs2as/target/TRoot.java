/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRoot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.TRoot#getOwnedA <em>Owned A</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getTRoot()
 * @model superTypes="uk.ac.york.cs.asbh.lang.cs2as.target.Visitable"
 * @generated
 */
public interface TRoot extends EObject, Visitable {
	/**
	 * Returns the value of the '<em><b>Owned A</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.target.A}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned A</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getTRoot_OwnedA()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!TRoot!ownedA'"
	 * @generated
	 */
	EList<A> getOwnedA();

} // TRoot
