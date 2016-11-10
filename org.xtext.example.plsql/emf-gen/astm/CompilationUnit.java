/**
 */
package astm;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.CompilationUnit#getLanguage <em>Language</em>}</li>
 *   <li>{@link astm.CompilationUnit#getFragments <em>Fragments</em>}</li>
 *   <li>{@link astm.CompilationUnit#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see astm.AstmPackage#getCompilationUnit_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link astm.CompilationUnit#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see astm.AstmPackage#getCompilationUnit_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getFragments();

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' containment reference.
	 * @see #setOpensScope(ProgramScope)
	 * @see astm.AstmPackage#getCompilationUnit_OpensScope()
	 * @model containment="true"
	 * @generated
	 */
	ProgramScope getOpensScope();

	/**
	 * Sets the value of the '{@link astm.CompilationUnit#getOpensScope <em>Opens Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' containment reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(ProgramScope value);

} // CompilationUnit
