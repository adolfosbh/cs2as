/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getQualifications <em>Qualifications</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualificationDef()
 * @model
 * @generated
 */
public interface QualificationDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualifications</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifications</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualificationDef_Qualifications()
   * @model containment="true"
   * @generated
   */
  EList<Qualification> getQualifications();

} // QualificationDef
