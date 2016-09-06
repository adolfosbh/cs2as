/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.NamedTypeDefinition#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getNamedTypeDefinition()
 * @model
 * @generated
 */
public interface NamedTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' containment reference.
	 * @see #setDefinitionType(NamedType)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getNamedTypeDefinition_DefinitionType()
	 * @model containment="true"
	 * @generated
	 */
	NamedType getDefinitionType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.NamedTypeDefinition#getDefinitionType <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' containment reference.
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(NamedType value);

} // NamedTypeDefinition
