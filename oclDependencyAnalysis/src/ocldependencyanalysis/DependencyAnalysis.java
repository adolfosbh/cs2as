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
	
	private static OCL getOCL() {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		org.eclipse.ocl.examples.pivot.OCL.initialize(resourceSet);		
		org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
		org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.getAdapter(resourceSet);

		EPackage.Registry registry = new EPackageRegistryImpl();
		PivotEnvironmentFactory environmentFactory = new PivotEnvironmentFactory(registry, null);
		return OCL.newInstance(environmentFactory);
	}

	public static IGraph<Type> createTypeDependencyGraph(URI cs2asDocURI) {
			
		OCL ocl = getOCL();
		Resource cs2asResource = ocl.parse(cs2asDocURI);
		TypeDependencyGraphComputer inputTypeGraphComp = new TypeDependencyGraphComputer();
		return inputTypeGraphComp.computeDependencyGraph(cs2asResource);
	}
	
	public static IGraph<FeatureObj> createFeatureDependencyGraph(URI cs2asDocURI) {
		
		OCL ocl = getOCL();		
		Resource cs2asResource = ocl.parse(cs2asDocURI);		
		FeatureDependencyGraphComputer featGraphComp = new FeatureDependencyGraphComputer();
		return featGraphComp.computeDependencyGraph(cs2asResource);
	}
	
	public static IGraph<FeatureObj> createFeatureDependencyGraph(URI cs2asDocURI, URI lookupDocURI) {
		
		OCL ocl = getOCL();	
		Resource cs2asResource = ocl.parse(cs2asDocURI);
		Resource lookupResoource = ocl.parse(lookupDocURI);
		FeatureDependencyGraphComputer featGraphComp = new FeatureDependencyGraphComputer();
				
				
		return featGraphComp.computeDependencyGraph(cs2asResource, lookupResoource);
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
