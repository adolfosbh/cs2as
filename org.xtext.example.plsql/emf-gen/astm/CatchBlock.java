/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.CatchBlock#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getCatchBlock()
 * @model
 * @generated
 */
public interface CatchBlock extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Statement)
	 * @see astm.AstmPackage#getCatchBlock_Body()
	 * @model containment="true"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link astm.CatchBlock#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

} // CatchBlock
