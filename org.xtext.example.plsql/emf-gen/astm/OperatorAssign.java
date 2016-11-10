/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.OperatorAssign#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getOperatorAssign()
 * @model
 * @generated
 */
public interface OperatorAssign extends BinaryOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(OtherSyntaxObject)
	 * @see astm.AstmPackage#getOperatorAssign_Operator()
	 * @model containment="true"
	 * @generated
	 */
	OtherSyntaxObject getOperator();

	/**
	 * Sets the value of the '{@link astm.OperatorAssign#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OtherSyntaxObject value);

} // OperatorAssign
