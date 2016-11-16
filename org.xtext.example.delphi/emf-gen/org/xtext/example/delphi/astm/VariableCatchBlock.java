/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.VariableCatchBlock#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getVariableCatchBlock()
 * @model
 * @generated
 */
public interface VariableCatchBlock extends CatchBlock {
	/**
	 * Returns the value of the '<em><b>Exception Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Variable</em>' containment reference.
	 * @see #setExceptionVariable(DataDefinition)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getVariableCatchBlock_ExceptionVariable()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!VariableCatchBlock!exceptionVariable'"
	 * @generated
	 */
	DataDefinition getExceptionVariable();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.VariableCatchBlock#getExceptionVariable <em>Exception Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Variable</em>' containment reference.
	 * @see #getExceptionVariable()
	 * @generated
	 */
	void setExceptionVariable(DataDefinition value);

} // VariableCatchBlock
