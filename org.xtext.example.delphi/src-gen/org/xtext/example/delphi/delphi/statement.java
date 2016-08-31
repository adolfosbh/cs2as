/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.statement#getLabelId <em>Label Id</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Label Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Id</em>' attribute.
   * @see #setLabelId(String)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getstatement_LabelId()
   * @model
   * @generated
   */
  String getLabelId();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.statement#getLabelId <em>Label Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Id</em>' attribute.
   * @see #getLabelId()
   * @generated
   */
  void setLabelId(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(EObject)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getstatement_Statement()
   * @model containment="true"
   * @generated
   */
  EObject getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(EObject value);

} // statement
