/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.DataDefinition#isIsMutable <em>Is Mutable</em>}</li>
 *   <li>{@link astm.DataDefinition#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getDataDefinition()
 * @model abstract="true"
 * @generated
 */
public interface DataDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mutable</em>' attribute.
	 * @see #setIsMutable(boolean)
	 * @see astm.AstmPackage#getDataDefinition_IsMutable()
	 * @model
	 * @generated
	 */
	boolean isIsMutable();

	/**
	 * Sets the value of the '{@link astm.DataDefinition#isIsMutable <em>Is Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mutable</em>' attribute.
	 * @see #isIsMutable()
	 * @generated
	 */
	void setIsMutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see astm.AstmPackage#getDataDefinition_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link astm.DataDefinition#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

} // DataDefinition