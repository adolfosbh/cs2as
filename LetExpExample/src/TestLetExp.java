import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;


public class TestLetExp {

	private static Resource getPivotResource(URI oclDocumentURI) {
		
		CompleteOCLStandaloneSetup.doSetup();
		OCL ocl = OCL.newInstance();
		// parse the contents as an OCL document
		return ocl.parse(oclDocumentURI);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");

		getPivotResource(URI.createURI("src/LetExp.ocl"));
		
		System.out.println("...Finished");
	}
}