/**
 */
package org.xtext.example.macros.iMacros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.macros.iMacros.Url#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getUrl()
 * @model
 * @generated
 */
public interface Url extends Instruction {
	/**
	 * Returns the value of the '<em><b>Goto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto</em>' attribute.
	 * @see #setGoto(String)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getUrl_Goto()
	 * @model
	 * @generated
	 */
	String getGoto();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Url#getGoto <em>Goto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto</em>' attribute.
	 * @see #getGoto()
	 * @generated
	 */
	void setGoto(String value);

} // Url
