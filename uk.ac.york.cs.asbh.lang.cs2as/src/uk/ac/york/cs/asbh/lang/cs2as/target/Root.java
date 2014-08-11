/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.Root#getOwnedA <em>Owned A</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
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
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getRoot_OwnedA()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getOwnedA();

} // Root
