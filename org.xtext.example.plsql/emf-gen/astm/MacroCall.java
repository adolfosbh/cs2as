/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.MacroCall#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getMacroCall()
 * @model
 * @generated
 */
public interface MacroCall extends PreprocessorElement {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' containment reference.
	 * @see #setRefersTo(MacroDefinition)
	 * @see astm.AstmPackage#getMacroCall_RefersTo()
	 * @model containment="true"
	 * @generated
	 */
	MacroDefinition getRefersTo();

	/**
	 * Sets the value of the '{@link astm.MacroCall#getRefersTo <em>Refers To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' containment reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(MacroDefinition value);

} // MacroCall
