/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#isRedefine <em>Redefine</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropRef <em>Prop Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropInit <em>Prop Init</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyDef()
 * @model
 * @generated
 */
public interface PropertyDef extends EObject
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyDef_Redefine()
   * @model
   * @generated
   */
  boolean isRedefine();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#isRedefine <em>Redefine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Redefine</em>' attribute.
   * @see #isRedefine()
   * @generated
   */
  void setRedefine(boolean value);

  /**
   * Returns the value of the '<em><b>Prop Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Ref</em>' containment reference.
   * @see #setPropRef(PathNameCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyDef_PropRef()
   * @model containment="true"
   * @generated
   */
  PathNameCS getPropRef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropRef <em>Prop Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Ref</em>' containment reference.
   * @see #getPropRef()
   * @generated
   */
  void setPropRef(PathNameCS value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getPropertyDef_PropInit()
   * @model containment="true"
   * @generated
   */
  ExpCS getPropInit();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropInit <em>Prop Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Init</em>' containment reference.
   * @see #getPropInit()
   * @generated
   */
  void setPropInit(ExpCS value);

} // PropertyDef
