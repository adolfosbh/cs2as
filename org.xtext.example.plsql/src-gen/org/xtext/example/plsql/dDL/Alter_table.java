/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.Alter_table#getTabname <em>Tabname</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.Alter_table#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.Alter_table#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.Alter_table#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.xtext.example.plsql.dDL.Alter_table#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table()
 * @model
 * @generated
 */
public interface Alter_table extends Definition
{
  /**
   * Returns the value of the '<em><b>Tabname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabname</em>' containment reference.
   * @see #setTabname(Tabname)
   * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table_Tabname()
   * @model containment="true"
   * @generated
   */
  Tabname getTabname();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Alter_table#getTabname <em>Tabname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tabname</em>' containment reference.
   * @see #getTabname()
   * @generated
   */
  void setTabname(Tabname value);

  /**
   * Returns the value of the '<em><b>Add</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' attribute.
   * @see #setAdd(String)
   * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table_Add()
   * @model
   * @generated
   */
  String getAdd();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Alter_table#getAdd <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add</em>' attribute.
   * @see #getAdd()
   * @generated
   */
  void setAdd(String value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(Constraint)
   * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Alter_table#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(Constraint value);

  /**
   * Returns the value of the '<em><b>Enable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable</em>' attribute.
   * @see #setEnable(String)
   * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table_Enable()
   * @model
   * @generated
   */
  String getEnable();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Alter_table#getEnable <em>Enable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable</em>' attribute.
   * @see #getEnable()
   * @generated
   */
  void setEnable(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.plsql.dDL.DDLPackage#getAlter_table_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Alter_table#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Alter_table
