/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Table Space Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBTableSpaceDefinition#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBTableSpaceDefinition()
 * @model
 * @generated
 */
public interface RDBTableSpaceDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link astm.NameSpaceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableSpaceDefinition_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameSpaceDefinition> getTable();

} // RDBTableSpaceDefinition
