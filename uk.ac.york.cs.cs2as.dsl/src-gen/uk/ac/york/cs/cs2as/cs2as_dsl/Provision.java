/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getProvidedClasses <em>Provided Classes</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getContributionsDef <em>Contributions Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getOccludingDefs <em>Occluding Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvision()
 * @model
 * @generated
 */
public interface Provision extends EObject
{
  /**
   * Returns the value of the '<em><b>Provided Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Classes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Classes</em>' containment reference.
   * @see #setProvidedClasses(MultiplePathNames)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvision_ProvidedClasses()
   * @model containment="true"
   * @generated
   */
  MultiplePathNames getProvidedClasses();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getProvidedClasses <em>Provided Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provided Classes</em>' containment reference.
   * @see #getProvidedClasses()
   * @generated
   */
  void setProvidedClasses(MultiplePathNames value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvision_ContributionsDef()
   * @model containment="true"
   * @generated
   */
  ContributionsDef getContributionsDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getContributionsDef <em>Contributions Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contributions Def</em>' containment reference.
   * @see #getContributionsDef()
   * @generated
   */
  void setContributionsDef(ContributionsDef value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvision_OccludingDefs()
   * @model containment="true"
   * @generated
   */
  EList<OccludingDef> getOccludingDefs();

} // Provision
