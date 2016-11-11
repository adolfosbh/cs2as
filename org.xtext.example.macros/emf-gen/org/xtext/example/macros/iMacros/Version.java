/**
 */
package org.xtext.example.macros.iMacros;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.macros.astm.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.macros.iMacros.Version#getBuild <em>Build</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getVersion()
 * @model superTypes="org.xtext.example.macros.iMacros.Visitable"
 * @generated
 */
public interface Version extends EObject, Visitable {
	/**
	 * Returns the value of the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' attribute.
	 * @see #setBuild(String)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getVersion_Build()
	 * @model
	 * @generated
	 */
	String getBuild();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Version#getBuild <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' attribute.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(String value);

} // Version
