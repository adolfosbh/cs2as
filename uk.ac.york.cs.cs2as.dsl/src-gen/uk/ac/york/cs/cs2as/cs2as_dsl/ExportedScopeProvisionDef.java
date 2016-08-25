/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exported Scope Provision Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef#getProvisions <em>Provisions</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportedScopeProvisionDef()
 * @model
 * @generated
 */
public interface ExportedScopeProvisionDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Provisions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provisions</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportedScopeProvisionDef_Provisions()
   * @model containment="true"
   * @generated
   */
  EList<Provision> getProvisions();

} // ExportedScopeProvisionDef
