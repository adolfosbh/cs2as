/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getRule <em>Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#isIsFallback <em>Is Fallback</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMappingCreation()
 * @model
 * @generated
 */
public interface MappingCreation extends MappingDef
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMappingCreation_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

  /**
   * Returns the value of the '<em><b>Is Fallback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fallback</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fallback</em>' attribute.
   * @see #setIsFallback(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMappingCreation_IsFallback()
   * @model
   * @generated
   */
  boolean isIsFallback();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#isIsFallback <em>Is Fallback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Fallback</em>' attribute.
   * @see #isIsFallback()
   * @generated
   */
  void setIsFallback(boolean value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getMappingCreation_Properties()
   * @model containment="true"
   * @generated
   */
  EList<PropertyDef> getProperties();

} // MappingCreation
