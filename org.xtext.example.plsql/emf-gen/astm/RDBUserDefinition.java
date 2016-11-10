/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDB User Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.RDBUserDefinition#getOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getRDBUserDefinition()
 * @model
 * @generated
 */
public interface RDBUserDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link astm.NameSpaceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see astm.AstmPackage#getRDBUserDefinition_Owns()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameSpaceDefinition> getOwns();

} // RDBUserDefinition
