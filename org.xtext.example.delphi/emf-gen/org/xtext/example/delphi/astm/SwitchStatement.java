/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.SwitchStatement#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.SwitchStatement#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getSwitchStatement()
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSwitchStatement_SwitchExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSwitchExpression();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SwitchStatement#getSwitchExpression <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expression</em>' containment reference.
	 * @see #getSwitchExpression()
	 * @generated
	 */
	void setSwitchExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.SwitchCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSwitchStatement_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchCase> getCases();

} // SwitchStatement
