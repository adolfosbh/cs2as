/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Specific</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific#getSelections <em>Selections</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getSelectionSpecific()
 * @model
 * @generated
 */
public interface SelectionSpecific extends SelectionDef
{
  /**
   * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.PathNameCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selections</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getSelectionSpecific_Selections()
   * @model containment="true"
   * @generated
   */
  EList<PathNameCS> getSelections();

} // SelectionSpecific
