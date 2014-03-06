package ocldependencyanalysis.graphml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ocldependencyanalysis.Analysis;
import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.IGraph;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.qvtd.build.etl.graph.Graph;
import org.eclipse.qvtd.build.etl.graph.GraphPackage;

public class GraphmlGenerator {

	
	public static void main(String[] args) {
				
		if (args.length != 2) {
			printUsage();
			return;
		}
		try {
			generateGraphmlFile(URI.createURI(args[0]), args[1]);
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
		
	
	/**
	 * @param inputOclDocUri input Complete OCL document URI. e.g. file:/C:/temp/myOCLdocument.ocl
	 * @param outputGaprhmlFilePath output Graphml model path. e.g. C:/temp/myGraph.graphml
	 * 
	 * @throws Exception from  {@link AbstractEolLauncher#execute()}
	 */
	public static void generateGraphmlFile(URI inputOclDocUri, final String outputGaprhmlFilePath ) throws Exception  {
		// URI uri = URI.createURI("platform:/resource/oclDependencyAnalysis.tests/src/ocldependencyanalysis/tests/SMM1d.ocl");
		IGraph<FeatureObj> graph = Analysis.createFeaturesDependencyGraph(inputOclDocUri);
		
		System.out.println(graph.toString());
		Graph graphModel = Graph2GraphModel.createGraphModel(graph);
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".aninmemoryoclresource", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.createResource(URI.createURI("input.inmemoryoclresource"));
		resource.getContents().add(graphModel);	
		

		AbstractEolLauncher launcher = new AbstractEolLauncher() {

			// TODO improve the Standalone Epsilon Launcher to avoid having the a duplicated eol script  
			@Override
			public String getSource() throws Exception {
				return "GraphToGraphML.eol";
			}
			
			@Override
			public List<IModel> getModels() throws Exception {
				
				List<IModel> models = new ArrayList<IModel>();
				models.add(new InMemoryEmfModel("graph", 
						resource, Collections.<EPackage>singletonList(GraphPackage.eINSTANCE)));
				models.add(createXmlModel("gml",
						outputGaprhmlFilePath,
						"D:/Eclipse/eclipse-modeling-luna-M4/workspace_luna_QVTo/org.eclipse.qvtd.build.etl.extras/schema/ygraphml.xsd",
						false, true));
				return models;
			}
			
			@Override
			public IEolExecutableModule createModule() {
				return new EolModule();
			}
		};
		

		launcher.execute();
	}
	
	private static final void printUsage() {
		System.out.println("Program args:");
		System.out.println("    1. input Complete OCL document URI. e.g. file:/C:/temp/myOCLdocument.ocl");
		System.out.println("    2. output Graphml model path. e.g C:/temp/myGraph.graphml");
	}
}
