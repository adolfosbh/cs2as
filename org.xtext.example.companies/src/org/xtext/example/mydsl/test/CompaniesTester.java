package org.xtext.example.mydsl.test;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.pivot.evaluation.tx.TransformationExecutor;
import org.eclipse.ocl.pivot.evaluation.tx.Transformer;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiEnvironmentFactory;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiTransformationExecutor;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.mydsl.CompaniesStandaloneSetup;
import org.xtext.example.mydsl._companies_qvtp_qvtcas.companies_qvtp_qvtcas;
import org.xtext.example.mydsl.companies.CompaniesPackage;

public class CompaniesTester {
	
	static enum Usage {
		TOPOLOGY_EXPERIMENT,
		SCALABILITY_EXPERIMENT,
		INCORRECT
	}
	
	private static int NUM_OF_MODELS;
	
	public static void main(String[] args) throws Exception {
		
		URI baseURI = URI.createPlatformResourceURI("/org.xtext.example.companies/src/org/xtext/example/mydsl/test/", true);
		Usage usage = checkArgs(args);
		
		if (usage == Usage.INCORRECT)  {
			return;
		} else {
			if (Usage.SCALABILITY_EXPERIMENT == usage) {
				NUM_OF_MODELS = 25;
				baseURI = baseURI.appendSegment("scalability");
			} else {
				NUM_OF_MODELS = 7;
				
			}
		}
		
		long startAll = System.currentTimeMillis();
		
		PivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		QVTcorePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		CompaniesStandaloneSetup.doSetup();
		
		// warmup with model 2
		System.out.println("* Running Warmup *");
		for (int i=0; i < 3000 ; i++) {
			execute_CG(baseURI, "model2.101");
		}
		
		printMemory();
        
		// take measurements
		
		System.out.println("* Running Final Measurement *");
		for (int i=1; i <= NUM_OF_MODELS; i++){
			System.gc();
			Thread.sleep(1000);
			// printMemory();
			execute_CG(baseURI,  "model"+i+".101");
		}
		
		long endAll = System.currentTimeMillis();
		System.out.println("Whole process (ms): " + (endAll - startAll));
	}
	
	private static QVTiEnvironmentFactory createEnvFact() {
		ResourceSet rSet = new ResourceSetImpl();
		// To use the proper EPackage impl
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.companies/model/generated/Companies.ecore", true).toString(), 
				CompaniesPackage.eINSTANCE);
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.companies/model/Company.ecore", true).toString(), 
				CompanyPackage.eINSTANCE);
		
		return new QVTiEnvironmentFactory(ProjectManager.CLASS_PATH, rSet);
	}
			
	private static void execute_CG(URI baseURI, String fileName) throws Exception {
		
		QVTiEnvironmentFactory envFact = createEnvFact();
		TransformationExecutor evaluator = new QVTiTransformationExecutor(envFact, companies_qvtp_qvtcas.class);
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
	
	private static Usage checkArgs(String[] args) {
		
		Usage usage = Usage.INCORRECT;
		if (args != null && args.length == 1) {
			usage = "-topology".equals(args[0]) ? Usage.TOPOLOGY_EXPERIMENT
					: "-scalability".equals(args[0]) ? Usage.SCALABILITY_EXPERIMENT
					: Usage.INCORRECT;
		} 
		if (usage == Usage.INCORRECT) {
			System.out.println("Incorrect arguments. Please specify -topology for topology analysis related experiment, otherwise -scalability for the scalability analysis related experiment");
		}
		return usage;
	}
}
