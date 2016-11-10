/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Table Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBTableReference#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBTableReference()
 * @model
 * @generated
 */
public interface RDBTableReference extends IdentifierReference {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(LabelDefinition)
	 * @see astm.AstmPackage#getRDBTableReference_Alias()
	 * @model containment="true"
	 * @generated
	 */
	LabelDefinition getAlias();

	/**
	 * Sets the value of the '{@link astm.RDBTableReference#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(LabelDefinition value);

} // RDBTableReference
