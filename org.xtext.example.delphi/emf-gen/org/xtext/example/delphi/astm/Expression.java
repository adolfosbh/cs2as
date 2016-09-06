/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.Expression#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends GASTMSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' containment reference.
	 * @see #setExpressionType(TypeReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getExpression_ExpressionType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getExpressionType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Expression#getExpressionType <em>Expression Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' containment reference.
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(TypeReference value);

} // Expression
