import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;


public class TestLetExp {

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
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");

		getPivotResource(URI.createURI("src/LetExp.ocl"));
		
		System.out.println("...Finished");
	}
}