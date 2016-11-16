/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.Scope#getDefinitionObject <em>Definition Object</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.Scope#getChildScope <em>Child Scope</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends GASTMSemanticObject {
	/**
	 * Returns the value of the '<em><b>Definition Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Object</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getScope_DefinitionObject()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!Scope!definitionObject'"
	 * @generated
	 */
	EList<DefinitionObject> getDefinitionObject();

	/**
	 * Returns the value of the '<em><b>Child Scope</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Scope</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Scope</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getScope_ChildScope()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!Scope!childScope'"
	 * @generated
	 */
	EList<Scope> getChildScope();

} // Scope
