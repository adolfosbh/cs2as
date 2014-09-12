package ocldependencyanalysis.cs2asanalysis;

import ocldependencyanalysis.graph2.AbstractGraphManager;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Graph;

public class CS2ASGraphManager extends AbstractGraphManager {
	
	public CS2ASGraphManager(Graph graph) {
		super(graph);
	}

	@Override
	protected Edge createEdge() {		
		return CS2ASAnalysisFactory.eINSTANCE.createCS2ASAnalysisEdge();
	}
}
