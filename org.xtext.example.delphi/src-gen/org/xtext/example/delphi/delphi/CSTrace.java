/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.delphi.astm.GASTMObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.CSTrace#getAst <em>Ast</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getCSTrace()
 * @model abstract="true"
 * @generated
 */
public interface CSTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Ast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ast</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast</em>' reference.
	 * @see #setAst(GASTMObject)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getCSTrace_Ast()
	 * @model transient="true"
	 * @generated
	 */
	GASTMObject getAst();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.CSTrace#getAst <em>Ast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast</em>' reference.
	 * @see #getAst()
	 * @generated
	 */
	void setAst(GASTMObject value);

} // CSTrace
