/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements Contrib Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsPreceding <em>Is Preceding</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsImported <em>Is Imported</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp()
 * @model
 * @generated
 */
public interface ElementsContribExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Preceding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Preceding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Preceding</em>' attribute.
   * @see #setIsPreceding(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp_IsPreceding()
   * @model
   * @generated
   */
  boolean isIsPreceding();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsPreceding <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Preceding</em>' attribute.
   * @see #isIsPreceding()
   * @generated
   */
  void setIsPreceding(boolean value);

  /**
   * Returns the value of the '<em><b>Is Imported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Imported</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Imported</em>' attribute.
   * @see #setIsImported(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp_IsImported()
   * @model
   * @generated
   */
  boolean isIsImported();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsImported <em>Is Imported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Imported</em>' attribute.
   * @see #isIsImported()
   * @generated
   */
  void setIsImported(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp_Expression()
   * @model containment="true"
   * @generated
   */
  ExpCS getExpression();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ExpCS value);

} // ElementsContribExp
