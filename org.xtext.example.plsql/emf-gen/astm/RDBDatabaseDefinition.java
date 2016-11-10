/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Database Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBDatabaseDefinition#getTableSpace <em>Table Space</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBDatabaseDefinition()
 * @model
 * @generated
 */
public interface RDBDatabaseDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Table Space</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBTableSpaceReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Space</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Space</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBDatabaseDefinition_TableSpace()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBTableSpaceReference> getTableSpace();

} // RDBDatabaseDefinition
