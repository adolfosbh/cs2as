package oclDependencyAnalysis.qvt;

import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.build.etl.QvtMtcExecutionException;

public class OCL2QVTiBroker extends MtcBroker {

	public OCL2QVTiBroker(String qvtcasUri, Class owner, MetaModelManager metaModelManager)
			throws QvtMtcExecutionException {
		super(qvtcasUri, owner, metaModelManager);
	}
	
	
	
	@Override
	public void execute() throws QvtMtcExecutionException {
		loadConfigurationModel();
		loadOclStdLibModel();
		createContainmentTrees();
		
		pModel = createModel(partitionUri, "QVTp", "QVT", QVTI_FULL_NS, true, true, true);		
		sModel = qvtpToQvts(pModel);
		qvtpScheduling(pModel, sModel);
		iModel = qvtpQvtsToQvti(pModel, sModel);
	}
	

}
