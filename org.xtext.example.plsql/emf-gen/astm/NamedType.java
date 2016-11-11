/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.NamedType#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getNamedType()
 * @model
 * @generated
 */
public interface NamedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Type)
	 * @see astm.AstmPackage#getNamedType_Body()
	 * @model containment="true"
	 * @generated
	 */
	Type getBody();

	/**
	 * Sets the value of the '{@link astm.NamedType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Type value);

} // NamedType
