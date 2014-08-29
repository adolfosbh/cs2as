/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Property Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedPropertyInfo()
 * @model
 * @generated
 */
public interface ExtendedPropertyInfo extends PropertyRef, InfoNode {
	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' reference.
	 * @see #setPropertyType(Type)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getExtendedPropertyInfo_PropertyType()
	 * @model required="true"
	 * @generated
	 */
	Type getPropertyType();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo#getPropertyType <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' reference.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(Type value);

} // ExtendedPropertyInfo
