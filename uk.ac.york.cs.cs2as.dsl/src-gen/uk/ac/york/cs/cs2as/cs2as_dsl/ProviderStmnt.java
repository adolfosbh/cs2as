/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Stmnt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getSelectionDef <em>Selection Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProviderStmnt()
 * @model
 * @generated
 */
public interface ProviderStmnt extends EObject
{
  /**
   * Returns the value of the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Def</em>' containment reference.
   * @see #setSelectionDef(SelectionDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProviderStmnt_SelectionDef()
   * @model containment="true"
   * @generated
   */
  SelectionDef getSelectionDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getSelectionDef <em>Selection Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Def</em>' containment reference.
   * @see #getSelectionDef()
   * @generated
   */
  void setSelectionDef(SelectionDef value);

  /**
   * Returns the value of the '<em><b>Provision Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provision Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provision Defs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProviderStmnt_ProvisionDefs()
   * @model containment="true"
   * @generated
   */
  EList<ProvisionDef> getProvisionDefs();

} // ProviderStmnt
