/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Table Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBTableDefinition#getPrimKey <em>Prim Key</em>}</li>
 *   <li>{@link astm.RDBTableDefinition#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.RDBTableDefinition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link astm.RDBTableDefinition#getIndex <em>Index</em>}</li>
 *   <li>{@link astm.RDBTableDefinition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBTableDefinition()
 * @model
 * @generated
 */
public interface RDBTableDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Prim Key</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prim Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prim Key</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableDefinition_PrimKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnReference> getPrimKey();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBColumnDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableDefinition_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBColumnDefinition> getColumn();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableDefinition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBIndex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableDefinition_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBIndex> getIndex();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link astm.RDBTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBTableDefinition_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDBTrigger> getTrigger();

} // RDBTableDefinition
