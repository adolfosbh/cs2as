package ocldependencyanalysis.graph2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;

import org.eclipse.emf.common.util.EList;

public abstract class AbstractGraphManager {
	
	private Map<String, Node> createdNodes = new HashMap<String,Node>();
	private Set<Edge> createdEdges = new HashSet<Edge>();
	
	private Graph graph;
	
	public AbstractGraphManager(Graph graph) {
		this.graph = graph;
	}
	
	public void addEdge(CS2ASAnalysisNode from, CS2ASAnalysisNode to) {
		addEdge(from, to, false);
	}
	
	public void addEdge(CS2ASAnalysisNode from, CS2ASAnalysisNode to, boolean replace) { 
		
		Edge edge = createEdge();
		edge.setFrom(from);
		edge.setTo(to);
				
		if (!createdEdges.contains(edge)) {
			graph.getEdges().add(edge);
			createdEdges.add(edge);
			
			EList<Node> nodes = graph.getNodes();
			Node previousFrom =  createdNodes.get(from.toString());
			if (previousFrom == null) {
				nodes.add(from);				
				createdNodes.put(from.toString(), from);
			} else {
				if (replace) {					
					replaceNode(previousFrom, from);
					createdNodes.put(from.toString(), from);
				} else{
					edge.setFrom(previousFrom);
				}
			}
			
			Node previousTo =  createdNodes.get(to.toString());
			if (previousTo == null) {			
				nodes.add(to);
				createdNodes.put(to.toString(), to);
			} else {
				if (replace) {
					replaceNode(previousTo, to);
					createdNodes.put(to.toString(), to);
				} else {
					edge.setTo(previousTo);
				}
			}
		}		
	}
	
	private void replaceNode(Node oldNode, Node newNode) {
		for (Edge outEdge : new CopyOnWriteArrayList<Edge>(oldNode.getOutgoing())) {
			outEdge.setFrom(newNode);
		}
		for (Edge inEdge : new CopyOnWriteArrayList<Edge>(oldNode.getIncoming())) {
			inEdge.setTo(newNode);
		}
		EList<Node> nodes = graph.getNodes();
		nodes.remove(oldNode);
		nodes.add(newNode);
	}
	
	public boolean containsEdge(Edge edge) {
		return createdEdges.contains(edge);
	}
	
	public boolean containsNode(Node node) {
		return createdNodes.get(node.toString()) != null;
	}
	
	public EList<Edge> getOutgoing(Node node) {
		Node gNode = createdNodes.get(node.toString());
		return gNode == null ? node.getOutgoing() : gNode.getOutgoing();
	}
	
	public EList<Edge> getIncoming(Node node) {
		Node gNode = createdNodes.get(node.toString());
		return gNode == null ? node.getIncoming() : gNode.getIncoming();
	}
	
	public void invertEdge(Edge edge) {
		
		Node from = edge.getFrom();
		edge.setFrom(edge.getTo());
		edge.setTo(from);
	}
	
	public void clear() {
		createdNodes.clear();
		createdEdges.clear();
	}
	
	abstract protected Edge createEdge();
	
}
