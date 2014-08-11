package ocldependencyanalysis;


import ocldependencyanalysis.graph.IGraph;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.Class;
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

	public static IGraph<Class> createClassDependencyGraph(URI oclDocumentURI) {
			
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
		
		if (args.length != 1) {
			System.out.println("Incorrect program arguments.\n"
								+ "Usage:\n"+
							"\tjava Analysis <Complete-OCL document URI>\n"
							+ "Example:\n"
							+ "\tjava Analysis platform:/resource/oclDependencyAnalysis/example/Source2Target.ocl");
			return;
		}
		
		System.out.println("Starting...");						
		URI uri = URI.createURI(args[0]); // OCL Document URI
		IGraph<?> depedencyGraph = createClassDependencyGraph(uri);
		printGraphAndCycles(depedencyGraph);
		System.out.println("...Finished");
	}
}
