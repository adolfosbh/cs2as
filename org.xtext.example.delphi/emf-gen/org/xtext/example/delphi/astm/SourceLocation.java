/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.SourceLocation#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.SourceLocation#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.SourceLocation#getEndLine <em>End Line</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.SourceLocation#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.SourceLocation#getInSourceFile <em>In Source File</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation()
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation_StartLine()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceLocation!startLine'"
	 * @generated
	 */
	int getStartLine();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceLocation#getStartLine <em>Start Line</em>}' attribute.
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation_StartColumn()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceLocation!startColumn'"
	 * @generated
	 */
	int getStartColumn();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceLocation#getStartColumn <em>Start Column</em>}' attribute.
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation_EndLine()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceLocation!endLine'"
	 * @generated
	 */
	int getEndLine();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceLocation#getEndLine <em>End Line</em>}' attribute.
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation_EndColumn()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceLocation!endColumn'"
	 * @generated
	 */
	int getEndColumn();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceLocation#getEndColumn <em>End Column</em>}' attribute.
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceLocation_InSourceFile()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceLocation!inSourceFile'"
	 * @generated
	 */
	SourceFile getInSourceFile();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceLocation#getInSourceFile <em>In Source File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Source File</em>' containment reference.
	 * @see #getInSourceFile()
	 * @generated
	 */
	void setInSourceFile(SourceFile value);

} // SourceLocation
