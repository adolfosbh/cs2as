package ocldependencyanalysis.tests;

import static org.junit.Assert.*;
import ocldependencyanalysis.Analysis;
import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.IGraph;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class AttributeDependencyGraphTestCases {

	// TODO complete assertions
	@Test
	public void testSMM1a() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1a.ocl");
		IGraph<FeatureObj> graph = Analysis.createFeaturesDependencyGraph(uri);
		Analysis.printGraphAndCycles(graph);
	}
	
	@Test
	public void testSMM1b() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1b.ocl");
		IGraph<FeatureObj> graph = Analysis.createFeaturesDependencyGraph(uri);
		Analysis.printGraphAndCycles(graph);
	}
	
	@Test
	public void testSMM1c() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1c.ocl");
		IGraph<FeatureObj> graph = Analysis.createFeaturesDependencyGraph(uri);
		Analysis.printGraphAndCycles(graph);
		assertTrue(graph.getCycles().isEmpty());
	}
	
	@Test
	public void testSMM1d() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1d.ocl");
		IGraph<FeatureObj> graph = Analysis.createFeaturesDependencyGraph(uri);
		Analysis.printGraphAndCycles(graph);
		assertTrue(graph.getCycles().isEmpty());
	}

}
