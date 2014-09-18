package ocldependencyanalysis.tests;

import static org.junit.Assert.*;
import ocldependencyanalysis.DependencyAnalysis;
import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph2.Graph;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class DependencyGraphTestCases {

	// TODO complete assertions
	@Test
	public void testSMM1a() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1a.ocl");
		IGraph<FeatureObj> graph = DependencyAnalysis.createFeatureDependencyGraph(uri);
		DependencyAnalysis.printGraphAndCycles(graph);
	}
	
	@Test
	public void testSMM1b() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1b.ocl");
		IGraph<FeatureObj> graph = DependencyAnalysis.createFeatureDependencyGraph(uri);
		DependencyAnalysis.printGraphAndCycles(graph);
	}
	
	@Test
	public void testSMM1c() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1c.ocl");
		IGraph<FeatureObj> graph = DependencyAnalysis.createFeatureDependencyGraph(uri);
		DependencyAnalysis.printGraphAndCycles(graph);
		assertTrue(graph.getCycles().isEmpty());
	}
	
	@Test
	public void testSMM1d() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1d.ocl");
		IGraph<FeatureObj> graph = DependencyAnalysis.createFeatureDependencyGraph(uri);
		DependencyAnalysis.printGraphAndCycles(graph);
		assertTrue(graph.getCycles().isEmpty());
	}
	
	
	@Test
	public void testOCLCS2ASDescription_Source2Target() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis/example/Source2Target.ocl");
		Graph graph = DependencyAnalysis.createCS2ASAnalysisGraph(uri);
		assertEquals(31, graph.getNodes().size());
		assertEquals(38, graph.getEdges().size());
	}
	
	@Test
	public void testOCLCS2ASDescription_Sourceb2Target() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis/example/example1/Sourceb2Target.ocl");
		Graph graph = DependencyAnalysis.createCS2ASAnalysisGraph(uri);
		assertEquals(100, graph.getNodes().size());
		assertEquals(156, graph.getEdges().size());
	}
	
	@Test
	public void testOCLCS2ASDescription_Classes() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis/example/example2/ClassesCS2Classes.ocl");
		Graph graph = DependencyAnalysis.createCS2ASAnalysisGraph(uri);
		assertEquals(41, graph.getNodes().size());
		assertEquals(59, graph.getEdges().size());
	}

	@Test
	public void testOCLCS2ASDescription_KiamaExample() {
		
		URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis/example/example3/KiamaRewrite.ocl");
		Graph graph = DependencyAnalysis.createCS2ASAnalysisGraph(uri);
		assertEquals(32, graph.getNodes().size());
		assertEquals(46, graph.getEdges().size());
	}
}
