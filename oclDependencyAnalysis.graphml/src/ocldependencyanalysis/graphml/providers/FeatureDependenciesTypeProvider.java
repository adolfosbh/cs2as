package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.List;

import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.NameResoPropertyObj;
import ocldependencyanalysis.graph.IEdge;
import ocldependencyanalysis.graph.INode;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.EdgeLineStyle;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLEdgeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class FeatureDependenciesTypeProvider implements  IElementTypeProvider<FeatureObj>{
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType astOperation;
	private GraphMLNodeType astContainmentProperty;
	private GraphMLNodeType astNonContainmentProperty;
	// private GraphMLNodeType astOppositeProperty;	
	private GraphMLNodeType astContainmentNameResoProperty;
	private GraphMLNodeType astNonContainmentNameResoProperty;
	
	private GraphMLEdgeType astOutgoingToConstructionOperation;

	public FeatureDependenciesTypeProvider() {
		elementTypes = new ArrayList<ElementType>();
		astOperation = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astOperation.setName("AstOperation");
		astOperation.setColor("#FF0000");
		astOperation.setShape(ShapeType.ELLIPSE);
		
		astContainmentProperty = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astContainmentProperty.setName("ContainmentASproperty");
		astContainmentProperty.setColor("#FF6600");
		astContainmentProperty.setShape(ShapeType.ELLIPSE);
		
		astNonContainmentProperty = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astNonContainmentProperty.setName("NonContainmentASproperty");
		astNonContainmentProperty.setColor("#FFFF00");
		astNonContainmentProperty.setShape(ShapeType.ELLIPSE);
		
		astContainmentNameResoProperty = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astContainmentNameResoProperty.setName("ContainmentASNameResoProperty");
		astContainmentNameResoProperty.setColor("#FF6600");
		astContainmentNameResoProperty.setShape(ShapeType.HEXAGON);
		
		astNonContainmentNameResoProperty = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astNonContainmentNameResoProperty.setName("NonContainmentASNameResoProperty");
		astNonContainmentNameResoProperty.setColor("#FFFF00");
		astNonContainmentNameResoProperty.setShape(ShapeType.HEXAGON);

		astOutgoingToConstructionOperation = GraphmltypesFactory.eINSTANCE.createGraphMLEdgeType();
		astOutgoingToConstructionOperation.setName("astOutgoingToConstructionOperation");
		astOutgoingToConstructionOperation.setLineStyle(EdgeLineStyle.DOTTED);
		
		elementTypes.add(astOperation);
		elementTypes.add(astContainmentProperty);
		elementTypes.add(astNonContainmentProperty);
		elementTypes.add(astContainmentNameResoProperty);
		elementTypes.add(astNonContainmentNameResoProperty);
		elementTypes.add(astOutgoingToConstructionOperation);
	}

	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<FeatureObj> node) {
		FeatureObj featureObj = node.getObject();
		
		if (featureObj instanceof NameResoPropertyObj) {
			Property prop = (Property) featureObj.getFeature();
			if (prop.isComposite()) {
				return astContainmentNameResoProperty;
			} else {
				return astNonContainmentNameResoProperty;
			}
			
		} else {
			Feature feature = featureObj.getFeature();
			if (feature instanceof Operation) {
				return astOperation;
			} else {
				Property prop = (Property) feature;
				if (prop.isComposite()) {
					return astContainmentProperty;
				} else {
					return astNonContainmentProperty;
				}
			}
		}
	}

	@Override
	public EdgeType getEdgeType(IEdge<FeatureObj> edge) {
		
		// For the time being, an edge between ast operations are dotted
		FeatureObj fromFeature = edge.getFrom().getObject();
		FeatureObj toFeature = edge.getTo().getObject();
		if (fromFeature.getFeature() instanceof Operation &&
			toFeature.getFeature() instanceof Operation) {
			return astOutgoingToConstructionOperation;
		}
		// else default edge style
		return null;
	}
}
