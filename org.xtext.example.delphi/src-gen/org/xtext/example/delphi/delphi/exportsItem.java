/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exports Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.exportsItem#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.exportsItem#getConstExp <em>Const Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportsItem()
 * @model
 * @generated
 */
public interface exportsItem extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ident)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportsItem_Id()
	 * @model containment="true"
	 * @generated
	 */
  ident getId();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.exportsItem#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
  void setId(ident value);

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
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportsItem_ConstExp()
	 * @model containment="true"
	 * @generated
	 */
  EList<constExpr> getConstExp();

} // exportsItem
