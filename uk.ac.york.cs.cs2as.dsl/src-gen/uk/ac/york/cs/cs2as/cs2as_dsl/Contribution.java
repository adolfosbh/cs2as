/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getChild <em>Child</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsPreceding <em>Is Preceding</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsExported <em>Is Exported</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getTypeRefs <em>Type Refs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsLoaded <em>Is Loaded</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends EObject
{
  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(ParameterCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_Child()
   * @model containment="true"
   * @generated
   */
  ParameterCS getChild();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(ParameterCS value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_IsPreceding()
   * @model
   * @generated
   */
  boolean isIsPreceding();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsPreceding <em>Is Preceding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Preceding</em>' attribute.
   * @see #isIsPreceding()
   * @generated
   */
  void setIsPreceding(boolean value);

  /**
   * Returns the value of the '<em><b>Is Exported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Exported</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Exported</em>' attribute.
   * @see #setIsExported(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_IsExported()
   * @model
   * @generated
   */
  boolean isIsExported();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsExported <em>Is Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Exported</em>' attribute.
   * @see #isIsExported()
   * @generated
   */
  void setIsExported(boolean value);

  /**
   * Returns the value of the '<em><b>Type Refs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.PathNameCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Refs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_TypeRefs()
   * @model containment="true"
   * @generated
   */
  EList<PathNameCS> getTypeRefs();

  /**
   * Returns the value of the '<em><b>Is Loaded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Loaded</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Loaded</em>' attribute.
   * @see #setIsLoaded(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_IsLoaded()
   * @model
   * @generated
   */
  boolean isIsLoaded();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsLoaded <em>Is Loaded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Loaded</em>' attribute.
   * @see #isIsLoaded()
   * @generated
   */
  void setIsLoaded(boolean value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getContribution_Expression()
   * @model containment="true"
   * @generated
   */
  ExpCS getExpression();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ExpCS value);

} // Contribution
