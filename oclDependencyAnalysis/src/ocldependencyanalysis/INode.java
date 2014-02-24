package ocldependencyanalysis;

/**
 * A parametrised graph node wrapping a real object
 *  
 * @author asbh500
 *
 * @param <C> The real object wrapped by this {@link IGraph} node
 */
public interface INode<C> {

	C getObject();
}
