/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Column Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBColumnDefinition#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link astm.RDBColumnDefinition#getName <em>Name</em>}</li>
 *   <li>{@link astm.RDBColumnDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBColumnDefinition()
 * @model
 * @generated
 */
public interface RDBColumnDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see astm.AstmPackage#getRDBColumnDefinition_NotNull()
	 * @model
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link astm.RDBColumnDefinition#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see astm.AstmPackage#getRDBColumnDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link astm.RDBColumnDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(RDBColumnType)
	 * @see astm.AstmPackage#getRDBColumnDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	RDBColumnType getType();

	/**
	 * Sets the value of the '{@link astm.RDBColumnDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RDBColumnType value);

} // RDBColumnDefinition
