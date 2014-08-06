/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ <em>Owns Z</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX <em>To X</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getY()
 * @model abstract="true"
 * @generated
 */
public interface Y extends EObject {
	/**
	 * Returns the value of the '<em><b>Owns Z</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY <em>To Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns Z</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Z</em>' containment reference.
	 * @see #setOwnsZ(Z)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getY_OwnsZ()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY
	 * @model opposite="toY" containment="true"
	 * @generated
	 */
	Z getOwnsZ();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ <em>Owns Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns Z</em>' containment reference.
	 * @see #getOwnsZ()
	 * @generated
	 */
	void setOwnsZ(Z value);

	/**
	 * Returns the value of the '<em><b>To X</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY <em>Owns Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To X</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To X</em>' container reference.
	 * @see #setToX(X)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getY_ToX()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY
	 * @model opposite="ownsY" transient="false"
	 * @generated
	 */
	X getToX();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX <em>To X</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To X</em>' container reference.
	 * @see #getToX()
	 * @generated
	 */
	void setToX(X value);

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
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getY_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Y
