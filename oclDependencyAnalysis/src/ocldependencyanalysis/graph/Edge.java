package ocldependencyanalysis.graph;


/**
 * Basic implementation of {@link IEdge} establishing a String identity 
 * for the edge
 * 
 * @author asbh500
 *
 * @param <C> see {@link INode}
 */
public class Edge<C> implements IEdge<C> {

	private static final String DEPENDENCY_SYMBOL = " => ";
	private INode<C> from;
	private INode<C> to;
	
	public Edge(INode<C> from, INode<C> to) {
		this.from = from;
		this.to = to;
	}
			
	@Override
	public INode<C> getFrom() {
		return from;
	}
	
	@Override
	public INode<C> getTo() {
		return to;
	}

	@Override
	public String toString() {			
		return from.toString() + DEPENDENCY_SYMBOL + to.toString();
	}
	
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return toString().equals(obj.toString());
	}
}
