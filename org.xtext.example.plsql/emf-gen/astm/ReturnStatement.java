/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.ReturnStatement#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(Expression)
	 * @see astm.AstmPackage#getReturnStatement_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReturnValue();

	/**
	 * Sets the value of the '{@link astm.ReturnStatement#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Expression value);

} // ReturnStatement
