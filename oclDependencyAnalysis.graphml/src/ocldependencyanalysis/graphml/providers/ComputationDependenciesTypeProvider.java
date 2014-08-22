package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.List;

import ocldependencyanalysis.Computation;
import ocldependencyanalysis.ComputationType;
import ocldependencyanalysis.IActionNode;
import ocldependencyanalysis.IInfoNode;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeLineStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class ComputationDependenciesTypeProvider implements  IElementTypeProvider<Computation>{
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType infoNode;
	private GraphMLNodeType actionNode;
	
	private GraphMLEdgeType actionInput;
	private GraphMLEdgeType actionOutput;
	private GraphMLEdgeType infoInheritance;

	public ComputationDependenciesTypeProvider() {
		elementTypes = new ArrayList<ElementType>();
		infoNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		infoNode.setName("infoNode");
		infoNode.setColor("#FFFFFFF");
		infoNode.setShape(ShapeType.RECTANGLE);
		
	
		actionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		actionNode.setName("actionNode");
		actionNode.setColor("#FFFFFFF");
		actionNode.setShape(ShapeType.ELLIPSE);
		
		actionInput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionInput.setName("actionInput");
		actionInput.setColor("#00FF00");
		actionInput.setLineStyle(EdgeLineStyle.LINE);
		
		actionOutput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionOutput.setName("actionOutput");
		actionOutput.setColor("#000000");
		actionOutput.setLineStyle(EdgeLineStyle.LINE);
		
		infoInheritance = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		infoInheritance.setName("actionOutput");
		infoInheritance.setColor("#000000");
		infoInheritance.setLineStyle(EdgeLineStyle.DOTTED);
		
		elementTypes.add(infoNode);
		elementTypes.add(actionNode);
		elementTypes.add(actionInput);
		elementTypes.add(actionOutput);
		elementTypes.add(infoInheritance);
	}

	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<Computation> node) {
		Computation computation = node.getObject();
		
		if (computation instanceof IActionNode) {
			return actionNode;
		} else if (computation instanceof IInfoNode){
			return infoNode;
		} else {
			throw new IllegalStateException("Unexpected computation element");
		}
	}

	@Override
	public EdgeType getEdgeType(IEdge<Computation> edge) {
		
		// For the time being, an edge between ast operations are dotted
		Computation fromComp = edge.getFrom().getObject();
		Computation toComp = edge.getTo().getObject();
		if (fromComp instanceof IActionNode) {
			return actionOutput;
		} else if (toComp instanceof IActionNode) {
			return actionInput;
		} else if (fromComp instanceof ComputationType &&
					toComp instanceof ComputationType){
			return infoInheritance;
		}
		
		// else default edge style
		return null;
	}
}
