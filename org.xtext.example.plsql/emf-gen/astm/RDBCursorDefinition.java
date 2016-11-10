/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Cursor Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBCursorDefinition#getSelectExpression <em>Select Expression</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBCursorDefinition()
 * @model
 * @generated
 */
public interface RDBCursorDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Select Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Expression</em>' containment reference.
	 * @see #setSelectExpression(AggregateTypeDefinition)
	 * @see astm.AstmPackage#getRDBCursorDefinition_SelectExpression()
	 * @model containment="true"
	 * @generated
	 */
	AggregateTypeDefinition getSelectExpression();

	/**
	 * Sets the value of the '{@link astm.RDBCursorDefinition#getSelectExpression <em>Select Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Expression</em>' containment reference.
	 * @see #getSelectExpression()
	 * @generated
	 */
	void setSelectExpression(AggregateTypeDefinition value);

} // RDBCursorDefinition
