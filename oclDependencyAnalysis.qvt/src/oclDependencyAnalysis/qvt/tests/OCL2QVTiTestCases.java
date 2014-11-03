package oclDependencyAnalysis.qvt.tests;

import static org.junit.Assert.*;

import java.net.URL;

import oclDependencyAnalysis.qvt.OCL2QVTiBroker;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.qvtd.build.etl.MtcBroker;
import org.eclipse.qvtd.pivot.qvtcore.QVTcorePivotStandaloneSetup;
import org.eclipse.qvtd.pivot.qvtimperative.QVTimperativePivotStandaloneSetup;
import org.junit.Before;
import org.junit.Test;

public class OCL2QVTiTestCases {

	private MetaModelManager metaModelManager; 
	private ResourceSet rSet;
	
	@Before
	public void setUp() throws Exception {
		QVTcorePivotStandaloneSetup.doSetup();
		QVTimperativePivotStandaloneSetup.doSetup();
		OCLstdlib.install();
				
		rSet = new ResourceSetImpl();
		metaModelManager = new MetaModelManager();
        MetaModelManagerResourceSetAdapter.getAdapter(DomainUtil.nonNullState(rSet), metaModelManager);
	}

	@Test
	public void test() throws Exception {
				
		String qvtcasUri = "platform:/resource/oclDependencyAnalysis.qvt/src/oclDependencyAnalysis/qvt/tests/models/example2/classescs2as.qvtc"; 

    	MtcBroker mtc = new OCL2QVTiBroker(qvtcasUri, this.getClass(), metaModelManager);
    	mtc.execute();
    	
    	System.out.println("finished!!!");
	}

}
