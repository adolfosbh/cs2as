/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA1()
 * @model
 * @generated
 */
public interface A1 extends A {
	/**
	 * Returns the value of the '<em><b>Owns B</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.target.B}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1 <em>To A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns B</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns B</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA1_OwnsB()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1
	 * @model opposite="toA1" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!A1!ownsB'"
	 * @generated
	 */
	EList<B> getOwnsB();

} // A1
