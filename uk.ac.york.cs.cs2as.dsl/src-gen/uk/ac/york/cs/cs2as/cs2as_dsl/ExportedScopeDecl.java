/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exported Scope Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportedScopeDecl()
 * @model
 * @generated
 */
public interface ExportedScopeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Provision Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provision Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provision Defs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportedScopeDecl_ProvisionDefs()
   * @model containment="true"
   * @generated
   */
  EList<ExportedScopeProvisionDef> getProvisionDefs();

} // ExportedScopeDecl
