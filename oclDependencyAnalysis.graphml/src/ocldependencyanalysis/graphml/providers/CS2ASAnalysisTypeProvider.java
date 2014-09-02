package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ocldependencyanalysis.NameResoPropertyObj;
import ocldependencyanalysis.cs2asanalysis.ActionNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartAction;
import ocldependencyanalysis.cs2asanalysis.InfoNode;
import ocldependencyanalysis.cs2asanalysis.OperationAction;
import ocldependencyanalysis.cs2asanalysis.PropertyRef;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.IGraph;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeLineStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class CS2ASAnalysisTypeProvider implements  IElementTypeProvider<CS2ASAnalysisNode>{
	
	static final List<String> infoNodeColours = new ArrayList<>();	
	{infoNodeColours.add("#FF00FF"); // PINK
	 infoNodeColours.add("#99CCFF"); // BLUE
	 infoNodeColours.add("#FFFFFF"); // DEFAULT - White
	} 
	
	private Map<String, GraphMLNodeType> packageName2InfoNodes= new HashMap<String, GraphMLNodeType>();
	
	//FF00FF - PINK (input)
	//99CCFF - Blue (output)
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType cstElementActionNode;
	private GraphMLNodeType astElementActionNode;
	
	private GraphMLNodeType attributePropertyActionNode;
	private GraphMLNodeType containmentPropertyActionNode;
	private GraphMLNodeType nonContainmentPropertyActionNode;

	private GraphMLNodeType containmentNameResoPropertyActionNode;
	private GraphMLNodeType nonContainmentNameResoPropertyActionNode;
	
	private GraphMLEdgeType actionInput;
	private GraphMLEdgeType actionOutput;
	private GraphMLEdgeType infoAggregation;
//	private GraphMLEdgeType bidirectionalOpposite;

	public CS2ASAnalysisTypeProvider(IGraph<CS2ASAnalysisNode> graph) {
		
		List<String> involvedPackages = new ArrayList<String>();		
		for (INode<CS2ASAnalysisNode> node : graph.getNodes()) {
			String pPackage = getContainingPackageName(node.getObject().getReferredElement());
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
		
		containmentNameResoPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		containmentNameResoPropertyActionNode.setName("containmentNameResoPropertyAction");
		containmentNameResoPropertyActionNode.setColor("#FF6600");
		containmentNameResoPropertyActionNode.setShape(ShapeType.HEXAGON);
		
		nonContainmentNameResoPropertyActionNode = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		nonContainmentNameResoPropertyActionNode.setName("nonContainmentNameResoPropertyAction");
		nonContainmentNameResoPropertyActionNode.setColor("#FFFF00");
		nonContainmentNameResoPropertyActionNode.setShape(ShapeType.HEXAGON);
		
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
		elementTypes.add(attributePropertyActionNode);
		elementTypes.add(containmentPropertyActionNode);
		elementTypes.add(containmentNameResoPropertyActionNode);
		elementTypes.add(nonContainmentPropertyActionNode);
		elementTypes.add(nonContainmentNameResoPropertyActionNode);		
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
		CS2ASAnalysisNode computation = node.getObject();
		
		if (computation instanceof ActionNode) {
			if (computation instanceof NameResoPropertyObj) {
				// TODO
//				Property prop = (Property) featureObj.getFeature();
//				if (prop.isComposite()) {
//					return astContainmentNameResoProperty;
//				} else {
//					return astNonContainmentNameResoProperty;
//				}
				return null;
			} else {			
				if (computation instanceof OperationAction) {
					Operation operation = ((OperationAction)computation).getOperation();
					if ("ast".equals(operation.getName()))
						return astElementActionNode;
					else if ("cst".equals(operation.getName())) 
						return cstElementActionNode;
					else
						return null;
				} if (computation instanceof ConstructorPartAction) {
					Property prop = ((ConstructorPartAction) computation).getProperty();
					if (prop.getOpposite() == null) { 	// FIXME how to know that a prop is Class attribute or an Association end ?
														// This is not ideal, but seems reasonably working
						return attributePropertyActionNode;
					} else if (prop.isComposite()) {
						return containmentPropertyActionNode;
					} else {
						return nonContainmentPropertyActionNode;
					}
				} else {
					throw new IllegalStateException("Unexpected computation element");
				}
			}			
			
		} else if (computation instanceof InfoNode){
			String pPackage = getContainingPackageName(computation.getReferredElement());
			return packageName2InfoNodes.get(pPackage);
		} else {
			throw new IllegalStateException("Unexpected computation element");
		}
	}

	@Override
	public EdgeType getEdgeType(IEdge<CS2ASAnalysisNode> edge) {
		
		// For the time being, an edge between ast operations are dotted
		CS2ASAnalysisNode fromComp = edge.getFrom().getObject();
		CS2ASAnalysisNode toComp = edge.getTo().getObject();
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
	
	private String getContainingPackageName(Element element) {		
		EObject container = element.eContainer();
		while (container != null) {
			if (container instanceof Package) {
				return ((Package)container).getName();
//				Package pPackage = (Package)container;
//				return (Package) PivotUtil.findMetaModelManager(pPackage).getPrimaryPackage(pPackage);				
			}
			container = container.eContainer();
		}
		return null;
	}
}
