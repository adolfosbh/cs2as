/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Connect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBConnectStatement#getConnectString <em>Connect String</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBConnectStatement()
 * @model
 * @generated
 */
public interface RDBConnectStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Connect String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect String</em>' containment reference.
	 * @see #setConnectString(NamedTypeDefinition)
	 * @see astm.AstmPackage#getRDBConnectStatement_ConnectString()
	 * @model containment="true"
	 * @generated
	 */
	NamedTypeDefinition getConnectString();

	/**
	 * Sets the value of the '{@link astm.RDBConnectStatement#getConnectString <em>Connect String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect String</em>' containment reference.
	 * @see #getConnectString()
	 * @generated
	 */
	void setConnectString(NamedTypeDefinition value);

} // RDBConnectStatement
