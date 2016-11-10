/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Index Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBIndexColumn#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.RDBIndexColumn#getAscendingOrDescending <em>Ascending Or Descending</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBIndexColumn()
 * @model
 * @generated
 */
public interface RDBIndexColumn extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(IncludeUnit)
	 * @see astm.AstmPackage#getRDBIndexColumn_Column()
	 * @model containment="true"
	 * @generated
	 */
	IncludeUnit getColumn();

	/**
	 * Sets the value of the '{@link astm.RDBIndexColumn#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(IncludeUnit value);

	/**
	 * Returns the value of the '<em><b>Ascending Or Descending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending Or Descending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending Or Descending</em>' attribute.
	 * @see #setAscendingOrDescending(char)
	 * @see astm.AstmPackage#getRDBIndexColumn_AscendingOrDescending()
	 * @model
	 * @generated
	 */
	char getAscendingOrDescending();

	/**
	 * Sets the value of the '{@link astm.RDBIndexColumn#getAscendingOrDescending <em>Ascending Or Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending Or Descending</em>' attribute.
	 * @see #getAscendingOrDescending()
	 * @generated
	 */
	void setAscendingOrDescending(char value);

} // RDBIndexColumn
