/**
 */
package ocldependencyanalysis.graph2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocldependencyanalysis.graph2.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ocldependencyanalysis.graph2.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocldependencyanalysis.graph2.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ocldependencyanalysis.graph2.Node}.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see ocldependencyanalysis.graph2.GraphPackage#getGraph_Nodes()
	 * @see ocldependencyanalysis.graph2.Node#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link ocldependencyanalysis.graph2.Edge}.
	 * It is bidirectional and its opposite is '{@link ocldependencyanalysis.graph2.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see ocldependencyanalysis.graph2.GraphPackage#getGraph_Edges()
	 * @see ocldependencyanalysis.graph2.Edge#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // Graph
