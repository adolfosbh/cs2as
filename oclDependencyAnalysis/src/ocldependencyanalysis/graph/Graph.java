package ocldependencyanalysis.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ocldependencyanalysis.CyclesDetector;
import ocldependencyanalysis.ICyclesDetector;

/**
 * Basic implementation of {@link IGraph}
 * 
 * When an {@link IEdge} is added the corresponding {@link INode} are 
 * created in case they were not in the graph.
 * 
 * @author asbh500
 *
 * @param <C> see {@link INode}
 */

public class Graph<C> implements IGraph<C> {

	private Set<INode<C>> nodes= new HashSet<INode<C>>();
	private Map<C, Node<C>> object2node = new HashMap<C, Node<C>>();
	private Map<INode<C>, Set<IEdge<C>>> node2outputEdges = new HashMap<INode<C>, Set<IEdge<C>>>();
	private Map<INode<C>, Set<IEdge<C>>> node2inputEdges = new HashMap<INode<C>, Set<IEdge<C>>>();
	private ICyclesDetector<C> cyclesDetector;

	private Set<IEdge<C>> edges= new HashSet<IEdge<C>>();
	
	@Override
	public Set<INode<C>> getNodes() {
		return Collections.unmodifiableSet(nodes);
	}
	
	@Override
	public Set<IEdge<C>> getEdges() {
		return edges;
	}
	
	@Override
	public Set<IEdge<C>> getOutputEdges(INode<C> node) {
		Set<IEdge<C>> result = node2outputEdges.get(node);
		return result == null ? Collections.<IEdge<C>>emptySet() : result;
	}
	
	@Override
	public Set<IEdge<C>> getInputEdges(INode<C> node) {
		Set<IEdge<C>> result = node2inputEdges.get(node);
		return result == null ? Collections.<IEdge<C>>emptySet() : result;
	}
	
	@Override
	public  INode<C> addNode(C c) {
		return addNode(c, false);
	}
	
	@Override
	public  INode<C> addNode(C c, boolean replacement) {
		Node<C> node = object2node.get(c);
		if (node == null) {
			node = createNode(c);
			nodes.add(node);
			object2node.put(c, node);
		} else {
			if (replacement) {
				node.replaceObject(c);
			}
		}
		
		return node;
	}
	
	@Override
	public void addEdge(C from, C to) {
		addEdge(from, to, false);		
	}
	
	public void addEdge(C from, C to, boolean replace) {
		INode<C> fromNode = addNode(from, replace);
		INode<C> toNode = addNode(to, replace);
		IEdge<C> newEdge = createEdge(fromNode, toNode);
		if (edges.add(newEdge)) {
			Set<IEdge<C>> outputEdges = node2outputEdges.get(fromNode);
			if (outputEdges == null) {
				outputEdges = new HashSet<IEdge<C>>();
				node2outputEdges.put(fromNode, outputEdges);
			}
			outputEdges.add(newEdge);
			Set<IEdge<C>> inputEdges = node2inputEdges.get(toNode);
			if (inputEdges == null) {
				inputEdges = new HashSet<IEdge<C>>();
				node2inputEdges.put(toNode, inputEdges);
			}
			inputEdges.add(newEdge);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+Nodes:");
		sb.append('\n');
		for (INode<C> node : nodes) {
			sb.append(node.toString());
			sb.append('\n');
		}
		sb.append("+Edges:");
		sb.append('\n');
		for (IEdge<C> edge : edges) {
			sb.append(edge.toString());
			sb.append('\n');
		}
		return sb.toString();
	}
	
	protected Node<C> createNode(C object) {
		return new Node<C>(object);
	}
	protected IEdge<C> createEdge(INode<C> from, INode<C> to) {
		return new Edge<C>(from, to);
	}

	@Override
	public Set<IGraph<C>> getCycles() {
		if (cyclesDetector == null) {
			cyclesDetector = createCyclesDetector();
		}
		return cyclesDetector.run(this);
	}
	
	protected ICyclesDetector<C> createCyclesDetector() {
		return new CyclesDetector<C>();
	}

	@Override
	public boolean removeNode(INode<C> node) {		
		
		boolean nodeRemoved = nodes.remove(node);
		if (nodeRemoved) {
			object2node.remove(node.getObject());
			List<IEdge<C>> edgesToRemove = new ArrayList<IEdge<C>>();
			for (IEdge<C> outputEdge : getOutputEdges(node)) {
				edgesToRemove.add(outputEdge);
			}
			for (IEdge<C> inputEdge : getInputEdges(node)) {
				edgesToRemove.add(inputEdge);
			}
			for (IEdge<C> edge : edgesToRemove) {
				removeEdge(edge);
			}
		}
		return nodeRemoved;
	}
	
	@Override
	public boolean removeEdge(IEdge<C> edge) {
		node2outputEdges.get(edge.getFrom()).remove(edge);
		node2inputEdges.get(edge.getTo()).remove(edge);
		return edges.remove(edge);
	}
		
}
