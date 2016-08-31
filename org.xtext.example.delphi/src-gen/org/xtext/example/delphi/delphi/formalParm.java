/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal Parm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.formalParm#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getformalParm()
 * @model
 * @generated
 */
public interface formalParm extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(parameter)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getformalParm_Param()
   * @model containment="true"
   * @generated
   */
  parameter getParam();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.formalParm#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(parameter value);

} // formalParm
