package ocldependencyanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Cycles detector algorithm for an {@link IGraph}
 * 
 * Adaptation of Targan's Algorithm:
 * 
 * http://en.wikipedia.org/wiki/Tarjan's_strongly_connected_components_algorithm
 *
 * @author asbh500
 *
 * @param <C> see {@link INode}
 */
public class CyclesDetector<C> implements ICyclesDetector<C>{

	private class TarjanNode extends Node<C> {
	
		int lowindex=0;
		int index=0;
		
		public TarjanNode(C node) {
			super(node);
		}
		
		public int getLowLink() {
			return lowindex;
		}
		
		public int getIndex() {
			return index;
		}
		
		public void setIndex(int index) {
			this.index = index;
		}
		
		public void setLowindex(int lowindex) {
			this.lowindex = lowindex;
		}
	}
	
	
	private int  index;
	private Stack<TarjanNode> stack = new Stack<TarjanNode>();	
	private Map<INode<C>, TarjanNode> visitedNodes = new HashMap<INode<C>, CyclesDetector<C>.TarjanNode>();
	
	
	@Override
	public Set<IGraph<C>> run(IGraph<C> input) {
		
		index = 0;
		stack.clear();
		visitedNodes.clear();
		
		Set<IGraph<C>> output = new HashSet<IGraph<C>>();
		for (INode<C> node : input.getNodes()) {
			if (visitedNodes.get(node) == null) {
				strongConnect(node, input, output);
			}
		}
		return output;
	}
	
	private TarjanNode strongConnect(INode<C> node, IGraph<C> input, Set<IGraph<C>> output) {
		
		TarjanNode v = new TarjanNode(node.getObject());
		visitedNodes.put(node, v);
		int currentStackSize = stack.size();
		
	    // Set the depth index for tNode to the smallest unused index
	    v.setIndex(index);
	    v.setLowindex(index);
	    
	    index++;
	    stack.push(v);

	    // Consider successors of v
	    for (IEdge<C> edge : input.getOutputEdges(node)) {
	    	INode<C> outputNode = edge.getTo();
	    	TarjanNode w = visitedNodes.get(outputNode);
	    	
	    	if (w == null) {
	    		w = strongConnect(outputNode, input, output);	    		
	    		v.setLowindex(min(v.getLowLink(),  w.getLowLink()));
	    	} else {
	    		if (stack.contains(w)) {
	    			v.setLowindex(min(v.getLowLink(), w.getIndex()));
	    		}
	    	}
	    }


	    // If v is a root node, pop the stack and generate an SCC (cycle)
	    if (v.getLowLink() == v.getIndex()) {
	    	if (stack.size() - currentStackSize > 1 ) {	// A cycle must have more than two nodes in the result
	    		IGraph<C> newResult = createGraph();
		    	TarjanNode wTNode = null;
		    	do {
		    		wTNode = stack.pop();
		    		newResult.addNode(wTNode.getObject());
		    	} while (wTNode != v);
		    	
		    	// We build the cycle with the intervening nodes
		    	Set<INode<C>> nodes = newResult.getNodes();
		    	for (INode<C> newNode : nodes) {
		    		for (IEdge<C> edge : input.getOutputEdges(newNode)) {
		    			INode<C> toNode = edge.getTo();
		    			if (nodes.contains(toNode)) {
		    				newResult.addEdge(newNode.getObject(), toNode.getObject());
		    			}
		    		}
		    	}
		    	output.add(newResult);
	    	} else {
	    		stack.pop();
	    	}
	    }
	    
	    return v;
	}
	
	private int min(int val1, int val2) {
		return val1 < val2 ? val1 : val2;
	}
	
	protected IGraph<C> createGraph() {
		return new Graph<C>();
	}
}
