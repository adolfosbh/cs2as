/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBTrigger#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBTrigger()
 * @model
 * @generated
 */
public interface RDBTrigger extends OtherSyntaxObject, Definition {
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
	 * @see astm.AstmPackage#getRDBTrigger_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // RDBTrigger
