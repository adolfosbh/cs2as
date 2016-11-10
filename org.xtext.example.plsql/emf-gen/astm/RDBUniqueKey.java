/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Unique Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBUniqueKey#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBUniqueKey()
 * @model
 * @generated
 */
public interface RDBUniqueKey extends RDBConstraint {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBUniqueKey_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnReference> getColumn();

} // RDBUniqueKey
