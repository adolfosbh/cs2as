package ocldependencyanalysis;


import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;

public class DependencyAnalysis {
	
	private static Resource getPivotResource(URI oclDocumentURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		org.eclipse.ocl.examples.pivot.OCL.initialize(resourceSet);		
		org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
		org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.getAdapter(resourceSet);

		EPackage.Registry registry = new EPackageRegistryImpl();
		PivotEnvironmentFactory environmentFactory = new PivotEnvironmentFactory(registry, null);
		OCL ocl = OCL.newInstance(environmentFactory);

		// parse the contents as an OCL document
		return ocl.parse(oclDocumentURI);
	}

	public static IGraph<Type> createClassDependencyGraph(URI oclDocumentURI) {
			
		Resource pivotResource = getPivotResource(oclDocumentURI);
		return new ClassDependencyGraphComputer().computeDependencyGraph(pivotResource);
	}
	
	public static IGraph<FeatureObj> createFeatureDependencyGraph(URI oclDocumentURI) {
		
		Resource pivotResource = getPivotResource(oclDocumentURI);
		return new FeatureDependencyGraphComputer().computeDependencyGraph(pivotResource);
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
				printGraphAndCycles(createClassDependencyGraph(URI.createURI(args[1])));
				System.out.println("...Finished");
			}				
			else if ("FEATURE".equalsIgnoreCase(args[0])) {
				System.out.println("Starting...");
				printGraphAndCycles(createFeatureDependencyGraph(URI.createURI(args[1])));
				System.out.println("...Finished");
			}
			else { 
				printUsage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static final void printUsage() {
		System.out.println("Program args:");
		System.out.println("    1. TYPE (for type dependencies graph) or FEATURE (for feature dependencies graph)");
		System.out.println("    2. input Complete OCL document URI. e.g. platform:/resource/oclDependencyAnalysis/example/Source2Target.ocl");
	}
}
