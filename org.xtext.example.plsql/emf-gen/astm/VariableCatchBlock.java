/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.VariableCatchBlock#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getVariableCatchBlock()
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
	 * @see astm.AstmPackage#getVariableCatchBlock_ExceptionVariable()
	 * @model containment="true"
	 * @generated
	 */
	DataDefinition getExceptionVariable();

	/**
	 * Sets the value of the '{@link astm.VariableCatchBlock#getExceptionVariable <em>Exception Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Variable</em>' containment reference.
	 * @see #getExceptionVariable()
	 * @generated
	 */
	void setExceptionVariable(DataDefinition value);

} // VariableCatchBlock
