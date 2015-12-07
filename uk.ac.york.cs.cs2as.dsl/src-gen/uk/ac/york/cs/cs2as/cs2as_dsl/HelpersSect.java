/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helpers Sect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect#getClassHelpers <em>Class Helpers</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelpersSect()
 * @model
 * @generated
 */
public interface HelpersSect extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Helpers</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Helpers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Helpers</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelpersSect_ClassHelpers()
   * @model containment="true"
   * @generated
   */
  EList<ClassHelper> getClassHelpers();

} // HelpersSect
