/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occluding Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContibution <em>Contibution</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef()
 * @model
 * @generated
 */
public interface OccludingDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Contibution</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contibution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contibution</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getOccludingDef_Contibution()
   * @model containment="true"
   * @generated
   */
  EList<ElementsContribExp> getContibution();

} // OccludingDef
