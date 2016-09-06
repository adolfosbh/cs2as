/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi With Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiWithStatement#getWiths <em>Withs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiWithStatement()
 * @model
 * @generated
 */
public interface DelphiWithStatement extends BlockStatement {
	/**
	 * Returns the value of the '<em><b>Withs</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withs</em>' reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiWithStatement_Withs()
	 * @model
	 * @generated
	 */
	EList<DefinitionObject> getWiths();

} // DelphiWithStatement
