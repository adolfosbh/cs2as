package ocldependencyanalysis.graphml.providers;

import java.util.Collections;
import java.util.List;

import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Node;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;

public class DefaultElementTypeProvider<T> implements IElementTypeProvider<T> {

	@Override
	public NodeType getNodeType(INode<T> node) {
		return null;
	}

	@Override
	public NodeType getNodeType(Node node) {
		return null;
	}
	
	@Override
	public EdgeType getEdgeType(IEdge<T> edge) {
		return null;
	}

	@Override
	public EdgeType getEdgeType(Edge edge) {
		return null;
	}
	@Override
	public List<ElementType> getProvidedElementTypes() {
		return Collections.emptyList();
	}

}
