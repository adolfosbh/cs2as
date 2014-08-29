/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.PropertyCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Exp Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo#getPropertyCallExp <em>Property Call Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getPropertyCallExpInfo()
 * @model
 * @generated
 */
public interface PropertyCallExpInfo extends PropertyRef, InfoNode {
	/**
	 * Returns the value of the '<em><b>Property Call Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Call Exp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Call Exp</em>' reference.
	 * @see #setPropertyCallExp(PropertyCallExp)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getPropertyCallExpInfo_PropertyCallExp()
	 * @model required="true"
	 * @generated
	 */
	PropertyCallExp getPropertyCallExp();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo#getPropertyCallExp <em>Property Call Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Call Exp</em>' reference.
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	void setPropertyCallExp(PropertyCallExp value);

} // PropertyCallExpInfo
