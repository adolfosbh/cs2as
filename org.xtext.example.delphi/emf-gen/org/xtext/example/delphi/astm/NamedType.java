/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.NamedType#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getNamedType()
 * @model
 * @generated
 */
public interface NamedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Type)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getNamedType_Body()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!NamedType!body'"
	 * @generated
	 */
	Type getBody();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.NamedType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Type value);

} // NamedType
