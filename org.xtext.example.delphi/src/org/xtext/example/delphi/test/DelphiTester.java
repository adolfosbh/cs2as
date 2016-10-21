package org.xtext.example.delphi.test;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiEnvironmentFactory;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiTransformationExecutor;
import org.eclipse.qvtd.runtime.evaluation.TransformationExecutor;
import org.eclipse.qvtd.runtime.evaluation.Transformer;
import org.xtext.example.delphi.DelphiStandaloneSetup;
import org.xtext.example.delphi._Delphi_qvtp_qvtcas.Delphi_qvtp_qvtcas;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.delphi.DelphiPackage;


public class DelphiTester {
	
	private static final String[] MODEL_NAMES = new String[]{"test.delphi", "untClArchivo.delphi", "untClAux.delphi", "untClFormatos.delphi"};
	
	public static void main(String[] args) throws Exception {
		
		URI baseURI = URI.createPlatformResourceURI("/org.xtext.example.delphi/src/org/xtext/example/delphi/test/", true);
		
		long startAll = System.currentTimeMillis();
		
		PivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		QVTcorePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		DelphiStandaloneSetup.doSetup();
		
		// warmup with model 2
		System.out.println("* Running Warmup *");
		for (int i=0; i < 3000 ; i++) {
			execute_CG(baseURI, "test.delphi");
		}
		
		printMemory();
        
		// take measurements
		
		System.out.println("* Running Final Measurement *");
		for (String modelName : MODEL_NAMES){
			System.gc();
			Thread.sleep(1000);
			// printMemory();
			execute_CG(baseURI, modelName);
		}
		
		long endAll = System.currentTimeMillis();
		System.out.println("Whole process (ms): " + (endAll - startAll));
	}
	
	private static QVTiEnvironmentFactory createEnvFact() {
		ResourceSet rSet = new ResourceSetImpl();
		// To use the proper EPackage impl
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.delphi/model/generated/Delphi.ecore", true).toString(), 
				DelphiPackage.eINSTANCE);
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.delphi/model/astm.ecore", true).toString(), 
				AstmPackage.eINSTANCE);
		
		return new QVTiEnvironmentFactory(ProjectManager.CLASS_PATH, rSet);
	}
			
	private static void execute_CG(URI baseURI, String fileName) throws Exception {
		
		QVTiEnvironmentFactory envFact = createEnvFact();
		TransformationExecutor evaluator = new QVTiTransformationExecutor(envFact, Delphi_qvtp_qvtcas.class);
		Transformer tx = evaluator.getTransformer();
		
		URI csModelURI = baseURI.appendSegment(fileName);
		URI asModelURI = csModelURI.trimFileExtension().appendFileExtension("output.xmi");

    	ResourceSet rSet = envFact.getResourceSet();
		Resource inputResource = rSet.getResource(csModelURI, true);
		tx.addRootObjects("leftCS", ClassUtil.nonNullState(inputResource.getContents()));
	    long start = System.currentTimeMillis();
		boolean success =  tx.run();
	    long end = System.currentTimeMillis();
	    System.out.println("CG execution time (ms) for model " + fileName +" : " + (end - start));
		Resource outputResource = rSet.createResource(asModelURI);
		outputResource.getContents().addAll(tx.getRootEObjects("rightAS"));
		outputResource.save(null);
		assert(success == true);
		envFact.dispose();
	}
	
	
	private static void printMemory() {
		
		Runtime runtime = Runtime.getRuntime();
		int mb = 1024*1024;
		
        System.out.println("Max Memory (Mb):" + runtime.maxMemory() / mb);
        
        System.out.println("Total Memory (Mb):" + runtime.totalMemory() / mb);
        
        System.out.println("Used Memory (Mb):"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        System.out.println("Free Memory (Mb):"
            + runtime.freeMemory() / mb);
	}
}
