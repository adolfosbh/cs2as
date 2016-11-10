/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.TypeDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see astm.AstmPackage#getTypeDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link astm.TypeDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

} // TypeDefinition
