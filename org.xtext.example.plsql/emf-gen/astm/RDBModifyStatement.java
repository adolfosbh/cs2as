/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Modify Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBModifyStatement#getTable <em>Table</em>}</li>
 *   <li>{@link astm.RDBModifyStatement#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBModifyStatement()
 * @model abstract="true"
 * @generated
 */
public interface RDBModifyStatement extends Statement {
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
	 * @see astm.AstmPackage#getRDBModifyStatement_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameSpaceDefinition> getTable();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see astm.AstmPackage#getRDBModifyStatement_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link astm.RDBModifyStatement#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

} // RDBModifyStatement
