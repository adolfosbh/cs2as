/**
 */
package ocldependencyanalysis.cs2asanalysis;

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
	String eNS_URI = "http://cs2asanalysis";

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
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.NodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___TO_STRING = 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HASH_CODE = 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EQUALS__OBJECT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getCS2ASAnalysisNode()
	 * @generated
	 */
	int CS2AS_ANALYSIS_NODE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__CONTEXT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___TO_STRING = NODE___TO_STRING;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___HASH_CODE = NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE___EQUALS__OBJECT = NODE___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS2AS_ANALYSIS_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ActionNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 2;

	/**
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___TO_STRING = NODE___TO_STRING;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___HASH_CODE = NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___EQUALS__OBJECT = NODE___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl <em>Info Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.InfoNodeImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getInfoNode()
	 * @generated
	 */
	int INFO_NODE = 3;

	/**
	 * The number of structural features of the '<em>Info Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___TO_STRING = NODE___TO_STRING;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___HASH_CODE = NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE___EQUALS__OBJECT = NODE___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Info Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl <em>Operation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.OperationRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getOperationRef()
	 * @generated
	 */
	int OPERATION_REF = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF__REFERRED_ELEMENT = CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

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
	 * The number of operations of the '<em>Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.PropertyRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getPropertyRef()
	 * @generated
	 */
	int PROPERTY_REF = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__REFERRED_ELEMENT = CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

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
	 * The number of operations of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_OPERATION_COUNT = CS2AS_ANALYSIS_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl <em>Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ClassRefImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getClassRef()
	 * @generated
	 */
	int CLASS_REF = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__CONTEXT = CS2AS_ANALYSIS_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__REFERRED_ELEMENT = CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF___TO_STRING = CS2AS_ANALYSIS_NODE___TO_STRING;

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
	int CONSTRUCTOR_PART_PROP_REF = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__CONTEXT = PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF__REFERRED_ELEMENT = PROPERTY_REF__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROP_REF___TO_STRING = PROPERTY_REF___TO_STRING;

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
	int CLASS_INFO = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__CONTEXT = CLASS_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO__REFERRED_ELEMENT = CLASS_REF__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INFO___TO_STRING = CLASS_REF___TO_STRING;

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
	int CONSTRUCTOR_EXP_CLASS_INFO = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__CONTEXT = CLASS_INFO__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO__REFERRED_ELEMENT = CLASS_INFO__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_EXP_CLASS_INFO___TO_STRING = CLASS_INFO___TO_STRING;

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
	int CONSTRUCTOR_PART_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__CONTEXT = CONSTRUCTOR_PART_PROP_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_ACTION__REFERRED_ELEMENT = CONSTRUCTOR_PART_PROP_REF__REFERRED_ELEMENT;

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
	int CONSTRUCTOR_PART_PROPERTY_INFO = 11;

	/**
	 * The meta object id for the '{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl <em>Extended Property Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyInfoImpl
	 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getExtendedPropertyInfo()
	 * @generated
	 */
	int EXTENDED_PROPERTY_INFO = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__CONTEXT = PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__REFERRED_ELEMENT = PROPERTY_REF__REFERRED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__PROPERTY = PROPERTY_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO__PROPERTY_CLASS = PROPERTY_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO_FEATURE_COUNT = PROPERTY_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___TO_STRING = PROPERTY_REF___TO_STRING;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___HASH_CODE = PROPERTY_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO___EQUALS__OBJECT = PROPERTY_REF___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Extended Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTY_INFO_OPERATION_COUNT = PROPERTY_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__CONTEXT = EXTENDED_PROPERTY_INFO__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO__REFERRED_ELEMENT = EXTENDED_PROPERTY_INFO__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PART_PROPERTY_INFO___TO_STRING = EXTENDED_PROPERTY_INFO___TO_STRING;

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
	int OPERATION_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__CONTEXT = OPERATION_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__REFERRED_ELEMENT = OPERATION_REF__REFERRED_ELEMENT;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION___TO_STRING = OPERATION_REF___TO_STRING;

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
	int PROPERTY_CALL_EXP_INFO = 14;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__CONTEXT = PROPERTY_REF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__REFERRED_ELEMENT = PROPERTY_REF__REFERRED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__PROPERTY = PROPERTY_REF__PROPERTY;

	/**
	 * The feature id for the '<em><b>Property Call Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP = PROPERTY_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Call Exp Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO_FEATURE_COUNT = PROPERTY_REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___TO_STRING = PROPERTY_REF___TO_STRING;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___HASH_CODE = PROPERTY_REF___HASH_CODE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO___EQUALS__OBJECT = PROPERTY_REF___EQUALS__OBJECT;

	/**
	 * The number of operations of the '<em>Property Call Exp Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_INFO_OPERATION_COUNT = PROPERTY_REF_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ocldependencyanalysis.cs2asanalysis.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the '{@link ocldependencyanalysis.cs2asanalysis.Node#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ocldependencyanalysis.cs2asanalysis.Node#toString()
	 * @generated
	 */
	EOperation getNode__ToString();

	/**
	 * Returns the meta object for the '{@link ocldependencyanalysis.cs2asanalysis.Node#hashCode() <em>Hash Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hash Code</em>' operation.
	 * @see ocldependencyanalysis.cs2asanalysis.Node#hashCode()
	 * @generated
	 */
	EOperation getNode__HashCode();

	/**
	 * Returns the meta object for the '{@link ocldependencyanalysis.cs2asanalysis.Node#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see ocldependencyanalysis.cs2asanalysis.Node#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getNode__Equals__Object();

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
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode#getReferredElement()
	 * @see #getCS2ASAnalysisNode()
	 * @generated
	 */
	EReference getCS2ASAnalysisNode_ReferredElement();

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
	 * Returns the meta object for the reference '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Class</em>'.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo#getPropertyClass()
	 * @see #getExtendedPropertyInfo()
	 * @generated
	 */
	EReference getExtendedPropertyInfo_PropertyClass();

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
		 * The meta object literal for the '{@link ocldependencyanalysis.cs2asanalysis.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocldependencyanalysis.cs2asanalysis.impl.NodeImpl
		 * @see ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___TO_STRING = eINSTANCE.getNode__ToString();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HASH_CODE = eINSTANCE.getNode__HashCode();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___EQUALS__OBJECT = eINSTANCE.getNode__Equals__Object();

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
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT = eINSTANCE.getCS2ASAnalysisNode_ReferredElement();

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
		 * The meta object literal for the '<em><b>Property Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PROPERTY_INFO__PROPERTY_CLASS = eINSTANCE.getExtendedPropertyInfo_PropertyClass();

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

	}

} //CS2ASAnalysisPackage
