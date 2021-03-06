/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subrange Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.subrangeType#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.subrangeType#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getsubrangeType()
 * @model
 * @generated
 */
public interface subrangeType extends ordinalType
{
  /**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(constExpr)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getsubrangeType_First()
	 * @model containment="true"
	 * @generated
	 */
  constExpr getFirst();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.subrangeType#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
  void setFirst(constExpr value);

  /**
	 * Returns the value of the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' containment reference.
	 * @see #setLast(constExpr)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getsubrangeType_Last()
	 * @model containment="true"
	 * @generated
	 */
  constExpr getLast();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.subrangeType#getLast <em>Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' containment reference.
	 * @see #getLast()
	 * @generated
	 */
  void setLast(constExpr value);

} // subrangeType
