/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.AggregateType#getMembers <em>Members</em>}</li>
 *   <li>{@link astm.AggregateType#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getAggregateType()
 * @model abstract="true"
 * @generated
 */
public interface AggregateType extends DataType {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see astm.AstmPackage#getAggregateType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getMembers();

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' containment reference.
	 * @see #setOpensScope(AggregateScope)
	 * @see astm.AstmPackage#getAggregateType_OpensScope()
	 * @model containment="true"
	 * @generated
	 */
	AggregateScope getOpensScope();

	/**
	 * Sets the value of the '{@link astm.AggregateType#getOpensScope <em>Opens Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' containment reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(AggregateScope value);

} // AggregateType
