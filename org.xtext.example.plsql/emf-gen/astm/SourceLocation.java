/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.SourceLocation#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link astm.SourceLocation#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link astm.SourceLocation#getEndLine <em>End Line</em>}</li>
 *   <li>{@link astm.SourceLocation#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link astm.SourceLocation#getInSourceFile <em>In Source File</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getSourceLocation()
 * @model
 * @generated
 */
public interface SourceLocation extends GASTMSourceObject {
	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(int)
	 * @see astm.AstmPackage#getSourceLocation_StartLine()
	 * @model
	 * @generated
	 */
	int getStartLine();

	/**
	 * Sets the value of the '{@link astm.SourceLocation#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(int)
	 * @see astm.AstmPackage#getSourceLocation_StartColumn()
	 * @model
	 * @generated
	 */
	int getStartColumn();

	/**
	 * Sets the value of the '{@link astm.SourceLocation#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(int value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(int)
	 * @see astm.AstmPackage#getSourceLocation_EndLine()
	 * @model
	 * @generated
	 */
	int getEndLine();

	/**
	 * Sets the value of the '{@link astm.SourceLocation#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(int value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(int)
	 * @see astm.AstmPackage#getSourceLocation_EndColumn()
	 * @model
	 * @generated
	 */
	int getEndColumn();

	/**
	 * Sets the value of the '{@link astm.SourceLocation#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(int value);

	/**
	 * Returns the value of the '<em><b>In Source File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Source File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Source File</em>' containment reference.
	 * @see #setInSourceFile(SourceFile)
	 * @see astm.AstmPackage#getSourceLocation_InSourceFile()
	 * @model containment="true"
	 * @generated
	 */
	SourceFile getInSourceFile();

	/**
	 * Sets the value of the '{@link astm.SourceLocation#getInSourceFile <em>In Source File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Source File</em>' containment reference.
	 * @see #getInSourceFile()
	 * @generated
	 */
	void setInSourceFile(SourceFile value);

} // SourceLocation
