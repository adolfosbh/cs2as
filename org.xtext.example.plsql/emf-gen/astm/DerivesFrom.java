/**
 */
package astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derives From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.DerivesFrom#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link astm.DerivesFrom#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link astm.DerivesFrom#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getDerivesFrom()
 * @model
 * @generated
 */
public interface DerivesFrom extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(boolean)
	 * @see astm.AstmPackage#getDerivesFrom_IsVirtual()
	 * @model
	 * @generated
	 */
	boolean isIsVirtual();

	/**
	 * Sets the value of the '{@link astm.DerivesFrom#isIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #isIsVirtual()
	 * @generated
	 */
	void setIsVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Kind</em>' containment reference.
	 * @see #setAccessKind(OtherSyntaxObject)
	 * @see astm.AstmPackage#getDerivesFrom_AccessKind()
	 * @model containment="true"
	 * @generated
	 */
	OtherSyntaxObject getAccessKind();

	/**
	 * Sets the value of the '{@link astm.DerivesFrom#getAccessKind <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' containment reference.
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(OtherSyntaxObject value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' containment reference.
	 * @see #setClassName(NamedType)
	 * @see astm.AstmPackage#getDerivesFrom_ClassName()
	 * @model containment="true"
	 * @generated
	 */
	NamedType getClassName();

	/**
	 * Sets the value of the '{@link astm.DerivesFrom#getClassName <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' containment reference.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(NamedType value);

} // DerivesFrom
