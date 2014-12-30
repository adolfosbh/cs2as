package oclDependencyAnalysis.qvt;

import java.net.URISyntaxException;

import oclDependencyAnalysis.qvt.tests.OCL2QVTiTestCases;
import oclDependencyAnalysis.qvt.tests.PivotModelUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.pivot.manager.MetaModelManager;
import org.eclipse.qvtd.build.etl.EtlTask;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.PivotModel;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;

/**
 * This is a quick extension of the MtcBroker, to exercise the OCL2QVTi code in test cases
 * 
 * @author asbh500
 * 
 */
public class OCL2QVTiBroker extends MtcBroker {

	private static final String OCLSTDLIB_URI = "http://www.eclipse.org/ocl/2015/Library.oclas";
	
	private static final String ECORE_URI = "http://www.eclipse.org/emf/2002/Ecore";
	
	private static final String PIVOT_URI = "http://www.eclipse.org/ocl/2015/Pivot";
	
	private static final String QVTB_URI ="http://www.eclipse.org/qvt/2015/QVTbase";
	
	private static final String QVTCB_URI = "http://www.eclipse.org/qvt/2015/QVTcoreBase";
	
	private static final String QVTI_URI = "http://www.eclipse.org/qvt/2015/QVTimperative";
		
	private static final String QVTI_FULL_NS = QVTI_URI + ',' + QVTCB_URI + ',' +  QVTB_URI + ',' +  PIVOT_URI;
	
	private static final String TRACES_FULL_NS = PIVOT_URI + ',' + ECORE_URI;
	
	private String oclDocUri;
	private String tracesMMUri;
	private PivotModelUtil pmUtil;
	
	public OCL2QVTiBroker(String oclDocUri, Class<?> owner, MetaModelManager metaModelManager)
			throws QvtMtcExecutionException {
		super(oclDocUri, owner, metaModelManager);
		this.pmUtil = new PivotModelUtil(metaModelManager);
		this.oclDocUri = oclDocUri;
					
		URI baseUri = URI.createURI(oclDocUri).trimFileExtension();
		this.tracesMMUri = baseUri.appendFileExtension("ecore.oclas").toString();
	}
	
	@Override
	public void execute() throws QvtMtcExecutionException {
		
		pModel = runOCL2QVTp(oclDocUri, partitionUri, tracesMMUri);
		
		loadOclStdLibModel();
		loadConfigurationModel();
		createContainmentTrees();
		sModel = qvtpToQvts(pModel);
		qvtpScheduling(pModel, sModel);
		iModel = qvtpQvtsToQvti(pModel, sModel);
	}
	
	
	protected PivotModel runOCL2QVTp (String oclDocURI, String qvtiFileURI, String tracesMMURI) throws QvtMtcExecutionException {

		String oclDocModelName = "OCL";
		PivotModel oclModel = pmUtil.createPivotModel(oclDocURI, oclDocModelName, "", PIVOT_URI, true, false, true, true, true);
		
		String qvtiModelName = "QVTp";
		String qvtiModelAlises = "QVTi,QVT"; // FIXME further steps should configure the aliases
		PivotModel pModel = pmUtil.createPivotModel(qvtiFileURI, qvtiModelName, qvtiModelAlises, QVTI_FULL_NS, false, true, false, true, true);
		
		String tracesMModelName = "MiddleMM";
		PivotModel tracesMM = pmUtil.createPivotModel(tracesMMURI, tracesMModelName, "", TRACES_FULL_NS , true, false, true, false, true);
		
		String oclStdlibName = "OclStdLib";
		PivotModel oclStdlib = pmUtil.createPivotModel(OCLSTDLIB_URI, oclStdlibName, "", PIVOT_URI, true, false, true, false, true);		
		
		EtlTask etl;
		try {
			etl = new EtlTask(OCL2QVTiTestCases.class.getResource("/oclDependencyAnalysis/qvt/ocl2qvtp.etl").toURI());
			etl.addModel(oclModel);
			etl.addModel(pModel);
			etl.addModel(tracesMM);
			etl.addModel(oclStdlib);
			etl.execute();

		} catch (URISyntaxException e) {
			throw new QvtMtcExecutionException("Exception launching OCL 2 QVTp transformation", e);
		}
		
		return pModel;
	}
}
