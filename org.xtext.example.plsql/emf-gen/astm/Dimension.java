/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.Dimension#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link astm.Dimension#getHighBound <em>High Bound</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Low Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Bound</em>' containment reference.
	 * @see #setLowBound(Expression)
	 * @see astm.AstmPackage#getDimension_LowBound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLowBound();

	/**
	 * Sets the value of the '{@link astm.Dimension#getLowBound <em>Low Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Bound</em>' containment reference.
	 * @see #getLowBound()
	 * @generated
	 */
	void setLowBound(Expression value);

	/**
	 * Returns the value of the '<em><b>High Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Bound</em>' containment reference.
	 * @see #setHighBound(Expression)
	 * @see astm.AstmPackage#getDimension_HighBound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getHighBound();

	/**
	 * Sets the value of the '{@link astm.Dimension#getHighBound <em>High Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Bound</em>' containment reference.
	 * @see #getHighBound()
	 * @generated
	 */
	void setHighBound(Expression value);

} // Dimension
