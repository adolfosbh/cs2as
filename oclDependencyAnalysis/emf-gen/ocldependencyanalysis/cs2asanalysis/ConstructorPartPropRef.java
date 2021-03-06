/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.pivot.ShadowPart;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Part Prop Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ShadowPartPropRef#getShadowPart <em>Constructor Part</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getShadowPartPropRef()
 * @model abstract="true"
 * @generated
 */
public interface ConstructorPartPropRef extends PropertyRef {

	/**
	 * Returns the value of the '<em><b>Constructor Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Part</em>' reference.
	 * @see #setShadowPart(ShadowPart)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getShadowPartPropRef_ShadowPart()
	 * @model
	 * @generated
	 */
	ShadowPart getShadowPart();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ShadowPartPropRef#getShadowPart <em>Constructor Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Part</em>' reference.
	 * @see #getShadowPart()
	 * @generated
	 */
	void setShadowPart(ShadowPart value);
} // ShadowPartPropRef
