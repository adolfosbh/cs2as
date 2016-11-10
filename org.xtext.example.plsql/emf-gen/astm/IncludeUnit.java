/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.IncludeUnit#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getIncludeUnit()
 * @model
 * @generated
 */
public interface IncludeUnit extends PreprocessorElement {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(SourceFile)
	 * @see astm.AstmPackage#getIncludeUnit_File()
	 * @model containment="true"
	 * @generated
	 */
	SourceFile getFile();

	/**
	 * Sets the value of the '{@link astm.IncludeUnit#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(SourceFile value);

} // IncludeUnit
