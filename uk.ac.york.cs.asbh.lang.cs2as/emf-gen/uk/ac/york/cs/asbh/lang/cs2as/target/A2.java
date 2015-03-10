/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC <em>Owns C</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA2()
 * @model
 * @generated
 */
public interface A2 extends A {
	/**
	 * Returns the value of the '<em><b>Owns C</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.target.C}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2 <em>To A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns C</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA2_OwnsC()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2
	 * @model opposite="toA2" containment="true"
	 * @generated
	 */
	EList<C> getOwnsC();

} // A2
