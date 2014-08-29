/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Exp Type Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ConstructorExpTypeInfo#getConstructorExp <em>Constructor Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorExpTypeInfo()
 * @model
 * @generated
 */
public interface ConstructorExpTypeInfo extends TypeInfo {
	/**
	 * Returns the value of the '<em><b>Constructor Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Exp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Exp</em>' reference.
	 * @see #setConstructorExp(ConstructorExp)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorExpTypeInfo_ConstructorExp()
	 * @model required="true"
	 * @generated
	 */
	ConstructorExp getConstructorExp();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ConstructorExpTypeInfo#getConstructorExp <em>Constructor Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Exp</em>' reference.
	 * @see #getConstructorExp()
	 * @generated
	 */
	void setConstructorExp(ConstructorExp value);

} // ConstructorExpTypeInfo
