/**
 */
package org.xtext.example.delphi.astm;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.Name#getNameString <em>Name String</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Name String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name String</em>' attribute.
	 * @see #setNameString(String)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getName_NameString()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!Name!nameString'"
	 * @generated
	 */
	String getNameString();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.Name#getNameString <em>Name String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name String</em>' attribute.
	 * @see #getNameString()
	 * @generated
	 */
	void setNameString(String value);

} // Name
