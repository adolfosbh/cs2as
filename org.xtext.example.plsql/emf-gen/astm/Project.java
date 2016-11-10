/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.Project#getFiles <em>Files</em>}</li>
 *   <li>{@link astm.Project#getOuterScope <em>Outer Scope</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends GASTMSemanticObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link astm.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see astm.AstmPackage#getProject_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getFiles();

	/**
	 * Returns the value of the '<em><b>Outer Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Scope</em>' containment reference.
	 * @see #setOuterScope(GlobalScope)
	 * @see astm.AstmPackage#getProject_OuterScope()
	 * @model containment="true"
	 * @generated
	 */
	GlobalScope getOuterScope();

	/**
	 * Sets the value of the '{@link astm.Project#getOuterScope <em>Outer Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Scope</em>' containment reference.
	 * @see #getOuterScope()
	 * @generated
	 */
	void setOuterScope(GlobalScope value);

} // Project
