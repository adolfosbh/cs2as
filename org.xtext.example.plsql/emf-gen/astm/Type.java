/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.Type#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link astm.Type#isIsVolatile <em>Is Volatile</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends GASTMSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see astm.AstmPackage#getType_IsConst()
	 * @model
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link astm.Type#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Volatile</em>' attribute.
	 * @see #setIsVolatile(boolean)
	 * @see astm.AstmPackage#getType_IsVolatile()
	 * @model
	 * @generated
	 */
	boolean isIsVolatile();

	/**
	 * Sets the value of the '{@link astm.Type#isIsVolatile <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Volatile</em>' attribute.
	 * @see #isIsVolatile()
	 * @generated
	 */
	void setIsVolatile(boolean value);

} // Type
