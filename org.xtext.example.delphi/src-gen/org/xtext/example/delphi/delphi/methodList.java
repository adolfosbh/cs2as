/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.methodList#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.methodList#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getmethodList()
 * @model
 * @generated
 */
public interface methodList extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(methodHeading)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getmethodList_Heading()
   * @model containment="true"
   * @generated
   */
  methodHeading getHeading();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.methodList#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(methodHeading value);

  /**
   * Returns the value of the '<em><b>Directive</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.delphi.delphi.directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' containment reference list.
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getmethodList_Directive()
   * @model containment="true"
   * @generated
   */
  EList<directive> getDirective();

} // methodList
