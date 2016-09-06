/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi Implementation Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiImplementationSection#getUses <em>Uses</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiImplementationSection#getExports <em>Exports</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiImplementationSection()
 * @model
 * @generated
 */
public interface DelphiImplementationSection extends CompilationUnit {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.NamedTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiImplementationSection_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTypeReference> getUses();

	/**
	 * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.NamedTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiImplementationSection_Exports()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTypeReference> getExports();

} // DelphiImplementationSection
