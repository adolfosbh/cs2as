package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ocldependencyanalysis.IEdge;
import ocldependencyanalysis.IGraph;
import ocldependencyanalysis.INode;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.ocl.examples.pivot.Class;
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
public class ClassDependenciesTypeProvider implements IElementTypeProvider<Class>{

	Set<INode<Class>> cycleNodes = new HashSet<INode<Class>>();
	Set<IEdge<Class>> cycleEdges = new HashSet<IEdge<Class>>();
	private List<ElementType> elementTypes;	
	private GraphMLNodeType cycleNodeType;
	private GraphMLEdgeType cycleEdgeType;
	
	public ClassDependenciesTypeProvider(IGraph<Class> graph) {
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
	
		
	
	private void preComputeCycleNodesAndEdges(IGraph<Class> graph) {
		for (IGraph<Class> cycle : graph.getCycles()) {
			cycleNodes.addAll(cycle.getNodes());
			cycleEdges.addAll(cycle.getEdges());
		}
	}
	
	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<Class> node) {
		return cycleNodes.contains(node) ? cycleNodeType : null;
	}

	@Override
	public EdgeType getEdgeType(IEdge<Class> edge) {
		return cycleEdges.contains(edge) ? cycleEdgeType : null;
	}

}
