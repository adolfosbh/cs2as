/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getEscapeSeqDef <em>Escape Seq Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualification <em>Qualification</em>}</li>
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
   * @see #setClassRef(PathNameCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_ClassRef()
   * @model containment="true"
   * @generated
   */
  PathNameCS getClassRef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getClassRef <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' containment reference.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(PathNameCS value);

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
   * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Case</em>' attribute.
   * @see #setIgnoreCase(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_IgnoreCase()
   * @model
   * @generated
   */
  boolean isIgnoreCase();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#isIgnoreCase <em>Ignore Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Case</em>' attribute.
   * @see #isIgnoreCase()
   * @generated
   */
  void setIgnoreCase(boolean value);

  /**
   * Returns the value of the '<em><b>Escape Seq Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Escape Seq Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Escape Seq Def</em>' containment reference.
   * @see #setEscapeSeqDef(EscapeSequenceDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_EscapeSeqDef()
   * @model containment="true"
   * @generated
   */
  EscapeSequenceDef getEscapeSeqDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getEscapeSeqDef <em>Escape Seq Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Escape Seq Def</em>' containment reference.
   * @see #getEscapeSeqDef()
   * @generated
   */
  void setEscapeSeqDef(EscapeSequenceDef value);

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
   * Returns the value of the '<em><b>Qualification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualification</em>' containment reference.
   * @see #setQualification(QualificationDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTarget_Qualification()
   * @model containment="true"
   * @generated
   */
  QualificationDef getQualification();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualification <em>Qualification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualification</em>' containment reference.
   * @see #getQualification()
   * @generated
   */
  void setQualification(QualificationDef value);

} // Target
