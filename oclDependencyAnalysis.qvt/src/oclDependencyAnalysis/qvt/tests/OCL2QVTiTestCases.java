package oclDependencyAnalysis.qvt.tests;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.dynamic.OCL2JavaFileObject;
import org.eclipse.ocl.pivot.internal.manager.MetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.pivot.internal.validation.PivotEObjectValidator;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.codegen.qvti.QVTiCodeGenOptions;
import org.eclipse.qvtd.codegen.qvti.java.QVTiCodeGenerator;
import org.eclipse.qvtd.pivot.qvtbase.QVTbasePackage;
import org.eclipse.qvtd.pivot.qvtbase.Transformation;
import org.eclipse.qvtd.pivot.qvtbase.evaluation.AbstractTransformationExecutor;
import org.eclipse.qvtd.pivot.qvtcorebase.QVTcoreBasePackage;
import org.eclipse.qvtd.pivot.qvtimperative.ImperativeModel;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePackage;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiEnvironmentFactory;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiPivotEvaluator;
import org.eclipse.qvtd.xtext.qvtbase.tests.LoadTestCase;
import org.eclipse.qvtd.xtext.qvtimperative.QVTimperativeStandaloneSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OCL2QVTiTestCases extends LoadTestCase {
	
	// For testing purpose
	private static class OCL2QVTiBrokerTester extends OCL2QVTiBroker {

		public OCL2QVTiBrokerTester(String oclDocUri, Class<?> owner, MetamodelManager metaModelManager)
				throws QvtMtcExecutionException {
			super(oclDocUri, owner, metaModelManager);
		}
		
		public OCL2QVTiBrokerTester(String oclDocUri, Class<?> owner, MetamodelManager metaModelManager, boolean middleFolded)
				throws QvtMtcExecutionException {
			super(oclDocUri, owner, metaModelManager, middleFolded);
		}
		
		// For testing purpose
		@Override
		protected PivotModel runOCL2QVTp_MiddleModel(String oclDocURI, String qvtiFileURI, String tracesMMURI)
				throws QvtMtcExecutionException {
			return super.runOCL2QVTp_MiddleModel(oclDocURI, qvtiFileURI, tracesMMURI);
		}
		
		// For testing purpose
		@Override
		protected PivotModel runOCL2QVTp_MiddleFolded(String oclDocURI, String qvtiFileURI)
				throws QvtMtcExecutionException {
			return super.runOCL2QVTp_MiddleFolded(oclDocURI, qvtiFileURI);
		}
	}


	@Before
	public void setUp() throws Exception {
		super.setUp();
		QVTimperativeStandaloneSetup.doSetup();		
		CompleteOCLStandaloneSetup.doSetup(); // To be able to add QVTimperative.ocl validation
				
		metamodelManager = new QVTiEnvironmentFactory(null, null).createMetamodelManager();
		metamodelManager.configureLoadFirstStrategy(); // Since the models might use a different URI to refer the same meta-model
	}
	
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testExample1_OCL2QVTp() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example1/Source2Target.oclas";
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example1/Source2Target.qvtp.qvtias";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metamodelManager);
		mtc.runOCL2QVTp_MiddleFolded(oclDocURI, qvtpFileURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	@Test
	public void testExample1_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example1");
		URI oclDocUri = baseURI.appendSegment("Source2Target.oclas");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metamodelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());
    	assertValidQVTiModel(txURI);
    	
    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(metamodelManager, qvtiTransf.getTransformation());
		URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("model1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("model1_output.xmi");
//    	URI expectedAsModelURI = samplesBaseUri.appendSegment("example1_output_expected.xmi");
    	
    	testEvaluator.saveTransformation(null);
        testEvaluator.loadModel("leftCS", csModelURI);
        testEvaluator.createModel("rightAS", asModelURI, null);
        testEvaluator.execute();
        testEvaluator.saveModels();
        testEvaluator.dispose();
                
//        ResourceSet rSet = metamodelManager.getExternalResourceSet();
//        Resource expected =  rSet.getResource(expectedAsModelURI, true);
//        assertSameModel(expected, rSet.getResource(asModelURI, true));
	}
	
	
	@Test
	public void testExample2_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
		URI oclDocUri = baseURI.appendSegment("classescs2as.oclas");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metamodelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());		
    	assertValidQVTiModel(txURI);
//    	assertValidModel(txURI);
    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(metamodelManager, qvtiTransf.getTransformation());
    	    	
//    	// Execute the transformation with a clean resourceSet and MetaModelManager
//    	ResourceSet rSet = new ResourceSetImpl();
//    	MetaModelManager newMManager = new MetaModelManager(rSet);
//    	URI txURI = baseURI.appendSegment("classescs2as.qvtias");
//    	assertValidModel(txURI);
//    	Transformation t = getTransformation(rSet, txURI);    	
//    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(newMManager, t);
    	
    	
		URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
//    	URI middleModelURI = samplesBaseUri.appendSegment("example1_middle.xmi");
    	URI expectedAsModelURI = samplesBaseUri.appendSegment("example1_output_expected.xmi");
    	
    	
//    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(ClassUtil.nonNullState(metamodelManager), qvtiTransf.getTransformation());
    	testEvaluator.saveTransformation(null);
        testEvaluator.loadModel("leftCS", csModelURI);
        testEvaluator.createModel("rightAS", asModelURI, null);
        // testEvaluator.createModel("middle", middleModelURI, null);
        testEvaluator.execute();
        testEvaluator.saveModels();
        testEvaluator.dispose();
                
        ResourceSet rSet = metamodelManager.getExternalResourceSet();
        Resource expected =  rSet.getResource(expectedAsModelURI, true);
        assertSameModel(expected, rSet.getResource(asModelURI, true));
	}
//	
////	FIXME commented until 	
//	@Test
//	public void testExample1_CG() throws Exception {
//		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/");
//		URI oclDocUri = baseURI.appendSegment("classescs2as.oclas");
//
//		OCL2QVTiBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metamodelManager);
//    	mtc.execute();
//    	PivotModel qvtiTransf = mtc.getiModel();
//    	
//    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());
//    	assertValidQVTiModel(txURI);
//    	
//    	//
//    	// Generate the transformation java code
//    	// 
//		URI middleGenModelURI= oclDocUri.trimFileExtension().appendFileExtension("genmodel");
//		Class<? extends AbstractTransformation> txClass = generateCode(qvtiTransf.getTransformation(), middleGenModelURI, "/oclDependencyAnalysis.qvt/tests-gen/");
//    	
//		
//		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(DomainEvaluator.class);
//		DomainEvaluator evaluator = new TxEvaluator(ClassUtil.nonNullState(metamodelManager));
//		AbstractTransformation tx = txConstructor.newInstance(evaluator);
//		
//		//
//		// Execute the transformation
//		//
//    	URI samplesBaseUri = baseURI.appendSegment("samples");
//    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
//    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
//		Resource inputResource = resourceSet.getResource(csModelURI, true);
//		tx.addRootObjects("leftCS", ClassUtil.nonNullState(inputResource.getContents()));
//		tx.run();
//		Resource outputResource = resourceSet.createResource(asModelURI);
//		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
//		outputResource.save(null);
//	}
	
//	@Test
//	public void testExample1_CGv2() throws Exception {
//		
//		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
//		URI txURI = baseURI.appendSegment("classescs2as.qvtias");		
//		URI middleGenModelURI = txURI.trimFileExtension().appendFileExtension("genmodel");
//		assertValidQVTiModel(txURI);
//		
//		//
//    	// Generate the transformation java code
//    	//
//		Transformation t = getTransformation(resourceSet, txURI);
//		Class<? extends AbstractTransformation> txClass=  generateCode(t,  middleGenModelURI, "../oclDependencyAnalysis.qvt/tests-gen/");
//		
//		//
//		// Execute the transformation
//		//
//		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(TxEvaluator.class);
//		Evaluator evaluator = new TxEvaluator(metamodelManager.getCompleteEnvironment());
//		AbstractTransformation tx = txConstructor.newInstance(evaluator);
//		
//    	URI samplesBaseUri = baseURI.appendSegment("samples");
//    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
//    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
//		Resource inputResource = resourceSet.getResource(csModelURI, true);
//		tx.addRootObjects("leftCS", ClassUtil.nonNullState(inputResource.getContents()));
//		tx.run();
//		Resource outputResource = resourceSet.createResource(asModelURI);
//		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
//		outputResource.save(null);
//	}
	
	
		
	@Test
	public void testExample2_OCL2QVTp_MiddleModel() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas";
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtp.qvtias";
		String tracesMMURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.ecore.oclas";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metamodelManager, false);
		mtc.runOCL2QVTp_MiddleModel(oclDocURI, qvtpFileURI, tracesMMURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	@Test
	public void testExample2_OCL2QVTp_MiddleFolded() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas";
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtp.qvtias";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metamodelManager);
		mtc.runOCL2QVTp_MiddleFolded(oclDocURI, qvtpFileURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	
	protected static void assertValidModel(@NonNull URI asURI) {
		PivotEnvironmentFactory factory =  new PivotEnvironmentFactory(null,null);
		MetamodelManager metamodelManager = factory.createMetamodelManager();
        ResourceSet asResourceSet = factory.createASResourceSet(metamodelManager);
        // MetaModelManager.initializeASResourceSet(asResourceSet);
        assertValidModel(asURI, asResourceSet);
	}
	
	protected static void assertValidModel(URI asURI, ResourceSet rSet) {
		Resource resource = rSet.getResource(asURI, true);
        EcoreUtil.resolveAll(resource);
	        
		String rUriString = resource.getURI().toString();
		assertNoUnresolvedProxies("Validating a resource: " + rUriString, resource);
        assertNoResourceErrors("Loading a resource" + rUriString, resource);
        //assertNoValidationErrors("Loading a resource" + rUriString, resource);
	}
	
	protected static void assertValidQVTiModel(@NonNull URI asURI ) {
	    
		PivotEnvironmentFactory factory =  new PivotEnvironmentFactory(null,null);
		MetamodelManager mManager = factory.createMetamodelManager();
        ResourceSet asResourceSet = factory.createASResourceSet(mManager);
		
        mManager.configureLoadFirstStrategy();
		
		URI oclURI = ClassUtil.nonNullState(URI.createPlatformResourceURI("/org.eclipse.qvtd.pivot.qvtimperative/model/QVTimperative.ocl", true));

		CompleteOCLEObjectValidator validator = new CompleteOCLEObjectValidator(ClassUtil.nonNullState(QVTcoreBasePackage.eINSTANCE), oclURI, mManager);
		validator.initialize();
		PivotEObjectValidator.install(ClassUtil.nonNullState(asResourceSet), ClassUtil.nonNullState(mManager));
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTbasePackage.eINSTANCE));
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTcoreBasePackage.eINSTANCE));
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTimperativePackage.eINSTANCE));
		
		assertValidModel(asURI, asResourceSet);
	}
	
	// Copied from QVTiCompilerTest
	protected Class<? extends AbstractTransformationExecutor> generateCode(@NonNull Transformation transformation, URI genModelURI, @Nullable String savePath) throws Exception {

		registerGenModels(resourceSet, metamodelManager, genModelURI);
				
		QVTiCodeGenerator cg = new QVTiCodeGenerator(ClassUtil.nonNullState(metamodelManager), transformation);
		QVTiCodeGenOptions options = cg.getOptions();
		options.setUseNullAnnotations(true);
		options.setPackagePrefix("cg");
		cg.generateClassFile();
		if (savePath != null) {
			cg.saveSourceFile(savePath);
		}
		return  compileTransformation(cg);
	}

	protected Transformation getTransformation(ResourceSet rSet, URI qvtiURI) {
		
		Resource resource = rSet.getResource(qvtiURI, true);
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
		return null;
	}
	
	protected void registerGenModels(ResourceSet rSet, MetamodelManager mManager, URI genModelURI) {
		
		rSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		Resource genResource = rSet.getResource(genModelURI, true);
		for (EObject eObject : genResource.getContents()) {
			if (eObject instanceof GenModel) {
				mManager.addGenModel((GenModel)eObject);
			}
		}
	}
	
	// Copied from QVTiCompilerTest
	@SuppressWarnings("unchecked")
	public Class<? extends AbstractTransformationExecutor> compileTransformation(@NonNull QVTiCodeGenerator cg) throws Exception {
		String qualifiedName = cg.getQualifiedName();
		String javaCodeSource = cg.generateClassFile();
		try {
			Class<?> txClass = OCL2JavaFileObject.loadClass(qualifiedName, javaCodeSource);
			return (Class<? extends AbstractTransformationExecutor>) txClass;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
}
