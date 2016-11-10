/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Column Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBColumnReference#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBColumnReference()
 * @model
 * @generated
 */
public interface RDBColumnReference extends IdentifierReference {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(Expression)
	 * @see astm.AstmPackage#getRDBColumnReference_Table()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTable();

	/**
	 * Sets the value of the '{@link astm.RDBColumnReference#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Expression value);

} // RDBColumnReference
