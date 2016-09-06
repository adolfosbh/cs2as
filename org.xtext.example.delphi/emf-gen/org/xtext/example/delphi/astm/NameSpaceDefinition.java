/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Space Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpaceType <em>Name Space Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getNameSpaceDefinition()
 * @model
 * @generated
 */
public interface NameSpaceDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' containment reference.
	 * @see #setNameSpace(Name)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getNameSpaceDefinition_NameSpace()
	 * @model containment="true"
	 * @generated
	 */
	Name getNameSpace();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpace <em>Name Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' containment reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Name value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getNameSpaceDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getBody();

	/**
	 * Returns the value of the '<em><b>Name Space Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space Type</em>' containment reference.
	 * @see #setNameSpaceType(NameSpaceType)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getNameSpaceDefinition_NameSpaceType()
	 * @model containment="true"
	 * @generated
	 */
	NameSpaceType getNameSpaceType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpaceType <em>Name Space Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space Type</em>' containment reference.
	 * @see #getNameSpaceType()
	 * @generated
	 */
	void setNameSpaceType(NameSpaceType value);

} // NameSpaceDefinition
