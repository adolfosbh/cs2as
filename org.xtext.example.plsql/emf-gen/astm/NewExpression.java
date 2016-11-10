/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.NewExpression#getNewType <em>New Type</em>}</li>
 *   <li>{@link astm.NewExpression#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getNewExpression()
 * @model
 * @generated
 */
public interface NewExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(TypeReference)
	 * @see astm.AstmPackage#getNewExpression_NewType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getNewType();

	/**
	 * Sets the value of the '{@link astm.NewExpression#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
	 * The list contents are of type {@link astm.OtherSyntaxObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Params</em>' containment reference list.
	 * @see astm.AstmPackage#getNewExpression_ActualParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherSyntaxObject> getActualParams();

} // NewExpression
