/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.UnnamedTypeReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getUnnamedTypeReference()
 * @model
 * @generated
 */
public interface UnnamedTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see astm.AstmPackage#getUnnamedTypeReference_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link astm.UnnamedTypeReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // UnnamedTypeReference
