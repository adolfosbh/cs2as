/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty <em>Name Poperty</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef()
 * @model
 * @generated
 */
public interface NamedElementDef extends ClassNameResolutionStmnt
{
  /**
   * Returns the value of the '<em><b>Name Poperty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Poperty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Poperty</em>' containment reference.
   * @see #setNamePoperty(NameExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef_NamePoperty()
   * @model containment="true"
   * @generated
   */
  NameExpCS getNamePoperty();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty <em>Name Poperty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Poperty</em>' containment reference.
   * @see #getNamePoperty()
   * @generated
   */
  void setNamePoperty(NameExpCS value);

  /**
   * Returns the value of the '<em><b>Qualification</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualification</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualification</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef_Qualification()
   * @model containment="true"
   * @generated
   */
  EList<QualificationDef> getQualification();

} // NamedElementDef
