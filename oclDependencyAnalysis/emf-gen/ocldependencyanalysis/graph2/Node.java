/**
 */
package ocldependencyanalysis.graph2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.graph2.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ocldependencyanalysis.graph2.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ocldependencyanalysis.graph2.Node#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.graph2.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ocldependencyanalysis.graph2.Edge}.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Edge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ocldependencyanalysis.graph2.GraphPackage#getNode_Incoming()
	 * @see ocldependencyanalysis.graph2.Edge#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Edge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ocldependencyanalysis.graph2.Edge}.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Edge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ocldependencyanalysis.graph2.GraphPackage#getNode_Outgoing()
	 * @see ocldependencyanalysis.graph2.Edge#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Edge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see ocldependencyanalysis.graph2.GraphPackage#getNode_Graph()
	 * @see ocldependencyanalysis.graph2.Graph#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.graph2.Node#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

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
	 * @model objectDataType="org.eclipse.ocl.pivot.Object"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return toString().equals(object.toString());'"
	 * @generated
	 */
	boolean equals(Object object);

} // Node
