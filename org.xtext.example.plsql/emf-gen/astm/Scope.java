/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.Scope#getDefinitionObject <em>Definition Object</em>}</li>
 *   <li>{@link astm.Scope#getChildScope <em>Child Scope</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends GASTMSemanticObject {
	/**
	 * Returns the value of the '<em><b>Definition Object</b></em>' containment reference list.
	 * The list contents are of type {@link astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Object</em>' containment reference list.
	 * @see astm.AstmPackage#getScope_DefinitionObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getDefinitionObject();

	/**
	 * Returns the value of the '<em><b>Child Scope</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Scope</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Scope</em>' containment reference list.
	 * @see astm.AstmPackage#getScope_ChildScope()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scope> getChildScope();

} // Scope
