/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getAggregateTypeDefinition()
 * @model
 * @generated
 */
public interface AggregateTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #setAggregateType(AggregateType)
	 * @see astm.AstmPackage#getAggregateTypeDefinition_AggregateType()
	 * @model containment="true"
	 * @generated
	 */
	AggregateType getAggregateType();

	/**
	 * Sets the value of the '{@link astm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #getAggregateType()
	 * @generated
	 */
	void setAggregateType(AggregateType value);

} // AggregateTypeDefinition
