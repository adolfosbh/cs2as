/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.EnumType#getEnumLiterals <em>Enum Literals</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enum Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.EnumLiteralDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literals</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getEnumType_EnumLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteralDefinition> getEnumLiterals();

} // EnumType