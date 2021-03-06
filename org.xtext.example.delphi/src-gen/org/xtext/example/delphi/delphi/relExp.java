/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rel Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.relExp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.relExp#getRelOp <em>Rel Op</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.relExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrelExp()
 * @model
 * @generated
 */
public interface relExp extends expression
{
  /**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(expression)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrelExp_Left()
	 * @model containment="true"
	 * @generated
	 */
  expression getLeft();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.relExp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
  void setLeft(expression value);

  /**
	 * Returns the value of the '<em><b>Rel Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Op</em>' containment reference.
	 * @see #setRelOp(relOp)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrelExp_RelOp()
	 * @model containment="true"
	 * @generated
	 */
  relOp getRelOp();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.relExp#getRelOp <em>Rel Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Op</em>' containment reference.
	 * @see #getRelOp()
	 * @generated
	 */
  void setRelOp(relOp value);

  /**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(simpleExpression)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrelExp_Right()
	 * @model containment="true"
	 * @generated
	 */
  simpleExpression getRight();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.relExp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
  void setRight(simpleExpression value);

} // relExp
