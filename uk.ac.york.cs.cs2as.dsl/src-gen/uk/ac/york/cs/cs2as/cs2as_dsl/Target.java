/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getPropRef <em>Prop Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualifications <em>Qualifications</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget()
 * @model
 * @generated
 */
public interface Target extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Ref</em>' containment reference.
   * @see #setClassRef(ClassRef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_ClassRef()
   * @model containment="true"
   * @generated
   */
  ClassRef getClassRef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getClassRef <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' containment reference.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(ClassRef value);

  /**
   * Returns the value of the '<em><b>Prop Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Ref</em>' containment reference.
   * @see #setPropRef(PathNameCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_PropRef()
   * @model containment="true"
   * @generated
   */
  PathNameCS getPropRef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getPropRef <em>Prop Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Ref</em>' containment reference.
   * @see #getPropRef()
   * @generated
   */
  void setPropRef(PathNameCS value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(FilterDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_Filter()
   * @model containment="true"
   * @generated
   */
  FilterDef getFilter();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterDef value);

  /**
   * Returns the value of the '<em><b>Qualifications</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifications</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_Qualifications()
   * @model containment="true"
   * @generated
   */
  EList<QualificationDef> getQualifications();

} // Target
