/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.Foreign_key#getTabname <em>Tabname</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.plsql.dDL.DDLPackage#getForeign_key()
 * @model
 * @generated
 */
public interface Foreign_key extends Key
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
   * @see org.xtext.example.plsql.dDL.DDLPackage#getForeign_key_Tabname()
   * @model containment="true"
   * @generated
   */
  Tabname getTabname();

  /**
   * Sets the value of the '{@link org.xtext.example.plsql.dDL.Foreign_key#getTabname <em>Tabname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tabname</em>' containment reference.
   * @see #getTabname()
   * @generated
   */
  void setTabname(Tabname value);

} // Foreign_key