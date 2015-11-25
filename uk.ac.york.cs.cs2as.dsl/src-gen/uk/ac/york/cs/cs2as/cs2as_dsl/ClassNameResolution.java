/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Name Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getClass_ <em>Class</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassNameResolution()
 * @model
 * @generated
 */
public interface ClassNameResolution extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(PathNameCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassNameResolution_Class()
   * @model containment="true"
   * @generated
   */
  PathNameCS getClass_();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(PathNameCS value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassNameResolution_Statements()
   * @model containment="true"
   * @generated
   */
  EList<ClassNameResolutionStmnt> getStatements();

} // ClassNameResolution
