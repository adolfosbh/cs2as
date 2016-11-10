/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBIndex#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link astm.RDBIndex#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link astm.RDBIndex#getIndexColumn <em>Index Column</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBIndex()
 * @model
 * @generated
 */
public interface RDBIndex extends OtherSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see astm.AstmPackage#getRDBIndex_NotNull()
	 * @model
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link astm.RDBIndex#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see astm.AstmPackage#getRDBIndex_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link astm.RDBIndex#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Index Column</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Name}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Column</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBIndex_IndexColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Name> getIndexColumn();

} // RDBIndex
