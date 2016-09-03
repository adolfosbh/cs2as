/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.directive#getDir <em>Dir</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.directive#getMessageExp <em>Message Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getdirective()
 * @model
 * @generated
 */
public interface directive extends EObject
{
  /**
   * Returns the value of the '<em><b>Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dir</em>' attribute.
   * @see #setDir(String)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getdirective_Dir()
   * @model
   * @generated
   */
  String getDir();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.directive#getDir <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dir</em>' attribute.
   * @see #getDir()
   * @generated
   */
  void setDir(String value);

  /**
   * Returns the value of the '<em><b>Message Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Exp</em>' containment reference.
   * @see #setMessageExp(constExpr)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getdirective_MessageExp()
   * @model containment="true"
   * @generated
   */
  constExpr getMessageExp();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.directive#getMessageExp <em>Message Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Exp</em>' containment reference.
   * @see #getMessageExp()
   * @generated
   */
  void setMessageExp(constExpr value);

} // directive