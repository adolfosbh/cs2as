/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rec Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.recVariant#getConstExp <em>Const Exp</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.recVariant#getFieldList <em>Field List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecVariant()
 * @model
 * @generated
 */
public interface recVariant extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Const Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.delphi.constExpr}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Exp</em>' containment reference list.
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecVariant_ConstExp()
	 * @model containment="true"
	 * @generated
	 */
  EList<constExpr> getConstExp();

  /**
	 * Returns the value of the '<em><b>Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Field List</em>' containment reference.
	 * @see #setFieldList(fieldList)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecVariant_FieldList()
	 * @model containment="true"
	 * @generated
	 */
  fieldList getFieldList();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.recVariant#getFieldList <em>Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field List</em>' containment reference.
	 * @see #getFieldList()
	 * @generated
	 */
  void setFieldList(fieldList value);

} // recVariant
