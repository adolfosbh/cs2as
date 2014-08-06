/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1 <em>Is A1</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY <em>Owns Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX()
 * @model
 * @generated
 */
public interface X extends EObject {
	/**
	 * Returns the value of the '<em><b>Is A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A1</em>' attribute.
	 * @see #setIsA1(boolean)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_IsA1()
	 * @model
	 * @generated
	 */
	boolean isIsA1();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1 <em>Is A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A1</em>' attribute.
	 * @see #isIsA1()
	 * @generated
	 */
	void setIsA1(boolean value);

	/**
	 * Returns the value of the '<em><b>Owns Y</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX <em>To X</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Y</em>' containment reference.
	 * @see #setOwnsY(Y)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_OwnsY()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX
	 * @model opposite="toX" containment="true"
	 * @generated
	 */
	Y getOwnsY();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY <em>Owns Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns Y</em>' containment reference.
	 * @see #getOwnsY()
	 * @generated
	 */
	void setOwnsY(Y value);

} // X
