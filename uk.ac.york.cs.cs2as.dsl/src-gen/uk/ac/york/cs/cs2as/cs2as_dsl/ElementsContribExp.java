/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isFollowing <em>Following</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getTypeFilter <em>Type Filter</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp()
 * @model
 * @generated
 */
public interface ElementsContribExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Following</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following</em>' attribute.
   * @see #setFollowing(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp_Following()
   * @model
   * @generated
   */
  boolean isFollowing();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isFollowing <em>Following</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Following</em>' attribute.
   * @see #isFollowing()
   * @generated
   */
  void setFollowing(boolean value);

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

  /**
   * Returns the value of the '<em><b>Type Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Filter</em>' containment reference.
   * @see #setTypeFilter(TypedRefCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getElementsContribExp_TypeFilter()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getTypeFilter();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getTypeFilter <em>Type Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Filter</em>' containment reference.
   * @see #getTypeFilter()
   * @generated
   */
  void setTypeFilter(TypedRefCS value);

} // ElementsContribExp
