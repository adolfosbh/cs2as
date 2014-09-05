package ocldependencyanalysis.graphml;

import java.util.List;

import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Node;

import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;

public interface IElementTypeProvider<C> {
	
	List<ElementType> getProvidedElementTypes();
	
	/**
	 * Provides the node type for the given node
	 * 
	 * @deprecated to remove
	 * @param node
	 * @return 
	 */	
	NodeType getNodeType(INode<C> node);
	
	/**
	 * @deprecated to remove
	 * Provides the edge type for the given edge
	 * @param edge
	 * @return
	 */
	EdgeType getEdgeType(IEdge<C> edge);
	
	
	NodeType getNodeType(Node node);
	
	EdgeType getEdgeType(Edge edge);
}
