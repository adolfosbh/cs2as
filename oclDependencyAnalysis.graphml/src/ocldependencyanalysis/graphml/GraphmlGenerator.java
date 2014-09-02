package ocldependencyanalysis.graphml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ocldependencyanalysis.CS2ASAnalysisGraphComputer;
import ocldependencyanalysis.DependencyAnalysis;
import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graphml.providers.CS2ASAnalysisTypeProvider;
import ocldependencyanalysis.graphml.providers.FeatureDependenciesTypeProvider;
import ocldependencyanalysis.graphml.providers.TypeDependenciesTypeProvider;

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
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.qvtd.build.etl.graph.Graph;
import org.eclipse.qvtd.build.etl.graph.GraphPackage;

public class GraphmlGenerator {

	
	public static void main(String[] args) {
				
		if (args.length != 4) {
			printUsage();
			return;
		}
		try {
			Boolean bothVersions = null;
			if ("PRUNED_AND_FULL".equalsIgnoreCase(args[1]))
				bothVersions = true;
			else if ("PRUNED_ONLY".equalsIgnoreCase(args[1])) {
				bothVersions = false;
			} else {
				printUsage();
				return;
			}
			
			if ("TYPE".equalsIgnoreCase(args[0]))
				generateClassDependencyGraphmlFile(URI.createURI(args[2]), args[3]);
			else if ("FEATURE".equalsIgnoreCase(args[0]))
				generateFeaturesDependencyGraphmlFile(URI.createURI(args[2]), args[3]);
			else if ("CS2ASAnalysis".equalsIgnoreCase(args[0]))
				generateCS2ASAnalysisGraphmlFile(URI.createURI(args[2]), args[3], bothVersions);
			else 
				printUsage();
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
	public static void generateFeaturesDependencyGraphmlFile(URI inputOclDocUri, String outputGaprhmlFilePath ) throws Exception  {
		IGraph<FeatureObj> graph = DependencyAnalysis.createFeatureDependencyGraph(inputOclDocUri);
		
		System.out.println(graph.toString());
		Graph graphModel = Graph2GraphModel.createSpecificGraphModel(graph, new FeatureDependenciesTypeProvider());
		launchGraph2GraphMLScript(graphModel, outputGaprhmlFilePath);
	}
	
	public static void generateCS2ASAnalysisGraphmlFile(URI inputOclDocUri, String outputGaprhmlFilePath, boolean bothVersions ) throws Exception  {
		
		if (bothVersions) {
			generateCS2ASAnalysisGraphmlFile(inputOclDocUri, outputGaprhmlFilePath.replaceFirst("(\\.[^.]*$)", "_pruned$1"));
			CS2ASAnalysisGraphComputer.CLEAN_GRAPH = false;
			generateCS2ASAnalysisGraphmlFile(inputOclDocUri, outputGaprhmlFilePath.replaceFirst("(\\.[^.]*$)", "_full$1"));
			CS2ASAnalysisGraphComputer.CLEAN_GRAPH = true;
		} else {
			generateCS2ASAnalysisGraphmlFile(inputOclDocUri, outputGaprhmlFilePath);
		}
		
	}
	
	public static void generateCS2ASAnalysisGraphmlFile(URI inputOclDocUri, String outputGaprhmlFilePath) throws Exception {		
		IGraph<CS2ASAnalysisNode> graph = DependencyAnalysis.createCS2ASAnalysisGraph(inputOclDocUri);
		
		System.out.println(graph.toString());
		Graph graphModel = Graph2GraphModel.createSpecificGraphModel(graph, new CS2ASAnalysisTypeProvider(graph));
		launchGraph2GraphMLScript(graphModel, outputGaprhmlFilePath);
	}
	
	/**
	 * @param inputOclDocUri input Complete OCL document URI. e.g. file:/C:/temp/myOCLdocument.ocl
	 * @param outputGaprhmlFilePath output Graphml model path. e.g. C:/temp/myGraph.graphml
	 * 
	 * @throws Exception from  {@link AbstractEolLauncher#execute()}
	 */
	public static void generateClassDependencyGraphmlFile(URI inputOclDocUri, String outputGaprhmlFilePath ) throws Exception  {
		IGraph<Type> graph = DependencyAnalysis.createTypeDependencyGraph(inputOclDocUri);
				
		System.out.println(graph.toString());
		Graph graphModel = Graph2GraphModel.createSpecificGraphModel(graph, new TypeDependenciesTypeProvider(graph));
		launchGraph2GraphMLScript(graphModel, outputGaprhmlFilePath);
	}
	
	
	private static void launchGraph2GraphMLScript(Graph graphModel, final String outputGaprhmlFilePath) throws Exception{
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".aninmemoryoclresource", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.createResource(URI.createURI("input.aninmemoryoclresource"));
		resource.getContents().add(graphModel);	
		

		AbstractEolLauncher launcher = new AbstractEolLauncher() {
		
			@Override
			public String getSource() throws Exception {
				return "transf/GraphToGraphML.eol";
			}
			
			@Override
			public List<IModel> getModels() throws Exception {
				
				List<IModel> models = new ArrayList<IModel>();
				models.add(new InMemoryEmfModel("graph", 
						resource, Collections.<EPackage>singletonList(GraphPackage.eINSTANCE)));
				models.add(createXmlModel("gml",
						outputGaprhmlFilePath,
						getClass().getResource("schema/ygraphml.xsd").getPath(),
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
		System.out.println("    1. TYPE (for class dependencies graph) or FEATURE (for features dependencies graph) or CS2ASAnalysis (CS2AS analysis graph)");
		System.out.println("    2. PRUNED_AND_FULL (generate pruned and complete graph version) or PRUNED_ONLY (generate pruned version only");
		System.out.println("    3. input Complete OCL document URI. e.g. file:/C:/temp/myOCLdocument.ocl");
		System.out.println("    4. output Graphml model path. e.g C:/temp/myGraph.graphml");
		
	}
}
