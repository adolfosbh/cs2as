/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.pivot.Operation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.OperationRef#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getOperationRef()
 * @model abstract="true"
 * @generated
 */
public interface OperationRef extends CS2ASAnalysisNode {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getOperationRef_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.OperationRef#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // OperationRef
