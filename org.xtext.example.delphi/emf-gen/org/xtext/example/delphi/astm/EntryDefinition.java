/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.EntryDefinition#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.EntryDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getEntryDefinition()
 * @model
 * @generated
 */
public interface EntryDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.FormalParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getEntryDefinition_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterDefinition> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getEntryDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // EntryDefinition
