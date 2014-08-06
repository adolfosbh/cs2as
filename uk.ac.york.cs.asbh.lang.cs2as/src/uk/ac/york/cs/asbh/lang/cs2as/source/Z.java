/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Z</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY <em>To Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getZ()
 * @model
 * @generated
 */
public interface Z extends EObject {
	/**
	 * Returns the value of the '<em><b>To Y</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ <em>Owns Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Y</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Y</em>' container reference.
	 * @see #setToY(Y)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getZ_ToY()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ
	 * @model opposite="ownsZ" transient="false"
	 * @generated
	 */
	Y getToY();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY <em>To Y</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Y</em>' container reference.
	 * @see #getToY()
	 * @generated
	 */
	void setToY(Y value);

} // Z
