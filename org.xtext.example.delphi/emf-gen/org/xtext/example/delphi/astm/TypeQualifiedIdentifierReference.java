/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Qualified Identifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getTypeQualifiedIdentifierReference()
 * @model
 * @generated
 */
public interface TypeQualifiedIdentifierReference extends NameReference {
	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getTypeQualifiedIdentifierReference_AggregateType()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!TypeQualifiedIdentifierReference!aggregateType'"
	 * @generated
	 */
	EList<TypeReference> getAggregateType();

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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getTypeQualifiedIdentifierReference_Member()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!TypeQualifiedIdentifierReference!member'"
	 * @generated
	 */
	IdentifierReference getMember();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(IdentifierReference value);

} // TypeQualifiedIdentifierReference
