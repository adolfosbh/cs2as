/**
 */
package org.xtext.example.macros.iMacros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.macros.astm.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.macros.iMacros.Script#getVersion <em>Version</em>}</li>
 *   <li>{@link org.xtext.example.macros.iMacros.Script#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getScript()
 * @model superTypes="org.xtext.example.macros.iMacros.Visitable"
 * @generated
 */
public interface Script extends EObject, Visitable {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(Version)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getScript_Version()
	 * @model
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Script#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.example.macros.iMacros.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' reference list.
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getScript_Instructions()
	 * @model
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // Script
