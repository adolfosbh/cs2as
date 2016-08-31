/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>init Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.initSection#getStmtList <em>Stmt List</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.initSection#getEndStmtList <em>End Stmt List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getinitSection()
 * @model
 * @generated
 */
public interface initSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmt List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt List</em>' containment reference.
   * @see #setStmtList(stmtList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getinitSection_StmtList()
   * @model containment="true"
   * @generated
   */
  stmtList getStmtList();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.initSection#getStmtList <em>Stmt List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt List</em>' containment reference.
   * @see #getStmtList()
   * @generated
   */
  void setStmtList(stmtList value);

  /**
   * Returns the value of the '<em><b>End Stmt List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Stmt List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Stmt List</em>' containment reference.
   * @see #setEndStmtList(stmtList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getinitSection_EndStmtList()
   * @model containment="true"
   * @generated
   */
  stmtList getEndStmtList();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.initSection#getEndStmtList <em>End Stmt List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Stmt List</em>' containment reference.
   * @see #getEndStmtList()
   * @generated
   */
  void setEndStmtList(stmtList value);

} // initSection
