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
	
	private static boolean RUN_SCALABILITY_TEST = true;
	private static int NUM_OF_MODELS = 25;
	
	public static void main(String[] args) throws Exception {
		
		long startAll = System.currentTimeMillis();
		
		ResourceSet rSet = new ResourceSetImpl();
		PivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		QVTcorePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		CompaniesStandaloneSetup.doSetup();
				
		// To use the proper EPackage impl
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.companies/model/generated/Companies.ecore", true).toString(), 
				CompaniesPackage.eINSTANCE);
		rSet.getPackageRegistry().put(
				URI.createPlatformResourceURI("org.xtext.example.companies/model/Company.ecore", true).toString(), 
				CompanyPackage.eINSTANCE);
		
		URI baseURI = URI.createPlatformResourceURI("/org.xtext.example.companies/src/org/xtext/example/mydsl/test/", true);
		QVTiEnvironmentFactory envFact = new QVTiEnvironmentFactory(ProjectManager.CLASS_PATH, rSet);
		
		// warmup with model 2
		System.out.println("* Running Warmup *");
		for (int i=0; i < 3000 ; i++) {
			execute_CG(baseURI, envFact, "model2.101");
		}
		
		// take measurements
		baseURI = baseURI.appendSegment("scalability");
		System.out.println("* Running Final Measurement *");
		if (RUN_SCALABILITY_TEST) {
			for (int i=1; i <= NUM_OF_MODELS; i++){
				System.gc();
				Thread.sleep(1000);
				execute_CG(baseURI, envFact, "model"+i+".101");
			}
		} else {
			String modelName = args[0];
			String fileName = modelName + ".101";
			for (int i=0; i < 10 ; i++) {
				execute_CG(baseURI, envFact, fileName);
			}
		}
		
		long endAll = System.currentTimeMillis();
		System.out.println("Whole process (ms): " + (endAll - startAll));
	}
			
	private static void execute_CG(URI baseURI, QVTiEnvironmentFactory envFact, String fileName) throws Exception {
		
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
	}
	
//	private static Transformation getTransformation(EnvironmentFactory envFact) {
//		ResourceSet rSet = envFact.getMetamodelManager().getASResourceSet();
//		URI txURI = URI.createPlatformResourceURI("/org.xtext.example.companies/model/companies.qvtias", true);
//		
//		Resource resource = rSet.getResource(txURI, true);
//		for (EObject eObject : resource.getContents()) {
//			if (eObject instanceof ImperativeModel) {
//				for (org.eclipse.ocl.pivot.Package pPackage : ((ImperativeModel)eObject).getOwnedPackages()) {
//					for (org.eclipse.ocl.pivot.Class pClass : pPackage.getOwnedClasses()) {
//						if (pClass instanceof Transformation) {
//							return  (Transformation) pClass;
//						}
//					}
//				}
//			}
//		}
//		throw new IllegalStateException("No transformation");
//	}
}
