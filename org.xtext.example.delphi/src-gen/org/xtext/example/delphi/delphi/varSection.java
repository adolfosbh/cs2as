/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.varSection#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getvarSection()
 * @model
 * @generated
 */
public interface varSection extends interfaceDecl, declSection
{
  /**
   * Returns the value of the '<em><b>Var Decls</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.delphi.delphi.varDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decls</em>' containment reference list.
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getvarSection_VarDecls()
   * @model containment="true"
   * @generated
   */
  EList<varDecl> getVarDecls();

} // varSection
