/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.plsql.dDL.Data_definition#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.plsql.dDL.DDLPackage#getData_definition()
 * @model
 * @generated
 */
public interface Data_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.plsql.dDL.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.xtext.example.plsql.dDL.DDLPackage#getData_definition_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

} // Data_definition
