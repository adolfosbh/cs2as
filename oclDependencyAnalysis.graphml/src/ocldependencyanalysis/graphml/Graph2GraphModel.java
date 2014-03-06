package ocldependencyanalysis.graphml;

import java.util.HashMap;
import java.util.Map;

import ocldependencyanalysis.IEdge;
import ocldependencyanalysis.IGraph;
import ocldependencyanalysis.INode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.qvtd.build.etl.graph.Edge;
import org.eclipse.qvtd.build.etl.graph.Element;
import org.eclipse.qvtd.build.etl.graph.Graph;
import org.eclipse.qvtd.build.etl.graph.GraphFactory;
import org.eclipse.qvtd.build.etl.graph.Node;

public class Graph2GraphModel {

	private static Map<INode<?>, Node> iNode2modelNode = new HashMap<INode<?>, Node>(); 

	public static Graph createGraphModel(IGraph<?> graph) {
		
		Graph graphModel = GraphFactory.eINSTANCE.createGraph();
		EList<Element> elements = graphModel.getElement();
		
		for (INode<?> node : graph.getNodes()) {
			Node modelNode = GraphFactory.eINSTANCE.createNode();
			modelNode.setLabel(node.toString());
			iNode2modelNode.put(node, modelNode);
			elements.add(modelNode);
		}
		
		for (IEdge<?> edge : graph.getEdges()) {
			Edge modelEdge = GraphFactory.eINSTANCE.createEdge();
			modelEdge.setSource(iNode2modelNode.get(edge.getFrom()));
			modelEdge.setTarget(iNode2modelNode.get(edge.getTo()));
			elements.add(modelEdge);
		}
		iNode2modelNode.clear();
		return graphModel;
	}
	
	public static IGraph<?> createIGraph(Graph graphModel) {
		
		//TODO 
		return null;
	}

	
}
