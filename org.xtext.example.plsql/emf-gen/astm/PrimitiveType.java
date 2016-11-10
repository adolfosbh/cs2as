/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.PrimitiveType#isIsSigned <em>Is Signed</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getPrimitiveType()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveType extends DataType {
	/**
	 * Returns the value of the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Signed</em>' attribute.
	 * @see #setIsSigned(boolean)
	 * @see astm.AstmPackage#getPrimitiveType_IsSigned()
	 * @model
	 * @generated
	 */
	boolean isIsSigned();

	/**
	 * Sets the value of the '{@link astm.PrimitiveType#isIsSigned <em>Is Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Signed</em>' attribute.
	 * @see #isIsSigned()
	 * @generated
	 */
	void setIsSigned(boolean value);

} // PrimitiveType
