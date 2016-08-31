/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>with Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.withStmt#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.withStmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getwithStmt()
 * @model
 * @generated
 */
public interface withStmt extends structStmt
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(identList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getwithStmt_Vars()
   * @model containment="true"
   * @generated
   */
  identList getVars();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.withStmt#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(identList value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(statement)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getwithStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  statement getStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.withStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(statement value);

} // withStmt
