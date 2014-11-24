package oclDependencyAnalysis.qvt.tests;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.junit.Before;
import org.junit.Test;

public class OCL2QVTiTestCases {
	
	static class OCL2QVTiBrokerTester extends OCL2QVTiBroker {

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
	
	private MetaModelManager metaModelManager; 
	private ResourceSet rSet;
	
	@Before
	public void setUp() throws Exception {
		OCLstdlib.install();
		QVTcorePivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		
				
		rSet = new ResourceSetImpl();
		metaModelManager = new MetaModelManager(rSet);
	}
	
	@Test
	public void test() throws Exception {
				
		String oclDocUri = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas"; 

    	MtcBroker mtc = new OCL2QVTiBroker(oclDocUri, this.getClass(), metaModelManager);
    	mtc.execute();
    	
    	System.out.println("finished!!!");
	}
		
	@Test
	public void testOCL2QVTp_classesExample() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.oclas";
		
		String qvtpFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtp.qvtias";
		
		String tracesMMURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.ecore.oclas";
		
		OCL2QVTiBrokerTester mtc = new OCL2QVTiBrokerTester(oclDocURI, this.getClass(), metaModelManager);
		
		mtc.runOCL2QVTp(oclDocURI, qvtpFileURI, tracesMMURI);
		
		// Testing nothing for the time being. Just to be able to debug java code.
	}
	
	
	
}
