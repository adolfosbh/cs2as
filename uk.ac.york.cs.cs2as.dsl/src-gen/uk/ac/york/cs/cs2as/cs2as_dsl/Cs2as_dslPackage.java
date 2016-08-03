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
   * The feature id for the '<em><b>Helpers Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HELPERS_SECT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = EssentialOCLCSPackage.CONTEXT_CS_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__TO = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MAP__FROM = 1;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
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
   * The feature id for the '<em><b>Class</b></em>' containment reference.
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
   * The feature id for the '<em><b>Targets Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__TARGETS_DEF = 0;

  /**
   * The feature id for the '<em><b>Inputs Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__INPUTS_DEF = 1;

  /**
   * The feature id for the '<em><b>Providers Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT__PROVIDERS_DEF = 2;

  /**
   * The number of structural features of the '<em>Name Resolution Sect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_RESOLUTION_SECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetsImpl <em>Targets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetsImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTargets()
   * @generated
   */
  int TARGETS = 12;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGETS__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Targets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGETS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 13;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__CLASS_REF = 0;

  /**
   * The feature id for the '<em><b>Prop Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__PROP_REF = 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__FILTER = 2;

  /**
   * The feature id for the '<em><b>Qualifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__QUALIFICATIONS = 3;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl <em>Inputs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getInputs()
   * @generated
   */
  int INPUTS = 14;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTS__INPUTS = 0;

  /**
   * The number of structural features of the '<em>Inputs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getInput()
   * @generated
   */
  int INPUT = 15;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__CLASS_REF = 1;

  /**
   * The feature id for the '<em><b>Prop Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__PROP_REF = 2;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvidersImpl <em>Providers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvidersImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviders()
   * @generated
   */
  int PROVIDERS = 16;

  /**
   * The feature id for the '<em><b>Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__PROVIDERS = 0;

  /**
   * The number of structural features of the '<em>Providers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl <em>Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvider()
   * @generated
   */
  int PROVIDER = 17;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__CLASS_REF = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderStmntImpl <em>Provider Stmnt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderStmntImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviderStmnt()
   * @generated
   */
  int PROVIDER_STMNT = 18;

  /**
   * The feature id for the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_STMNT__SELECTION_DEF = 0;

  /**
   * The feature id for the '<em><b>Provision Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_STMNT__PROVISION_DEFS = 1;

  /**
   * The number of structural features of the '<em>Provider Stmnt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_STMNT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl <em>Filter Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getFilterDef()
   * @generated
   */
  int FILTER_DEF = 19;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_DEF__PARAMS = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_DEF__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Filter Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl <em>Qualification Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getQualificationDef()
   * @generated
   */
  int QUALIFICATION_DEF = 20;

  /**
   * The feature id for the '<em><b>Targets Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_DEF__TARGETS_DEF = 0;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_DEF__CONTRIBUTION = 1;

  /**
   * The number of structural features of the '<em>Qualification Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl <em>Elements Contrib Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getElementsContribExp()
   * @generated
   */
  int ELEMENTS_CONTRIB_EXP = 21;

  /**
   * The feature id for the '<em><b>Is Preceding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_CONTRIB_EXP__IS_PRECEDING = 0;

  /**
   * The feature id for the '<em><b>Is Imported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_CONTRIB_EXP__IS_IMPORTED = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_CONTRIB_EXP__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Elements Contrib Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_CONTRIB_EXP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl <em>Scope Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getScopeDef()
   * @generated
   */
  int SCOPE_DEF = 22;

  /**
   * The feature id for the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__SELECTION_DEF = PROVIDER_STMNT__SELECTION_DEF;

  /**
   * The feature id for the '<em><b>Provision Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__PROVISION_DEFS = PROVIDER_STMNT__PROVISION_DEFS;

  /**
   * The feature id for the '<em><b>Same Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__SAME_SCOPE = PROVIDER_STMNT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Empty Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__EMPTY_SCOPE = PROVIDER_STMNT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Also Exports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF__ALSO_EXPORTS = PROVIDER_STMNT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Scope Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEF_FEATURE_COUNT = PROVIDER_STMNT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl <em>Provision Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvisionDef()
   * @generated
   */
  int PROVISION_DEF = 23;

  /**
   * The feature id for the '<em><b>Targets Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_DEF__TARGETS_DEF = 0;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_DEF__CONTRIBUTION = 1;

  /**
   * The feature id for the '<em><b>Occluding Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_DEF__OCCLUDING_DEFS = 2;

  /**
   * The number of structural features of the '<em>Provision Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassRefImpl <em>Class Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassRefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassRef()
   * @generated
   */
  int CLASS_REF = 24;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REF__CLASS_NAME = 0;

  /**
   * The number of structural features of the '<em>Class Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultipleClassRefImpl <em>Multiple Class Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultipleClassRefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMultipleClassRef()
   * @generated
   */
  int MULTIPLE_CLASS_REF = 25;

  /**
   * The feature id for the '<em><b>Class Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CLASS_REF__CLASS_NAMES = 0;

  /**
   * The number of structural features of the '<em>Multiple Class Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CLASS_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl <em>Occluding Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getOccludingDef()
   * @generated
   */
  int OCCLUDING_DEF = 26;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCLUDING_DEF__CONTRIBUTION = 0;

  /**
   * The number of structural features of the '<em>Occluding Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCLUDING_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionDefImpl <em>Contribution Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContributionDef()
   * @generated
   */
  int CONTRIBUTION_DEF = 27;

  /**
   * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_DEF__CONTRIBUTIONS = 0;

  /**
   * The number of structural features of the '<em>Contribution Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl <em>Selection Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionDef()
   * @generated
   */
  int SELECTION_DEF = 28;

  /**
   * The number of structural features of the '<em>Selection Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl <em>Export Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportDef()
   * @generated
   */
  int EXPORT_DEF = 29;

  /**
   * The feature id for the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DEF__SELECTION_DEF = PROVIDER_STMNT__SELECTION_DEF;

  /**
   * The feature id for the '<em><b>Provision Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DEF__PROVISION_DEFS = PROVIDER_STMNT__PROVISION_DEFS;

  /**
   * The number of structural features of the '<em>Export Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DEF_FEATURE_COUNT = PROVIDER_STMNT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl <em>Helpers Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelpersSect()
   * @generated
   */
  int HELPERS_SECT = 30;

  /**
   * The feature id for the '<em><b>Class Helpers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPERS_SECT__CLASS_HELPERS = 0;

  /**
   * The number of structural features of the '<em>Helpers Sect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPERS_SECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl <em>Class Helper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassHelper()
   * @generated
   */
  int CLASS_HELPER = 31;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_HELPER__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_HELPER__HELPERS = 1;

  /**
   * The number of structural features of the '<em>Class Helper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_HELPER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl <em>Helper Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperDef()
   * @generated
   */
  int HELPER_DEF = 32;

  /**
   * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF__OWNED_SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF__OWNED_TYPE = 3;

  /**
   * The feature id for the '<em><b>Helper Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF__HELPER_BODY = 4;

  /**
   * The number of structural features of the '<em>Helper Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_DEF_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl <em>Trace Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTraceExpCS()
   * @generated
   */
  int TRACE_EXP_CS = 33;

  /**
   * The feature id for the '<em><b>Csi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

  /**
   * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

  /**
   * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Has Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

  /**
   * The feature id for the '<em><b>Local Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

  /**
   * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Local Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

  /**
   * The feature id for the '<em><b>Local Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

  /**
   * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

  /**
   * The feature id for the '<em><b>Precedence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

  /**
   * The number of structural features of the '<em>Trace Exp CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl <em>Lookup Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.LookupExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getLookupExpCS()
   * @generated
   */
  int LOOKUP_EXP_CS = 34;

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
   * The feature id for the '<em><b>From Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__FROM_EXP = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__ARGS = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lookup Exp CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionAllImpl <em>Selection All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionAllImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionAll()
   * @generated
   */
  int SELECTION_ALL = 35;

  /**
   * The feature id for the '<em><b>Exception Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_ALL__EXCEPTION_PROPERTIES = SELECTION_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_ALL_FEATURE_COUNT = SELECTION_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionSpecificImpl <em>Selection Specific</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionSpecificImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionSpecific()
   * @generated
   */
  int SELECTION_SPECIFIC = 36;

  /**
   * The feature id for the '<em><b>Selected Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_SPECIFIC__SELECTED_PROPERTIES = SELECTION_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection Specific</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_SPECIFIC_FEATURE_COUNT = SELECTION_DEF_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getHelpersSect <em>Helpers Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Helpers Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model#getHelpersSect()
   * @see #getModel()
   * @generated
   */
  EReference getModel_HelpersSect();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_To();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom()
   * @see #getClassMap()
   * @generated
   */
  EReference getClassMap_From();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule()
   * @see #getClassMap()
   * @generated
   */
  EAttribute getClassMap_Rule();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation#getClass_()
   * @see #getClassDisambiguation()
   * @generated
   */
  EReference getClassDisambiguation_Class();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getTargetsDef <em>Targets Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Targets Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getTargetsDef()
   * @see #getNameResolutionSect()
   * @generated
   */
  EReference getNameResolutionSect_TargetsDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getInputsDef <em>Inputs Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inputs Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getInputsDef()
   * @see #getNameResolutionSect()
   * @generated
   */
  EReference getNameResolutionSect_InputsDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getProvidersDef <em>Providers Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Providers Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getProvidersDef()
   * @see #getNameResolutionSect()
   * @generated
   */
  EReference getNameResolutionSect_ProvidersDef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Targets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Targets</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Targets
   * @generated
   */
  EClass getTargets();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Targets#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Targets#getTargets()
   * @see #getTargets()
   * @generated
   */
  EReference getTargets_Targets();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getClassRef()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_ClassRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getPropRef <em>Prop Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getPropRef()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_PropRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getFilter()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualifications <em>Qualifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualifications</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualifications()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Qualifications();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Inputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inputs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Inputs
   * @generated
   */
  EClass getInputs();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Inputs#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Inputs#getInputs()
   * @see #getInputs()
   * @generated
   */
  EReference getInputs_Inputs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input#isQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input#isQualifier()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input#getClassRef()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ClassRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input#getPropRef <em>Prop Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input#getPropRef()
   * @see #getInput()
   * @generated
   */
  EReference getInput_PropRef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Providers <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Providers</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Providers
   * @generated
   */
  EClass getProviders();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Providers#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Providers</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Providers#getProviders()
   * @see #getProviders()
   * @generated
   */
  EReference getProviders_Providers();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider
   * @generated
   */
  EClass getProvider();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getClassRef()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_ClassRef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getStatements()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt <em>Provider Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider Stmnt</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt
   * @generated
   */
  EClass getProviderStmnt();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getSelectionDef <em>Selection Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getSelectionDef()
   * @see #getProviderStmnt()
   * @generated
   */
  EReference getProviderStmnt_SelectionDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getProvisionDefs <em>Provision Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provision Defs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt#getProvisionDefs()
   * @see #getProviderStmnt()
   * @generated
   */
  EReference getProviderStmnt_ProvisionDefs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef <em>Filter Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef
   * @generated
   */
  EClass getFilterDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef#getParams()
   * @see #getFilterDef()
   * @generated
   */
  EReference getFilterDef_Params();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef#getExpression()
   * @see #getFilterDef()
   * @generated
   */
  EReference getFilterDef_Expression();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef <em>Qualification Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualification Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef
   * @generated
   */
  EClass getQualificationDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getTargetsDef <em>Targets Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Targets Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getTargetsDef()
   * @see #getQualificationDef()
   * @generated
   */
  EReference getQualificationDef_TargetsDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contribution</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getContribution()
   * @see #getQualificationDef()
   * @generated
   */
  EReference getQualificationDef_Contribution();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp <em>Elements Contrib Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elements Contrib Exp</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp
   * @generated
   */
  EClass getElementsContribExp();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsPreceding <em>Is Preceding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Preceding</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsPreceding()
   * @see #getElementsContribExp()
   * @generated
   */
  EAttribute getElementsContribExp_IsPreceding();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsImported <em>Is Imported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Imported</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#isIsImported()
   * @see #getElementsContribExp()
   * @generated
   */
  EAttribute getElementsContribExp_IsImported();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp#getExpression()
   * @see #getElementsContribExp()
   * @generated
   */
  EReference getElementsContribExp_Expression();

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
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isEmptyScope <em>Empty Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isEmptyScope()
   * @see #getScopeDef()
   * @generated
   */
  EAttribute getScopeDef_EmptyScope();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isAlsoExports <em>Also Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Also Exports</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isAlsoExports()
   * @see #getScopeDef()
   * @generated
   */
  EAttribute getScopeDef_AlsoExports();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef <em>Provision Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provision Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef
   * @generated
   */
  EClass getProvisionDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getTargetsDef <em>Targets Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Targets Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getTargetsDef()
   * @see #getProvisionDef()
   * @generated
   */
  EReference getProvisionDef_TargetsDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contribution</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getContribution()
   * @see #getProvisionDef()
   * @generated
   */
  EReference getProvisionDef_Contribution();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getOccludingDefs <em>Occluding Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Occluding Defs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef#getOccludingDefs()
   * @see #getProvisionDef()
   * @generated
   */
  EReference getProvisionDef_OccludingDefs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef
   * @generated
   */
  EClass getClassRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef#getClassName()
   * @see #getClassRef()
   * @generated
   */
  EReference getClassRef_ClassName();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef <em>Multiple Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef
   * @generated
   */
  EClass getMultipleClassRef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef#getClassNames <em>Class Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Names</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef#getClassNames()
   * @see #getMultipleClassRef()
   * @generated
   */
  EReference getMultipleClassRef_ClassNames();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef <em>Occluding Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Occluding Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef
   * @generated
   */
  EClass getOccludingDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contribution</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContribution()
   * @see #getOccludingDef()
   * @generated
   */
  EReference getOccludingDef_Contribution();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef <em>Contribution Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef
   * @generated
   */
  EClass getContributionDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef#getContributions <em>Contributions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef#getContributions()
   * @see #getContributionDef()
   * @generated
   */
  EReference getContributionDef_Contributions();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef <em>Selection Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef
   * @generated
   */
  EClass getSelectionDef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef <em>Export Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef
   * @generated
   */
  EClass getExportDef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect <em>Helpers Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helpers Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect
   * @generated
   */
  EClass getHelpersSect();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect#getClassHelpers <em>Class Helpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Helpers</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect#getClassHelpers()
   * @see #getHelpersSect()
   * @generated
   */
  EReference getHelpersSect_ClassHelpers();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper <em>Class Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Helper</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper
   * @generated
   */
  EClass getClassHelper();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getContext()
   * @see #getClassHelper()
   * @generated
   */
  EReference getClassHelper_Context();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getHelpers <em>Helpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helpers</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper#getHelpers()
   * @see #getClassHelper()
   * @generated
   */
  EReference getClassHelper_Helpers();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef <em>Helper Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef
   * @generated
   */
  EClass getHelperDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedSignature <em>Owned Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Signature</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedSignature()
   * @see #getHelperDef()
   * @generated
   */
  EReference getHelperDef_OwnedSignature();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getName()
   * @see #getHelperDef()
   * @generated
   */
  EAttribute getHelperDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getParams()
   * @see #getHelperDef()
   * @generated
   */
  EReference getHelperDef_Params();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedType <em>Owned Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Type</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getOwnedType()
   * @see #getHelperDef()
   * @generated
   */
  EReference getHelperDef_OwnedType();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getHelperBody <em>Helper Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Helper Body</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef#getHelperBody()
   * @see #getHelperDef()
   * @generated
   */
  EReference getHelperDef_HelperBody();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS <em>Trace Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace Exp CS</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS
   * @generated
   */
  EClass getTraceExpCS();

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
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isFromExp <em>From Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From Exp</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isFromExp()
   * @see #getLookupExpCS()
   * @generated
   */
  EAttribute getLookupExpCS_FromExp();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll <em>Selection All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection All</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll
   * @generated
   */
  EClass getSelectionAll();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll#getExceptionProperties <em>Exception Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception Properties</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll#getExceptionProperties()
   * @see #getSelectionAll()
   * @generated
   */
  EReference getSelectionAll_ExceptionProperties();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific <em>Selection Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Specific</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific
   * @generated
   */
  EClass getSelectionSpecific();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific#getSelectedProperties <em>Selected Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selected Properties</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific#getSelectedProperties()
   * @see #getSelectionSpecific()
   * @generated
   */
  EReference getSelectionSpecific_SelectedProperties();

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
     * The meta object literal for the '<em><b>Helpers Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HELPERS_SECT = eINSTANCE.getModel_HelpersSect();

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
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__TO = eINSTANCE.getClassMap_To();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MAP__FROM = eINSTANCE.getClassMap_From();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MAP__RULE = eINSTANCE.getClassMap_Rule();

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
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DISAMBIGUATION__CLASS = eINSTANCE.getClassDisambiguation_Class();

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
     * The meta object literal for the '<em><b>Targets Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_RESOLUTION_SECT__TARGETS_DEF = eINSTANCE.getNameResolutionSect_TargetsDef();

    /**
     * The meta object literal for the '<em><b>Inputs Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_RESOLUTION_SECT__INPUTS_DEF = eINSTANCE.getNameResolutionSect_InputsDef();

    /**
     * The meta object literal for the '<em><b>Providers Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_RESOLUTION_SECT__PROVIDERS_DEF = eINSTANCE.getNameResolutionSect_ProvidersDef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetsImpl <em>Targets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetsImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTargets()
     * @generated
     */
    EClass TARGETS = eINSTANCE.getTargets();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGETS__TARGETS = eINSTANCE.getTargets_Targets();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__CLASS_REF = eINSTANCE.getTarget_ClassRef();

    /**
     * The meta object literal for the '<em><b>Prop Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__PROP_REF = eINSTANCE.getTarget_PropRef();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__FILTER = eINSTANCE.getTarget_Filter();

    /**
     * The meta object literal for the '<em><b>Qualifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__QUALIFICATIONS = eINSTANCE.getTarget_Qualifications();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl <em>Inputs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getInputs()
     * @generated
     */
    EClass INPUTS = eINSTANCE.getInputs();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUTS__INPUTS = eINSTANCE.getInputs_Inputs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__QUALIFIER = eINSTANCE.getInput_Qualifier();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__CLASS_REF = eINSTANCE.getInput_ClassRef();

    /**
     * The meta object literal for the '<em><b>Prop Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__PROP_REF = eINSTANCE.getInput_PropRef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvidersImpl <em>Providers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvidersImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviders()
     * @generated
     */
    EClass PROVIDERS = eINSTANCE.getProviders();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDERS__PROVIDERS = eINSTANCE.getProviders_Providers();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl <em>Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvider()
     * @generated
     */
    EClass PROVIDER = eINSTANCE.getProvider();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__CLASS_REF = eINSTANCE.getProvider_ClassRef();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__STATEMENTS = eINSTANCE.getProvider_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderStmntImpl <em>Provider Stmnt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderStmntImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviderStmnt()
     * @generated
     */
    EClass PROVIDER_STMNT = eINSTANCE.getProviderStmnt();

    /**
     * The meta object literal for the '<em><b>Selection Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_STMNT__SELECTION_DEF = eINSTANCE.getProviderStmnt_SelectionDef();

    /**
     * The meta object literal for the '<em><b>Provision Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_STMNT__PROVISION_DEFS = eINSTANCE.getProviderStmnt_ProvisionDefs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl <em>Filter Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getFilterDef()
     * @generated
     */
    EClass FILTER_DEF = eINSTANCE.getFilterDef();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_DEF__PARAMS = eINSTANCE.getFilterDef_Params();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_DEF__EXPRESSION = eINSTANCE.getFilterDef_Expression();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl <em>Qualification Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getQualificationDef()
     * @generated
     */
    EClass QUALIFICATION_DEF = eINSTANCE.getQualificationDef();

    /**
     * The meta object literal for the '<em><b>Targets Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFICATION_DEF__TARGETS_DEF = eINSTANCE.getQualificationDef_TargetsDef();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFICATION_DEF__CONTRIBUTION = eINSTANCE.getQualificationDef_Contribution();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl <em>Elements Contrib Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getElementsContribExp()
     * @generated
     */
    EClass ELEMENTS_CONTRIB_EXP = eINSTANCE.getElementsContribExp();

    /**
     * The meta object literal for the '<em><b>Is Preceding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTS_CONTRIB_EXP__IS_PRECEDING = eINSTANCE.getElementsContribExp_IsPreceding();

    /**
     * The meta object literal for the '<em><b>Is Imported</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTS_CONTRIB_EXP__IS_IMPORTED = eINSTANCE.getElementsContribExp_IsImported();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENTS_CONTRIB_EXP__EXPRESSION = eINSTANCE.getElementsContribExp_Expression();

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
     * The meta object literal for the '<em><b>Empty Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_DEF__EMPTY_SCOPE = eINSTANCE.getScopeDef_EmptyScope();

    /**
     * The meta object literal for the '<em><b>Also Exports</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_DEF__ALSO_EXPORTS = eINSTANCE.getScopeDef_AlsoExports();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl <em>Provision Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvisionDef()
     * @generated
     */
    EClass PROVISION_DEF = eINSTANCE.getProvisionDef();

    /**
     * The meta object literal for the '<em><b>Targets Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION_DEF__TARGETS_DEF = eINSTANCE.getProvisionDef_TargetsDef();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION_DEF__CONTRIBUTION = eINSTANCE.getProvisionDef_Contribution();

    /**
     * The meta object literal for the '<em><b>Occluding Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION_DEF__OCCLUDING_DEFS = eINSTANCE.getProvisionDef_OccludingDefs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassRefImpl <em>Class Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassRefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassRef()
     * @generated
     */
    EClass CLASS_REF = eINSTANCE.getClassRef();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_REF__CLASS_NAME = eINSTANCE.getClassRef_ClassName();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultipleClassRefImpl <em>Multiple Class Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultipleClassRefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMultipleClassRef()
     * @generated
     */
    EClass MULTIPLE_CLASS_REF = eINSTANCE.getMultipleClassRef();

    /**
     * The meta object literal for the '<em><b>Class Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLE_CLASS_REF__CLASS_NAMES = eINSTANCE.getMultipleClassRef_ClassNames();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl <em>Occluding Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getOccludingDef()
     * @generated
     */
    EClass OCCLUDING_DEF = eINSTANCE.getOccludingDef();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCLUDING_DEF__CONTRIBUTION = eINSTANCE.getOccludingDef_Contribution();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionDefImpl <em>Contribution Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContributionDef()
     * @generated
     */
    EClass CONTRIBUTION_DEF = eINSTANCE.getContributionDef();

    /**
     * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_DEF__CONTRIBUTIONS = eINSTANCE.getContributionDef_Contributions();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl <em>Selection Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionDef()
     * @generated
     */
    EClass SELECTION_DEF = eINSTANCE.getSelectionDef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl <em>Export Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportDef()
     * @generated
     */
    EClass EXPORT_DEF = eINSTANCE.getExportDef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl <em>Helpers Sect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelpersSect()
     * @generated
     */
    EClass HELPERS_SECT = eINSTANCE.getHelpersSect();

    /**
     * The meta object literal for the '<em><b>Class Helpers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPERS_SECT__CLASS_HELPERS = eINSTANCE.getHelpersSect_ClassHelpers();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl <em>Class Helper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getClassHelper()
     * @generated
     */
    EClass CLASS_HELPER = eINSTANCE.getClassHelper();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_HELPER__CONTEXT = eINSTANCE.getClassHelper_Context();

    /**
     * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_HELPER__HELPERS = eINSTANCE.getClassHelper_Helpers();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl <em>Helper Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperDef()
     * @generated
     */
    EClass HELPER_DEF = eINSTANCE.getHelperDef();

    /**
     * The meta object literal for the '<em><b>Owned Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_DEF__OWNED_SIGNATURE = eINSTANCE.getHelperDef_OwnedSignature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER_DEF__NAME = eINSTANCE.getHelperDef_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_DEF__PARAMS = eINSTANCE.getHelperDef_Params();

    /**
     * The meta object literal for the '<em><b>Owned Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_DEF__OWNED_TYPE = eINSTANCE.getHelperDef_OwnedType();

    /**
     * The meta object literal for the '<em><b>Helper Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_DEF__HELPER_BODY = eINSTANCE.getHelperDef_HelperBody();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl <em>Trace Exp CS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTraceExpCS()
     * @generated
     */
    EClass TRACE_EXP_CS = eINSTANCE.getTraceExpCS();

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
     * The meta object literal for the '<em><b>From Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP_EXP_CS__FROM_EXP = eINSTANCE.getLookupExpCS_FromExp();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP_EXP_CS__ARGS = eINSTANCE.getLookupExpCS_Args();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionAllImpl <em>Selection All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionAllImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionAll()
     * @generated
     */
    EClass SELECTION_ALL = eINSTANCE.getSelectionAll();

    /**
     * The meta object literal for the '<em><b>Exception Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_ALL__EXCEPTION_PROPERTIES = eINSTANCE.getSelectionAll_ExceptionProperties();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionSpecificImpl <em>Selection Specific</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionSpecificImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionSpecific()
     * @generated
     */
    EClass SELECTION_SPECIFIC = eINSTANCE.getSelectionSpecific();

    /**
     * The meta object literal for the '<em><b>Selected Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_SPECIFIC__SELECTED_PROPERTIES = eINSTANCE.getSelectionSpecific_SelectedProperties();

  }

} //Cs2as_dslPackage
