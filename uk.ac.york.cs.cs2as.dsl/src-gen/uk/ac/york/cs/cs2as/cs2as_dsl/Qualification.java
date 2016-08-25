/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getQualifiedClasses <em>Qualified Classes</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getContributions <em>Contributions</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualification()
 * @model
 * @generated
 */
public interface Qualification extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Classes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Classes</em>' containment reference.
   * @see #setQualifiedClasses(MultiplePathNames)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualification_QualifiedClasses()
   * @model containment="true"
   * @generated
   */
  MultiplePathNames getQualifiedClasses();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getQualifiedClasses <em>Qualified Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Classes</em>' containment reference.
   * @see #getQualifiedClasses()
   * @generated
   */
  void setQualifiedClasses(MultiplePathNames value);

  /**
   * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributions</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualification_Contributions()
   * @model containment="true"
   * @generated
   */
  EList<ExpCS> getContributions();

} // Qualification
