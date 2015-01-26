package oclDependencyAnalysis.qvt.tests;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.xml.XmlModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.dynamic.OCL2JavaFileObject;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.build.etl.EtlTask;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.codegen.qvti.QVTiCodeGenOptions;
import org.eclipse.qvtd.codegen.qvti.java.QVTiCodeGenerator;
import org.eclipse.qvtd.pivot.qvtbase.Transformation;
import org.eclipse.qvtd.pivot.qvtbase.evaluation.AbstractTransformationExecutor;
import org.eclipse.qvtd.pivot.qvtimperative.ImperativeModel;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiEnvironmentFactory;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiPivotEvaluator;
import org.eclipse.qvtd.xtext.qvtbase.tests.LoadTestCase;
import org.eclipse.qvtd.xtext.qvtimperative.QVTimperativeStandaloneSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author asbh500
 * 
 *
 */
public class OCL2QVTiTestCases extends LoadTestCase {
	
	protected class MyQVT extends OCL.Internal
	{
		public MyQVT(@NonNull QVTiEnvironmentFactory environmentFactory) {
			super(environmentFactory);
		}

		public @NonNull QVTiPivotEvaluator createEvaluator(Transformation transformation) throws IOException {
			return new QVTiPivotEvaluator(getEnvironmentFactory(), transformation);
		}

		@Override
		public @NonNull QVTiEnvironmentFactory getEnvironmentFactory() {
			return (QVTiEnvironmentFactory) super.getEnvironmentFactory();
		}
	}
	
	// For testing purpose
	private static class OCL2QVTiBrokerTester extends OCL2QVTiBroker {

		public OCL2QVTiBrokerTester(URI baseURI, String oclDocName, OCL metaModelManager)
				throws Exception {
			super(baseURI, oclDocName, metaModelManager);
		}
		
		
		public OCL2QVTiBrokerTester(URI baseURI, String oclDocName, OCL metaModelManager, boolean middleFolded)
				throws Exception {
			super(baseURI, oclDocName, metaModelManager, middleFolded);
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
	
	private static class ModuleAccessibleEtlTask extends EtlTask {

		private List<Variable> parameters = new ArrayList<Variable>();
		
		public ModuleAccessibleEtlTask(java.net.URI etlSourceURI) {
			super(etlSourceURI);
		}
		
		public void addParameter(Variable parameter){
			parameters.add(parameter);
		}
		
		@Override
		public void preProcess() {
			super.preProcess();
			for (Variable param : parameters)
				module.getContext().getFrameStack().put(param);
		}
	}
	
	private MyQVT myQVT;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		QVTimperativeStandaloneSetup.doSetup();		
		CompleteOCLStandaloneSetup.doSetup(); // To be able to add QVTimperative.ocl validation
		
		myQVT = createQVT();
		QVTiEnvironmentFactory factory = myQVT.getEnvironmentFactory(); 
		factory.setEvaluationTracingEnabled(true);
		PivotMetamodelManager metamodelManager = factory.getMetamodelManager();
		metamodelManager.configureLoadFirstStrategy(); // Since the models might use a different URI to refer the same meta-model
		
	}
	
	protected @NonNull MyQVT createQVT() {
		return new MyQVT(new QVTiEnvironmentFactory(new StandaloneProjectMap()));
	}
	
	@After
	public void tearDown() throws Exception {
		myQVT.dispose();
		super.tearDown();
	}
	
	@Test
	public void testExample1_OCL2QVTp() throws Exception {

		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example1/");
		String oclDocURI = baseURI.appendSegment("Source2Target.oclas").toString();
		String qvtpFileURI = baseURI.appendSegment("Source2Target.qvtp.qvtias").toString();
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(baseURI, "Source2Target.qvtc", myQVT);
		mtc.runOCL2QVTp_MiddleFolded(oclDocURI, qvtpFileURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	@Test
	public void testExample1_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example1");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(baseURI,"Source2Target.oclas", myQVT);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());
    	assertValidQVTiModel(txURI);
    	
    	// Not working see Bug 458152
    	//launchQVTs2GraphMlTx(mtc.getsModel(), baseURI.appendSegment("Source2Target_complete").toString(), false);
    	//launchQVTs2GraphMlTx(mtc.getsModel(), baseURI.appendSegment("Source2Target_pruned").toString(), true);
		
    	QVTiPivotEvaluator testEvaluator =  new QVTiPivotEvaluator(myQVT.getEnvironmentFactory(), qvtiTransf.getTransformation());
		URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("model1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("model1_output.xmi");
    	URI expectedAsModelURI = samplesBaseUri.appendSegment("model1_output_ref.xmi");
    	
    	testEvaluator.saveTransformation(null);
        testEvaluator.loadModel("leftCS", csModelURI);
        testEvaluator.createModel("rightAS", asModelURI, null);
        testEvaluator.execute();
        testEvaluator.saveModels();
        testEvaluator.dispose();
                
        ResourceSet rSet = myQVT.getResourceSet();
        Resource expected =  rSet.getResource(expectedAsModelURI, true);
        assertSameModel(expected, rSet.getResource(asModelURI, true));
	}
	
	
	@Test
	public void testExample2_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(baseURI, "classescs2as.oclas", myQVT);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());		
    	assertValidQVTiModel(txURI);
    	QVTiPivotEvaluator testEvaluator = myQVT.createEvaluator(qvtiTransf.getTransformation());

//		//MetamodelManager newMManager = new QVTiEnvironmentFactory(null, null).createMetamodelManager();
//    	URI txURI = baseURI.appendSegment("classescs2as.qvtias");
//    	Transformation t = getTransformation(metamodelManager.getASResourceSet(), txURI);
//    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(metamodelManager, t);
   	
    	
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
                
        ResourceSet rSet = myQVT.getResourceSet();
        Resource expected =  rSet.getResource(expectedAsModelURI, true);
        assertSameModel(expected, rSet.getResource(asModelURI, true));
	}
	
	@Test
	public void testExample3_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example3");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(baseURI, "KiamaRewrite.oclas", myQVT);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = ClassUtil.nonNullState(qvtiTransf.getResource().getURI());
    	assertValidQVTiModel(txURI);
    	QVTiPivotEvaluator testEvaluator = myQVT.createEvaluator(qvtiTransf.getTransformation());
    	
    	URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("model1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("model1_output.xmi");
    	URI expectedAsModelURI = samplesBaseUri.appendSegment("model1_output_ref.xmi");
    	
    	
    	testEvaluator.saveTransformation(null);
        testEvaluator.loadModel("leftCS", csModelURI);
        testEvaluator.createModel("rightAS", asModelURI, null);
        testEvaluator.execute();
        testEvaluator.saveModels();
        testEvaluator.dispose();
                
        ResourceSet rSet = myQVT.getResourceSet();
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
				
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
		String oclDocURI = baseURI.appendSegment("classescs2as.oclas").toString();
		String qvtpFileURI = baseURI.appendSegment("classescs2as.qvtp.qvtias").toString();
		String tracesMMURI = baseURI.appendSegment("classescs2as.ecore.oclas").toString();
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(baseURI, "classescs2as.oclas", myQVT, false);
		mtc.runOCL2QVTp_MiddleModel(oclDocURI, qvtpFileURI, tracesMMURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	@Test
	public void testExample2_OCL2QVTp_MiddleFolded() throws Exception {
				
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
		String oclDocURI = baseURI.appendSegment("classescs2as.oclas").toString();
		String qvtpFileURI = baseURI.appendSegment("classescs2as.qvtp.qvtias").toString();
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(baseURI, "classescs2as.oclas", myQVT, false);
		mtc.runOCL2QVTp_MiddleFolded(oclDocURI, qvtpFileURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	
	protected static void assertValidModel(@NonNull URI asURI) {
		EnvironmentFactory factory =  OCL.createEnvironmentFactory(new StandaloneProjectMap());
        ResourceSet asResourceSet = factory.getResourceSet();
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
	    
		EnvironmentFactory factory =  OCL.createEnvironmentFactory(new StandaloneProjectMap());
		/* FIXME Validating QVTi models are causing problems. Not researched.
		MetamodelManager.Internal mManager = factory.getMetamodelManager(); 
        mManager.configureLoadFirstStrategy();
		
		URI oclURI = ClassUtil.nonNullState(URI.createPlatformResourceURI("/org.eclipse.qvtd.pivot.qvtimperative/model/QVTimperative.ocl", true));

		CompleteOCLEObjectValidator validator = new CompleteOCLEObjectValidator(ClassUtil.nonNullState(QVTcoreBasePackage.eINSTANCE), oclURI, factory);
		validator.initialize();
		PivotEObjectValidator.install(ClassUtil.nonNullState(factory.getResourceSet()), factory);
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTbasePackage.eINSTANCE));
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTcoreBasePackage.eINSTANCE));
		PivotEObjectValidator.install(ClassUtil.nonNullState(QVTimperativePackage.eINSTANCE));*/
		
		assertValidModel(asURI, factory.getResourceSet());
	}
	
	// Copied from QVTiCompilerTest
	protected Class<? extends AbstractTransformationExecutor> generateCode(@NonNull Transformation transformation, URI genModelURI, @Nullable String savePath) throws Exception {

		registerGenModels(myQVT.getResourceSet(), myQVT.getMetamodelManager(), genModelURI);
				
		QVTiCodeGenerator cg = new QVTiCodeGenerator(myQVT.getEnvironmentFactory(), transformation);
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
	
	protected void registerGenModels(ResourceSet rSet, MetamodelManager.Internal mManager, URI genModelURI) {
		
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
	
	
	private void launchQVTs2GraphMlTx(PivotModel qvtsModel, String graphMlURI, boolean pruneQVTs) throws QvtMtcExecutionException {
		
		try {
			// Since pruning might modify QVTs model, we will ensure it's not stored on disposal
			qvtsModel.setStoredOnDisposal(false);
			ModuleAccessibleEtlTask etl = new ModuleAccessibleEtlTask(MtcBroker.class.getResource("extras/QVTsToGraphML.etl").toURI());
			XmlModel graphMl = createGraphMlModel(graphMlURI);
			etl.addModel(qvtsModel);
			etl.addModel(graphMl);
			etl.addParameter(new Variable("pruneModel", pruneQVTs, EolPrimitiveType.Boolean));
			etl.execute();
		} catch (URISyntaxException e) {
			throw new QvtMtcExecutionException("Exception launching QVTs 2 GraphMl transformation", e);
		}
		
	}
	
	private XmlModel createGraphMlModel(String graphMlURI) throws QvtMtcExecutionException {
		
		try {
			XmlModel xmlModel = new XmlModel();
		    StringProperties properties = new StringProperties();
		    properties.put(XmlModel.PROPERTY_NAME, "GML");
		    properties.put(XmlModel.PROPERTY_ALIASES, "GML");
		    properties.put(XmlModel.PROPERTY_MODEL_FILE, graphMlURI);
		    properties.put(XmlModel.PROPERTY_XSD_FILE, "schema/ygraphml.xsd");
		    properties.put(XmlModel.PROPERTY_READONLOAD, "false");
		    properties.put(XmlModel.PROPERTY_STOREONDISPOSAL, "true");
		    xmlModel.load(properties);
		    return xmlModel;
		} catch (EolModelLoadingException e) {
			throw new QvtMtcExecutionException("Error loading graphml transformation", e);
		}
		
	}
}
