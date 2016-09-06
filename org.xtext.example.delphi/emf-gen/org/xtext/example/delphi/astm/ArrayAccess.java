/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.ArrayAccess#getArrayName <em>Array Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.ArrayAccess#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Array Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Name</em>' containment reference.
	 * @see #setArrayName(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getArrayAccess_ArrayName()
	 * @model containment="true"
	 * @generated
	 */
	Expression getArrayName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.ArrayAccess#getArrayName <em>Array Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Name</em>' containment reference.
	 * @see #getArrayName()
	 * @generated
	 */
	void setArrayName(Expression value);

	/**
	 * Returns the value of the '<em><b>Subscripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscripts</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getArrayAccess_Subscripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getSubscripts();

} // ArrayAccess
