/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.DeleteStatement#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getDeleteStatement()
 * @model
 * @generated
 */
public interface DeleteStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Expression)
	 * @see astm.AstmPackage#getDeleteStatement_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOperand();

	/**
	 * Sets the value of the '{@link astm.DeleteStatement#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression value);

} // DeleteStatement
