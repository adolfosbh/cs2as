/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.SwitchStatement#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link astm.SwitchStatement#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Expression</em>' containment reference.
	 * @see #setSwitchExpression(Expression)
	 * @see astm.AstmPackage#getSwitchStatement_SwitchExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSwitchExpression();

	/**
	 * Sets the value of the '{@link astm.SwitchStatement#getSwitchExpression <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expression</em>' containment reference.
	 * @see #getSwitchExpression()
	 * @generated
	 */
	void setSwitchExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference.
	 * @see #setCases(SwitchCase)
	 * @see astm.AstmPackage#getSwitchStatement_Cases()
	 * @model containment="true"
	 * @generated
	 */
	SwitchCase getCases();

	/**
	 * Sets the value of the '{@link astm.SwitchStatement#getCases <em>Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cases</em>' containment reference.
	 * @see #getCases()
	 * @generated
	 */
	void setCases(SwitchCase value);

} // SwitchStatement
