package ocldependencyanalysis;

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
	
	/**
	 * Implementations will ensure that a graph will
	 * have no edge referring to nodes which are not part
	 * of this graph 
	 *  
	 * @param from
	 * @param to
	 */
	public void addEdge(C from, C to);
}
