/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBCursorStatement#getCursor <em>Cursor</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBCursorStatement()
 * @model abstract="true"
 * @generated
 */
public interface RDBCursorStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' containment reference.
	 * @see #setCursor(Expression)
	 * @see astm.AstmPackage#getRDBCursorStatement_Cursor()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCursor();

	/**
	 * Sets the value of the '{@link astm.RDBCursorStatement#getCursor <em>Cursor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' containment reference.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(Expression value);

} // RDBCursorStatement
