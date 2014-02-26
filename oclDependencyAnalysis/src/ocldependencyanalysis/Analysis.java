package ocldependencyanalysis;


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

public class Analysis {
	
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
	
	public static IGraph<FeatureObj> createFeaturesDependencyGraph(URI oclDocumentURI) {
		
		Resource pivotResource = getPivotResource(oclDocumentURI);
		return new AttributeDependencyGraphComputer().computeDependencyGraph(pivotResource);
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
		
		System.out.println("Starting...");

		// OCL Document URI
		URI uri = URI.createURI("platform:/resource/org.eclipse.ocl.examples.xtext.base/model/BaseCS.ocl");
		// URI uri = URI.createURI("platform:/resource/org.eclipse.ocl.examples.xtext.essentialocl/model/EssentialOCLCS.ocl");
		
		IGraph<?> depedencyGraph = createClassDependencyGraph(uri);
		
		printGraphAndCycles(depedencyGraph);
		
		
		System.out.println("...Finished");
	}
}
