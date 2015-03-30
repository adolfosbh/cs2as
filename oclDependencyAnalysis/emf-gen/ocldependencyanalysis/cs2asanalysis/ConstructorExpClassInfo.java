/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.pivot.ShadowExp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Exp Class Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ShadowExpClassInfo#getShadowExp <em>Constructor Exp</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getShadowExpClassInfo()
 * @model
 * @generated
 */
public interface ConstructorExpClassInfo extends ClassInfo {
	/**
	 * Returns the value of the '<em><b>Constructor Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Exp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Exp</em>' reference.
	 * @see #setShadowExp(ShadowExp)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getShadowExpClassInfo_ShadowExp()
	 * @model required="true"
	 * @generated
	 */
	ShadowExp getShadowExp();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ShadowExpClassInfo#getShadowExp <em>Constructor Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Exp</em>' reference.
	 * @see #getShadowExp()
	 * @generated
	 */
	void setShadowExp(ShadowExp value);

} // ShadowExpClassInfo
