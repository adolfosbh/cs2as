/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exported Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.exportedHeading#getPHeading <em>PHeading</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.exportedHeading#getDirective <em>Directive</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.exportedHeading#getFHeading <em>FHeading</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportedHeading()
 * @model
 * @generated
 */
public interface exportedHeading extends interfaceDecl
{
  /**
	 * Returns the value of the '<em><b>PHeading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PHeading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>PHeading</em>' containment reference.
	 * @see #setPHeading(procedureHeading)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportedHeading_PHeading()
	 * @model containment="true"
	 * @generated
	 */
  procedureHeading getPHeading();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.exportedHeading#getPHeading <em>PHeading</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PHeading</em>' containment reference.
	 * @see #getPHeading()
	 * @generated
	 */
  void setPHeading(procedureHeading value);

  /**
	 * Returns the value of the '<em><b>Directive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive</em>' containment reference.
	 * @see #setDirective(directive)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportedHeading_Directive()
	 * @model containment="true"
	 * @generated
	 */
  directive getDirective();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.exportedHeading#getDirective <em>Directive</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directive</em>' containment reference.
	 * @see #getDirective()
	 * @generated
	 */
  void setDirective(directive value);

  /**
	 * Returns the value of the '<em><b>FHeading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FHeading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>FHeading</em>' containment reference.
	 * @see #setFHeading(functionHeading)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getexportedHeading_FHeading()
	 * @model containment="true"
	 * @generated
	 */
  functionHeading getFHeading();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.exportedHeading#getFHeading <em>FHeading</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FHeading</em>' containment reference.
	 * @see #getFHeading()
	 * @generated
	 */
  void setFHeading(functionHeading value);

} // exportedHeading
