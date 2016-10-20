/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.ConstExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getConstExp()
 * @model
 * @generated
 */
public interface ConstExp extends constExpr
{
  /**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(expression)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getConstExp_Exp()
	 * @model containment="true"
	 * @generated
	 */
  expression getExp();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.ConstExp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
  void setExp(expression value);

} // ConstExp
