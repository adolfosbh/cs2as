/**
 */
package org.xtext.example.delphi.astm;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.SourceFile#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends GASTMSourceObject {
	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getSourceFile_PathName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!SourceFile!pathName'"
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.SourceFile#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // SourceFile
