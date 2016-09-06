/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiBlockStatement#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiBlockStatement#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiBlockStatement()
 * @model
 * @generated
 */
public interface DelphiBlockStatement extends BlockStatement {
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
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiBlockStatement_Exports()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTypeReference> getExports();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiBlockStatement_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getDeclarations();

} // DelphiBlockStatement
