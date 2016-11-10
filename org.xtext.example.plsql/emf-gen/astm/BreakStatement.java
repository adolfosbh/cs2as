/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.BreakStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getBreakStatement()
 * @model
 * @generated
 */
public interface BreakStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(LabelAccess)
	 * @see astm.AstmPackage#getBreakStatement_Target()
	 * @model containment="true"
	 * @generated
	 */
	LabelAccess getTarget();

	/**
	 * Sets the value of the '{@link astm.BreakStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LabelAccess value);

} // BreakStatement
