/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ToStringSwitch.INSTANCE.doSwitch(this);'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return toString().hashCode();'"
	 * @generated
	 */
	int hashCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="org.eclipse.ocl.examples.pivot.Object"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return toString().equals(object.toString());'"
	 * @generated
	 */
	boolean equals(Object object);
} // Node
