/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Update Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBUpdateStatement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBUpdateStatement()
 * @model
 * @generated
 */
public interface RDBUpdateStatement extends RDBModifyStatement {
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
	 * @see astm.AstmPackage#getRDBUpdateStatement_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // RDBUpdateStatement
