/**
 */
package ocldependencyanalysis.cs2asanalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Operation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef#getOperationClass <em>Operation Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedOperationRef()
 * @model abstract="true"
 * @generated
 */
public interface ExtendedOperationRef extends OperationRef {
	/**
	 * Returns the value of the '<em><b>Operation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Class</em>' reference.
	 * @see #setOperationClass(org.eclipse.ocl.examples.pivot.Class)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedOperationRef_OperationClass()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.ocl.examples.pivot.Class getOperationClass();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef#getOperationClass <em>Operation Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Class</em>' reference.
	 * @see #getOperationClass()
	 * @generated
	 */
	void setOperationClass(org.eclipse.ocl.examples.pivot.Class value);

} // ExtendedOperationRef
