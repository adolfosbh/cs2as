/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiFunctionCallExpression#getApplyTo <em>Apply To</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiFunctionCallExpression()
 * @model
 * @generated
 */
public interface DelphiFunctionCallExpression extends FunctionCallExpression {
	/**
	 * Returns the value of the '<em><b>Apply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To</em>' reference.
	 * @see #setApplyTo(DefinitionObject)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiFunctionCallExpression_ApplyTo()
	 * @model
	 * @generated
	 */
	DefinitionObject getApplyTo();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DelphiFunctionCallExpression#getApplyTo <em>Apply To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To</em>' reference.
	 * @see #getApplyTo()
	 * @generated
	 */
	void setApplyTo(DefinitionObject value);

} // DelphiFunctionCallExpression
