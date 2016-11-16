/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.ConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnTrueOperand <em>On True Operand</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnFalseOperand <em>On False Operand</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getConditionalExpression_Condition()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!ConditionalExpression!condition'"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.ConditionalExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>On True Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On True Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On True Operand</em>' containment reference.
	 * @see #setOnTrueOperand(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getConditionalExpression_OnTrueOperand()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!ConditionalExpression!onTrueOperand'"
	 * @generated
	 */
	Expression getOnTrueOperand();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnTrueOperand <em>On True Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On True Operand</em>' containment reference.
	 * @see #getOnTrueOperand()
	 * @generated
	 */
	void setOnTrueOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>On False Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On False Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On False Operand</em>' containment reference.
	 * @see #setOnFalseOperand(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getConditionalExpression_OnFalseOperand()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!ConditionalExpression!onFalseOperand'"
	 * @generated
	 */
	Expression getOnFalseOperand();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnFalseOperand <em>On False Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On False Operand</em>' containment reference.
	 * @see #getOnFalseOperand()
	 * @generated
	 */
	void setOnFalseOperand(Expression value);

} // ConditionalExpression
