/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi Interface Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiInterfaceSection#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiInterfaceSection()
 * @model
 * @generated
 */
public interface DelphiInterfaceSection extends CompilationUnit {
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiInterfaceSection_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTypeReference> getUses();

} // DelphiInterfaceSection
