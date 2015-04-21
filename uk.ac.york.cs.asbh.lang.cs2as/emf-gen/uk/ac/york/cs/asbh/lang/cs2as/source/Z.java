/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Z</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY <em>To Y</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getRefers <em>Refers</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getZ()
 * @model
 * @generated
 */
public interface Z extends SElement {
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

	/**
	 * Returns the value of the '<em><b>Refers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers</em>' containment reference.
	 * @see #setRefers(PathNameCS)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getZ_Refers()
	 * @model containment="true"
	 * @generated
	 */
	PathNameCS getRefers();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getRefers <em>Refers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers</em>' containment reference.
	 * @see #getRefers()
	 * @generated
	 */
	void setRefers(PathNameCS value);

} // Z
