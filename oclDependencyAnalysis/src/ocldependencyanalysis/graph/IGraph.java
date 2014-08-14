package ocldependencyanalysis.graph;

import java.util.Set;


/**
 * @author asbh500
 *
 * @param <C> see {@link INode}
 */
public interface IGraph<C> {

	public Set<INode<C>> getNodes();
	
	public Set<IEdge<C>> getEdges();
	
	public Set<IEdge<C>> getOutputEdges(INode<C> node);
	
	public Set<IEdge<C>> getInputEdges(INode<C> node);
	
	public INode<C> addNode(C c);
	
	public INode<C> addNode(C c, boolean replace);
	
	/**
	 * Implementation must ensure that a graph will have no edge referring to nodes
	 * which are not part of this graph
	 * 
	 * @param c
	 * @return <code>true</code> if the node (or equivalent) was removed, otherwise <code>false</code>
	 */
	public boolean removeNode(INode<C> node);
	
	/**
	 * @param edge
	 * @return <code>true</code> if the edge (or equivalent) was removed, otherwise <code>false</code>
	 */
	public boolean removeEdge(IEdge<C> edge);
	
	/**
	 * Implementations must ensure that a graph will
	 * have no edge referring to nodes which are not part
	 * of this graph 
	 * 
	 * The same as {@link #addEdge(Object, Object, boolean) addEdge(Object, Object, false) } 
	 *  
	 * @param from
	 * @param to
	 */
	public void addEdge(C from, C to);
	
	/**
	 * Implementations must ensure that a graph will
	 * have no edge referring to nodes which are not part
	 * of this graph 
	 * @param from
	 * @param to
	 * @param replace true if the new edge (referring the given wrapped node objects) can replace the previous
	 * one (referring the same wrapped node objects)
	 */
	public void addEdge(C from, C to, boolean replace);

	/**
	 * @return A set with the subgraphs comprising a cycle
	 */
	public Set<IGraph<C>> getCycles();
}
