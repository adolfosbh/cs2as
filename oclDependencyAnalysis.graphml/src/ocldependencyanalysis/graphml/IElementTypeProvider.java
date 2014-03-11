package ocldependencyanalysis.graphml;

import java.util.List;

import ocldependencyanalysis.IEdge;
import ocldependencyanalysis.INode;

import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;

public interface IElementTypeProvider<C> {
	
	List<ElementType> getProvidedElementTypes();
	
	/**
	 * Provides the node type for the given node
	 * @param node
	 * @return 
	 */
	NodeType getNodeType(INode<C> node);
	
	/**
	 * Provides the edge type for the given edge
	 * @param edge
	 * @return
	 */
	EdgeType getEdgeType(IEdge<C> edge);
	
	
}
