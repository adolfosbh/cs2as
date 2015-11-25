/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropagationAll#getExceptionProperties <em>Exception Properties</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropagationAll()
 * @model
 * @generated
 */
public interface PropagationAll extends PropagationDef
{
  /**
   * Returns the value of the '<em><b>Exception Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Properties</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropagationAll_ExceptionProperties()
   * @model containment="true"
   * @generated
   */
  EList<ExpCS> getExceptionProperties();

} // PropagationAll
