/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.caseStmt#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.caseStmt#getCases <em>Cases</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.caseStmt#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getcaseStmt()
 * @model
 * @generated
 */
public interface caseStmt extends conditionalStmt
{
  /**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(expression)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getcaseStmt_Expression()
	 * @model containment="true"
	 * @generated
	 */
  expression getExpression();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.caseStmt#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
  void setExpression(expression value);

  /**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.delphi.caseSelector}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getcaseStmt_Cases()
	 * @model containment="true"
	 * @generated
	 */
  EList<caseSelector> getCases();

  /**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(stmtList)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getcaseStmt_Default()
	 * @model containment="true"
	 * @generated
	 */
  stmtList getDefault();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.caseStmt#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
  void setDefault(stmtList value);

} // caseStmt
