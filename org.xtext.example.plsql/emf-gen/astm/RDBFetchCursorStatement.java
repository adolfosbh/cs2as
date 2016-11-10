/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Fetch Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBFetchCursorStatement#getInto <em>Into</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBFetchCursorStatement()
 * @model
 * @generated
 */
public interface RDBFetchCursorStatement extends RDBCursorStatement {
	/**
	 * Returns the value of the '<em><b>Into</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBHostVariableReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBFetchCursorStatement_Into()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBHostVariableReference> getInto();

} // RDBFetchCursorStatement
