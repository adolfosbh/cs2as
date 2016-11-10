/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBSelectStatement#getSelectExpression <em>Select Expression</em>}</li>
 *   <li>{@link astm.RDBSelectStatement#getIntoVariable <em>Into Variable</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBSelectStatement()
 * @model
 * @generated
 */
public interface RDBSelectStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Select Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Expression</em>' containment reference.
	 * @see #setSelectExpression(RDBSelectExpression)
	 * @see astm.AstmPackage#getRDBSelectStatement_SelectExpression()
	 * @model containment="true"
	 * @generated
	 */
	RDBSelectExpression getSelectExpression();

	/**
	 * Sets the value of the '{@link astm.RDBSelectStatement#getSelectExpression <em>Select Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Expression</em>' containment reference.
	 * @see #getSelectExpression()
	 * @generated
	 */
	void setSelectExpression(RDBSelectExpression value);

	/**
	 * Returns the value of the '<em><b>Into Variable</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBHostVariableReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into Variable</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBSelectStatement_IntoVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBHostVariableReference> getIntoVariable();

} // RDBSelectStatement
