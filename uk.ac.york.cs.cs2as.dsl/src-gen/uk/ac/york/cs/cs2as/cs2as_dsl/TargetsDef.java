/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xcore.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Targets Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.TargetsDef#getTargetClasses <em>Target Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTargetsDef()
 * @model
 * @generated
 */
public interface TargetsDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Classes</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.xcore.XClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Classes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Classes</em>' reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getTargetsDef_TargetClasses()
   * @model
   * @generated
   */
  EList<XClass> getTargetClasses();

} // TargetsDef
