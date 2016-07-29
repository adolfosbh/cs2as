/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xcore.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getContext <em>Context</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassHelper()
 * @model
 * @generated
 */
public interface ClassHelper extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(XClass)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassHelper_Context()
   * @model
   * @generated
   */
  XClass getContext();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(XClass value);

  /**
   * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helpers</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassHelper_Helpers()
   * @model containment="true"
   * @generated
   */
  EList<HelperDef> getHelpers();

} // ClassHelper
