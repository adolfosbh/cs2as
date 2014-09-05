package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Node;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeEndStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

/**
 * TODO implement a model-loading IElementTypeProvider
 * @author asbh500
 *
 */
public class TypeDependenciesTypeProvider implements IElementTypeProvider<Type>{

	Set<INode<Type>> cycleNodes = new HashSet<INode<Type>>();
	Set<IEdge<Type>> cycleEdges = new HashSet<IEdge<Type>>();
	private List<ElementType> elementTypes;	
	private GraphMLNodeType cycleNodeType;
	private GraphMLEdgeType cycleEdgeType;
	
	public TypeDependenciesTypeProvider(IGraph<Type> graph) {
		preComputeCycleNodesAndEdges(graph);
		elementTypes = new ArrayList<ElementType>();
		cycleNodeType = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		cycleNodeType.setName("CycleNode");
		cycleNodeType.setColor("#FF0000");
		cycleNodeType.setShape(ShapeType.RECTANGLE3D);
		
		cycleEdgeType = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		cycleEdgeType.setName("CycleEdge");
		cycleEdgeType.setColor("#FF0000");
		cycleEdgeType.setFromStyle(EdgeEndStyle.NONE);
		cycleEdgeType.setToStyle(EdgeEndStyle.STANDARD);
		
		elementTypes.add(cycleNodeType);
		elementTypes.add(cycleEdgeType);
	}
	
		
	
	private void preComputeCycleNodesAndEdges(IGraph<Type> graph) {
		for (IGraph<Type> cycle : graph.getCycles()) {
			cycleNodes.addAll(cycle.getNodes());
			cycleEdges.addAll(cycle.getEdges());
		}
	}
	
	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<Type> node) {
		return cycleNodes.contains(node) ? cycleNodeType : null;
	}

	@Override
	public EdgeType getEdgeType(IEdge<Type> edge) {
		return cycleEdges.contains(edge) ? cycleEdgeType : null;
	}

	@Override
	public EdgeType getEdgeType(Edge edge) {
		return null;
	}
	
	@Override
	public NodeType getNodeType(Node node) {
		return null;
	}
}
