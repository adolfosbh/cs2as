/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.FunctionType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link astm.FunctionType#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends Type {
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
	 * @see astm.AstmPackage#getFunctionType_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link astm.FunctionType#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
	 * The list contents are of type {@link astm.FormalParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' containment reference list.
	 * @see astm.AstmPackage#getFunctionType_ParameterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterType> getParameterTypes();

} // FunctionType
