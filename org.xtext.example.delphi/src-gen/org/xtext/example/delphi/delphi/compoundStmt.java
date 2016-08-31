/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compound Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.compoundStmt#getStatmnts <em>Statmnts</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getcompoundStmt()
 * @model
 * @generated
 */
public interface compoundStmt extends structStmt
{
  /**
   * Returns the value of the '<em><b>Statmnts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statmnts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statmnts</em>' containment reference.
   * @see #setStatmnts(stmtList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getcompoundStmt_Statmnts()
   * @model containment="true"
   * @generated
   */
  stmtList getStatmnts();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.compoundStmt#getStatmnts <em>Statmnts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statmnts</em>' containment reference.
   * @see #getStatmnts()
   * @generated
   */
  void setStatmnts(stmtList value);

} // compoundStmt
