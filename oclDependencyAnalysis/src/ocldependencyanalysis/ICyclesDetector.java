package ocldependencyanalysis;

import java.util.Set;

import ocldependencyanalysis.graph.IGraph;

public interface ICyclesDetector<C> {

	Set<IGraph<C>> run(IGraph<C> graph);
}
