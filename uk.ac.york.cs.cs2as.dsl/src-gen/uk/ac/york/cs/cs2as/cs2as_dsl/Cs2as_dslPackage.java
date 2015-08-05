/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslFactory
 * @model kind="package"
 * @generated
 */
public interface Cs2as_dslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cs2as_dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/york/cs/cs2as/CS2ASDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cs2as_dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Cs2as_dslPackage eINSTANCE = uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Csi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CSI = EssentialOCLCSPackage.CONTEXT_CS__CSI;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PARENT = EssentialOCLCSPackage.CONTEXT_CS__PARENT;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PIVOT = EssentialOCLCSPackage.CONTEXT_CS__PIVOT;

  /**
   * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ORIGINAL_XMI_ID = EssentialOCLCSPackage.CONTEXT_CS__ORIGINAL_XMI_ID;

  /**
   * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_ANNOTATIONS = EssentialOCLCSPackage.CONTEXT_CS__OWNED_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = EssentialOCLCSPackage.CONTEXT_CS__NAME;

  /**
   * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_IMPORTS = EssentialOCLCSPackage.CONTEXT_CS__OWNED_IMPORTS;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_EXPRESSION = EssentialOCLCSPackage.CONTEXT_CS__OWNED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Cs Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CS_DECL = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>As Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AS_DECL = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPINGS = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CSDeclImpl <em>CS Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CSDeclImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCSDecl()
   * @generated
   */
  int CS_DECL = 1;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS_DECL__METAMODELS = 0;

  /**
   * The number of structural features of the '<em>CS Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl <em>AS Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getASDecl()
   * @generated
   */
  int AS_DECL = 2;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_DECL__METAMODELS = 0;

  /**
   * The number of structural features of the '<em>AS Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl <em>Class Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassMap()
   * @generated
   */
  int CLASS_MAP = 3;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__TO = 1;

  /**
   * The feature id for the '<em><b>Mapping Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__MAPPING_DEF = 2;

  /**
   * The feature id for the '<em><b>Disambiguation Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__DISAMBIGUATION_RULES = 3;

  /**
   * The number of structural features of the '<em>Class Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl <em>Disambiguation Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationMap()
   * @generated
   */
  int DISAMBIGUATION_MAP = 4;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_MAP__RULE = 0;

  /**
   * The feature id for the '<em><b>Produces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_MAP__PRODUCES = 1;

  /**
   * The feature id for the '<em><b>Mapping Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_MAP__MAPPING_DEF = 2;

  /**
   * The number of structural features of the '<em>Disambiguation Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_MAP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SimpleMapImpl <em>Simple Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SimpleMapImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSimpleMap()
   * @generated
   */
  int SIMPLE_MAP = 5;

  /**
   * The feature id for the '<em><b>Mapped Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MAP__MAPPED_PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Simple Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MAP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl <em>Property Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getPropertyMap()
   * @generated
   */
  int PROPERTY_MAP = 6;

  /**
   * The feature id for the '<em><b>Redefine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP__REDEFINE = 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP__LHS = 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP__RHS = 2;

  /**
   * The number of structural features of the '<em>Property Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MapExpCSImpl <em>Map Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MapExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMapExpCS()
   * @generated
   */
  int MAP_EXP_CS = 7;

  /**
   * The feature id for the '<em><b>Csi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

  /**
   * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

  /**
   * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Has Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

  /**
   * The feature id for the '<em><b>Local Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

  /**
   * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Local Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

  /**
   * The feature id for the '<em><b>Local Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

  /**
   * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Precedence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

  /**
   * The number of structural features of the '<em>Map Exp CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl <em>Lookup Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getLookupExpCS()
   * @generated
   */
  int LOOKUP_EXP_CS = 8;

  /**
   * The feature id for the '<em><b>Csi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

  /**
   * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

  /**
   * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Has Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

  /**
   * The feature id for the '<em><b>Local Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

  /**
   * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Local Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

  /**
   * The feature id for the '<em><b>Local Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

  /**
   * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Precedence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__ARGS = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lookup Exp CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getCsDecl <em>Cs Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cs Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getCsDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_CsDecl();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getAsDecl <em>As Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>As Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getAsDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AsDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Mappings();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl <em>CS Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CS Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl
   * @generated
   */
  EClass getCSDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getMetamodels()
   * @see #getCSDecl()
   * @generated
   */
  EReference getCSDecl_Metamodels();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl <em>AS Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AS Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl
   * @generated
   */
  EClass getASDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl#getMetamodels()
   * @see #getASDecl()
   * @generated
   */
  EReference getASDecl_Metamodels();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap <em>Class Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Map</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap
   * @generated
   */
  EClass getClassMap();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom()
   * @see #getClassMap()
   * @generated
   */
  EAttribute getClassMap_From();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo()
   * @see #getClassMap()
   * @generated
   */
  EAttribute getClassMap_To();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getMappingDef <em>Mapping Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getMappingDef()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_MappingDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getDisambiguationRules <em>Disambiguation Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disambiguation Rules</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getDisambiguationRules()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_DisambiguationRules();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap <em>Disambiguation Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disambiguation Map</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap
   * @generated
   */
  EClass getDisambiguationMap();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getRule()
   * @see #getDisambiguationMap()
   * @generated
   */
  EReference getDisambiguationMap_Rule();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getProduces <em>Produces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Produces</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getProduces()
   * @see #getDisambiguationMap()
   * @generated
   */
  EAttribute getDisambiguationMap_Produces();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getMappingDef <em>Mapping Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getMappingDef()
   * @see #getDisambiguationMap()
   * @generated
   */
  EReference getDisambiguationMap_MappingDef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap <em>Simple Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Map</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap
   * @generated
   */
  EClass getSimpleMap();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap#getMappedProperties <em>Mapped Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Properties</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap#getMappedProperties()
   * @see #getSimpleMap()
   * @generated
   */
  EReference getSimpleMap_MappedProperties();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap <em>Property Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Map</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap
   * @generated
   */
  EClass getPropertyMap();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#isRedefine <em>Redefine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Redefine</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#isRedefine()
   * @see #getPropertyMap()
   * @generated
   */
  EAttribute getPropertyMap_Redefine();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getLhs()
   * @see #getPropertyMap()
   * @generated
   */
  EReference getPropertyMap_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getRhs()
   * @see #getPropertyMap()
   * @generated
   */
  EReference getPropertyMap_Rhs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MapExpCS <em>Map Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Exp CS</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MapExpCS
   * @generated
   */
  EClass getMapExpCS();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS <em>Lookup Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lookup Exp CS</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS
   * @generated
   */
  EClass getLookupExpCS();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#getArgs()
   * @see #getLookupExpCS()
   * @generated
   */
  EReference getLookupExpCS_Args();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Cs2as_dslFactory getCs2as_dslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Cs Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CS_DECL = eINSTANCE.getModel_CsDecl();

    /**
     * The meta object literal for the '<em><b>As Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AS_DECL = eINSTANCE.getModel_AsDecl();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPINGS = eINSTANCE.getModel_Mappings();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CSDeclImpl <em>CS Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CSDeclImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCSDecl()
     * @generated
     */
    EClass CS_DECL = eINSTANCE.getCSDecl();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS_DECL__METAMODELS = eINSTANCE.getCSDecl_Metamodels();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl <em>AS Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getASDecl()
     * @generated
     */
    EClass AS_DECL = eINSTANCE.getASDecl();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AS_DECL__METAMODELS = eINSTANCE.getASDecl_Metamodels();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl <em>Class Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassMap()
     * @generated
     */
    EClass CLASS_MAP = eINSTANCE.getClassMap();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MAP__FROM = eINSTANCE.getClassMap_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MAP__TO = eINSTANCE.getClassMap_To();

    /**
     * The meta object literal for the '<em><b>Mapping Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__MAPPING_DEF = eINSTANCE.getClassMap_MappingDef();

    /**
     * The meta object literal for the '<em><b>Disambiguation Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__DISAMBIGUATION_RULES = eINSTANCE.getClassMap_DisambiguationRules();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl <em>Disambiguation Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationMap()
     * @generated
     */
    EClass DISAMBIGUATION_MAP = eINSTANCE.getDisambiguationMap();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_MAP__RULE = eINSTANCE.getDisambiguationMap_Rule();

    /**
     * The meta object literal for the '<em><b>Produces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISAMBIGUATION_MAP__PRODUCES = eINSTANCE.getDisambiguationMap_Produces();

    /**
     * The meta object literal for the '<em><b>Mapping Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_MAP__MAPPING_DEF = eINSTANCE.getDisambiguationMap_MappingDef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SimpleMapImpl <em>Simple Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SimpleMapImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSimpleMap()
     * @generated
     */
    EClass SIMPLE_MAP = eINSTANCE.getSimpleMap();

    /**
     * The meta object literal for the '<em><b>Mapped Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MAP__MAPPED_PROPERTIES = eINSTANCE.getSimpleMap_MappedProperties();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl <em>Property Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getPropertyMap()
     * @generated
     */
    EClass PROPERTY_MAP = eINSTANCE.getPropertyMap();

    /**
     * The meta object literal for the '<em><b>Redefine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_MAP__REDEFINE = eINSTANCE.getPropertyMap_Redefine();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_MAP__LHS = eINSTANCE.getPropertyMap_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_MAP__RHS = eINSTANCE.getPropertyMap_Rhs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MapExpCSImpl <em>Map Exp CS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MapExpCSImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMapExpCS()
     * @generated
     */
    EClass MAP_EXP_CS = eINSTANCE.getMapExpCS();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl <em>Lookup Exp CS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getLookupExpCS()
     * @generated
     */
    EClass LOOKUP_EXP_CS = eINSTANCE.getLookupExpCS();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP_EXP_CS__ARGS = eINSTANCE.getLookupExpCS_Args();

  }

} //Cs2as_dslPackage
