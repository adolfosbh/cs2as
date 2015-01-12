/**
 */
package ocldependencyanalysis.graph2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.graph2.Edge#getTo <em>To</em>}</li>
 *   <li>{@link ocldependencyanalysis.graph2.Edge#getFrom <em>From</em>}</li>
 *   <li>{@link ocldependencyanalysis.graph2.Edge#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.graph2.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see ocldependencyanalysis.graph2.GraphPackage#getEdge_To()
	 * @see ocldependencyanalysis.graph2.Node#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.graph2.Edge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Node value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see ocldependencyanalysis.graph2.GraphPackage#getEdge_From()
	 * @see ocldependencyanalysis.graph2.Node#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.graph2.Edge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Node value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see ocldependencyanalysis.graph2.GraphPackage#getEdge_Graph()
	 * @see ocldependencyanalysis.graph2.Graph#getEdges
	 * @model opposite="edges" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.graph2.Edge#getGraph <em>Graph</em>}' container reference.
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

} // Edge
