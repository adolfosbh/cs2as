/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.Definition#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.Definition#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDefinition()
 * @model abstract="true"
 * @generated
 */
public interface Definition extends DeclarationOrDefinition {
	/**
	 * Returns the value of the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Name</em>' containment reference.
	 * @see #setIdentifierName(Name)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDefinition_IdentifierName()
	 * @model containment="true"
	 * @generated
	 */
	Name getIdentifierName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Definition#getIdentifierName <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' containment reference.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(Name value);

	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' containment reference.
	 * @see #setDefinitionType(TypeReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDefinition_DefinitionType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDefinitionType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Definition#getDefinitionType <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' containment reference.
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(TypeReference value);

} // Definition
