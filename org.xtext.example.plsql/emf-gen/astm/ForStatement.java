/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.ForStatement#getInitBody <em>Init Body</em>}</li>
 *   <li>{@link astm.ForStatement#getIterationBody <em>Iteration Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getForStatement()
 * @model abstract="true"
 * @generated
 */
public interface ForStatement extends LoopStatement {
	/**
	 * Returns the value of the '<em><b>Init Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Body</em>' containment reference.
	 * @see #setInitBody(Expression)
	 * @see astm.AstmPackage#getForStatement_InitBody()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitBody();

	/**
	 * Sets the value of the '{@link astm.ForStatement#getInitBody <em>Init Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Body</em>' containment reference.
	 * @see #getInitBody()
	 * @generated
	 */
	void setInitBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Iteration Body</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration Body</em>' containment reference list.
	 * @see astm.AstmPackage#getForStatement_IterationBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIterationBody();

} // ForStatement
