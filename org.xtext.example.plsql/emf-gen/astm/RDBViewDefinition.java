/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBViewDefinition#getDefinedBy <em>Defined By</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBViewDefinition()
 * @model
 * @generated
 */
public interface RDBViewDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' containment reference.
	 * @see #setDefinedBy(AggregateTypeDefinition)
	 * @see astm.AstmPackage#getRDBViewDefinition_DefinedBy()
	 * @model containment="true"
	 * @generated
	 */
	AggregateTypeDefinition getDefinedBy();

	/**
	 * Sets the value of the '{@link astm.RDBViewDefinition#getDefinedBy <em>Defined By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' containment reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(AggregateTypeDefinition value);

} // RDBViewDefinition
