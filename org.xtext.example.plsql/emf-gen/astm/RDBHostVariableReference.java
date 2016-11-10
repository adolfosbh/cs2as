/**
 */
package astm;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.plsql.astm.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Host Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBHostVariableReference#getBaseVariable <em>Base Variable</em>}</li>
 *   <li>{@link astm.RDBHostVariableReference#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBHostVariableReference()
 * @model superTypes="astm.Visitable"
 * @generated
 */
public interface RDBHostVariableReference extends EObject, Visitable {
	/**
	 * Returns the value of the '<em><b>Base Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Variable</em>' containment reference.
	 * @see #setBaseVariable(Expression)
	 * @see astm.AstmPackage#getRDBHostVariableReference_BaseVariable()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBaseVariable();

	/**
	 * Sets the value of the '{@link astm.RDBHostVariableReference#getBaseVariable <em>Base Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Variable</em>' containment reference.
	 * @see #getBaseVariable()
	 * @generated
	 */
	void setBaseVariable(Expression value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator</em>' containment reference.
	 * @see #setIndicator(Expression)
	 * @see astm.AstmPackage#getRDBHostVariableReference_Indicator()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIndicator();

	/**
	 * Sets the value of the '{@link astm.RDBHostVariableReference#getIndicator <em>Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' containment reference.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Expression value);

} // RDBHostVariableReference
