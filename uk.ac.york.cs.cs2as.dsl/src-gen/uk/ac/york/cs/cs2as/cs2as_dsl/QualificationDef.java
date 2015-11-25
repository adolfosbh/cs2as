/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getQualifiedClass <em>Qualified Class</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualificationDef()
 * @model
 * @generated
 */
public interface QualificationDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Class</em>' containment reference.
   * @see #setQualifiedClass(TypedRefCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualificationDef_QualifiedClass()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getQualifiedClass();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getQualifiedClass <em>Qualified Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Class</em>' containment reference.
   * @see #getQualifiedClass()
   * @generated
   */
  void setQualifiedClass(TypedRefCS value);

  /**
   * Returns the value of the '<em><b>Contribution</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getQualificationDef_Contribution()
   * @model containment="true"
   * @generated
   */
  EList<ElementsContribExp> getContribution();

} // QualificationDef
