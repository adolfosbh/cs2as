/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provision Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getTargetsDef <em>Targets Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getContribution <em>Contribution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getOccludingDefs <em>Occluding Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvisionDef()
 * @model
 * @generated
 */
public interface ProvisionDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Targets Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets Def</em>' containment reference.
   * @see #setTargetsDef(MultipleClassRef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvisionDef_TargetsDef()
   * @model containment="true"
   * @generated
   */
  MultipleClassRef getTargetsDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getTargetsDef <em>Targets Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targets Def</em>' containment reference.
   * @see #getTargetsDef()
   * @generated
   */
  void setTargetsDef(MultipleClassRef value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvisionDef_Contribution()
   * @model containment="true"
   * @generated
   */
  ContributionDef getContribution();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getContribution <em>Contribution</em>}' containment reference.
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvisionDef_OccludingDefs()
   * @model containment="true"
   * @generated
   */
  EList<OccludingDef> getOccludingDefs();

} // ProvisionDef
