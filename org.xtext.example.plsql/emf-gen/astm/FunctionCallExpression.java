/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.FunctionCallExpression#getCalledFunction <em>Called Function</em>}</li>
 *   <li>{@link astm.FunctionCallExpression#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getFunctionCallExpression()
 * @model
 * @generated
 */
public interface FunctionCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Called Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Function</em>' containment reference.
	 * @see #setCalledFunction(Expression)
	 * @see astm.AstmPackage#getFunctionCallExpression_CalledFunction()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCalledFunction();

	/**
	 * Sets the value of the '{@link astm.FunctionCallExpression#getCalledFunction <em>Called Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Function</em>' containment reference.
	 * @see #getCalledFunction()
	 * @generated
	 */
	void setCalledFunction(Expression value);

	/**
	 * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
	 * The list contents are of type {@link astm.ActualParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Params</em>' containment reference list.
	 * @see astm.AstmPackage#getFunctionCallExpression_ActualParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualParameter> getActualParams();

} // FunctionCallExpression
