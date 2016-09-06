/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelType <em>Label Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getLabelDefinition()
 * @model
 * @generated
 */
public interface LabelDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Label Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Name</em>' containment reference.
	 * @see #setLabelName(Name)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getLabelDefinition_LabelName()
	 * @model containment="true"
	 * @generated
	 */
	Name getLabelName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelName <em>Label Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Name</em>' containment reference.
	 * @see #getLabelName()
	 * @generated
	 */
	void setLabelName(Name value);

	/**
	 * Returns the value of the '<em><b>Label Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Type</em>' containment reference.
	 * @see #setLabelType(LabelType)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getLabelDefinition_LabelType()
	 * @model containment="true"
	 * @generated
	 */
	LabelType getLabelType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelType <em>Label Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' containment reference.
	 * @see #getLabelType()
	 * @generated
	 */
	void setLabelType(LabelType value);

} // LabelDefinition
