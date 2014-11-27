package oclDependencyAnalysis.qvt.tests;

import java.lang.reflect.Constructor;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.codegen.qvti.QVTiCodeGenOptions;
import org.eclipse.qvtd.codegen.qvti.java.QVTiCodeGenerator;
import org.eclipse.qvtd.pivot.qvtbase.Transformation;
import org.eclipse.qvtd.pivot.qvtbase.TypedModel;
import org.eclipse.qvtd.pivot.qvtimperative.ImperativeModel;
import org.eclipse.qvtd.pivot.qvtimperative.evaluation.QVTiPivotEvaluator;
import org.eclipse.qvtd.xtext.qvtbase.tests.LoadTestCase;
import org.eclipse.qvtd.xtext.qvtimperative.QVTimperativeStandaloneSetup;
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
	
//	private MetaModelManager metaModelManager; 
//	private ResourceSet rSet;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		OCLstdlib.install();
		//QVTcorePivotStandaloneSetup.doSetup();
		QVTimperativeStandaloneSetup.doSetup();
		//QVTimperativePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
				
		resourceSet = new ResourceSetImpl();
		metaModelManager = new MetaModelManager(resourceSet);
		metaModelManager.configureLoadFirstStrategy(); // Since the models will a different URI to refer the same meta-model
	}
	
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		// metaModelManager.dispose();		
	}
	
	@Test
	public void testExample1_Interpreted() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/"); 		
		
		String oclDocUri = baseURI.appendSegment("classescs2as.oclas").toString(); 

    	MtcBroker mtc = new OCL2QVTiBroker(oclDocUri, this.getClass(), metaModelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	Transformation transformation = qvtiTransf.getTransformation();
    	URI txURI = DomainUtil.nonNullState(transformation.eResource().getURI());
    	assertValidModel(txURI);
    			
    	URI samplesBaseUri = baseURI.appendSegment("samples");
    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
    	URI middleModelURI = samplesBaseUri.appendSegment("example1_middle.xmi");
    	URI expectedAsModelURI = samplesBaseUri.appendSegment("example1_output_expected.xmi");

    	// ensurePivot2EcoreConversion(metaModelManager, transformation);
    	
        QVTiPivotEvaluator testEvaluator = new QVTiPivotEvaluator(DomainUtil.nonNullState(metaModelManager), transformation);
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
	
	@Test
	public void testExample1_CG() throws Exception {
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/");
		URI oclDocUri = baseURI.appendSegment("classescs2as.oclas");

    	MtcBroker mtc = new OCL2QVTiBroker(oclDocUri.toString(), this.getClass(), metaModelManager);
    	mtc.execute();
    	PivotModel qvtiTransf = mtc.getiModel();
    	Transformation transformation = qvtiTransf.getTransformation();
    	
    	URI txURI = DomainUtil.nonNullState(transformation.eResource().getURI());
    	assertValidModel(txURI);
    	
    	//
    	// Generate the transformation java code
    	// 

		URI middleGenModelURI= oclDocUri.trimFileExtension().appendFileExtension("genmodel");
		Class<? extends AbstractTransformation> txClass = generateCode(transformation, middleGenModelURI, "/oclDependencyAnalysis.qvt/tests-gen/");
    	
		
		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(DomainEvaluator.class);
		DomainEvaluator evaluator = new TxEvaluator(DomainUtil.nonNullState(metaModelManager));
		AbstractTransformation tx = txConstructor.newInstance(evaluator);
		
		//
		// Execute the transformation
		//
		metaModelManager.configureLoadFirstStrategy(); // Since the models havea different URI to refer the same meta-model
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
	
	public void testExample1_CGv2() throws Exception {
		
		URI baseURI = URI.createURI("platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2");
		URI txURI = baseURI.appendSegment("classescs2as.qvtias");		
		URI middleGenModelURI = txURI.trimFileExtension().appendFileExtension("genmodel");
		assertValidModel(txURI);
		
		//
    	// Generate the transformation java code
    	//
		Resource resource = resourceSet.getResource(txURI, true);
		Class<? extends AbstractTransformation> txClass=null;
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof ImperativeModel) {
				for (org.eclipse.ocl.examples.pivot.Package pPackage : ((ImperativeModel)eObject).getNestedPackage()) {
					if (pPackage instanceof Transformation) {
						txClass = generateCode((Transformation) pPackage,  middleGenModelURI, "../oclDependencyAnalysis.qvt/tests-gen/");
					}
				}
			}
		}
    	
    	
		
		//
		// Execute the transformation
		//
		metaModelManager.configureLoadFirstStrategy(); // Since the models havea different URI to refer the same meta-model
		Constructor<? extends AbstractTransformation> txConstructor = txClass.getConstructor(DomainEvaluator.class);
		DomainEvaluator evaluator = new TxEvaluator(DomainUtil.nonNullState(metaModelManager));
		AbstractTransformation tx = txConstructor.newInstance(evaluator);
		
    	URI samplesBaseUri = baseURI.appendSegment("sample");
    	URI csModelURI = samplesBaseUri.appendSegment("example1_input.xmi");
    	URI asModelURI = samplesBaseUri.appendSegment("example1_output.xmi");
		Resource inputResource = resourceSet.getResource(csModelURI, true);
		tx.addRootObjects("leftCS", DomainUtil.nonNullState(inputResource.getContents()));
		tx.run();
		Resource outputResource = resourceSet.createResource(asModelURI);
		outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
		outputResource.save(null);
	}
	
	
		
	@Test
	public void testOCL2QVTp_classesExample() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas";
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtp.qvtias";
		String tracesMMURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.ecore.oclas";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metaModelManager);
		mtc.runOCL2QVTp(oclDocURI, qvtpFileURI, tracesMMURI);
		// Test the QVTp transformation can be loaded
    	assertValidModel(URI.createURI(qvtpFileURI));
	}
	
	
	protected static void assertValidModel(@NonNull URI asURI) {
        ResourceSet asResourceSet = new ResourceSetImpl();
        MetaModelManager.initializeASResourceSet(asResourceSet);
        Resource resource = asResourceSet.getResource(asURI, true);
        EcoreUtil.resolveAll(resource);
        assertNoUnresolvedProxies("Validating a resource: " + asURI.toString(), resource);
        assertNoResourceErrors("Loading a resource" + asURI.toString(), resource);
        assertNoValidationErrors("Loading a resource" + asURI.toString(), resource);
	}
	
	// Copied from QVTiCompilerTest
	protected Class<? extends AbstractTransformation> generateCode(@NonNull Transformation transformation, URI genModelURI, @Nullable String savePath) throws Exception {

		registerGenModels(resourceSet, metaModelManager, genModelURI);
		ensurePivot2EcoreConversion(metaModelManager, transformation);
				
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

	protected void ensurePivot2EcoreConversion(MetaModelManager mManager, Transformation t) {
		for (TypedModel tModel : t.getModelParameter()) {
			for (org.eclipse.ocl.examples.pivot.Package _package : tModel.getUsedPackage()) {
				mManager.getEcoreOfPivot(EPackage.class, _package);
			}
		}
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
