/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.FormalParameterType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getFormalParameterType()
 * @model abstract="true"
 * @generated
 */
public interface FormalParameterType extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see astm.AstmPackage#getFormalParameterType_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link astm.FormalParameterType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // FormalParameterType
