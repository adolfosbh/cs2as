/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.ifStmt#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.ifStmt#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.ifStmt#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getifStmt()
 * @model
 * @generated
 */
public interface ifStmt extends conditionalStmt
{
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
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getifStmt_Condition()
	 * @model containment="true"
	 * @generated
	 */
  expression getCondition();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.ifStmt#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(expression value);

  /**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(statement)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getifStmt_Then()
	 * @model containment="true"
	 * @generated
	 */
  statement getThen();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.ifStmt#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
  void setThen(statement value);

  /**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(statement)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getifStmt_Else()
	 * @model containment="true"
	 * @generated
	 */
  statement getElse();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.ifStmt#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
  void setElse(statement value);

} // ifStmt
