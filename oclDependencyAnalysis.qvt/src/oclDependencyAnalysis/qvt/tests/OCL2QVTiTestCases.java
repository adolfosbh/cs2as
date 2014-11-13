package oclDependencyAnalysis.qvt.tests;

import java.net.URISyntaxException;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.qvtd.build.etl.EtlTask;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.junit.Before;
import org.junit.Test;

public class OCL2QVTiTestCases {

	protected static final String ECORE_URI = "http://www.eclipse.org/emf/2002/Ecore";
	
	protected static final String PIVOT_URI = "http://www.eclipse.org/ocl/3.1.0/Pivot";
	
	protected static final String QVTB_URI ="http://www.eclipse.org/qvt/0.9/QVTbase";
	
	protected static final String QVTCB_URI = "http://www.eclipse.org/qvt/0.9/QVTcoreBase";
	
	protected static final String QVTC_URI = "http://www.eclipse.org/qvt/0.9/QVTcore";
	
	protected static final String QVTI_URI = "http://www.eclipse.org/qvt/0.9/QVTimperative";
		
	protected static final String QVTI_FULL_NS = QVTI_URI + ',' + QVTCB_URI + ',' +  QVTB_URI + ',' +  PIVOT_URI;
	
	protected static final String TRACES_FULL_NS = PIVOT_URI + ',' + ECORE_URI;
	
	private MetaModelManager metaModelManager; 
	private ResourceSet rSet;
	private PivotModelUtil pmUtil;
	
	@Before
	public void setUp() throws Exception {
		OCLstdlib.install();
		QVTcorePivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		
				
		rSet = new ResourceSetImpl();
		metaModelManager = new MetaModelManager();
		pmUtil = new PivotModelUtil(metaModelManager);
        MetaModelManagerResourceSetAdapter.getAdapter(DomainUtil.nonNullState(rSet), metaModelManager);
	}

	public void test() throws Exception {
				
		String qvtcasUri = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtc"; 

    	MtcBroker mtc = new OCL2QVTiBroker(qvtcasUri, this.getClass(), metaModelManager);
    	mtc.execute();
    	
    	System.out.println("finished!!!");
	}
		
	@Test
	public void testOCL2QVTi_classesExample() throws Exception {
				
		String oclDocURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/ClassesCS2Classes.ocl.oclas";
		
		String qvtiFileURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.output.qvtp.qvtias";
		
		String tracesMMURI = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/ClassesCS2ClassesAS.ecore.oclas";
		
		runOCL2QVTi(oclDocURI, qvtiFileURI, tracesMMURI);
		
		// Testing nothing for the time being. Just to be able to debug java code.
	}
	
	@Test
	protected void runOCL2QVTi (String oclDocURI, String qvtiFileURI, String tracesMMURI) throws QvtMtcExecutionException, URISyntaxException {

		String oclDocModelName = "OCL";
		PivotModel oclModel = pmUtil.createPivotModel(oclDocURI, oclDocModelName, "", PIVOT_URI, true, false, true, true);
		
		String qvtiModelName = "QVTi";
		PivotModel qvtiModel = pmUtil.createPivotModel(qvtiFileURI, qvtiModelName, "", QVTI_FULL_NS, false, true, false, true);
		
		String tracesMModelName = "MiddleMM";
		PivotModel tracesMM = pmUtil.createPivotModel(tracesMMURI, tracesMModelName, "", TRACES_FULL_NS , true, false, true, true);
		
		EtlTask eol = new EtlTask(OCL2QVTiTestCases.class.getResource("/oclDependencyAnalysis/qvt/ocl2qvti.etl").toURI());
		eol.addModel(oclModel);
		eol.addModel(qvtiModel);
		eol.addModel(tracesMM);
		eol.execute();
	}
}
