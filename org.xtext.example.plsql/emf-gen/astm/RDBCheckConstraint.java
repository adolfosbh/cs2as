/**
 */
package astm;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBCheckConstraint#getRDBConstraintText <em>RDB Constraint Text</em>}</li>
 *   <li>{@link astm.RDBCheckConstraint#getRDBConstraintType <em>RDB Constraint Type</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBCheckConstraint()
 * @model
 * @generated
 */
public interface RDBCheckConstraint extends RDBConstraint {
	/**
	 * Returns the value of the '<em><b>RDB Constraint Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDB Constraint Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDB Constraint Text</em>' attribute.
	 * @see #setRDBConstraintText(String)
	 * @see astm.AstmPackage#getRDBCheckConstraint_RDBConstraintText()
	 * @model
	 * @generated
	 */
	String getRDBConstraintText();

	/**
	 * Sets the value of the '{@link astm.RDBCheckConstraint#getRDBConstraintText <em>RDB Constraint Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDB Constraint Text</em>' attribute.
	 * @see #getRDBConstraintText()
	 * @generated
	 */
	void setRDBConstraintText(String value);

	/**
	 * Returns the value of the '<em><b>RDB Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDB Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDB Constraint Type</em>' attribute.
	 * @see #setRDBConstraintType(char)
	 * @see astm.AstmPackage#getRDBCheckConstraint_RDBConstraintType()
	 * @model
	 * @generated
	 */
	char getRDBConstraintType();

	/**
	 * Sets the value of the '{@link astm.RDBCheckConstraint#getRDBConstraintType <em>RDB Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDB Constraint Type</em>' attribute.
	 * @see #getRDBConstraintType()
	 * @generated
	 */
	void setRDBConstraintType(char value);

} // RDBCheckConstraint
