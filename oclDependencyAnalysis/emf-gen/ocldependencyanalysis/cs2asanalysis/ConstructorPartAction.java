/**
 */
package ocldependencyanalysis.cs2asanalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Part Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#getNeedsLookup <em>Needs Lookup</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorPartAction()
 * @model
 * @generated
 */
public interface ConstructorPartAction extends ConstructorPartPropRef, ActionNode {

	/**
	 * Returns the value of the '<em><b>Needs Lookup</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Lookup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Lookup</em>' attribute.
	 * @see #setNeedsLookup(Boolean)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getConstructorPartAction_NeedsLookup()
	 * @model default="false"
	 * @generated
	 */
	Boolean getNeedsLookup();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#getNeedsLookup <em>Needs Lookup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Lookup</em>' attribute.
	 * @see #getNeedsLookup()
	 * @generated
	 */
	void setNeedsLookup(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.toString();'"
	 * @generated
	 */
	String toString();
} // ConstructorPartAction
