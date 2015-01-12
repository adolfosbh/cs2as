/**
 */
package ocldependencyanalysis.cs2asanalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.EnvironmentInfo#getLookupClass <em>Lookup Class</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getEnvironmentInfo()
 * @model
 * @generated
 */
public interface EnvironmentInfo extends ExtendedOperationRef, InfoNode {

	/**
	 * Returns the value of the '<em><b>Lookup Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookup Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup Class</em>' reference.
	 * @see #setLookupClass(org.eclipse.ocl.pivot.Class)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getEnvironmentInfo_LookupClass()
	 * @model
	 * @generated
	 */
	org.eclipse.ocl.pivot.Class getLookupClass();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.EnvironmentInfo#getLookupClass <em>Lookup Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Class</em>' reference.
	 * @see #getLookupClass()
	 * @generated
	 */
	void setLookupClass(org.eclipse.ocl.pivot.Class value);
} // EnvironmentInfo
