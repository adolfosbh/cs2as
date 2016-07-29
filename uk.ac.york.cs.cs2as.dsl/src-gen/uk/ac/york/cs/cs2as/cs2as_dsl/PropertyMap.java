/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.xcore.XStructuralFeature;

import org.eclipse.xtext.xbase.XExpression;

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
   * Returns the value of the '<em><b>Prop Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Name</em>' reference.
   * @see #setPropName(XStructuralFeature)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap_PropName()
   * @model
   * @generated
   */
  XStructuralFeature getPropName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropName <em>Prop Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Name</em>' reference.
   * @see #getPropName()
   * @generated
   */
  void setPropName(XStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Prop Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Init</em>' containment reference.
   * @see #setPropInit(XExpression)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyMap_PropInit()
   * @model containment="true"
   * @generated
   */
  XExpression getPropInit();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropInit <em>Prop Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Init</em>' containment reference.
   * @see #getPropInit()
   * @generated
   */
  void setPropInit(XExpression value);

} // PropertyMap
