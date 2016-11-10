/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.SpecificTriggerDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getSpecificTriggerDefinition()
 * @model
 * @generated
 */
public interface SpecificTriggerDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see astm.AstmPackage#getSpecificTriggerDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // SpecificTriggerDefinition
