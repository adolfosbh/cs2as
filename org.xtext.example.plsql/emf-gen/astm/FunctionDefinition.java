/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.FunctionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link astm.FunctionDefinition#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link astm.FunctionDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link astm.FunctionDefinition#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 *   <li>{@link astm.FunctionDefinition#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends Definition {
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
	 * @see astm.AstmPackage#getFunctionDefinition_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link astm.FunctionDefinition#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link astm.FormalParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see astm.AstmPackage#getFunctionDefinition_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterDefinition> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see astm.AstmPackage#getFunctionDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

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
	 * @see astm.AstmPackage#getFunctionDefinition_FunctionMemberAttributes()
	 * @model containment="true"
	 * @generated
	 */
	FunctionMemberAttributes getFunctionMemberAttributes();

	/**
	 * Sets the value of the '{@link astm.FunctionDefinition#getFunctionMemberAttributes <em>Function Member Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Member Attributes</em>' containment reference.
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	void setFunctionMemberAttributes(FunctionMemberAttributes value);

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' containment reference.
	 * @see #setOpensScope(FunctionScope)
	 * @see astm.AstmPackage#getFunctionDefinition_OpensScope()
	 * @model containment="true"
	 * @generated
	 */
	FunctionScope getOpensScope();

	/**
	 * Sets the value of the '{@link astm.FunctionDefinition#getOpensScope <em>Opens Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' containment reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(FunctionScope value);

} // FunctionDefinition
