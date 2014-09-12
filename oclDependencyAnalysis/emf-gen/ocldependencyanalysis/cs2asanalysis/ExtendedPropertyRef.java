/**
 */
package ocldependencyanalysis.cs2asanalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Property Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef#getPropertyClass <em>Property Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedPropertyRef()
 * @model abstract="true"
 * @generated
 */
public interface ExtendedPropertyRef extends PropertyRef {
	/**
	 * Returns the value of the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Class</em>' reference.
	 * @see #setPropertyClass(org.eclipse.ocl.examples.pivot.Class)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedPropertyRef_PropertyClass()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.ocl.examples.pivot.Class getPropertyClass();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef#getPropertyClass <em>Property Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Class</em>' reference.
	 * @see #getPropertyClass()
	 * @generated
	 */
	void setPropertyClass(org.eclipse.ocl.examples.pivot.Class value);

} // ExtendedPropertyRef
