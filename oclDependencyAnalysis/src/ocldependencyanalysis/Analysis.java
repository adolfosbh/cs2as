package ocldependencyanalysis;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;

public class Analysis {
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");
		ResourceSet resourceSet = new ResourceSetImpl();
		
		org.eclipse.ocl.examples.pivot.OCL.initialize(resourceSet);		
		org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
		org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.getAdapter(resourceSet);

		EPackage.Registry registry = new EPackageRegistryImpl();
		PivotEnvironmentFactory environmentFactory = new PivotEnvironmentFactory(registry, null);
		OCL ocl = OCL.newInstance(environmentFactory);

		// OCL Document URI
		URI uri = URI.createURI("platform:/resource/org.eclipse.ocl.examples.xtext.base/model/BaseCS.ocl");
		// URI uri = URI.createURI("platform:/resource/org.eclipse.ocl.examples.xtext.essentialocl/model/EssentialOCLCS.ocl");

		// parse the contents as an OCL document
		Resource pivotResource = ocl.parse(uri);
		
		//IGraph<?> dependencyGraph = new ClassDependencyGraphComputer().computeDependencyGraph(pivotResource);
		IGraph<?> dependencyGraph = new AttributeDependencyGraphComputer().computeDependencyGraph(pivotResource);
		
		System.out.println("******** Dependency Graph **********");
		System.out.println(dependencyGraph.toString());

		System.out.println("******** Cycles **********");
		for (IGraph<?> cycle : dependencyGraph.getCycles()) {
			System.out.println(cycle.toString());
		}
		
		System.out.println("...Finished");
	}
}
