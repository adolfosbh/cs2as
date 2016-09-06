/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.CaseBlock#getCaseExpressions <em>Case Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getCaseBlock()
 * @model
 * @generated
 */
public interface CaseBlock extends SwitchCase {
	/**
	 * Returns the value of the '<em><b>Case Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Expressions</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getCaseBlock_CaseExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getCaseExpressions();

} // CaseBlock
