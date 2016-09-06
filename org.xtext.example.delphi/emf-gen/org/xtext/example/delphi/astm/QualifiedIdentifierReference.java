/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Identifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getQualifiedIdentifierReference()
 * @model abstract="true"
 * @generated
 */
public interface QualifiedIdentifierReference extends NameReference {
	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference.
	 * @see #setQualifiers(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getQualifiedIdentifierReference_Qualifiers()
	 * @model containment="true"
	 * @generated
	 */
	Expression getQualifiers();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getQualifiers <em>Qualifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifiers</em>' containment reference.
	 * @see #getQualifiers()
	 * @generated
	 */
	void setQualifiers(Expression value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(IdentifierReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getQualifiedIdentifierReference_Member()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getMember();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(IdentifierReference value);

} // QualifiedIdentifierReference
