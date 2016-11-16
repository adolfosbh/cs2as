/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getAggregateTypeDefinition()
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getAggregateTypeDefinition_AggregateType()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!AggregateTypeDefinition!aggregateType'"
	 * @generated
	 */
	AggregateType getAggregateType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #getAggregateType()
	 * @generated
	 */
	void setAggregateType(AggregateType value);

} // AggregateTypeDefinition
