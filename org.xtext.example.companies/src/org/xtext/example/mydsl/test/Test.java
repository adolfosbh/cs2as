package org.xtext.example.mydsl.test;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.pivot.evaluation.tx.TransformationExecutor;
import org.eclipse.ocl.pivot.evaluation.tx.Transformer;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtbase.Transformation;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.ImperativeModel;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.BasicQVTiExecutor;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiEnvironmentFactory;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiIncrementalExecutor;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiTransformationExecutor;
import org.xtext.example.company.CompanyPackage;
import org.xtext.example.mydsl.CompaniesStandaloneSetup;
import org.xtext.example.mydsl._companies_qvtp_qvtcas.companies_qvtp_qvtcas;
import org.xtext.example.mydsl.companies.CompaniesPackage;

public class Test {
	
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
		
		
		doWarmup(baseURI, envFact, "model2.101");
		String fileName = "model5.101";
		System.out.println("* Running CG execution:");
		for (int i=0; i < 10 ; i++) {
			execute_CG(baseURI, envFact, fileName);
		}
		
		/*System.out.println("* Running Interpreter execution:");
		for (int i=0; i < 10; i++) {
			execute_Interpreter(baseURI, envFact);
		}*/
		
		
		long endAll = System.currentTimeMillis();
		System.out.println("Whole process (ms): " + (endAll - startAll));
	}
	
	private static void doWarmup(URI baseURI, QVTiEnvironmentFactory envFact, String fileName) throws Exception {
		long start = System.currentTimeMillis();
		URI csModelURI = baseURI.appendSegment(fileName);
		URI asModelURI = csModelURI.trimFileExtension().appendFileExtension("companyas");

		//saveEmptyModel(asModelURI);

		for (int i=0; i < 3000 ; i++) {
			Transformation tx = getTransformation(envFact);
			BasicQVTiExecutor testEvaluator = new QVTiIncrementalExecutor(envFact, tx, QVTiIncrementalExecutor.Mode.LAZY);
			//testEvaluator.saveTransformation(null);
		    testEvaluator.loadModel("leftCS", csModelURI);
		    testEvaluator.createModel("rightAS", asModelURI, null);
			testEvaluator.execute();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Warmup time (ms):" + (end - start));
	}
	
	public static void execute_Interpreter(URI baseURI, QVTiEnvironmentFactory envFact, String fileName) {
		URI csModelURI = baseURI.appendSegment(fileName);
		URI asModelURI = csModelURI.trimFileExtension().appendFileExtension("companyas");

		//saveEmptyModel(asModelURI);

		Transformation tx = getTransformation(envFact);
		BasicQVTiExecutor testEvaluator = new QVTiIncrementalExecutor(envFact, tx, QVTiIncrementalExecutor.Mode.LAZY);
		//testEvaluator.saveTransformation(null);
	    testEvaluator.loadModel("leftCS", csModelURI);
	    testEvaluator.createModel("rightAS", asModelURI, null);
	    
	    long start = System.currentTimeMillis();
	    boolean success = testEvaluator.execute();
	    long end = System.currentTimeMillis();
	    System.out.println("Interpreter execution time (ms): " + (end - start));
	    
	    testEvaluator.saveModels((Map<?, ?>)null);
	    testEvaluator.dispose();
	    assert(success == true);
	}
		
	public static void execute_CG(URI baseURI, QVTiEnvironmentFactory envFact, String fileName) throws Exception {
		
		TransformationExecutor evaluator = new QVTiTransformationExecutor(envFact, companies_qvtp_qvtcas.class);
		Transformer tx = evaluator.getTransformer();
		
		URI csModelURI = baseURI.appendSegment(fileName);
		URI asModelURI = csModelURI.trimFileExtension().appendFileExtension("companyas");

    	ResourceSet rSet = envFact.getResourceSet();
		Resource inputResource = rSet.getResource(csModelURI, true);
		tx.addRootObjects("leftCS", ClassUtil.nonNullState(inputResource.getContents()));
	    long start = System.currentTimeMillis();
		boolean success =  tx.run();
	    long end = System.currentTimeMillis();
	    System.out.println("CG execution time (ms): " + (end - start));
		Resource outputResource = rSet.createResource(asModelURI);
		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
		outputResource.save(null);
		assert(success == true);
	}
	
	public static Transformation getTransformation(EnvironmentFactory envFact) {
		ResourceSet rSet = envFact.getMetamodelManager().getASResourceSet();
		URI txURI = URI.createPlatformResourceURI("/org.xtext.example.companies/model/companies.qvtias", true);
		
		Resource resource = rSet.getResource(txURI, true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof ImperativeModel) {
				for (org.eclipse.ocl.pivot.Package pPackage : ((ImperativeModel)eObject).getOwnedPackages()) {
					for (org.eclipse.ocl.pivot.Class pClass : pPackage.getOwnedClasses()) {
						if (pClass instanceof Transformation) {
							return  (Transformation) pClass;
						}
					}
				}
			}
		}
		throw new IllegalStateException("No transformation");
	}
	
	
}
