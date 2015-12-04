/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getSelectionDef <em>Selection Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getExportedClass <em>Exported Class</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getContribution <em>Contribution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getOccludingDefs <em>Occluding Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef()
 * @model
 * @generated
 */
public interface ExportDef extends ClassNameResolutionStmnt
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_SelectionDef()
   * @model containment="true"
   * @generated
   */
  SelectionDef getSelectionDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getSelectionDef <em>Selection Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Def</em>' containment reference.
   * @see #getSelectionDef()
   * @generated
   */
  void setSelectionDef(SelectionDef value);

  /**
   * Returns the value of the '<em><b>Exported Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exported Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exported Class</em>' containment reference.
   * @see #setExportedClass(TypedRefCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_ExportedClass()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getExportedClass();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getExportedClass <em>Exported Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exported Class</em>' containment reference.
   * @see #getExportedClass()
   * @generated
   */
  void setExportedClass(TypedRefCS value);

  /**
   * Returns the value of the '<em><b>Contribution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution</em>' containment reference.
   * @see #setContribution(ContributionDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_Contribution()
   * @model containment="true"
   * @generated
   */
  ContributionDef getContribution();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getContribution <em>Contribution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution</em>' containment reference.
   * @see #getContribution()
   * @generated
   */
  void setContribution(ContributionDef value);

  /**
   * Returns the value of the '<em><b>Occluding Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occluding Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occluding Defs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_OccludingDefs()
   * @model containment="true"
   * @generated
   */
  EList<OccludingDef> getOccludingDefs();

} // ExportDef
