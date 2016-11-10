/**
 */
package astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link astm.TypesCatchBlock#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see astm.AstmPackage#getTypesCatchBlock()
 * @model
 * @generated
 */
public interface TypesCatchBlock extends CatchBlock {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link astm.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see astm.AstmPackage#getTypesCatchBlock_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getExceptions();

} // TypesCatchBlock
