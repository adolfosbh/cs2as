package ocldependencyanalysis.graphml.providers;

import java.util.ArrayList;
import java.util.List;

import ocldependencyanalysis.FeatureObj;
import ocldependencyanalysis.IEdge;
import ocldependencyanalysis.INode;
import ocldependencyanalysis.OppositePropertyObj;
import ocldependencyanalysis.graphml.IElementTypeProvider;

import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.qvtd.build.etl.graph.EdgeType;
import org.eclipse.qvtd.build.etl.graph.ElementType;
import org.eclipse.qvtd.build.etl.graph.NodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphMLNodeType;
import org.eclipse.qvtd.build.etl.graphmltypes.GraphmltypesFactory;
import org.eclipse.qvtd.build.etl.graphmltypes.ShapeType;

public class AttributeDependenciesTypeProvider implements  IElementTypeProvider<FeatureObj>{
	
	private List<ElementType> elementTypes;	
	private GraphMLNodeType astOperation;
	private GraphMLNodeType astContainmentProperty;
	private GraphMLNodeType astNonContainmentProperty;
	private GraphMLNodeType astOppositeProperty;
	
	public AttributeDependenciesTypeProvider() {
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
		
		astOppositeProperty = GraphmltypesFactory.eINSTANCE.createGraphMLNodeType();
		astOppositeProperty.setName("ComputedOppositeASproperty");
		astOppositeProperty.setColor("#50B4FF");
		astOppositeProperty.setShape(ShapeType.ELLIPSE);
		
		elementTypes.add(astOperation);
		elementTypes.add(astContainmentProperty);
		elementTypes.add(astNonContainmentProperty);
		elementTypes.add(astOppositeProperty);
	}

	@Override
	public List<ElementType> getProvidedElementTypes() {
		return elementTypes;
	}

	@Override
	public NodeType getNodeType(INode<FeatureObj> node) {
		FeatureObj featureObj = node.getObject();
		
		if (featureObj instanceof OppositePropertyObj) {
			return astOppositeProperty;
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
		// TODO
		return null;
	}
}
