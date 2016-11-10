/**
 */
package astm;

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
 *   <li>{@link astm.SourceFile#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getSourceFile()
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
	 * @see astm.AstmPackage#getSourceFile_PathName()
	 * @model
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link astm.SourceFile#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // SourceFile
