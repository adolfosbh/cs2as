/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.parameterSimple#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.parameterSimple#getInitExp <em>Init Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getparameterSimple()
 * @model
 * @generated
 */
public interface parameterSimple extends parameter
{
  /**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(ident)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getparameterSimple_If()
	 * @model containment="true"
	 * @generated
	 */
  ident getIf();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.parameterSimple#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
  void setIf(ident value);

  /**
	 * Returns the value of the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Exp</em>' containment reference.
	 * @see #setInitExp(constExpr)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getparameterSimple_InitExp()
	 * @model containment="true"
	 * @generated
	 */
  constExpr getInitExp();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.parameterSimple#getInitExp <em>Init Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Exp</em>' containment reference.
	 * @see #getInitExp()
	 * @generated
	 */
  void setInitExp(constExpr value);

} // parameterSimple
