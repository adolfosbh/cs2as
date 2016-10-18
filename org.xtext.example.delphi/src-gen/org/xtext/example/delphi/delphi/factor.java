/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getDesignator <em>Designator</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getExpList <em>Exp List</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getSetConstuctor <em>Set Constuctor</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.factor#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor()
 * @model
 * @generated
 */
public interface factor extends term
{
  /**
	 * Returns the value of the '<em><b>Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Designator</em>' containment reference.
	 * @see #setDesignator(designator)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_Designator()
	 * @model containment="true"
	 * @generated
	 */
  designator getDesignator();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getDesignator <em>Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designator</em>' containment reference.
	 * @see #getDesignator()
	 * @generated
	 */
  void setDesignator(designator value);

  /**
	 * Returns the value of the '<em><b>Exp List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp List</em>' containment reference.
	 * @see #setExpList(exprList)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_ExpList()
	 * @model containment="true"
	 * @generated
	 */
  exprList getExpList();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getExpList <em>Exp List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp List</em>' containment reference.
	 * @see #getExpList()
	 * @generated
	 */
  void setExpList(exprList value);

  /**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_Number()
	 * @model
	 * @generated
	 */
  String getNumber();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
  void setNumber(String value);

  /**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_String()
	 * @model
	 * @generated
	 */
  String getString();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
  void setString(String value);

  /**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(expression)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_Exp()
	 * @model containment="true"
	 * @generated
	 */
  expression getExp();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
  void setExp(expression value);

  /**
	 * Returns the value of the '<em><b>Set Constuctor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Constuctor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constuctor</em>' containment reference.
	 * @see #setSetConstuctor(setConstructor)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_SetConstuctor()
	 * @model containment="true"
	 * @generated
	 */
  setConstructor getSetConstuctor();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getSetConstuctor <em>Set Constuctor</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constuctor</em>' containment reference.
	 * @see #getSetConstuctor()
	 * @generated
	 */
  void setSetConstuctor(setConstructor value);

  /**
	 * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' containment reference.
	 * @see #setTypeRef(typeId)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getfactor_TypeRef()
	 * @model containment="true"
	 * @generated
	 */
  typeId getTypeRef();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.factor#getTypeRef <em>Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' containment reference.
	 * @see #getTypeRef()
	 * @generated
	 */
  void setTypeRef(typeId value);

} // factor
