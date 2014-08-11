package ocldependencyanalysis.graph;

/**
 * A graph edge between two graph nodes 
 * 
 * @author asbh500 
 * @param <C> see {@link INode} 
 */
public interface IEdge<C> {

	INode<C> getFrom();
	INode<C> getTo();
}
