/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.Declaration#getDefRef <em>Def Ref</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.Declaration#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.Declaration#getDeclarationType <em>Declaration Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends DeclarationOrDefinition {
	/**
	 * Returns the value of the '<em><b>Def Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Ref</em>' containment reference.
	 * @see #setDefRef(Definition)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclaration_DefRef()
	 * @model containment="true"
	 * @generated
	 */
	Definition getDefRef();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Declaration#getDefRef <em>Def Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Ref</em>' containment reference.
	 * @see #getDefRef()
	 * @generated
	 */
	void setDefRef(Definition value);

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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclaration_IdentifierName()
	 * @model containment="true"
	 * @generated
	 */
	Name getIdentifierName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Declaration#getIdentifierName <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' containment reference.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(Name value);

	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' containment reference.
	 * @see #setDeclarationType(TypeReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclaration_DeclarationType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDeclarationType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Declaration#getDeclarationType <em>Declaration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' containment reference.
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(TypeReference value);

} // Declaration
