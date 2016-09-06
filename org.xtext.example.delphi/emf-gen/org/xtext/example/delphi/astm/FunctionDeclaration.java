/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.FunctionDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.FunctionDeclaration#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.FunctionDeclaration#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.FormalParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getFunctionDeclaration_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterDeclaration> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Function Member Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Member Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Member Attributes</em>' containment reference.
	 * @see #setFunctionMemberAttributes(FunctionMemberAttributes)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getFunctionDeclaration_FunctionMemberAttributes()
	 * @model containment="true"
	 * @generated
	 */
	FunctionMemberAttributes getFunctionMemberAttributes();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.FunctionDeclaration#getFunctionMemberAttributes <em>Function Member Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Member Attributes</em>' containment reference.
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	void setFunctionMemberAttributes(FunctionMemberAttributes value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getFunctionDeclaration_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.FunctionDeclaration#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

} // FunctionDeclaration
