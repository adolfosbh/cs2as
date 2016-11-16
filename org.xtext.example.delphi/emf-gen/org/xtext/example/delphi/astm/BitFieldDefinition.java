/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getBitFieldDefinition()
 * @model
 * @generated
 */
public interface BitFieldDefinition extends DataDefinition {
	/**
	 * Returns the value of the '<em><b>Bit Field Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #setBitFieldSize(Expression)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getBitFieldDefinition_BitFieldSize()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!BitFieldDefinition!bitFieldSize'"
	 * @generated
	 */
	Expression getBitFieldSize();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #getBitFieldSize()
	 * @generated
	 */
	void setBitFieldSize(Expression value);

} // BitFieldDefinition
