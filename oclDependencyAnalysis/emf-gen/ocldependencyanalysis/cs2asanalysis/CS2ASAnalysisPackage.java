/**
 */
package ocldependencyanalysis.cs2asanalysis;

import ocldependencyanalysis.graph2.GraphPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface CS2ASAnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs2asanalysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.ac.york.cs/cs2asanalysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs2asana";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CS2ASAnalysisPackage eINSTANCE = ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisNode()
	 * @generated
	 */
	int CS2AS_ANALYSIS_NODE = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__INCOMING = GraphPackage.NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__OUTGOING = GraphPackage.NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__GRAPH = GraphPackage.NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__CONTEXT = GraphPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE = GraphPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE_FEATURE_COUNT = GraphPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___HASH_CODE = GraphPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___EQUALS__OBJECT = GraphPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___TO_STRING = GraphPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE_OPERATION_COUNT = GraphPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisEdgeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisEdge()
	 * @generated
	 */
	int CS2AS_ANALYSIS_EDGE = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE__TO = GraphPackage.EDGE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE__FROM = GraphPackage.EDGE__FROM;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE__GRAPH = GraphPackage.EDGE__GRAPH;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE_FEATURE_COUNT = GraphPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE___HASH_CODE = GraphPackage.EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE___EQUALS__OBJECT = GraphPackage.EDGE___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_EDGE_OPERATION_COUNT = GraphPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisGraphImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisGraph()
	 * @generated
	 */
	int CS2AS_ANALYSIS_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_GRAPH__NODES = GraphPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_GRAPH__EDGES = GraphPackage.GRAPH__EDGES;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_GRAPH_FEATURE_COUNT = GraphPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_GRAPH_OPERATION_COUNT = GraphPackage.GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__INCOMING = CS2AS_ANALYSIS_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__OUTGOING = CS2AS_ANALYSIS_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__GRAPH = CS2AS_ANALYSIS_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__ASSOCIATED_PACKAGE = CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___HASH_CODE = CS2AS_ANALYSIS_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___EQUALS__OBJECT = CS2AS_ANALYSIS_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

	/**
	 * The number of operations of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl <em>Info Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getInfoNode()
	 * @generated
	 */
	int INFO_NODE = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE__INCOMING = CS2AS_ANALYSIS_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE__OUTGOING = CS2AS_ANALYSIS_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE__GRAPH = CS2AS_ANALYSIS_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE__ASSOCIATED_PACKAGE = CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Info Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE_FEATURE_COUNT = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___HASH_CODE = CS2AS_ANALYSIS_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___EQUALS__OBJECT = CS2AS_ANALYSIS_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

	/**
	 * The number of operations of the '<em>Info Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl <em>Operation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getOperationRef()
	 * @generated
	 */
	int OPERATION_REF = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__INCOMING = CS2AS_ANALYSIS_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__OUTGOING = CS2AS_ANALYSIS_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__GRAPH = CS2AS_ANALYSIS_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__ASSOCIATED_PACKAGE = CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__OPERATION = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_FEATURE_COUNT = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF___HASH_CODE = CS2AS_ANALYSIS_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF___EQUALS__OBJECT = CS2AS_ANALYSIS_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

	/**
	 * The number of operations of the '<em>Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedOperationRefImpl <em>Extended Operation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedOperationRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedOperationRef()
	 * @generated
	 */
	int EXTENDED_OPERATION_REF = 6;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__INCOMING = OPERATION_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__OUTGOING = OPERATION_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__GRAPH = OPERATION_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__CONTEXT = OPERATION_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__ASSOCIATED_PACKAGE = OPERATION_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__OPERATION = OPERATION_REF__OPERATION;

	/**
	 * The feature id for the '<em><b>Operation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF__OPERATION_CLASS = OPERATION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF_FEATURE_COUNT = OPERATION_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF___HASH_CODE = OPERATION_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF___EQUALS__OBJECT = OPERATION_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF___TO_STRING = OPERATION_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Extended Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_REF_OPERATION_COUNT = OPERATION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getPropertyRef()
	 * @generated
	 */
	int PROPERTY_REF = 7;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__INCOMING = CS2AS_ANALYSIS_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__OUTGOING = CS2AS_ANALYSIS_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__GRAPH = CS2AS_ANALYSIS_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__ASSOCIATED_PACKAGE = CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__PROPERTY = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_FEATURE_COUNT = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___HASH_CODE = CS2AS_ANALYSIS_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___EQUALS__OBJECT = CS2AS_ANALYSIS_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

	/**
	 * The number of operations of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyRefImpl <em>Extended Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedPropertyRef()
	 * @generated
	 */
	int EXTENDED_PROPERTY_REF = 8;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__INCOMING = PROPERTY_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__OUTGOING = PROPERTY_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__GRAPH = PROPERTY_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__CONTEXT = PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__ASSOCIATED_PACKAGE = PROPERTY_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__PROPERTY = PROPERTY_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF__PROPERTY_CLASS = PROPERTY_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF_FEATURE_COUNT = PROPERTY_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF___HASH_CODE = PROPERTY_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF___EQUALS__OBJECT = PROPERTY_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF___TO_STRING = PROPERTY_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Extended Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_REF_OPERATION_COUNT = PROPERTY_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl <em>Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getClassRef()
	 * @generated
	 */
	int CLASS_REF = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__INCOMING = CS2AS_ANALYSIS_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__OUTGOING = CS2AS_ANALYSIS_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__GRAPH = CS2AS_ANALYSIS_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__ASSOCIATED_PACKAGE = CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__CLASS = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_FEATURE_COUNT = CS2AS_ANALYSIS_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF___HASH_CODE = CS2AS_ANALYSIS_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF___EQUALS__OBJECT = CS2AS_ANALYSIS_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

	/**
	 * The number of operations of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropRefImpl <em>Constructor Part Prop Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartPropRef()
	 * @generated
	 */
	int CONSTRUCTOR_PART_PROP_REF = 10;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__INCOMING = PROPERTY_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__OUTGOING = PROPERTY_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__GRAPH = PROPERTY_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__CONTEXT = PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__ASSOCIATED_PACKAGE = PROPERTY_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__PROPERTY = PROPERTY_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Constructor Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART = PROPERTY_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Part Prop Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF_FEATURE_COUNT = PROPERTY_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF___HASH_CODE = PROPERTY_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF___EQUALS__OBJECT = PROPERTY_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF___TO_STRING = PROPERTY_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Constructor Part Prop Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF_OPERATION_COUNT = PROPERTY_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ClassInfoImpl <em>Class Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ClassInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getClassInfo()
	 * @generated
	 */
	int CLASS_INFO = 11;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__INCOMING = CLASS_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__OUTGOING = CLASS_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__GRAPH = CLASS_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__CONTEXT = CLASS_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__ASSOCIATED_PACKAGE = CLASS_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__CLASS = CLASS_REF__CLASS;

	/**
	 * The number of structural features of the '<em>Class Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO_FEATURE_COUNT = CLASS_REF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO___HASH_CODE = CLASS_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO___EQUALS__OBJECT = CLASS_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO___TO_STRING = CLASS_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Class Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO_OPERATION_COUNT = CLASS_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorExpClassInfoImpl <em>Constructor Exp Class Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorExpClassInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorExpClassInfo()
	 * @generated
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO = 12;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__INCOMING = CLASS_INFO__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__OUTGOING = CLASS_INFO__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__GRAPH = CLASS_INFO__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__CONTEXT = CLASS_INFO__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__ASSOCIATED_PACKAGE = CLASS_INFO__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__CLASS = CLASS_INFO__CLASS;

	/**
	 * The feature id for the '<em><b>Constructor Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP = CLASS_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Exp Class Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO_FEATURE_COUNT = CLASS_INFO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO___HASH_CODE = CLASS_INFO___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO___EQUALS__OBJECT = CLASS_INFO___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO___TO_STRING = CLASS_INFO___TO_STRING;

	/**
	 * The number of operations of the '<em>Constructor Exp Class Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO_OPERATION_COUNT = CLASS_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartActionImpl <em>Constructor Part Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartActionImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartAction()
	 * @generated
	 */
	int CONSTRUCTOR_PART_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__INCOMING = CONSTRUCTOR_PART_PROP_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__OUTGOING = CONSTRUCTOR_PART_PROP_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__GRAPH = CONSTRUCTOR_PART_PROP_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__CONTEXT = CONSTRUCTOR_PART_PROP_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__ASSOCIATED_PACKAGE = CONSTRUCTOR_PART_PROP_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__PROPERTY = CONSTRUCTOR_PART_PROP_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Constructor Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__CONSTRUCTOR_PART = CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART;

	/**
	 * The feature id for the '<em><b>Needs Lookup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__NEEDS_LOOKUP = CONSTRUCTOR_PART_PROP_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Part Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION_FEATURE_COUNT = CONSTRUCTOR_PART_PROP_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION___HASH_CODE = CONSTRUCTOR_PART_PROP_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION___EQUALS__OBJECT = CONSTRUCTOR_PART_PROP_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION___TO_STRING = CONSTRUCTOR_PART_PROP_REF_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor Part Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION_OPERATION_COUNT = CONSTRUCTOR_PART_PROP_REF_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropertyInfoImpl <em>Constructor Part Property Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropertyInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartPropertyInfo()
	 * @generated
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO = 14;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl <em>Extended Property Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedPropertyInfo()
	 * @generated
	 */
	int EXTENDED_PROPERTY_INFO = 15;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__INCOMING = EXTENDED_PROPERTY_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__OUTGOING = EXTENDED_PROPERTY_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__GRAPH = EXTENDED_PROPERTY_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__CONTEXT = EXTENDED_PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__ASSOCIATED_PACKAGE = EXTENDED_PROPERTY_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__PROPERTY = EXTENDED_PROPERTY_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__PROPERTY_CLASS = EXTENDED_PROPERTY_REF__PROPERTY_CLASS;

	/**
	 * The number of structural features of the '<em>Extended Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO_FEATURE_COUNT = EXTENDED_PROPERTY_REF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___HASH_CODE = EXTENDED_PROPERTY_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___EQUALS__OBJECT = EXTENDED_PROPERTY_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___TO_STRING = EXTENDED_PROPERTY_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Extended Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO_OPERATION_COUNT = EXTENDED_PROPERTY_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__INCOMING = EXTENDED_PROPERTY_INFO__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__OUTGOING = EXTENDED_PROPERTY_INFO__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__GRAPH = EXTENDED_PROPERTY_INFO__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__CONTEXT = EXTENDED_PROPERTY_INFO__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__ASSOCIATED_PACKAGE = EXTENDED_PROPERTY_INFO__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__PROPERTY = EXTENDED_PROPERTY_INFO__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__PROPERTY_CLASS = EXTENDED_PROPERTY_INFO__PROPERTY_CLASS;

	/**
	 * The feature id for the '<em><b>Constructor Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART = EXTENDED_PROPERTY_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Part Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO_FEATURE_COUNT = EXTENDED_PROPERTY_INFO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO___HASH_CODE = EXTENDED_PROPERTY_INFO___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO___EQUALS__OBJECT = EXTENDED_PROPERTY_INFO___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO___TO_STRING = EXTENDED_PROPERTY_INFO___TO_STRING;

	/**
	 * The number of operations of the '<em>Constructor Part Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO_OPERATION_COUNT = EXTENDED_PROPERTY_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.OperationActionImpl <em>Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.OperationActionImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getOperationAction()
	 * @generated
	 */
	int OPERATION_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__INCOMING = OPERATION_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__OUTGOING = OPERATION_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__GRAPH = OPERATION_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__CONTEXT = OPERATION_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ASSOCIATED_PACKAGE = OPERATION_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__OPERATION = OPERATION_REF__OPERATION;

	/**
	 * The number of structural features of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_FEATURE_COUNT = OPERATION_REF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION___HASH_CODE = OPERATION_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION___EQUALS__OBJECT = OPERATION_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION___TO_STRING = OPERATION_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_OPERATION_COUNT = OPERATION_REF_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyCallExpInfoImpl <em>Property Call Exp Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.PropertyCallExpInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getPropertyCallExpInfo()
	 * @generated
	 */
	int PROPERTY_CALL_EXP_INFO = 17;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__INCOMING = EXTENDED_PROPERTY_INFO__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__OUTGOING = EXTENDED_PROPERTY_INFO__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__GRAPH = EXTENDED_PROPERTY_INFO__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__CONTEXT = EXTENDED_PROPERTY_INFO__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__ASSOCIATED_PACKAGE = EXTENDED_PROPERTY_INFO__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__PROPERTY = EXTENDED_PROPERTY_INFO__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__PROPERTY_CLASS = EXTENDED_PROPERTY_INFO__PROPERTY_CLASS;

	/**
	 * The feature id for the '<em><b>Property Call Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP = EXTENDED_PROPERTY_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Call Exp Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO_FEATURE_COUNT = EXTENDED_PROPERTY_INFO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___HASH_CODE = EXTENDED_PROPERTY_INFO___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___EQUALS__OBJECT = EXTENDED_PROPERTY_INFO___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___TO_STRING = EXTENDED_PROPERTY_INFO___TO_STRING;

	/**
	 * The number of operations of the '<em>Property Call Exp Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO_OPERATION_COUNT = EXTENDED_PROPERTY_INFO_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.EnvironmentInfoImpl <em>Environment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.EnvironmentInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getEnvironmentInfo()
	 * @generated
	 */
	int ENVIRONMENT_INFO = 18;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__INCOMING = EXTENDED_OPERATION_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__OUTGOING = EXTENDED_OPERATION_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__GRAPH = EXTENDED_OPERATION_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__CONTEXT = EXTENDED_OPERATION_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__ASSOCIATED_PACKAGE = EXTENDED_OPERATION_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__OPERATION = EXTENDED_OPERATION_REF__OPERATION;

	/**
	 * The feature id for the '<em><b>Operation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__OPERATION_CLASS = EXTENDED_OPERATION_REF__OPERATION_CLASS;

	/**
	 * The feature id for the '<em><b>Lookup Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO__LOOKUP_CLASS = EXTENDED_OPERATION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO_FEATURE_COUNT = EXTENDED_OPERATION_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO___HASH_CODE = EXTENDED_OPERATION_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO___EQUALS__OBJECT = EXTENDED_OPERATION_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO___TO_STRING = EXTENDED_OPERATION_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Environment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_INFO_OPERATION_COUNT = EXTENDED_OPERATION_REF_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.MappingActionImpl <em>Mapping Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.MappingActionImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getMappingAction()
	 * @generated
	 */
	int MAPPING_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__INCOMING = OPERATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__OUTGOING = OPERATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__GRAPH = OPERATION_ACTION__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__CONTEXT = OPERATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__ASSOCIATED_PACKAGE = OPERATION_ACTION__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The number of structural features of the '<em>Mapping Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION___HASH_CODE = OPERATION_ACTION___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION___EQUALS__OBJECT = OPERATION_ACTION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION___TO_STRING = OPERATION_ACTION___TO_STRING;

	/**
	 * The number of operations of the '<em>Mapping Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.EnvironmentActionImpl <em>Environment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.EnvironmentActionImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getEnvironmentAction()
	 * @generated
	 */
	int ENVIRONMENT_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__INCOMING = EXTENDED_OPERATION_REF__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__OUTGOING = EXTENDED_OPERATION_REF__OUTGOING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__GRAPH = EXTENDED_OPERATION_REF__GRAPH;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__CONTEXT = EXTENDED_OPERATION_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Associated Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__ASSOCIATED_PACKAGE = EXTENDED_OPERATION_REF__ASSOCIATED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__OPERATION = EXTENDED_OPERATION_REF__OPERATION;

	/**
	 * The feature id for the '<em><b>Operation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION__OPERATION_CLASS = EXTENDED_OPERATION_REF__OPERATION_CLASS;

	/**
	 * The number of structural features of the '<em>Environment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION_FEATURE_COUNT = EXTENDED_OPERATION_REF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION___HASH_CODE = EXTENDED_OPERATION_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION___EQUALS__OBJECT = EXTENDED_OPERATION_REF___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION___TO_STRING = EXTENDED_OPERATION_REF___TO_STRING;

	/**
	 * The number of operations of the '<em>Environment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTION_OPERATION_COUNT = EXTENDED_OPERATION_REF_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode
	 * @generated
	 */
	EClass getCS2ASAnalysisNode();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getContext()
	 * @see #getCS2ASAnalysisNode()
	 * @generated
	 */
	EReference getCS2ASAnalysisNode_Context();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getAssociatedPackage <em>Associated Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Package</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getAssociatedPackage()
	 * @see #getCS2ASAnalysisNode()
	 * @generated
	 */
	EReference getCS2ASAnalysisNode_AssociatedPackage();

	/**
	 * Returns the meta object for the '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#toString()
	 * @generated
	 */
	EOperation getCS2ASAnalysisNode__ToString();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisEdge
	 * @generated
	 */
	EClass getCS2ASAnalysisEdge();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisGraph
	 * @generated
	 */
	EClass getCS2ASAnalysisGraph();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.InfoNode <em>Info Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Node</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.InfoNode
	 * @generated
	 */
	EClass getInfoNode();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.OperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.OperationRef
	 * @generated
	 */
	EClass getOperationRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.OperationRef#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.OperationRef#getOperation()
	 * @see #getOperationRef()
	 * @generated
	 */
	EReference getOperationRef_Operation();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef <em>Extended Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Operation Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef
	 * @generated
	 */
	EClass getExtendedOperationRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef#getOperationClass <em>Operation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Class</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef#getOperationClass()
	 * @see #getExtendedOperationRef()
	 * @generated
	 */
	EReference getExtendedOperationRef_OperationClass();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyRef
	 * @generated
	 */
	EClass getPropertyRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.PropertyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyRef#getProperty()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Property();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef <em>Extended Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Property Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef
	 * @generated
	 */
	EClass getExtendedPropertyRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Class</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef#getPropertyClass()
	 * @see #getExtendedPropertyRef()
	 * @generated
	 */
	EReference getExtendedPropertyRef_PropertyClass();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ClassRef
	 * @generated
	 */
	EClass getClassRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ClassRef#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ClassRef#getClass_()
	 * @see #getClassRef()
	 * @generated
	 */
	EReference getClassRef_Class();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef <em>Constructor Part Prop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Part Prop Ref</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef
	 * @generated
	 */
	EClass getConstructorPartPropRef();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef#getConstructorPart <em>Constructor Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor Part</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef#getConstructorPart()
	 * @see #getConstructorPartPropRef()
	 * @generated
	 */
	EReference getConstructorPartPropRef_ConstructorPart();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ClassInfo <em>Class Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ClassInfo
	 * @generated
	 */
	EClass getClassInfo();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo <em>Constructor Exp Class Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Exp Class Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo
	 * @generated
	 */
	EClass getConstructorExpClassInfo();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo#getConstructorExp <em>Constructor Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor Exp</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo#getConstructorExp()
	 * @see #getConstructorExpClassInfo()
	 * @generated
	 */
	EReference getConstructorExpClassInfo_ConstructorExp();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction <em>Constructor Part Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Part Action</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartAction
	 * @generated
	 */
	EClass getConstructorPartAction();

	/**
	 * Returns the meta object for the attribute '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#getNeedsLookup <em>Needs Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Lookup</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#getNeedsLookup()
	 * @see #getConstructorPartAction()
	 * @generated
	 */
	EAttribute getConstructorPartAction_NeedsLookup();

	/**
	 * Returns the meta object for the '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartAction#toString()
	 * @generated
	 */
	EOperation getConstructorPartAction__ToString();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo <em>Constructor Part Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Part Property Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo
	 * @generated
	 */
	EClass getConstructorPartPropertyInfo();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo <em>Extended Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Property Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo
	 * @generated
	 */
	EClass getExtendedPropertyInfo();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Action</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.OperationAction
	 * @generated
	 */
	EClass getOperationAction();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo <em>Property Call Exp Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo
	 * @generated
	 */
	EClass getPropertyCallExpInfo();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo#getPropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Call Exp</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo#getPropertyCallExp()
	 * @see #getPropertyCallExpInfo()
	 * @generated
	 */
	EReference getPropertyCallExpInfo_PropertyCallExp();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.EnvironmentInfo <em>Environment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Info</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.EnvironmentInfo
	 * @generated
	 */
	EClass getEnvironmentInfo();

	/**
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.EnvironmentInfo#getLookupClass <em>Lookup Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lookup Class</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.EnvironmentInfo#getLookupClass()
	 * @see #getEnvironmentInfo()
	 * @generated
	 */
	EReference getEnvironmentInfo_LookupClass();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.MappingAction <em>Mapping Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Action</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.MappingAction
	 * @generated
	 */
	EClass getMappingAction();

	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.EnvironmentAction <em>Environment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Action</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.EnvironmentAction
	 * @generated
	 */
	EClass getEnvironmentAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CS2ASAnalysisFactory getCS2ASAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisNode()
		 * @generated
		 */
		EClass CS2AS_ANALYSIS_NODE = eINSTANCE.getCS2ASAnalysisNode();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS2AS_ANALYSIS_NODE__CONTEXT = eINSTANCE.getCS2ASAnalysisNode_Context();

		/**
		 * The meta object literal for the '<em><b>Associated Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE = eINSTANCE.getCS2ASAnalysisNode_AssociatedPackage();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CS2AS_ANALYSIS_NODE___TO_STRING = eINSTANCE.getCS2ASAnalysisNode__ToString();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisEdgeImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisEdge()
		 * @generated
		 */
		EClass CS2AS_ANALYSIS_EDGE = eINSTANCE.getCS2ASAnalysisEdge();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisGraphImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisGraph()
		 * @generated
		 */
		EClass CS2AS_ANALYSIS_GRAPH = eINSTANCE.getCS2ASAnalysisGraph();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getActionNode()
		 * @generated
		 */
		EClass ACTION_NODE = eINSTANCE.getActionNode();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl <em>Info Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getInfoNode()
		 * @generated
		 */
		EClass INFO_NODE = eINSTANCE.getInfoNode();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl <em>Operation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getOperationRef()
		 * @generated
		 */
		EClass OPERATION_REF = eINSTANCE.getOperationRef();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_REF__OPERATION = eINSTANCE.getOperationRef_Operation();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedOperationRefImpl <em>Extended Operation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedOperationRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedOperationRef()
		 * @generated
		 */
		EClass EXTENDED_OPERATION_REF = eINSTANCE.getExtendedOperationRef();

		/**
		 * The meta object literal for the '<em><b>Operation Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_OPERATION_REF__OPERATION_CLASS = eINSTANCE.getExtendedOperationRef_OperationClass();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl <em>Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getPropertyRef()
		 * @generated
		 */
		EClass PROPERTY_REF = eINSTANCE.getPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF__PROPERTY = eINSTANCE.getPropertyRef_Property();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyRefImpl <em>Extended Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedPropertyRef()
		 * @generated
		 */
		EClass EXTENDED_PROPERTY_REF = eINSTANCE.getExtendedPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Property Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PROPERTY_REF__PROPERTY_CLASS = eINSTANCE.getExtendedPropertyRef_PropertyClass();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl <em>Class Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getClassRef()
		 * @generated
		 */
		EClass CLASS_REF = eINSTANCE.getClassRef();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_REF__CLASS = eINSTANCE.getClassRef_Class();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropRefImpl <em>Constructor Part Prop Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropRefImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartPropRef()
		 * @generated
		 */
		EClass CONSTRUCTOR_PART_PROP_REF = eINSTANCE.getConstructorPartPropRef();

		/**
		 * The meta object literal for the '<em><b>Constructor Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART = eINSTANCE.getConstructorPartPropRef_ConstructorPart();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ClassInfoImpl <em>Class Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ClassInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getClassInfo()
		 * @generated
		 */
		EClass CLASS_INFO = eINSTANCE.getClassInfo();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorExpClassInfoImpl <em>Constructor Exp Class Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorExpClassInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorExpClassInfo()
		 * @generated
		 */
		EClass CONSTRUCTOR_EXP_CLASS_INFO = eINSTANCE.getConstructorExpClassInfo();

		/**
		 * The meta object literal for the '<em><b>Constructor Exp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP = eINSTANCE.getConstructorExpClassInfo_ConstructorExp();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartActionImpl <em>Constructor Part Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartActionImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartAction()
		 * @generated
		 */
		EClass CONSTRUCTOR_PART_ACTION = eINSTANCE.getConstructorPartAction();

		/**
		 * The meta object literal for the '<em><b>Needs Lookup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_PART_ACTION__NEEDS_LOOKUP = eINSTANCE.getConstructorPartAction_NeedsLookup();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRUCTOR_PART_ACTION___TO_STRING = eINSTANCE.getConstructorPartAction__ToString();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropertyInfoImpl <em>Constructor Part Property Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropertyInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getConstructorPartPropertyInfo()
		 * @generated
		 */
		EClass CONSTRUCTOR_PART_PROPERTY_INFO = eINSTANCE.getConstructorPartPropertyInfo();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl <em>Extended Property Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedPropertyInfo()
		 * @generated
		 */
		EClass EXTENDED_PROPERTY_INFO = eINSTANCE.getExtendedPropertyInfo();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.OperationActionImpl <em>Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.OperationActionImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getOperationAction()
		 * @generated
		 */
		EClass OPERATION_ACTION = eINSTANCE.getOperationAction();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyCallExpInfoImpl <em>Property Call Exp Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.PropertyCallExpInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getPropertyCallExpInfo()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP_INFO = eINSTANCE.getPropertyCallExpInfo();

		/**
		 * The meta object literal for the '<em><b>Property Call Exp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExpInfo_PropertyCallExp();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.EnvironmentInfoImpl <em>Environment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.EnvironmentInfoImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getEnvironmentInfo()
		 * @generated
		 */
		EClass ENVIRONMENT_INFO = eINSTANCE.getEnvironmentInfo();

		/**
		 * The meta object literal for the '<em><b>Lookup Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_INFO__LOOKUP_CLASS = eINSTANCE.getEnvironmentInfo_LookupClass();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.MappingActionImpl <em>Mapping Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.MappingActionImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getMappingAction()
		 * @generated
		 */
		EClass MAPPING_ACTION = eINSTANCE.getMappingAction();

		/**
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.EnvironmentActionImpl <em>Environment Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.EnvironmentActionImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getEnvironmentAction()
		 * @generated
		 */
		EClass ENVIRONMENT_ACTION = eINSTANCE.getEnvironmentAction();

	}

} //CS2ASAnalysisPackage
