/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#isRedefine <em>Redefine</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropInit <em>Prop Init</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap()
 * @model
 * @generated
 */
public interface PropertyMap extends ClassMapStmnt
{
  /**
   * Returns the value of the '<em><b>Redefine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Redefine</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Redefine</em>' attribute.
   * @see #setRedefine(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap_Redefine()
   * @model
   * @generated
   */
  boolean isRedefine();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#isRedefine <em>Redefine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Redefine</em>' attribute.
   * @see #isRedefine()
   * @generated
   */
  void setRedefine(boolean value);

  /**
   * Returns the value of the '<em><b>Prop Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Name</em>' attribute.
   * @see #setPropName(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap_PropName()
   * @model
   * @generated
   */
  String getPropName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropName <em>Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Name</em>' attribute.
   * @see #getPropName()
   * @generated
   */
  void setPropName(String value);

  /**
   * Returns the value of the '<em><b>Prop Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Init</em>' containment reference.
   * @see #setPropInit(ExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap_PropInit()
   * @model containment="true"
   * @generated
   */
  ExpCS getPropInit();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropInit <em>Prop Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Init</em>' containment reference.
   * @see #getPropInit()
   * @generated
   */
  void setPropInit(ExpCS value);

} // PropertyMap
