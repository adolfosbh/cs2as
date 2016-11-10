/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getBitFieldDefinition()
 * @model
 * @generated
 */
public interface BitFieldDefinition extends DataDefinition {
	/**
	 * Returns the value of the '<em><b>Bit Field Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #setBitFieldSize(Expression)
	 * @see astm.AstmPackage#getBitFieldDefinition_BitFieldSize()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBitFieldSize();

	/**
	 * Sets the value of the '{@link astm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #getBitFieldSize()
	 * @generated
	 */
	void setBitFieldSize(Expression value);

} // BitFieldDefinition
