/**
 */
package astm;

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
 *   <li>{@link astm.TypeQualifiedIdentifierReference#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link astm.TypeQualifiedIdentifierReference#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getTypeQualifiedIdentifierReference()
 * @model
 * @generated
 */
public interface TypeQualifiedIdentifierReference extends NameReference {
	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' containment reference list.
	 * The list contents are of type {@link astm.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' containment reference list.
	 * @see astm.AstmPackage#getTypeQualifiedIdentifierReference_AggregateType()
	 * @model containment="true"
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
	 * @see astm.AstmPackage#getTypeQualifiedIdentifierReference_Member()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getMember();

	/**
	 * Sets the value of the '{@link astm.TypeQualifiedIdentifierReference#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(IdentifierReference value);

} // TypeQualifiedIdentifierReference
