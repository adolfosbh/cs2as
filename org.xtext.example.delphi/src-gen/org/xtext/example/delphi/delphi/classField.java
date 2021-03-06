/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.classField#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.classField#getFieldList <em>Field List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getclassField()
 * @model
 * @generated
 */
public interface classField extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getclassField_Visibility()
	 * @model
	 * @generated
	 */
  String getVisibility();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.classField#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
  void setVisibility(String value);

  /**
	 * Returns the value of the '<em><b>Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Field List</em>' containment reference.
	 * @see #setFieldList(objFieldList)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getclassField_FieldList()
	 * @model containment="true"
	 * @generated
	 */
  objFieldList getFieldList();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.classField#getFieldList <em>Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field List</em>' containment reference.
	 * @see #getFieldList()
	 * @generated
	 */
  void setFieldList(objFieldList value);

} // classField
