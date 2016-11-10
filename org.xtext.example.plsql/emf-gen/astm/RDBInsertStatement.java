/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBInsertStatement#getIntoTable <em>Into Table</em>}</li>
 *   <li>{@link astm.RDBInsertStatement#getColumns <em>Columns</em>}</li>
 *   <li>{@link astm.RDBInsertStatement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBInsertStatement()
 * @model
 * @generated
 */
public interface RDBInsertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Into Table</b></em>' containment reference list.
	 * The list contents are of type {@link astm.NameSpaceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into Table</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBInsertStatement_IntoTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameSpaceDefinition> getIntoTable();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link astm.IncludeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBInsertStatement_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludeUnit> getColumns();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBInsertStatement_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // RDBInsertStatement
