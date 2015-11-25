/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getContibution <em>Contibution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getOccludingDefs <em>Occluding Defs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#isAcceptingAll <em>Accepting All</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getAcceptingElement <em>Accepting Element</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef()
 * @model
 * @generated
 */
public interface ExportDef extends ClassNameResolutionStmnt
{
  /**
   * Returns the value of the '<em><b>Contibution</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contibution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contibution</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_Contibution()
   * @model containment="true"
   * @generated
   */
  EList<ElementsContribExp> getContibution();

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

  /**
   * Returns the value of the '<em><b>Accepting All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accepting All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accepting All</em>' attribute.
   * @see #setAcceptingAll(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_AcceptingAll()
   * @model
   * @generated
   */
  boolean isAcceptingAll();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#isAcceptingAll <em>Accepting All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accepting All</em>' attribute.
   * @see #isAcceptingAll()
   * @generated
   */
  void setAcceptingAll(boolean value);

  /**
   * Returns the value of the '<em><b>Accepting Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accepting Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accepting Element</em>' containment reference.
   * @see #setAcceptingElement(ExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getExportDef_AcceptingElement()
   * @model containment="true"
   * @generated
   */
  ExpCS getAcceptingElement();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef#getAcceptingElement <em>Accepting Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accepting Element</em>' containment reference.
   * @see #getAcceptingElement()
   * @generated
   */
  void setAcceptingElement(ExpCS value);

} // ExportDef
