package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ocldependencyanalysis.cs2asanalysis.ActionNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartAction;
import ocldependencyanalysis.cs2asanalysis.InfoNode;
import ocldependencyanalysis.cs2asanalysis.OperationRef;
import ocldependencyanalysis.cs2asanalysis.PropertyRef;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Graph;
import ocldependencyanalysis.graph2.Node;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeLineStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class CS2ASAnalysisTypeProvider implements  IElementTypeProvider<CS2ASAnalysisNode>{
	
	private static final List<String> infoNodeColours = new ArrayList<>();	
	static {
	 infoNodeColours.add("#FF00FF"); // PINK
	 infoNodeColours.add("#99CCFF"); // BLUE
	 infoNodeColours.add("#FFFFFF"); // DEFAULT - White
	}
	
	private Map<String, GraphMLNodeType> packageName2InfoNodes= new HashMap<String, GraphMLNodeType>();
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType cstElementActionNode;
	private GraphMLNodeType astElementActionNode;
	private GraphMLNodeType envActionNode;
	
	private GraphMLNodeType attributePropertyActionNode;
	private GraphMLNodeType containmentPropertyActionNode;
	private GraphMLNodeType nonContainmentPropertyActionNode;

	private GraphMLNodeType attributeLookupPropertyActionNode;
	private GraphMLNodeType containmentLookupPropertyActionNode;
	private GraphMLNodeType nonContainmentLookupPropertyActionNode;
	
	private GraphMLEdgeType actionInput;
	private GraphMLEdgeType actionOutput;
	private GraphMLEdgeType infoAggregation;
//	private GraphMLEdgeType bidirectionalOpposite;

	public CS2ASAnalysisTypeProvider(Graph graph) {
		
		List<String> involvedPackages = new ArrayList<String>();		
		for (Node node : graph.getNodes()) {
			String pPackage = getAssociatedPackageName(((CS2ASAnalysisNode)node));
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
			
			packageName2InfoNodes.put(involvedPackages.get(i), infoNode);
			elementTypes.add(infoNode);
		}
	
		astElementActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astElementActionNode.setName("AstOperation");
		astElementActionNode.setColor("#FF0000");
		astElementActionNode.setShape(ShapeType.ELLIPSE);
		
		cstElementActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		cstElementActionNode.setName("CstOperation");
		cstElementActionNode.setColor("#00FF00");
		cstElementActionNode.setShape(ShapeType.ELLIPSE);
		
		envActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		envActionNode.setName("EnvOperation");
		envActionNode.setColor("#AA7755");
		envActionNode.setShape(ShapeType.ELLIPSE);
		
		attributePropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		attributePropertyActionNode.setName("attributePropertyAction");
		attributePropertyActionNode.setColor("#0000EE");
		attributePropertyActionNode.setShape(ShapeType.ELLIPSE);
		
		containmentPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		containmentPropertyActionNode.setName("containmentPropertyAction");
		containmentPropertyActionNode.setColor("#FF6600");
		containmentPropertyActionNode.setShape(ShapeType.ELLIPSE);
		
		nonContainmentPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		nonContainmentPropertyActionNode.setName("nonContainmentPropertyAction");
		nonContainmentPropertyActionNode.setColor("#FFFF00");
		nonContainmentPropertyActionNode.setShape(ShapeType.ELLIPSE);
		
		attributeLookupPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		attributeLookupPropertyActionNode.setName("attributeLookupPropertyActionNode");
		attributeLookupPropertyActionNode.setColor("#0000EE");
		attributeLookupPropertyActionNode.setShape(ShapeType.HEXAGON);
		
		containmentLookupPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		containmentLookupPropertyActionNode.setName("containmentNameResoPropertyAction");
		containmentLookupPropertyActionNode.setColor("#FF6600");
		containmentLookupPropertyActionNode.setShape(ShapeType.HEXAGON);
		
		nonContainmentLookupPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		nonContainmentLookupPropertyActionNode.setName("nonContainmentNameResoPropertyAction");
		nonContainmentLookupPropertyActionNode.setColor("#FFFF00");
		nonContainmentLookupPropertyActionNode.setShape(ShapeType.HEXAGON);
		
		actionInput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionInput.setName("actionInput");
		actionInput.setColor("#00FF00");
		actionInput.setLineStyle(EdgeLineStyle.LINE);
		
		actionOutput = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		actionOutput.setName("actionOutput");
		actionOutput.setColor("#000000");
		actionOutput.setLineStyle(EdgeLineStyle.LINE);
		
		infoAggregation = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		infoAggregation.setName("infoAggregation");
		infoAggregation.setColor("#000000");
		infoAggregation.setLineStyle(EdgeLineStyle.DOTTED);
		
//		bidirectionalOpposite = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
//		bidirectionalOpposite.setName("bidirectionalOpposite");
//		bidirectionalOpposite.setColor("#000000");
//		bidirectionalOpposite.setLineStyle(EdgeLineStyle.LINE);
//		bidirectionalOpposite.setFromStyle(EdgeEndStyle.STANDARD);
		
//		elementTypes.add(bidirectionalOpposite);
		elementTypes.add(astElementActionNode);
		elementTypes.add(cstElementActionNode);
		elementTypes.add(envActionNode);
		elementTypes.add(attributePropertyActionNode);
		elementTypes.add(attributeLookupPropertyActionNode);
		elementTypes.add(containmentPropertyActionNode);
		elementTypes.add(containmentLookupPropertyActionNode);
		elementTypes.add(nonContainmentPropertyActionNode);
		elementTypes.add(nonContainmentLookupPropertyActionNode);		
		elementTypes.add(actionInput);
		elementTypes.add(actionOutput);
		elementTypes.add(infoAggregation);
	}

	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<CS2ASAnalysisNode> node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodeType getNodeType(Node node) {

		if (node instanceof ActionNode) {
			if (node instanceof OperationRef) {
				Operation operation = ((OperationRef)node).getOperation();
				if ("ast".equals(operation.getName()))
					return astElementActionNode;
				else if ("cst".equals(operation.getName())) 
					return cstElementActionNode;
				else if (operation.getName().contains("_env"))
					return envActionNode;
			} if (node instanceof ConstructorPartAction) {
				ConstructorPartAction action = (ConstructorPartAction) node; 
				Property prop = action.getProperty();
				if (prop.getOpposite() == null) { 	// FIXME how to know that a prop is Class attribute or an Association end ?
													// This is not ideal, but seems reasonably working
					if (action.getNeedsLookup()) {
						return attributeLookupPropertyActionNode;
					} else {
						return attributePropertyActionNode;
					}
				} else if (prop.isIsComposite()) {
					if (action.getNeedsLookup()) {
						return containmentLookupPropertyActionNode;
					} else {
						return containmentPropertyActionNode;
					}
				} else {
					if (action.getNeedsLookup()) {
						return nonContainmentLookupPropertyActionNode;
					} else {
						return nonContainmentPropertyActionNode;
					}
				}
			} else {
				throw new IllegalStateException("Unexpected computation element: " + node.toString());
			}
			
		} else if (node instanceof InfoNode){
			String pPackage = getAssociatedPackageName(((CS2ASAnalysisNode)node));
			return packageName2InfoNodes.get(pPackage);
		} else {
			throw new IllegalStateException("Unexpected computation element: " + node.toString());
		}
	}
	@Override
	public EdgeType getEdgeType(IEdge<CS2ASAnalysisNode> edge) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public EdgeType getEdgeType(Edge edge) {
		
		// For the time being, an edge between ast operations are dotted
		Node fromComp = edge.getFrom();
		Node toComp = edge.getTo();
		if (fromComp instanceof ActionNode
			|| toComp instanceof ActionNode) {
			return actionOutput;
//		} else if (toComp instanceof ActionNode) {
//			return actionInput;
		} else if (fromComp instanceof PropertyRef &&
				toComp instanceof PropertyRef) {
			PropertyRef fromProp = (PropertyRef) fromComp;
			PropertyRef toProp = (PropertyRef) toComp;
			if (fromProp.getProperty() == toProp.getProperty()) {  // must be aggregation/inheritance link
				return infoAggregation;
			}
		} else if (fromComp instanceof InfoNode &&
					toComp instanceof InfoNode){
			return infoAggregation;
		}
		
		// else default edge style
		return null;
	}
	private String getAssociatedPackageName(CS2ASAnalysisNode node) {		
		return node.getAssociatedPackage().getName();
	}
}
