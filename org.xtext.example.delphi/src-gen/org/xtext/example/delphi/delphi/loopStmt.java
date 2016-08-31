/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>loop Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.loopStmt#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.loopStmt#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getloopStmt()
 * @model
 * @generated
 */
public interface loopStmt extends structStmt
{
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
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getloopStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  statement getStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.loopStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(statement value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(expression)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getloopStmt_Condition()
   * @model containment="true"
   * @generated
   */
  expression getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.loopStmt#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(expression value);

} // loopStmt
