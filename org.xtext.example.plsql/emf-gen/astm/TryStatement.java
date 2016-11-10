/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.TryStatement#getGuardedStatement <em>Guarded Statement</em>}</li>
 *   <li>{@link astm.TryStatement#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link astm.TryStatement#getFinalStatement <em>Final Statement</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Guarded Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarded Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarded Statement</em>' containment reference.
	 * @see #setGuardedStatement(Statement)
	 * @see astm.AstmPackage#getTryStatement_GuardedStatement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getGuardedStatement();

	/**
	 * Sets the value of the '{@link astm.TryStatement#getGuardedStatement <em>Guarded Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarded Statement</em>' containment reference.
	 * @see #getGuardedStatement()
	 * @generated
	 */
	void setGuardedStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link astm.CatchBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Blocks</em>' containment reference list.
	 * @see astm.AstmPackage#getTryStatement_CatchBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchBlock> getCatchBlocks();

	/**
	 * Returns the value of the '<em><b>Final Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Statement</em>' containment reference.
	 * @see #setFinalStatement(Statement)
	 * @see astm.AstmPackage#getTryStatement_FinalStatement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getFinalStatement();

	/**
	 * Sets the value of the '{@link astm.TryStatement#getFinalStatement <em>Final Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Statement</em>' containment reference.
	 * @see #getFinalStatement()
	 * @generated
	 */
	void setFinalStatement(Statement value);

} // TryStatement
