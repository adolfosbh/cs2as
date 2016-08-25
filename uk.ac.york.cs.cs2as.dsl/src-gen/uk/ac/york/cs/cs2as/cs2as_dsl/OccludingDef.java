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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContributionsDef <em>Contributions Def</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef()
 * @model
 * @generated
 */
public interface OccludingDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Contributions Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributions Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributions Def</em>' containment reference.
   * @see #setContributionsDef(ContributionsDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef_ContributionsDef()
   * @model containment="true"
   * @generated
   */
  ContributionsDef getContributionsDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContributionsDef <em>Contributions Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contributions Def</em>' containment reference.
   * @see #getContributionsDef()
   * @generated
   */
  void setContributionsDef(ContributionsDef value);

} // OccludingDef
