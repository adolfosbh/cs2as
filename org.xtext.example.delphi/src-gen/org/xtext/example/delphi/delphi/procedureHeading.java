/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.procedureHeading#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getprocedureHeading()
 * @model
 * @generated
 */
public interface procedureHeading extends methodHeading
{
  /**
   * Returns the value of the '<em><b>Formal Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Params</em>' containment reference.
   * @see #setFormalParams(formalParameters)
   * @see org.xtext.example.delphi.delphi.DelphiPackage#getprocedureHeading_FormalParams()
   * @model containment="true"
   * @generated
   */
  formalParameters getFormalParams();

  /**
   * Sets the value of the '{@link org.xtext.example.delphi.delphi.procedureHeading#getFormalParams <em>Formal Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Params</em>' containment reference.
   * @see #getFormalParams()
   * @generated
   */
  void setFormalParams(formalParameters value);

} // procedureHeading
