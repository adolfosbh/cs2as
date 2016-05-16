/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.InvariantCS#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getInvariantCS()
 * @model
 * @generated
 */
public interface InvariantCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ExpCS)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getInvariantCS_Exp()
   * @model containment="true"
   * @generated
   */
  ExpCS getExp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.InvariantCS#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ExpCS value);

} // InvariantCS
