package ocldependencyanalysis;


import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisGraphComputer;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph2.Graph;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;

public class DependencyAnalysis {
	
	private static OCL getOCL() {
				
		OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
		return OCL.newInstance();
	}

	public static IGraph<Type> createTypeDependencyGraph(URI cs2asDocURI) {
			
		OCL ocl = getOCL();
		Resource cs2asResource = ocl.parse(cs2asDocURI);
		TypeDependencyGraphComputer inputTypeGraphComp = new TypeDependencyGraphComputer(ocl);
		IGraph<Type> graph =  inputTypeGraphComp.computeDependencyGraph(cs2asResource);
		ocl.dispose();
		return graph;
	}
	
	public static IGraph<FeatureObj> createFeatureDependencyGraph(URI cs2asDocURI) {
		
		OCL ocl = getOCL();		
		Resource cs2asResource = ocl.parse(cs2asDocURI);		
		FeatureDependencyGraphComputer featGraphComp = new FeatureDependencyGraphComputer(ocl);
		IGraph<FeatureObj> graph = featGraphComp.computeDependencyGraph(cs2asResource);
		ocl.dispose();
		return graph;
	}
	
	public static Graph createCS2ASAnalysisGraph(URI cs2asDocURI) {
		
		OCL ocl = getOCL();		
		Resource cs2asResource = ocl.parse(cs2asDocURI);
		CS2ASAnalysisGraphComputer cs2asAnalysisGraphComp = new CS2ASAnalysisGraphComputer(ocl);
		Graph graph = cs2asAnalysisGraphComp.computeDependencyGraph(cs2asResource);
		ocl.dispose();
		return graph;
	}
	
	public static void printGraphAndCycles(IGraph<?> graph) {
		System.out.println("******** Dependency Graph **********");
		System.out.println(graph.toString());

		System.out.println("******** Cycles **********");
		for (IGraph<?> cycle : graph.getCycles()) {
			System.out.println(cycle.toString());
		}
	}
	
	public static void main(String[] args) {
		
		if (args.length != 2) {
			printUsage();
			return;
		}
		
		try {
			if ("TYPE".equalsIgnoreCase(args[0])) {
				System.out.println("Starting...");
				printGraphAndCycles(createTypeDependencyGraph(URI.createURI(args[1])));
				System.out.println("...Finished");
			}				
			else if ("FEATURE".equalsIgnoreCase(args[0])) {
				System.out.println("Starting...");
				printGraphAndCycles(createFeatureDependencyGraph(URI.createURI(args[1])));
				System.out.println("...Finished");
			}
			else if ("CS2ASAnalysis".equalsIgnoreCase(args[0])) { 
				System.out.println("Starting...");
				Graph graph = createCS2ASAnalysisGraph(URI.createURI(args[1]));
				System.out.println(graph.toString());
				System.out.println("Nodes: " + graph.getNodes().size());
				System.out.println("Edges: " + graph.getEdges().size());
				System.out.println("...Finished");
			} else {
				printUsage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static final void printUsage() {
		System.out.println("Program args:");
		System.out.println("    1. TYPE (for type dependencies graph) or FEATURE (for feature dependencies graph) or CS2ASAnalysis (for CS2AS analysis graph)");
		System.out.println("    2. input Complete OCL document URI. e.g. platform:/resource/oclDependencyAnalysis/example/Source2Target.ocl");
	}
}
