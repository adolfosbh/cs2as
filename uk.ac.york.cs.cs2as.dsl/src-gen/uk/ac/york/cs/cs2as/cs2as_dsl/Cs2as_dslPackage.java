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
   * The feature id for the '<em><b>Mapping Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPING_SECT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Disambiguation Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DISAMBIGUATION_SECT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Namereso Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAMERESO_SECT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 5;

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
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingSectImpl <em>Mapping Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingSect()
   * @generated
   */
  int MAPPING_SECT = 3;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SECT__MAPPINGS = 0;

  /**
   * The number of structural features of the '<em>Mapping Sect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_SECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl <em>Class Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassMap()
   * @generated
   */
  int CLASS_MAP = 4;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__TO = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__FROM = 1;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__RULE = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Class Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapStmntImpl <em>Class Map Stmnt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapStmntImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassMapStmnt()
   * @generated
   */
  int CLASS_MAP_STMNT = 5;

  /**
   * The number of structural features of the '<em>Class Map Stmnt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP_STMNT_FEATURE_COUNT = 0;

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
  int PROPERTY_MAP__REDEFINE = CLASS_MAP_STMNT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prop Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP__PROP_NAME = CLASS_MAP_STMNT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Prop Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP__PROP_INIT = CLASS_MAP_STMNT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAP_FEATURE_COUNT = CLASS_MAP_STMNT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl <em>Disambiguation Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationSect()
   * @generated
   */
  int DISAMBIGUATION_SECT = 7;

  /**
   * The feature id for the '<em><b>Disambiguations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_SECT__DISAMBIGUATIONS = 0;

  /**
   * The number of structural features of the '<em>Disambiguation Sect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_SECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationImpl <em>Class Disambiguation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassDisambiguation()
   * @generated
   */
  int CLASS_DISAMBIGUATION = 8;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DISAMBIGUATION__CLASS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DISAMBIGUATION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Class Disambiguation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DISAMBIGUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationStmntImpl <em>Class Disambiguation Stmnt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationStmntImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassDisambiguationStmnt()
   * @generated
   */
  int CLASS_DISAMBIGUATION_STMNT = 9;

  /**
   * The number of structural features of the '<em>Class Disambiguation Stmnt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DISAMBIGUATION_STMNT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl <em>Disambiguation Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationDef()
   * @generated
   */
  int DISAMBIGUATION_DEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF__NAME = CLASS_DISAMBIGUATION_STMNT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF__EXP = CLASS_DISAMBIGUATION_STMNT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Disambiguation Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF_FEATURE_COUNT = CLASS_DISAMBIGUATION_STMNT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl <em>Name Resolution Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getNameResolutionSect()
   * @generated
   */
  int NAME_RESOLUTION_SECT = 11;

  /**
   * The feature id for the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__NAME_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__NAME_PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Name Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__NAME_QUALIFIER = 2;

  /**
   * The feature id for the '<em><b>Name Resolutions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__NAME_RESOLUTIONS = 3;

  /**
   * The number of structural features of the '<em>Name Resolution Sect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl <em>Class Name Resolution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassNameResolution()
   * @generated
   */
  int CLASS_NAME_RESOLUTION = 12;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_NAME_RESOLUTION__CLASS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_NAME_RESOLUTION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Class Name Resolution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_NAME_RESOLUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionStmntImpl <em>Class Name Resolution Stmnt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionStmntImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassNameResolutionStmnt()
   * @generated
   */
  int CLASS_NAME_RESOLUTION_STMNT = 13;

  /**
   * The number of structural features of the '<em>Class Name Resolution Stmnt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl <em>Named Element Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getNamedElementDef()
   * @generated
   */
  int NAMED_ELEMENT_DEF = 14;

  /**
   * The feature id for the '<em><b>Name Poperty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_DEF__NAME_POPERTY = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_DEF__QUALIFIER = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Element Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_DEF_FEATURE_COUNT = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl <em>Scope Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getScopeDef()
   * @generated
   */
  int SCOPE_DEF = 15;

  /**
   * The feature id for the '<em><b>Same Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__SAME_SCOPE = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contributing Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__CONTRIBUTING_PROP = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__TYPE_FILTER = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Propagating Prop</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__PROPAGATING_PROP = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Scope Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF_FEATURE_COUNT = CLASS_NAME_RESOLUTION_STMNT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ResolveExpCSImpl <em>Resolve Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ResolveExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getResolveExpCS()
   * @generated
   */
  int RESOLVE_EXP_CS = 16;

  /**
   * The feature id for the '<em><b>Csi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

  /**
   * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

  /**
   * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Has Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

  /**
   * The feature id for the '<em><b>Local Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

  /**
   * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Local Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

  /**
   * The feature id for the '<em><b>Local Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

  /**
   * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Precedence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

  /**
   * The number of structural features of the '<em>Resolve Exp CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl <em>Lookup Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getLookupExpCS()
   * @generated
   */
  int LOOKUP_EXP_CS = 17;

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappingSect <em>Mapping Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappingSect()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MappingSect();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getDisambiguationSect <em>Disambiguation Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Disambiguation Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getDisambiguationSect()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DisambiguationSect();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getNameresoSect <em>Namereso Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namereso Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getNameresoSect()
   * @see #getModel()
   * @generated
   */
  EReference getModel_NameresoSect();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect <em>Mapping Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect
   * @generated
   */
  EClass getMappingSect();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect#getMappings()
   * @see #getMappingSect()
   * @generated
   */
  EReference getMappingSect_Mappings();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_Rule();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getStatements()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt <em>Class Map Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Map Stmnt</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt
   * @generated
   */
  EClass getClassMapStmnt();

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
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropName <em>Prop Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropName()
   * @see #getPropertyMap()
   * @generated
   */
  EAttribute getPropertyMap_PropName();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropInit <em>Prop Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Init</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap#getPropInit()
   * @see #getPropertyMap()
   * @generated
   */
  EReference getPropertyMap_PropInit();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect <em>Disambiguation Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disambiguation Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
   * @generated
   */
  EClass getDisambiguationSect();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect#getDisambiguations <em>Disambiguations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disambiguations</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect#getDisambiguations()
   * @see #getDisambiguationSect()
   * @generated
   */
  EReference getDisambiguationSect_Disambiguations();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation <em>Class Disambiguation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Disambiguation</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation
   * @generated
   */
  EClass getClassDisambiguation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getClass_()
   * @see #getClassDisambiguation()
   * @generated
   */
  EAttribute getClassDisambiguation_Class();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getStatements()
   * @see #getClassDisambiguation()
   * @generated
   */
  EReference getClassDisambiguation_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt <em>Class Disambiguation Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Disambiguation Stmnt</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt
   * @generated
   */
  EClass getClassDisambiguationStmnt();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef <em>Disambiguation Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disambiguation Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
   * @generated
   */
  EClass getDisambiguationDef();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getName()
   * @see #getDisambiguationDef()
   * @generated
   */
  EAttribute getDisambiguationDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getExp()
   * @see #getDisambiguationDef()
   * @generated
   */
  EReference getDisambiguationDef_Exp();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect <em>Name Resolution Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Resolution Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect
   * @generated
   */
  EClass getNameResolutionSect();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameElement <em>Name Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Element</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameElement()
   * @see #getNameResolutionSect()
   * @generated
   */
  EAttribute getNameResolutionSect_NameElement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameProperty <em>Name Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Property</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameProperty()
   * @see #getNameResolutionSect()
   * @generated
   */
  EReference getNameResolutionSect_NameProperty();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameQualifier <em>Name Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Qualifier</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameQualifier()
   * @see #getNameResolutionSect()
   * @generated
   */
  EAttribute getNameResolutionSect_NameQualifier();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameResolutions <em>Name Resolutions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Resolutions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameResolutions()
   * @see #getNameResolutionSect()
   * @generated
   */
  EReference getNameResolutionSect_NameResolutions();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution <em>Class Name Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Name Resolution</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution
   * @generated
   */
  EClass getClassNameResolution();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getClass_()
   * @see #getClassNameResolution()
   * @generated
   */
  EAttribute getClassNameResolution_Class();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution#getStatements()
   * @see #getClassNameResolution()
   * @generated
   */
  EReference getClassNameResolution_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt <em>Class Name Resolution Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Name Resolution Stmnt</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt
   * @generated
   */
  EClass getClassNameResolutionStmnt();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef <em>Named Element Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef
   * @generated
   */
  EClass getNamedElementDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty <em>Name Poperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Poperty</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty()
   * @see #getNamedElementDef()
   * @generated
   */
  EReference getNamedElementDef_NamePoperty();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getQualifier()
   * @see #getNamedElementDef()
   * @generated
   */
  EAttribute getNamedElementDef_Qualifier();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef <em>Scope Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef
   * @generated
   */
  EClass getScopeDef();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isSameScope <em>Same Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Same Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isSameScope()
   * @see #getScopeDef()
   * @generated
   */
  EAttribute getScopeDef_SameScope();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getContributingProp <em>Contributing Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contributing Prop</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getContributingProp()
   * @see #getScopeDef()
   * @generated
   */
  EReference getScopeDef_ContributingProp();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getTypeFilter <em>Type Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Filter</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getTypeFilter()
   * @see #getScopeDef()
   * @generated
   */
  EReference getScopeDef_TypeFilter();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getPropagatingProp <em>Propagating Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propagating Prop</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getPropagatingProp()
   * @see #getScopeDef()
   * @generated
   */
  EReference getScopeDef_PropagatingProp();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS <em>Resolve Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resolve Exp CS</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS
   * @generated
   */
  EClass getResolveExpCS();

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
     * The meta object literal for the '<em><b>Mapping Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPING_SECT = eINSTANCE.getModel_MappingSect();

    /**
     * The meta object literal for the '<em><b>Disambiguation Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DISAMBIGUATION_SECT = eINSTANCE.getModel_DisambiguationSect();

    /**
     * The meta object literal for the '<em><b>Namereso Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NAMERESO_SECT = eINSTANCE.getModel_NameresoSect();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingSectImpl <em>Mapping Sect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingSectImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingSect()
     * @generated
     */
    EClass MAPPING_SECT = eINSTANCE.getMappingSect();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_SECT__MAPPINGS = eINSTANCE.getMappingSect_Mappings();

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
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MAP__TO = eINSTANCE.getClassMap_To();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MAP__FROM = eINSTANCE.getClassMap_From();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__RULE = eINSTANCE.getClassMap_Rule();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__STATEMENTS = eINSTANCE.getClassMap_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapStmntImpl <em>Class Map Stmnt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapStmntImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassMapStmnt()
     * @generated
     */
    EClass CLASS_MAP_STMNT = eINSTANCE.getClassMapStmnt();

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
     * The meta object literal for the '<em><b>Prop Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_MAP__PROP_NAME = eINSTANCE.getPropertyMap_PropName();

    /**
     * The meta object literal for the '<em><b>Prop Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_MAP__PROP_INIT = eINSTANCE.getPropertyMap_PropInit();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl <em>Disambiguation Sect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationSect()
     * @generated
     */
    EClass DISAMBIGUATION_SECT = eINSTANCE.getDisambiguationSect();

    /**
     * The meta object literal for the '<em><b>Disambiguations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_SECT__DISAMBIGUATIONS = eINSTANCE.getDisambiguationSect_Disambiguations();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationImpl <em>Class Disambiguation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassDisambiguation()
     * @generated
     */
    EClass CLASS_DISAMBIGUATION = eINSTANCE.getClassDisambiguation();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DISAMBIGUATION__CLASS = eINSTANCE.getClassDisambiguation_Class();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DISAMBIGUATION__STATEMENTS = eINSTANCE.getClassDisambiguation_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationStmntImpl <em>Class Disambiguation Stmnt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassDisambiguationStmntImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassDisambiguationStmnt()
     * @generated
     */
    EClass CLASS_DISAMBIGUATION_STMNT = eINSTANCE.getClassDisambiguationStmnt();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl <em>Disambiguation Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationDef()
     * @generated
     */
    EClass DISAMBIGUATION_DEF = eINSTANCE.getDisambiguationDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISAMBIGUATION_DEF__NAME = eINSTANCE.getDisambiguationDef_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_DEF__EXP = eINSTANCE.getDisambiguationDef_Exp();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl <em>Name Resolution Sect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getNameResolutionSect()
     * @generated
     */
    EClass NAME_RESOLUTION_SECT = eINSTANCE.getNameResolutionSect();

    /**
     * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_RESOLUTION_SECT__NAME_ELEMENT = eINSTANCE.getNameResolutionSect_NameElement();

    /**
     * The meta object literal for the '<em><b>Name Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_RESOLUTION_SECT__NAME_PROPERTY = eINSTANCE.getNameResolutionSect_NameProperty();

    /**
     * The meta object literal for the '<em><b>Name Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_RESOLUTION_SECT__NAME_QUALIFIER = eINSTANCE.getNameResolutionSect_NameQualifier();

    /**
     * The meta object literal for the '<em><b>Name Resolutions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_RESOLUTION_SECT__NAME_RESOLUTIONS = eINSTANCE.getNameResolutionSect_NameResolutions();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl <em>Class Name Resolution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassNameResolution()
     * @generated
     */
    EClass CLASS_NAME_RESOLUTION = eINSTANCE.getClassNameResolution();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_NAME_RESOLUTION__CLASS = eINSTANCE.getClassNameResolution_Class();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_NAME_RESOLUTION__STATEMENTS = eINSTANCE.getClassNameResolution_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionStmntImpl <em>Class Name Resolution Stmnt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassNameResolutionStmntImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassNameResolutionStmnt()
     * @generated
     */
    EClass CLASS_NAME_RESOLUTION_STMNT = eINSTANCE.getClassNameResolutionStmnt();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl <em>Named Element Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getNamedElementDef()
     * @generated
     */
    EClass NAMED_ELEMENT_DEF = eINSTANCE.getNamedElementDef();

    /**
     * The meta object literal for the '<em><b>Name Poperty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT_DEF__NAME_POPERTY = eINSTANCE.getNamedElementDef_NamePoperty();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT_DEF__QUALIFIER = eINSTANCE.getNamedElementDef_Qualifier();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl <em>Scope Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getScopeDef()
     * @generated
     */
    EClass SCOPE_DEF = eINSTANCE.getScopeDef();

    /**
     * The meta object literal for the '<em><b>Same Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_DEF__SAME_SCOPE = eINSTANCE.getScopeDef_SameScope();

    /**
     * The meta object literal for the '<em><b>Contributing Prop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_DEF__CONTRIBUTING_PROP = eINSTANCE.getScopeDef_ContributingProp();

    /**
     * The meta object literal for the '<em><b>Type Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_DEF__TYPE_FILTER = eINSTANCE.getScopeDef_TypeFilter();

    /**
     * The meta object literal for the '<em><b>Propagating Prop</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_DEF__PROPAGATING_PROP = eINSTANCE.getScopeDef_PropagatingProp();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ResolveExpCSImpl <em>Resolve Exp CS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ResolveExpCSImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getResolveExpCS()
     * @generated
     */
    EClass RESOLVE_EXP_CS = eINSTANCE.getResolveExpCS();

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
