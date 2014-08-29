/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.ocl.examples.pivot.ConstructorPart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Part Prop Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef#getConstructorPart <em>Constructor Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorPartPropRef()
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
	 * @see #setConstructorPart(ConstructorPart)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorPartPropRef_ConstructorPart()
	 * @model
	 * @generated
	 */
	ConstructorPart getConstructorPart();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef#getConstructorPart <em>Constructor Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Part</em>' reference.
	 * @see #getConstructorPart()
	 * @generated
	 */
	void setConstructorPart(ConstructorPart value);
} // ConstructorPartPropRef
