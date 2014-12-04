package oclDependencyAnalysis.qvt.tests;

import java.lang.reflect.Constructor;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.dynamic.OCL2JavaFileObject;
import org.eclipse.ocl.examples.domain.evaluation.AbstractTransformation;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.codegen.qvti.QVTiCodeGenOptions;
import org.eclipse.qvtd.codegen.qvti.java.QVTiCodeGenerator;
import org.eclipse.qvtd.pivot.qvtbase.QVTbasePackage;
import org.eclipse.qvtd.pivot.qvtbase.Transformation;
import org.eclipse.qvtd.pivot.qvtcorebase.QVTcoreBasePackage;
import org.eclipse.qvtd.pivot.qvtimperative.ImperativeModel;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePackage;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiPivotEvaluator;
import org.eclipse.qvtd.xtext.qvtbase.tests.LoadTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OCL2QVTiTestCases extends LoadTestCase {
	
	// For testing purpose
	private static class OCL2QVTiBrokerTester extends OCL2QVTiBroker {

		public OCL2QVTiBrokerTester(String oclDocUri, Class<?> owner, MetaModelManager metaModelManager)
				throws QvtMtcExecutionException {
			super(oclDocUri, owner, metaModelManager);
		}
		
		// For testing purpose
		@Override
		protected PivotModel runOCL2QVTp(String oclDocURI, String qvtiFileURI, String tracesMMURI)
				throws QvtMtcExecutionException {
			return super.runOCL2QVTp(oclDocURI, qvtiFileURI, tracesMMURI);
		}
	}
	
	private static final class TxEvaluator extends ExecutorManager {
		private TxEvaluator(@NonNull MetaModelManager metaModelManager) {
			super(metaModelManager);
		}

		@NonNull
		public DomainEvaluator createNestedEvaluator() {
			throw new UnsupportedOperationException();
		}

		@NonNull
		public IdResolver getIdResolver() {
			return ((MetaModelManager)standardLibrary).getIdResolver();
		}

		@NonNull
		public DomainModelManager getModelManager() {
			throw new UnsupportedOperationException();
		}
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
		QVTimperativePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup(); // To be able to add QVTimperative.ocl validation
				
		resourceSet = new ResourceSetImpl();
		metaModelManager = new MetaModelManager(resourceSet);
		metaModelManager.configureLoadFirstStrategy(); // Since the models might use a different URI to refer the same meta-model
	}
	
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		// metaModelManager.dispose();		
	}
	
	@Test
	public void testExample1_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2"); 		
		URI oclDocUri = baseURI.appendSegment("classescs2as.oclas");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metaModelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	URI txURI = DomainUtil.nonNullState(qvtiTransf.getResource().getURI());		
    	assertValidQVTiModel(txURI);
    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(metaModelManager, qvtiTransf.getTransformation());
    	    	
    	// Execute the transformation with a clean resourceSet and MetaModelManager
//    	ResourceSet localRSet = new ResourceSetImpl();
//    	MetaModelManager newMManager = new MetaModelManager(localRSet);
//    	URI txURI = baseURI.appendSegment("classescs2as.qvtias");
//    	assertValidModel(txURI);
//    	Transformation t = getTransformation(localRSet, txURI);    	
//    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(newMManager, t);
    	
    	
		URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
    	URI middleModelURI = samplesBaseUri.appendSegment("example1_middle.xmi");
    	URI expectedAsModelURI = samplesBaseUri.appendSegment("example1_output_expected.xmi");
    	
    	
//    	QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(DomainUtil.nonNullState(metaModelManager), qvtiTransf.getTransformation());
    	testEvaluator.saveTransformation(null);
        testEvaluator.loadModel("leftCS", csModelURI);
        testEvaluator.createModel("rightAS", asModelURI, null);
        testEvaluator.createModel("middle", middleModelURI, null);
        testEvaluator.execute();
        testEvaluator.saveModels();
        testEvaluator.dispose();
                
        Resource expected =  resourceSet.getResource(expectedAsModelURI, true);
        assertSameModel(expected, resourceSet.getResource(asModelURI, true));
	}
	
//	FIXME commented until 	
	@Test
	public void testExample1_CG() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/");
		URI oclDocUri = baseURI.appendSegment("classescs2as.oclas");

		OCL2QVTiBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metaModelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	
    	URI txURI = DomainUtil.nonNullState(qvtiTransf.getResource().getURI());
    	assertValidQVTiModel(txURI);
    	
    	//
    	// Generate the transformation java code
    	// 
		URI middleGenModelURI= oclDocUri.trimFileExtension().appendFileExtension("genmodel");
		Class<? extends AbstractTransformation> txClass = generateCode(qvtiTransf.getTransformation(), middleGenModelURI, "/oclDependencyAnalysis.qvt/tests-gen/");
    	
		
		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(DomainEvaluator.class);
		DomainEvaluator evaluator = new TxEvaluator(DomainUtil.nonNullState(metaModelManager));
		AbstractTransformation tx = txConstructor.newInstance(evaluator);
		
		//
		// Execute the transformation
		//
    	URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
		Resource inputResource = resourceSet.getResource(csModelURI, true);
		tx.addRootObjects("leftCS", DomainUtil.nonNullState(inputResource.getContents()));
		tx.run();
		Resource outputResource = resourceSet.createResource(asModelURI);
		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
		outputResource.save(null);
	}
	
//	public void testExample1_CGv2() throws Exception {
//		
//		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
//		URI txURI = baseURI.appendSegment("classescs2as.qvtias");		
//		URI middleGenModelURI = txURI.trimFileExtension().appendFileExtension("genmodel");
//		assertValidModel(txURI);
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
//		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(DomainEvaluator.class);
//		DomainEvaluator evaluator = new TxEvaluator(DomainUtil.nonNullState(metaModelManager));
//		AbstractTransformation tx = txConstructor.newInstance(evaluator);
//		
//    	URI samplesBaseUri = baseURI.appendSegment("sample");
//    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
//    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
//		Resource inputResource = resourceSet.getResource(csModelURI, true);
//		tx.addRootObjects("leftCS", DomainUtil.nonNullState(inputResource.getContents()));
//		tx.run();
//		Resource outputResource = resourceSet.createResource(asModelURI);
//		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
//		outputResource.save(null);
//	}
	
	
		
	@Test
	public void testOCL2QVTp_classesExample() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas";
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtp.qvtias";
		String tracesMMURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.ecore.oclas";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metaModelManager);
		mtc.runOCL2QVTp(oclDocURI, qvtpFileURI, tracesMMURI);
		// Test the QVTp transformation can be loaded
		assertValidQVTiModel(URI.createURI(qvtpFileURI));
	}
	
	
	protected static void assertValidModel(@NonNull URI asURI) {
        ResourceSet asResourceSet = new ResourceSetImpl();
        MetaModelManager.initializeASResourceSet(asResourceSet);
        assertValidModel(asURI, asResourceSet);
	}
	
	protected static void assertValidModel(URI asURI, ResourceSet rSet) {
		Resource resource = rSet.getResource(asURI, true);
        EcoreUtil.resolveAll(resource);
	        
		String rUriString = resource.getURI().toString();
		assertNoUnresolvedProxies("Validating a resource: " + rUriString, resource);
        assertNoResourceErrors("Loading a resource" + rUriString, resource);
        assertNoValidationErrors("Loading a resource" + rUriString, resource);
	}
	
	protected static void assertValidQVTiModel(@NonNull URI asURI ) {
	    
		ResourceSet asResourceSet = new ResourceSetImpl();
		MetaModelManager mManager = new MetaModelManager(asResourceSet);
		mManager.configureLoadFirstStrategy();
		
		URI oclURI = DomainUtil.nonNullState(URI.createPlatformResourceURI("/org.eclipse.qvtd.pivot.qvtimperative/model/QVTimperative.ocl", true));

		CompleteOCLEObjectValidator validator = new CompleteOCLEObjectValidator(DomainUtil.nonNullState(QVTcoreBasePackage.eINSTANCE), oclURI, mManager);
		validator.initialize();
		PivotEObjectValidator.install(DomainUtil.nonNullState(asResourceSet), DomainUtil.nonNullState(mManager));
		PivotEObjectValidator.install(DomainUtil.nonNullState(QVTbasePackage.eINSTANCE));
		PivotEObjectValidator.install(DomainUtil.nonNullState(QVTcoreBasePackage.eINSTANCE));
		PivotEObjectValidator.install(DomainUtil.nonNullState(QVTimperativePackage.eINSTANCE));
		
		assertValidModel(asURI, asResourceSet);
	}
	
	// Copied from QVTiCompilerTest
	protected Class<? extends AbstractTransformation> generateCode(@NonNull Transformation transformation, URI genModelURI, @Nullable String savePath) throws Exception {

		registerGenModels(resourceSet, metaModelManager, genModelURI);
				
		QVTiCodeGenerator cg = new QVTiCodeGenerator(DomainUtil.nonNullState(metaModelManager), transformation);
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
				for (org.eclipse.ocl.examples.pivot.Package pPackage : ((ImperativeModel)eObject).getNestedPackage()) {
					if (pPackage instanceof Transformation) {
						return  (Transformation) pPackage;
					}
				}
			}
		}
		return null;
	}
	
	protected void registerGenModels(ResourceSet rSet, MetaModelManager mManager, URI genModelURI) {
		
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
	public Class<? extends AbstractTransformation> compileTransformation(@NonNull QVTiCodeGenerator cg) throws Exception {
		String qualifiedName = cg.getQualifiedName();
		String javaCodeSource = cg.generateClassFile();
		try {
			Class<?> txClass = OCL2JavaFileObject.loadClass(qualifiedName, javaCodeSource);
			return (Class<? extends AbstractTransformation>) txClass;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
}
