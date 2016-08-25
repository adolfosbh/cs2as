/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Path Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames#getPathNames <em>Path Names</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMultiplePathNames()
 * @model
 * @generated
 */
public interface MultiplePathNames extends EObject
{
  /**
   * Returns the value of the '<em><b>Path Names</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.PathNameCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Names</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMultiplePathNames_PathNames()
   * @model containment="true"
   * @generated
   */
  EList<PathNameCS> getPathNames();

} // MultiplePathNames
