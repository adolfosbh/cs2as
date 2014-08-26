package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ocldependencyanalysis.Computation;
import ocldependencyanalysis.ComputationType;
import ocldependencyanalysis.IActionNode;
import ocldependencyanalysis.IInfoNode;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeLineStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class ComputationDependenciesTypeProvider implements  IElementTypeProvider<Computation>{
	
	static final List<String> infoNodeColours = new ArrayList<>();	
	{infoNodeColours.add("#FF00FF"); // PINK
	 infoNodeColours.add("#99CCFF"); // BLUE
	 infoNodeColours.add("#FFFFFF"); // DEFAULT - White
	} 
	
	private Map<Package, GraphMLNodeType> package2InfoNodes= new HashMap<Package, GraphMLNodeType>();
	
	//FF00FF - PINK (input)
	//99CCFF - Blue (output)
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType actionNode;
	
	private GraphMLEdgeType actionInput;
	private GraphMLEdgeType actionOutput;
	private GraphMLEdgeType infoInheritance;

	public ComputationDependenciesTypeProvider(IGraph<Computation> graph) {
		
		List<Package> involvedPackages = new ArrayList<Package>();		
		for (INode<Computation> node : graph.getNodes()) {
			Package pPackage = getContainingPackage(node.getObject().getReferredElement());
			if (!involvedPackages.contains(pPackage)) {
				involvedPackages.add(pPackage);	
			}
		}
		elementTypes = new ArrayList<ElementType>();
		
		for (int i = 0; i < involvedPackages.size(); i++) {
			int index = i >= infoNodeColours.size() ? infoNodeColours.size() - 1 : i; 
			GraphMLNodeType infoNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
			infoNode.setName("infoNode"+i);
			infoNode.setColor(infoNodeColours.get(index));
			infoNode.setShape(ShapeType.RECTANGLE);	
			
			package2InfoNodes.put(involvedPackages.get(i), infoNode);
			elementTypes.add(infoNode);
		}
	
		actionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		actionNode.setName("actionNode");
		actionNode.setColor("#FF6600");
		actionNode.setShape(ShapeType.ELLIPSE);
		
		actionInput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionInput.setName("actionInput");
		actionInput.setColor("#00FF00");
		actionInput.setLineStyle(EdgeLineStyle.LINE);
		
		actionOutput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionOutput.setName("actionOutput");
		actionOutput.setColor("#000000");
		actionOutput.setLineStyle(EdgeLineStyle.LINE);
		
		infoInheritance = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		infoInheritance.setName("actionOutput");
		infoInheritance.setColor("#000000");
		infoInheritance.setLineStyle(EdgeLineStyle.DOTTED);
		
		elementTypes.add(actionNode);
		elementTypes.add(actionInput);
		elementTypes.add(actionOutput);
		elementTypes.add(infoInheritance);
	}

	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<Computation> node) {
		Computation computation = node.getObject();
		
		if (computation instanceof IActionNode) {
			return actionNode;
		} else if (computation instanceof IInfoNode){
			Package pPackage = getContainingPackage(computation.getReferredElement());
			return package2InfoNodes.get(pPackage);
		} else {
			throw new IllegalStateException("Unexpected computation element");
		}
	}

	@Override
	public EdgeType getEdgeType(IEdge<Computation> edge) {
		
		// For the time being, an edge between ast operations are dotted
		Computation fromComp = edge.getFrom().getObject();
		Computation toComp = edge.getTo().getObject();
		if (fromComp instanceof IActionNode) {
			return actionOutput;
		} else if (toComp instanceof IActionNode) {
			return actionInput;
		} else if (fromComp instanceof ComputationType &&
					toComp instanceof ComputationType){
			return infoInheritance;
		}
		
		// else default edge style
		return null;
	}
	
	private Package getContainingPackage(Element element) {		
		EObject container = element.eContainer();
		while (container != null) {
			if (container instanceof Package) {
				Package pPackage = (Package)container;
				return (Package) PivotUtil.findMetaModelManager(pPackage).getPrimaryPackage(pPackage);
			}
			container = container.eContainer();
		}
		return null;
	}
}