/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uses Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.usesClause#getIdList <em>Id List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getusesClause()
 * @model
 * @generated
 */
public interface usesClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference.
   * @see #setIdList(identList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getusesClause_IdList()
   * @model containment="true"
   * @generated
   */
  identList getIdList();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.usesClause#getIdList <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id List</em>' containment reference.
   * @see #getIdList()
   * @generated
   */
  void setIdList(identList value);

} // usesClause
