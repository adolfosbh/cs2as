/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.RangeExpression#getFromExpression <em>From Expression</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.RangeExpression#getToExpression <em>To Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getRangeExpression()
 * @model
 * @generated
 */
public interface RangeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>From Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Expression</em>' containment reference.
	 * @see #setFromExpression(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getRangeExpression_FromExpression()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!RangeExpression!fromExpression'"
	 * @generated
	 */
	Expression getFromExpression();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.RangeExpression#getFromExpression <em>From Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Expression</em>' containment reference.
	 * @see #getFromExpression()
	 * @generated
	 */
	void setFromExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>To Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Expression</em>' containment reference.
	 * @see #setToExpression(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getRangeExpression_ToExpression()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!RangeExpression!toExpression'"
	 * @generated
	 */
	Expression getToExpression();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.RangeExpression#getToExpression <em>To Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Expression</em>' containment reference.
	 * @see #getToExpression()
	 * @generated
	 */
	void setToExpression(Expression value);

} // RangeExpression
