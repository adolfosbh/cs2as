/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Ref Integrity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBRefIntegrity#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link astm.RDBRefIntegrity#getParentKey <em>Parent Key</em>}</li>
 *   <li>{@link astm.RDBRefIntegrity#getParentTable <em>Parent Table</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBRefIntegrity()
 * @model
 * @generated
 */
public interface RDBRefIntegrity extends RDBConstraint {
	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBRefIntegrity_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnReference> getForeignKey();

	/**
	 * Returns the value of the '<em><b>Parent Key</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Key</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBRefIntegrity_ParentKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnReference> getParentKey();

	/**
	 * Returns the value of the '<em><b>Parent Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Table</em>' containment reference.
	 * @see #setParentTable(RDBTableReference)
	 * @see astm.AstmPackage#getRDBRefIntegrity_ParentTable()
	 * @model containment="true"
	 * @generated
	 */
	RDBTableReference getParentTable();

	/**
	 * Sets the value of the '{@link astm.RDBRefIntegrity#getParentTable <em>Parent Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Table</em>' containment reference.
	 * @see #getParentTable()
	 * @generated
	 */
	void setParentTable(RDBTableReference value);

} // RDBRefIntegrity
