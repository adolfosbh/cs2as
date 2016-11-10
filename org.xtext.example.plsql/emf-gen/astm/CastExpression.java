/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.CastExpression#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link astm.CastExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Cast Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast Type</em>' reference.
	 * @see #setCastType(TypeReference)
	 * @see astm.AstmPackage#getCastExpression_CastType()
	 * @model
	 * @generated
	 */
	TypeReference getCastType();

	/**
	 * Sets the value of the '{@link astm.CastExpression#getCastType <em>Cast Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast Type</em>' reference.
	 * @see #getCastType()
	 * @generated
	 */
	void setCastType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see astm.AstmPackage#getCastExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link astm.CastExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // CastExpression
