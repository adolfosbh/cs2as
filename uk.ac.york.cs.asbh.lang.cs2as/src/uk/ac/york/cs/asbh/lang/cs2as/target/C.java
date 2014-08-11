/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2 <em>To A2</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD <em>Owns D</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getC()
 * @model
 * @generated
 */
public interface C extends EObject {
	/**
	 * Returns the value of the '<em><b>To A2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC <em>Owns C</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To A2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To A2</em>' container reference.
	 * @see #setToA2(A2)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getC_ToA2()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC
	 * @model opposite="ownsC" transient="false"
	 * @generated
	 */
	A2 getToA2();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2 <em>To A2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To A2</em>' container reference.
	 * @see #getToA2()
	 * @generated
	 */
	void setToA2(A2 value);

	/**
	 * Returns the value of the '<em><b>Owns D</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC <em>To C</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns D</em>' containment reference.
	 * @see #setOwnsD(D)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getC_OwnsD()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC
	 * @model opposite="toC" containment="true"
	 * @generated
	 */
	D getOwnsD();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD <em>Owns D</em>}' containment reference.
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
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // C
