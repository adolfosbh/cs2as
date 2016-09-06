/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Or Definition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement#getDeclOrDefn <em>Decl Or Defn</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinitionStatement()
 * @model
 * @generated
 */
public interface DeclarationOrDefinitionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Decl Or Defn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl Or Defn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl Or Defn</em>' containment reference.
	 * @see #setDeclOrDefn(DefinitionObject)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinitionStatement_DeclOrDefn()
	 * @model containment="true"
	 * @generated
	 */
	DefinitionObject getDeclOrDefn();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement#getDeclOrDefn <em>Decl Or Defn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl Or Defn</em>' containment reference.
	 * @see #getDeclOrDefn()
	 * @generated
	 */
	void setDeclOrDefn(DefinitionObject value);

} // DeclarationOrDefinitionStatement
