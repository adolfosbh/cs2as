package ocldependencyanalysis;

/**
 * A basic {@link INode} implementation node establishing a String identity 
 * for the real object this graph node is wrapping
 * 
 * @author asbh500
 *
 * @param <C> see {@link INode}
 * @see Edge 
 */
public class Node<C> implements INode<C>{
		
	private C object; 
	
	public Node(C object) {
		this.object = object;
	}
		
	@Override
	public String toString() {			
		return object.toString();
	}
	
	@Override
	public int hashCode() {			
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {			
		return toString().equals(obj.toString());
	}
	
	@Override
	public C getObject() {
		return object;
	}
}
