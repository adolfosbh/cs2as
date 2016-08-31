/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.interfaceType#getHeritage <em>Heritage</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.interfaceType#getMethodList <em>Method List</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.interfaceType#getPropList <em>Prop List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getinterfaceType()
 * @model
 * @generated
 */
public interface interfaceType extends restrictedType
{
  /**
   * Returns the value of the '<em><b>Heritage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heritage</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heritage</em>' containment reference.
   * @see #setHeritage(interfaceHeritage)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getinterfaceType_Heritage()
   * @model containment="true"
   * @generated
   */
  interfaceHeritage getHeritage();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.interfaceType#getHeritage <em>Heritage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heritage</em>' containment reference.
   * @see #getHeritage()
   * @generated
   */
  void setHeritage(interfaceHeritage value);

  /**
   * Returns the value of the '<em><b>Method List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method List</em>' containment reference.
   * @see #setMethodList(classMethodList)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getinterfaceType_MethodList()
   * @model containment="true"
   * @generated
   */
  classMethodList getMethodList();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.interfaceType#getMethodList <em>Method List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method List</em>' containment reference.
   * @see #getMethodList()
   * @generated
   */
  void setMethodList(classMethodList value);

  /**
   * Returns the value of the '<em><b>Prop List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.delphi.delphi.classPropertyList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop List</em>' containment reference list.
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getinterfaceType_PropList()
   * @model containment="true"
   * @generated
   */
  EList<classPropertyList> getPropList();

} // interfaceType
