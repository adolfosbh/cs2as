/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colname</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.Colname#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.plsql.dDL.DDLPackage#getColname()
 * @model
 * @generated
 */
public interface Colname extends EObject
{
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
   * @see org.xtext.example.plsql.dDL.DDLPackage#getColname_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Colname#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Colname
