/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xcore.XClass;
import org.eclipse.emf.ecore.xcore.XParameter;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getHelperBody <em>Helper Body</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelperDef()
 * @model
 * @generated
 */
public interface HelperDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelperDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.xcore.XParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelperDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<XParameter> getParams();

  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type</em>' reference.
   * @see #setOwnedType(XClass)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelperDef_OwnedType()
   * @model
   * @generated
   */
  XClass getOwnedType();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedType <em>Owned Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Type</em>' reference.
   * @see #getOwnedType()
   * @generated
   */
  void setOwnedType(XClass value);

  /**
   * Returns the value of the '<em><b>Helper Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helper Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helper Body</em>' containment reference.
   * @see #setHelperBody(XExpression)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getHelperDef_HelperBody()
   * @model containment="true"
   * @generated
   */
  XExpression getHelperBody();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getHelperBody <em>Helper Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Helper Body</em>' containment reference.
   * @see #getHelperBody()
   * @generated
   */
  void setHelperBody(XExpression value);

} // HelperDef
