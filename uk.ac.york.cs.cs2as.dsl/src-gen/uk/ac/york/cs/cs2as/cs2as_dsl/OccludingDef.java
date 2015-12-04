/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occluding Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef()
 * @model
 * @generated
 */
public interface OccludingDef extends EObject
{
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef_Contribution()
   * @model containment="true"
   * @generated
   */
  ContributionDef getContribution();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContribution <em>Contribution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution</em>' containment reference.
   * @see #getContribution()
   * @generated
   */
  void setContribution(ContributionDef value);

} // OccludingDef
