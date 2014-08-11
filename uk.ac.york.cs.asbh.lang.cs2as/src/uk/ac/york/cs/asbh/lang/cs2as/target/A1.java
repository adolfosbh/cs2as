/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA1()
 * @model
 * @generated
 */
public interface A1 extends A {
	/**
	 * Returns the value of the '<em><b>Owns B</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1 <em>To A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns B</em>' containment reference.
	 * @see #setOwnsB(B)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getA1_OwnsB()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1
	 * @model opposite="toA1" containment="true"
	 * @generated
	 */
	B getOwnsB();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns B</em>' containment reference.
	 * @see #getOwnsB()
	 * @generated
	 */
	void setOwnsB(B value);

} // A1
