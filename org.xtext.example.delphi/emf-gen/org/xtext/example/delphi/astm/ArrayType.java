/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.ArrayType#getRanks <em>Ranks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends ConstructedType {
	/**
	 * Returns the value of the '<em><b>Ranks</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranks</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getArrayType_Ranks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getRanks();

} // ArrayType
