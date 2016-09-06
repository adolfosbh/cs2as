/**
 */
package org.xtext.example.delphi.astm;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Or Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#isIsRegister <em>Is Register</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getLinkageSpecifier <em>Linkage Specifier</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getStorageSpecifiers <em>Storage Specifiers</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getAccessKind <em>Access Kind</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinition()
 * @model abstract="true"
 * @generated
 */
public interface DeclarationOrDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Register</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Register</em>' attribute.
	 * @see #setIsRegister(boolean)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinition_IsRegister()
	 * @model
	 * @generated
	 */
	boolean isIsRegister();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#isIsRegister <em>Is Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Register</em>' attribute.
	 * @see #isIsRegister()
	 * @generated
	 */
	void setIsRegister(boolean value);

	/**
	 * Returns the value of the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkage Specifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkage Specifier</em>' attribute.
	 * @see #setLinkageSpecifier(String)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinition_LinkageSpecifier()
	 * @model
	 * @generated
	 */
	String getLinkageSpecifier();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getLinkageSpecifier <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkage Specifier</em>' attribute.
	 * @see #getLinkageSpecifier()
	 * @generated
	 */
	void setLinkageSpecifier(String value);

	/**
	 * Returns the value of the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Specifiers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Specifiers</em>' containment reference.
	 * @see #setStorageSpecifiers(OtherSyntaxObject)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinition_StorageSpecifiers()
	 * @model containment="true"
	 * @generated
	 */
	OtherSyntaxObject getStorageSpecifiers();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getStorageSpecifiers <em>Storage Specifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Specifiers</em>' containment reference.
	 * @see #getStorageSpecifiers()
	 * @generated
	 */
	void setStorageSpecifiers(OtherSyntaxObject value);

	/**
	 * Returns the value of the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Kind</em>' containment reference.
	 * @see #setAccessKind(OtherSyntaxObject)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDeclarationOrDefinition_AccessKind()
	 * @model containment="true"
	 * @generated
	 */
	OtherSyntaxObject getAccessKind();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getAccessKind <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' containment reference.
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(OtherSyntaxObject value);

} // DeclarationOrDefinition
