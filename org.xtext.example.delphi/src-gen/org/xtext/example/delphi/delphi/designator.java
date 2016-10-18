/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>designator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.designator#getSubpart <em>Subpart</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.designator#getDesignator <em>Designator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getdesignator()
 * @model
 * @generated
 */
public interface designator extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Subpart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subpart</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpart</em>' containment reference.
	 * @see #setSubpart(designatorSubPart)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getdesignator_Subpart()
	 * @model containment="true"
	 * @generated
	 */
  designatorSubPart getSubpart();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.designator#getSubpart <em>Subpart</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subpart</em>' containment reference.
	 * @see #getSubpart()
	 * @generated
	 */
  void setSubpart(designatorSubPart value);

  /**
	 * Returns the value of the '<em><b>Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Designator</em>' containment reference.
	 * @see #setDesignator(designator)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getdesignator_Designator()
	 * @model containment="true"
	 * @generated
	 */
  designator getDesignator();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.designator#getDesignator <em>Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designator</em>' containment reference.
	 * @see #getDesignator()
	 * @generated
	 */
  void setDesignator(designator value);

} // designator
