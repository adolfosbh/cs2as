/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Vars Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProviderVarsDecl()
 * @model
 * @generated
 */
public interface ProviderVarsDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProviderVarsDecl_VarDecl()
   * @model containment="true"
   * @generated
   */
  EList<LetVariableCS> getVarDecl();

} // ProviderVarsDecl
