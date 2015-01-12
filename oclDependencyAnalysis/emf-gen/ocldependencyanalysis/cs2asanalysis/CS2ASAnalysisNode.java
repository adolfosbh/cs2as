/**
 */
package ocldependencyanalysis.cs2asanalysis;

import ocldependencyanalysis.graph2.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getContext <em>Context</em>}</li>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getAssociatedPackage <em>Associated Package</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getCS2ASAnalysisNode()
 * @model abstract="true"
 * @generated
 */
public interface CS2ASAnalysisNode extends Node {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(org.eclipse.ocl.pivot.Class)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getCS2ASAnalysisNode_Context()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.ocl.pivot.Class getContext();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(org.eclipse.ocl.pivot.Class value);

	/**
	 * Returns the value of the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Package</em>' reference.
	 * @see #setAssociatedPackage(org.eclipse.ocl.pivot.Package)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getCS2ASAnalysisNode_AssociatedPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.ocl.pivot.Package getAssociatedPackage();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getAssociatedPackage <em>Associated Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Package</em>' reference.
	 * @see #getAssociatedPackage()
	 * @generated
	 */
	void setAssociatedPackage(org.eclipse.ocl.pivot.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ToStringSwitch.INSTANCE.doSwitch(this);'"
	 * @generated
	 */
	String toString();

} // CS2ASAnalysisNode
