/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.LabeledStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link astm.LabeledStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getLabeledStatement()
 * @model
 * @generated
 */
public interface LabeledStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelDefinition)
	 * @see astm.AstmPackage#getLabeledStatement_Label()
	 * @model containment="true"
	 * @generated
	 */
	LabelDefinition getLabel();

	/**
	 * Sets the value of the '{@link astm.LabeledStatement#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelDefinition value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see astm.AstmPackage#getLabeledStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link astm.LabeledStatement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // LabeledStatement
