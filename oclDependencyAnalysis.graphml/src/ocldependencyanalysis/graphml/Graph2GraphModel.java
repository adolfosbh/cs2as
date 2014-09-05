package ocldependencyanalysis.graphml;

import java.util.HashMap;
import java.util.Map;

import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graphml.providers.DefaultElementTypeProvider;

import org.eclipse.emf.common.util.EList;
import org.eclipse.qvtd.build.etl.graph.Edge;
import org.eclipse.qvtd.build.etl.graph.Element;
import org.eclipse.qvtd.build.etl.graph.Graph;
import org.eclipse.qvtd.build.etl.graph.GraphFactory;
import org.eclipse.qvtd.build.etl.graph.Node;

public class Graph2GraphModel {
	
	private static Map<INode<?>, Node> iNode2modelNode = new HashMap<INode<?>, Node>();
	
	private static Map<ocldependencyanalysis.graph2.Node, Node> node2modelNode = new HashMap<ocldependencyanalysis.graph2.Node, Node>();

	/**
	 * Creates a Graph Model without any node/edge types creation, therefore
	 * without graphml-specific visualization information 
	 * 
	 * @deprecated to remove
	 * @param graph
	 * @return
	 */
	public static <T> Graph createGenericGraphModel(IGraph<T> graph) {
		return createSpecificGraphModel(graph, new DefaultElementTypeProvider<T>());
	}

	/**
	 * @deprecated to remove
	 * @param graph an {@link IGraph}
	 * @param typesProvider provides the types for the graph nodes/edges
	 * @return
	 */
	public static <T> Graph createSpecificGraphModel(IGraph<T> graph, IElementTypeProvider<T> typesProvider)  {
		
		Graph graphModel = GraphFactory.eINSTANCE.createGraph();
		graphModel.getElementType().addAll(typesProvider.getProvidedElementTypes());
		EList<Element> elements = graphModel.getElement();
		
		for (INode<T> node : graph.getNodes()) {
			Node modelNode = GraphFactory.eINSTANCE.createNode();
			modelNode.setLabel(node.toString());
			modelNode.setType(typesProvider.getNodeType(node));
			iNode2modelNode.put(node, modelNode);
			elements.add(modelNode);
		}
		
		for (IEdge<T> edge : graph.getEdges()) {
			Edge modelEdge = GraphFactory.eINSTANCE.createEdge();			
			modelEdge.setSource(iNode2modelNode.get(edge.getFrom()));
			modelEdge.setTarget(iNode2modelNode.get(edge.getTo()));
			modelEdge.setType(typesProvider.getEdgeType(edge));
			elements.add(modelEdge);
		}
		iNode2modelNode.clear();
		return graphModel;
	}
	
	public static <T> Graph createSpecificGraphModel(ocldependencyanalysis.graph2.Graph graph, IElementTypeProvider<T> typesProvider)  {
		
		Graph graphModel = GraphFactory.eINSTANCE.createGraph();
		graphModel.getElementType().addAll(typesProvider.getProvidedElementTypes());
		EList<Element> elements = graphModel.getElement();
		
		for (ocldependencyanalysis.graph2.Node node : graph.getNodes()) {
			Node modelNode = GraphFactory.eINSTANCE.createNode();
			modelNode.setLabel(node.toString());
			modelNode.setType(typesProvider.getNodeType(node));
			node2modelNode.put(node, modelNode);
			elements.add(modelNode);
		}
		
		for (ocldependencyanalysis.graph2.Edge edge : graph.getEdges()) {
			Edge modelEdge = GraphFactory.eINSTANCE.createEdge();			
			modelEdge.setSource(node2modelNode.get(edge.getFrom()));
			modelEdge.setTarget(node2modelNode.get(edge.getTo()));
			modelEdge.setType(typesProvider.getEdgeType(edge));
			elements.add(modelEdge);
		}
		node2modelNode.clear();
		return graphModel;
	}
	
	public static IGraph<?> createIGraph(Graph graphModel) {
		
		//TODO 
		return null;
	}

	
}
