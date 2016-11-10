/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBSelectExpression#getTable <em>Table</em>}</li>
 *   <li>{@link astm.RDBSelectExpression#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.RDBSelectExpression#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBSelectExpression()
 * @model
 * @generated
 */
public interface RDBSelectExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBTableReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBSelectExpression_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBTableReference> getTable();

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
	 * @see astm.AstmPackage#getRDBSelectExpression_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnReference> getColumn();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBSelectExpression_Where()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getWhere();

} // RDBSelectExpression
