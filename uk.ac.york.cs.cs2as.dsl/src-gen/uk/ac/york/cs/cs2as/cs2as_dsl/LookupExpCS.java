/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isFromExp <em>From Exp</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getLookupExpCS()
 * @model
 * @generated
 */
public interface LookupExpCS extends XExpression
{
  /**
   * Returns the value of the '<em><b>From Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Exp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Exp</em>' attribute.
   * @see #setFromExp(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getLookupExpCS_FromExp()
   * @model
   * @generated
   */
  boolean isFromExp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isFromExp <em>From Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Exp</em>' attribute.
   * @see #isFromExp()
   * @generated
   */
  void setFromExp(boolean value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getLookupExpCS_Args()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getArgs();

} // LookupExpCS
