/**
 */
package astm;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.MacroDefinition#getMacroName <em>Macro Name</em>}</li>
 *   <li>{@link astm.MacroDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getMacroDefinition()
 * @model
 * @generated
 */
public interface MacroDefinition extends PreprocessorElement {
	/**
	 * Returns the value of the '<em><b>Macro Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Name</em>' attribute.
	 * @see #setMacroName(String)
	 * @see astm.AstmPackage#getMacroDefinition_MacroName()
	 * @model
	 * @generated
	 */
	String getMacroName();

	/**
	 * Sets the value of the '{@link astm.MacroDefinition#getMacroName <em>Macro Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro Name</em>' attribute.
	 * @see #getMacroName()
	 * @generated
	 */
	void setMacroName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see astm.AstmPackage#getMacroDefinition_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link astm.MacroDefinition#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // MacroDefinition
