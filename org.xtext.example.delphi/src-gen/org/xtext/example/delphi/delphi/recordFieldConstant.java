/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record Field Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.recordFieldConstant#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.recordFieldConstant#getTypedConstant <em>Typed Constant</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecordFieldConstant()
 * @model
 * @generated
 */
public interface recordFieldConstant extends CSTrace
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
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecordFieldConstant_Id()
	 * @model containment="true"
	 * @generated
	 */
  ident getId();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.recordFieldConstant#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
  void setId(ident value);

  /**
	 * Returns the value of the '<em><b>Typed Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typed Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Constant</em>' containment reference.
	 * @see #setTypedConstant(typedConstant)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getrecordFieldConstant_TypedConstant()
	 * @model containment="true"
	 * @generated
	 */
  typedConstant getTypedConstant();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.recordFieldConstant#getTypedConstant <em>Typed Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Constant</em>' containment reference.
	 * @see #getTypedConstant()
	 * @generated
	 */
  void setTypedConstant(typedConstant value);

} // recordFieldConstant
