package ocldependencyanalysis;

import java.util.Set;

public interface ICyclesDetector<C> {

	Set<IGraph<C>> run(IGraph<C> graph);
}
