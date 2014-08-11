/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1 <em>To A1</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD <em>Owns D</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>To A1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To A1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To A1</em>' container reference.
	 * @see #setToA1(A1)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getB_ToA1()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB
	 * @model opposite="ownsB" transient="false"
	 * @generated
	 */
	A1 getToA1();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1 <em>To A1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To A1</em>' container reference.
	 * @see #getToA1()
	 * @generated
	 */
	void setToA1(A1 value);

	/**
	 * Returns the value of the '<em><b>Owns D</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB <em>To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns D</em>' containment reference.
	 * @see #setOwnsD(D)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getB_OwnsD()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB
	 * @model opposite="toB" containment="true"
	 * @generated
	 */
	D getOwnsD();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD <em>Owns D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns D</em>' containment reference.
	 * @see #getOwnsD()
	 * @generated
	 */
	void setOwnsD(D value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getB_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // B
