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
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl <em>CS2AS Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCS2ASModel()
   * @generated
   */
  int CS2AS_MODEL = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__TARGET = 1;

  /**
   * The feature id for the '<em><b>Mapping Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__MAPPING_SECT = 2;

  /**
   * The feature id for the '<em><b>Disambiguation Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__DISAMBIGUATION_SECT = 3;

  /**
   * The feature id for the '<em><b>Namereso Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__NAMERESO_SECT = 4;

  /**
   * The feature id for the '<em><b>Helpers Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL__HELPERS_SECT = 5;

  /**
   * The number of structural features of the '<em>CS2AS Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS2AS_MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SourceDomainImpl <em>Source Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SourceDomainImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSourceDomain()
   * @generated
   */
  int SOURCE_DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_DOMAIN__METAMODELS = 0;

  /**
   * The number of structural features of the '<em>Source Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_DOMAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetDomainImpl <em>Target Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetDomainImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTargetDomain()
   * @generated
   */
  int TARGET_DOMAIN = 2;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_DOMAIN__METAMODELS = 0;

  /**
   * The number of structural features of the '<em>Target Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_DOMAIN_FEATURE_COUNT = 1;

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
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingDefImpl <em>Mapping Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingDef()
   * @generated
   */
  int MAPPING_DEF = 4;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DEF__TO = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DEF__FROM = 1;

  /**
   * The number of structural features of the '<em>Mapping Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingCreationImpl <em>Mapping Creation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingCreationImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingCreation()
   * @generated
   */
  int MAPPING_CREATION = 5;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION__TO = MAPPING_DEF__TO;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION__FROM = MAPPING_DEF__FROM;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION__RULE = MAPPING_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Fallback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION__IS_FALLBACK = MAPPING_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION__PROPERTIES = MAPPING_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mapping Creation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CREATION_FEATURE_COUNT = MAPPING_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl <em>Property Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getPropertyDef()
   * @generated
   */
  int PROPERTY_DEF = 6;

  /**
   * The feature id for the '<em><b>Redefine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEF__REDEFINE = 0;

  /**
   * The feature id for the '<em><b>Prop Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEF__PROP_REF = 1;

  /**
   * The feature id for the '<em><b>Prop Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEF__PROP_INIT = 2;

  /**
   * The number of structural features of the '<em>Property Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingReferenceImpl <em>Mapping Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingReferenceImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingReference()
   * @generated
   */
  int MAPPING_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_REFERENCE__TO = MAPPING_DEF__TO;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_REFERENCE__FROM = MAPPING_DEF__FROM;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_REFERENCE__EXPRESSION = MAPPING_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mapping Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_REFERENCE_FEATURE_COUNT = MAPPING_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl <em>Disambiguation Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationSect()
   * @generated
   */
  int DISAMBIGUATION_SECT = 8;

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
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl <em>Disambiguation Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationDef()
   * @generated
   */
  int DISAMBIGUATION_DEF = 9;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF__CLASS_REF = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF__RULES = 1;

  /**
   * The number of structural features of the '<em>Disambiguation Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationRuleImpl <em>Disambiguation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationRuleImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationRule()
   * @generated
   */
  int DISAMBIGUATION_RULE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_RULE__EXP = 1;

  /**
   * The number of structural features of the '<em>Disambiguation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISAMBIGUATION_RULE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__IGNORE_CASE = 2;

  /**
   * The feature id for the '<em><b>Escape Seq Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__ESCAPE_SEQ_DEF = 3;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__FILTER = 4;

  /**
   * The feature id for the '<em><b>Qualification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__QUALIFICATION = 5;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceDefImpl <em>Escape Sequence Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getEscapeSequenceDef()
   * @generated
   */
  int ESCAPE_SEQUENCE_DEF = 14;

  /**
   * The feature id for the '<em><b>Escapes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCAPE_SEQUENCE_DEF__ESCAPES = 0;

  /**
   * The number of structural features of the '<em>Escape Sequence Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCAPE_SEQUENCE_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceImpl <em>Escape Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getEscapeSequence()
   * @generated
   */
  int ESCAPE_SEQUENCE = 15;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCAPE_SEQUENCE__PREFIX = 0;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCAPE_SEQUENCE__SUFFIX = 1;

  /**
   * The number of structural features of the '<em>Escape Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCAPE_SEQUENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl <em>Inputs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputsImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getInputs()
   * @generated
   */
  int INPUTS = 16;

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
  int INPUT = 17;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__TYPE_REF = 1;

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
  int PROVIDERS = 18;

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
  int PROVIDER = 19;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__CLASS_REF = 0;

  /**
   * The feature id for the '<em><b>Vars Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__VARS_DECL = 1;

  /**
   * The feature id for the '<em><b>Current Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__CURRENT_SCOPE = 2;

  /**
   * The feature id for the '<em><b>Exported Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__EXPORTED_SCOPE = 3;

  /**
   * The number of structural features of the '<em>Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderVarsDeclImpl <em>Provider Vars Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderVarsDeclImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviderVarsDecl()
   * @generated
   */
  int PROVIDER_VARS_DECL = 20;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_VARS_DECL__VAR_DECL = 0;

  /**
   * The number of structural features of the '<em>Provider Vars Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_VARS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl <em>Filter Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.FilterDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getFilterDef()
   * @generated
   */
  int FILTER_DEF = 21;

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
  int QUALIFICATION_DEF = 22;

  /**
   * The feature id for the '<em><b>Qualifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_DEF__QUALIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Qualification Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl <em>Qualification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getQualification()
   * @generated
   */
  int QUALIFICATION = 23;

  /**
   * The feature id for the '<em><b>Qualified Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION__QUALIFIED_CLASSES = 0;

  /**
   * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION__CONTRIBUTIONS = 1;

  /**
   * The number of structural features of the '<em>Qualification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeDeclImpl <em>Current Scope Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeDeclImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCurrentScopeDecl()
   * @generated
   */
  int CURRENT_SCOPE_DECL = 24;

  /**
   * The feature id for the '<em><b>Provision Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_DECL__PROVISION_DEFS = 0;

  /**
   * The number of structural features of the '<em>Current Scope Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeProvisionDefImpl <em>Current Scope Provision Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeProvisionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCurrentScopeProvisionDef()
   * @generated
   */
  int CURRENT_SCOPE_PROVISION_DEF = 25;

  /**
   * The feature id for the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_PROVISION_DEF__SELECTION_DEF = 0;

  /**
   * The feature id for the '<em><b>Same Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_PROVISION_DEF__SAME_SCOPE = 1;

  /**
   * The feature id for the '<em><b>Empty Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_PROVISION_DEF__EMPTY_SCOPE = 2;

  /**
   * The feature id for the '<em><b>Provisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_PROVISION_DEF__PROVISIONS = 3;

  /**
   * The number of structural features of the '<em>Current Scope Provision Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_SCOPE_PROVISION_DEF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl <em>Selection Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SelectionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSelectionDef()
   * @generated
   */
  int SELECTION_DEF = 26;

  /**
   * The number of structural features of the '<em>Selection Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl <em>Provision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvision()
   * @generated
   */
  int PROVISION = 27;

  /**
   * The feature id for the '<em><b>Provided Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__PROVIDED_CLASSES = 0;

  /**
   * The feature id for the '<em><b>Contributions Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__CONTRIBUTIONS_DEF = 1;

  /**
   * The feature id for the '<em><b>Occluding Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__OCCLUDING_DEFS = 2;

  /**
   * The number of structural features of the '<em>Provision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultiplePathNamesImpl <em>Multiple Path Names</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultiplePathNamesImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMultiplePathNames()
   * @generated
   */
  int MULTIPLE_PATH_NAMES = 28;

  /**
   * The feature id for the '<em><b>Path Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_PATH_NAMES__PATH_NAMES = 0;

  /**
   * The number of structural features of the '<em>Multiple Path Names</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_PATH_NAMES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl <em>Occluding Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getOccludingDef()
   * @generated
   */
  int OCCLUDING_DEF = 29;

  /**
   * The feature id for the '<em><b>Contributions Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCLUDING_DEF__CONTRIBUTIONS_DEF = 0;

  /**
   * The number of structural features of the '<em>Occluding Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCLUDING_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionsDefImpl <em>Contributions Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionsDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContributionsDef()
   * @generated
   */
  int CONTRIBUTIONS_DEF = 30;

  /**
   * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTIONS_DEF__CONTRIBUTIONS = 0;

  /**
   * The number of structural features of the '<em>Contributions Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTIONS_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl <em>Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContribution()
   * @generated
   */
  int CONTRIBUTION = 31;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__CHILD = 0;

  /**
   * The feature id for the '<em><b>Is Preceding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__IS_PRECEDING = 1;

  /**
   * The feature id for the '<em><b>Is Exported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__IS_EXPORTED = 2;

  /**
   * The feature id for the '<em><b>Type Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__TYPE_REFS = 3;

  /**
   * The feature id for the '<em><b>Is Loaded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__IS_LOADED = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__EXPRESSION = 5;

  /**
   * The number of structural features of the '<em>Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeDeclImpl <em>Exported Scope Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeDeclImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportedScopeDecl()
   * @generated
   */
  int EXPORTED_SCOPE_DECL = 32;

  /**
   * The feature id for the '<em><b>Provision Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTED_SCOPE_DECL__PROVISION_DEFS = 0;

  /**
   * The number of structural features of the '<em>Exported Scope Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTED_SCOPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeProvisionDefImpl <em>Exported Scope Provision Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeProvisionDefImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportedScopeProvisionDef()
   * @generated
   */
  int EXPORTED_SCOPE_PROVISION_DEF = 33;

  /**
   * The feature id for the '<em><b>Provisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS = 0;

  /**
   * The number of structural features of the '<em>Exported Scope Provision Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTED_SCOPE_PROVISION_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl <em>Helpers Sect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelpersSectImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelpersSect()
   * @generated
   */
  int HELPERS_SECT = 34;

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
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperClassImpl <em>Helper Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperClassImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperClass()
   * @generated
   */
  int HELPER_CLASS = 35;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_CLASS__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_CLASS__HELPERS = 1;

  /**
   * The number of structural features of the '<em>Helper Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl <em>Helper Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperOp()
   * @generated
   */
  int HELPER_OP = 36;

  /**
   * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP__OWNED_SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP__OWNED_TYPE = 3;

  /**
   * The feature id for the '<em><b>Helper Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP__HELPER_BODY = 4;

  /**
   * The number of structural features of the '<em>Helper Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_OP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl <em>Trace Exp CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TraceExpCSImpl
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTraceExpCS()
   * @generated
   */
  int TRACE_EXP_CS = 37;

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
  int LOOKUP_EXP_CS = 38;

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
   * The feature id for the '<em><b>Is Exported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_EXP_CS__IS_EXPORTED = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

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
  int SELECTION_ALL = 39;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_ALL__EXCEPTIONS = SELECTION_DEF_FEATURE_COUNT + 0;

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
  int SELECTION_SPECIFIC = 40;

  /**
   * The feature id for the '<em><b>Selections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_SPECIFIC__SELECTIONS = SELECTION_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection Specific</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_SPECIFIC_FEATURE_COUNT = SELECTION_DEF_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel <em>CS2AS Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CS2AS Model</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel
   * @generated
   */
  EClass getCS2ASModel();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getSource()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_Source();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getTarget()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_Target();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getMappingSect <em>Mapping Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getMappingSect()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_MappingSect();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getDisambiguationSect <em>Disambiguation Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Disambiguation Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getDisambiguationSect()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_DisambiguationSect();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getNameresoSect <em>Namereso Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namereso Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getNameresoSect()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_NameresoSect();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getHelpersSect <em>Helpers Sect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Helpers Sect</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getHelpersSect()
   * @see #getCS2ASModel()
   * @generated
   */
  EReference getCS2ASModel_HelpersSect();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain <em>Source Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Domain</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain
   * @generated
   */
  EClass getSourceDomain();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain#getMetamodels()
   * @see #getSourceDomain()
   * @generated
   */
  EReference getSourceDomain_Metamodels();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain <em>Target Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Domain</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain
   * @generated
   */
  EClass getTargetDomain();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain#getMetamodels()
   * @see #getTargetDomain()
   * @generated
   */
  EReference getTargetDomain_Metamodels();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef <em>Mapping Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef
   * @generated
   */
  EClass getMappingDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef#getTo()
   * @see #getMappingDef()
   * @generated
   */
  EReference getMappingDef_To();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef#getFrom()
   * @see #getMappingDef()
   * @generated
   */
  EReference getMappingDef_From();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation <em>Mapping Creation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Creation</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation
   * @generated
   */
  EClass getMappingCreation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getRule()
   * @see #getMappingCreation()
   * @generated
   */
  EAttribute getMappingCreation_Rule();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#isIsFallback <em>Is Fallback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Fallback</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#isIsFallback()
   * @see #getMappingCreation()
   * @generated
   */
  EAttribute getMappingCreation_IsFallback();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation#getProperties()
   * @see #getMappingCreation()
   * @generated
   */
  EReference getMappingCreation_Properties();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef <em>Property Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef
   * @generated
   */
  EClass getPropertyDef();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#isRedefine <em>Redefine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Redefine</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#isRedefine()
   * @see #getPropertyDef()
   * @generated
   */
  EAttribute getPropertyDef_Redefine();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropRef <em>Prop Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropRef()
   * @see #getPropertyDef()
   * @generated
   */
  EReference getPropertyDef_PropRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropInit <em>Prop Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Init</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef#getPropInit()
   * @see #getPropertyDef()
   * @generated
   */
  EReference getPropertyDef_PropInit();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference <em>Mapping Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Reference</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference
   * @generated
   */
  EClass getMappingReference();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference#getExpression()
   * @see #getMappingReference()
   * @generated
   */
  EReference getMappingReference_Expression();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef <em>Disambiguation Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disambiguation Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
   * @generated
   */
  EClass getDisambiguationDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getClassRef()
   * @see #getDisambiguationDef()
   * @generated
   */
  EReference getDisambiguationDef_ClassRef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef#getRules()
   * @see #getDisambiguationDef()
   * @generated
   */
  EReference getDisambiguationDef_Rules();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule <em>Disambiguation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disambiguation Rule</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule
   * @generated
   */
  EClass getDisambiguationRule();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule#getName()
   * @see #getDisambiguationRule()
   * @generated
   */
  EAttribute getDisambiguationRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule#getExp()
   * @see #getDisambiguationRule()
   * @generated
   */
  EReference getDisambiguationRule_Exp();

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
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#isIgnoreCase <em>Ignore Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore Case</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#isIgnoreCase()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_IgnoreCase();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getEscapeSeqDef <em>Escape Seq Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Escape Seq Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getEscapeSeqDef()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_EscapeSeqDef();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualification <em>Qualification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualification</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target#getQualification()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Qualification();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef <em>Escape Sequence Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Escape Sequence Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef
   * @generated
   */
  EClass getEscapeSequenceDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef#getEscapes <em>Escapes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Escapes</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef#getEscapes()
   * @see #getEscapeSequenceDef()
   * @generated
   */
  EReference getEscapeSequenceDef_Escapes();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence <em>Escape Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Escape Sequence</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence
   * @generated
   */
  EClass getEscapeSequence();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence#getPrefix()
   * @see #getEscapeSequence()
   * @generated
   */
  EAttribute getEscapeSequence_Prefix();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suffix</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence#getSuffix()
   * @see #getEscapeSequence()
   * @generated
   */
  EAttribute getEscapeSequence_Suffix();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input#getTypeRef()
   * @see #getInput()
   * @generated
   */
  EReference getInput_TypeRef();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getVarsDecl <em>Vars Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vars Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getVarsDecl()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_VarsDecl();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getCurrentScope <em>Current Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Current Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getCurrentScope()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_CurrentScope();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getExportedScope <em>Exported Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exported Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getExportedScope()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_ExportedScope();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl <em>Provider Vars Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider Vars Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl
   * @generated
   */
  EClass getProviderVarsDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl#getVarDecl()
   * @see #getProviderVarsDecl()
   * @generated
   */
  EReference getProviderVarsDecl_VarDecl();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getQualifications <em>Qualifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualifications</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef#getQualifications()
   * @see #getQualificationDef()
   * @generated
   */
  EReference getQualificationDef_Qualifications();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification <em>Qualification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualification</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Qualification
   * @generated
   */
  EClass getQualification();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getQualifiedClasses <em>Qualified Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Classes</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getQualifiedClasses()
   * @see #getQualification()
   * @generated
   */
  EReference getQualification_QualifiedClasses();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getContributions <em>Contributions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Qualification#getContributions()
   * @see #getQualification()
   * @generated
   */
  EReference getQualification_Contributions();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl <em>Current Scope Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Scope Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl
   * @generated
   */
  EClass getCurrentScopeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl#getProvisionDefs <em>Provision Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provision Defs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl#getProvisionDefs()
   * @see #getCurrentScopeDecl()
   * @generated
   */
  EReference getCurrentScopeDecl_ProvisionDefs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef <em>Current Scope Provision Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Scope Provision Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef
   * @generated
   */
  EClass getCurrentScopeProvisionDef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#getSelectionDef <em>Selection Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#getSelectionDef()
   * @see #getCurrentScopeProvisionDef()
   * @generated
   */
  EReference getCurrentScopeProvisionDef_SelectionDef();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#isSameScope <em>Same Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Same Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#isSameScope()
   * @see #getCurrentScopeProvisionDef()
   * @generated
   */
  EAttribute getCurrentScopeProvisionDef_SameScope();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#isEmptyScope <em>Empty Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty Scope</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#isEmptyScope()
   * @see #getCurrentScopeProvisionDef()
   * @generated
   */
  EAttribute getCurrentScopeProvisionDef_EmptyScope();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#getProvisions <em>Provisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provisions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef#getProvisions()
   * @see #getCurrentScopeProvisionDef()
   * @generated
   */
  EReference getCurrentScopeProvisionDef_Provisions();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provision</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provision
   * @generated
   */
  EClass getProvision();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getProvidedClasses <em>Provided Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provided Classes</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getProvidedClasses()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_ProvidedClasses();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getContributionsDef <em>Contributions Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contributions Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getContributionsDef()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_ContributionsDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getOccludingDefs <em>Occluding Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Occluding Defs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provision#getOccludingDefs()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_OccludingDefs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames <em>Multiple Path Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Path Names</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames
   * @generated
   */
  EClass getMultiplePathNames();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames#getPathNames <em>Path Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Path Names</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames#getPathNames()
   * @see #getMultiplePathNames()
   * @generated
   */
  EReference getMultiplePathNames_PathNames();

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
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContributionsDef <em>Contributions Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contributions Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef#getContributionsDef()
   * @see #getOccludingDef()
   * @generated
   */
  EReference getOccludingDef_ContributionsDef();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef <em>Contributions Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contributions Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef
   * @generated
   */
  EClass getContributionsDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef#getContributions <em>Contributions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef#getContributions()
   * @see #getContributionsDef()
   * @generated
   */
  EReference getContributionsDef_Contributions();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution
   * @generated
   */
  EClass getContribution();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getChild()
   * @see #getContribution()
   * @generated
   */
  EReference getContribution_Child();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsPreceding <em>Is Preceding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Preceding</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsPreceding()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_IsPreceding();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsExported <em>Is Exported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exported</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsExported()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_IsExported();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getTypeRefs <em>Type Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Refs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getTypeRefs()
   * @see #getContribution()
   * @generated
   */
  EReference getContribution_TypeRefs();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsLoaded <em>Is Loaded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Loaded</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#isIsLoaded()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_IsLoaded();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution#getExpression()
   * @see #getContribution()
   * @generated
   */
  EReference getContribution_Expression();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl <em>Exported Scope Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exported Scope Decl</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl
   * @generated
   */
  EClass getExportedScopeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl#getProvisionDefs <em>Provision Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provision Defs</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl#getProvisionDefs()
   * @see #getExportedScopeDecl()
   * @generated
   */
  EReference getExportedScopeDecl_ProvisionDefs();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef <em>Exported Scope Provision Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exported Scope Provision Def</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef
   * @generated
   */
  EClass getExportedScopeProvisionDef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef#getProvisions <em>Provisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provisions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef#getProvisions()
   * @see #getExportedScopeProvisionDef()
   * @generated
   */
  EReference getExportedScopeProvisionDef_Provisions();

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
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass <em>Helper Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper Class</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass
   * @generated
   */
  EClass getHelperClass();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass#getContext()
   * @see #getHelperClass()
   * @generated
   */
  EReference getHelperClass_Context();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass#getHelpers <em>Helpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helpers</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass#getHelpers()
   * @see #getHelperClass()
   * @generated
   */
  EReference getHelperClass_Helpers();

  /**
   * Returns the meta object for class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp <em>Helper Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper Op</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp
   * @generated
   */
  EClass getHelperOp();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getOwnedSignature <em>Owned Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Signature</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getOwnedSignature()
   * @see #getHelperOp()
   * @generated
   */
  EReference getHelperOp_OwnedSignature();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getName()
   * @see #getHelperOp()
   * @generated
   */
  EAttribute getHelperOp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getParams()
   * @see #getHelperOp()
   * @generated
   */
  EReference getHelperOp_Params();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getOwnedType <em>Owned Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Type</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getOwnedType()
   * @see #getHelperOp()
   * @generated
   */
  EReference getHelperOp_OwnedType();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getHelperBody <em>Helper Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Helper Body</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp#getHelperBody()
   * @see #getHelperOp()
   * @generated
   */
  EReference getHelperOp_HelperBody();

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
   * Returns the meta object for the attribute '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isIsExported <em>Is Exported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exported</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS#isIsExported()
   * @see #getLookupExpCS()
   * @generated
   */
  EAttribute getLookupExpCS_IsExported();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll#getExceptions()
   * @see #getSelectionAll()
   * @generated
   */
  EReference getSelectionAll_Exceptions();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific#getSelections <em>Selections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selections</em>'.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific#getSelections()
   * @see #getSelectionSpecific()
   * @generated
   */
  EReference getSelectionSpecific_Selections();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl <em>CS2AS Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCS2ASModel()
     * @generated
     */
    EClass CS2AS_MODEL = eINSTANCE.getCS2ASModel();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__SOURCE = eINSTANCE.getCS2ASModel_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__TARGET = eINSTANCE.getCS2ASModel_Target();

    /**
     * The meta object literal for the '<em><b>Mapping Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__MAPPING_SECT = eINSTANCE.getCS2ASModel_MappingSect();

    /**
     * The meta object literal for the '<em><b>Disambiguation Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__DISAMBIGUATION_SECT = eINSTANCE.getCS2ASModel_DisambiguationSect();

    /**
     * The meta object literal for the '<em><b>Namereso Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__NAMERESO_SECT = eINSTANCE.getCS2ASModel_NameresoSect();

    /**
     * The meta object literal for the '<em><b>Helpers Sect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS2AS_MODEL__HELPERS_SECT = eINSTANCE.getCS2ASModel_HelpersSect();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.SourceDomainImpl <em>Source Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.SourceDomainImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getSourceDomain()
     * @generated
     */
    EClass SOURCE_DOMAIN = eINSTANCE.getSourceDomain();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_DOMAIN__METAMODELS = eINSTANCE.getSourceDomain_Metamodels();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetDomainImpl <em>Target Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetDomainImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getTargetDomain()
     * @generated
     */
    EClass TARGET_DOMAIN = eINSTANCE.getTargetDomain();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_DOMAIN__METAMODELS = eINSTANCE.getTargetDomain_Metamodels();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingDefImpl <em>Mapping Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingDef()
     * @generated
     */
    EClass MAPPING_DEF = eINSTANCE.getMappingDef();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DEF__TO = eINSTANCE.getMappingDef_To();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DEF__FROM = eINSTANCE.getMappingDef_From();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingCreationImpl <em>Mapping Creation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingCreationImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingCreation()
     * @generated
     */
    EClass MAPPING_CREATION = eINSTANCE.getMappingCreation();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_CREATION__RULE = eINSTANCE.getMappingCreation_Rule();

    /**
     * The meta object literal for the '<em><b>Is Fallback</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_CREATION__IS_FALLBACK = eINSTANCE.getMappingCreation_IsFallback();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_CREATION__PROPERTIES = eINSTANCE.getMappingCreation_Properties();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl <em>Property Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getPropertyDef()
     * @generated
     */
    EClass PROPERTY_DEF = eINSTANCE.getPropertyDef();

    /**
     * The meta object literal for the '<em><b>Redefine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEF__REDEFINE = eINSTANCE.getPropertyDef_Redefine();

    /**
     * The meta object literal for the '<em><b>Prop Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEF__PROP_REF = eINSTANCE.getPropertyDef_PropRef();

    /**
     * The meta object literal for the '<em><b>Prop Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEF__PROP_INIT = eINSTANCE.getPropertyDef_PropInit();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingReferenceImpl <em>Mapping Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MappingReferenceImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMappingReference()
     * @generated
     */
    EClass MAPPING_REFERENCE = eINSTANCE.getMappingReference();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_REFERENCE__EXPRESSION = eINSTANCE.getMappingReference_Expression();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl <em>Disambiguation Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationDef()
     * @generated
     */
    EClass DISAMBIGUATION_DEF = eINSTANCE.getDisambiguationDef();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_DEF__CLASS_REF = eINSTANCE.getDisambiguationDef_ClassRef();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_DEF__RULES = eINSTANCE.getDisambiguationDef_Rules();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationRuleImpl <em>Disambiguation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationRuleImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getDisambiguationRule()
     * @generated
     */
    EClass DISAMBIGUATION_RULE = eINSTANCE.getDisambiguationRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISAMBIGUATION_RULE__NAME = eINSTANCE.getDisambiguationRule_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISAMBIGUATION_RULE__EXP = eINSTANCE.getDisambiguationRule_Exp();

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
     * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__IGNORE_CASE = eINSTANCE.getTarget_IgnoreCase();

    /**
     * The meta object literal for the '<em><b>Escape Seq Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__ESCAPE_SEQ_DEF = eINSTANCE.getTarget_EscapeSeqDef();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__FILTER = eINSTANCE.getTarget_Filter();

    /**
     * The meta object literal for the '<em><b>Qualification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__QUALIFICATION = eINSTANCE.getTarget_Qualification();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceDefImpl <em>Escape Sequence Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getEscapeSequenceDef()
     * @generated
     */
    EClass ESCAPE_SEQUENCE_DEF = eINSTANCE.getEscapeSequenceDef();

    /**
     * The meta object literal for the '<em><b>Escapes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESCAPE_SEQUENCE_DEF__ESCAPES = eINSTANCE.getEscapeSequenceDef_Escapes();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceImpl <em>Escape Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.EscapeSequenceImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getEscapeSequence()
     * @generated
     */
    EClass ESCAPE_SEQUENCE = eINSTANCE.getEscapeSequence();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESCAPE_SEQUENCE__PREFIX = eINSTANCE.getEscapeSequence_Prefix();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESCAPE_SEQUENCE__SUFFIX = eINSTANCE.getEscapeSequence_Suffix();

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
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__TYPE_REF = eINSTANCE.getInput_TypeRef();

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
     * The meta object literal for the '<em><b>Vars Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__VARS_DECL = eINSTANCE.getProvider_VarsDecl();

    /**
     * The meta object literal for the '<em><b>Current Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__CURRENT_SCOPE = eINSTANCE.getProvider_CurrentScope();

    /**
     * The meta object literal for the '<em><b>Exported Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__EXPORTED_SCOPE = eINSTANCE.getProvider_ExportedScope();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderVarsDeclImpl <em>Provider Vars Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProviderVarsDeclImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProviderVarsDecl()
     * @generated
     */
    EClass PROVIDER_VARS_DECL = eINSTANCE.getProviderVarsDecl();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_VARS_DECL__VAR_DECL = eINSTANCE.getProviderVarsDecl_VarDecl();

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
     * The meta object literal for the '<em><b>Qualifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFICATION_DEF__QUALIFICATIONS = eINSTANCE.getQualificationDef_Qualifications();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl <em>Qualification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.QualificationImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getQualification()
     * @generated
     */
    EClass QUALIFICATION = eINSTANCE.getQualification();

    /**
     * The meta object literal for the '<em><b>Qualified Classes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFICATION__QUALIFIED_CLASSES = eINSTANCE.getQualification_QualifiedClasses();

    /**
     * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFICATION__CONTRIBUTIONS = eINSTANCE.getQualification_Contributions();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeDeclImpl <em>Current Scope Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeDeclImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCurrentScopeDecl()
     * @generated
     */
    EClass CURRENT_SCOPE_DECL = eINSTANCE.getCurrentScopeDecl();

    /**
     * The meta object literal for the '<em><b>Provision Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURRENT_SCOPE_DECL__PROVISION_DEFS = eINSTANCE.getCurrentScopeDecl_ProvisionDefs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeProvisionDefImpl <em>Current Scope Provision Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.CurrentScopeProvisionDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getCurrentScopeProvisionDef()
     * @generated
     */
    EClass CURRENT_SCOPE_PROVISION_DEF = eINSTANCE.getCurrentScopeProvisionDef();

    /**
     * The meta object literal for the '<em><b>Selection Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURRENT_SCOPE_PROVISION_DEF__SELECTION_DEF = eINSTANCE.getCurrentScopeProvisionDef_SelectionDef();

    /**
     * The meta object literal for the '<em><b>Same Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_SCOPE_PROVISION_DEF__SAME_SCOPE = eINSTANCE.getCurrentScopeProvisionDef_SameScope();

    /**
     * The meta object literal for the '<em><b>Empty Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_SCOPE_PROVISION_DEF__EMPTY_SCOPE = eINSTANCE.getCurrentScopeProvisionDef_EmptyScope();

    /**
     * The meta object literal for the '<em><b>Provisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURRENT_SCOPE_PROVISION_DEF__PROVISIONS = eINSTANCE.getCurrentScopeProvisionDef_Provisions();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl <em>Provision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ProvisionImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getProvision()
     * @generated
     */
    EClass PROVISION = eINSTANCE.getProvision();

    /**
     * The meta object literal for the '<em><b>Provided Classes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__PROVIDED_CLASSES = eINSTANCE.getProvision_ProvidedClasses();

    /**
     * The meta object literal for the '<em><b>Contributions Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__CONTRIBUTIONS_DEF = eINSTANCE.getProvision_ContributionsDef();

    /**
     * The meta object literal for the '<em><b>Occluding Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__OCCLUDING_DEFS = eINSTANCE.getProvision_OccludingDefs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultiplePathNamesImpl <em>Multiple Path Names</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.MultiplePathNamesImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getMultiplePathNames()
     * @generated
     */
    EClass MULTIPLE_PATH_NAMES = eINSTANCE.getMultiplePathNames();

    /**
     * The meta object literal for the '<em><b>Path Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLE_PATH_NAMES__PATH_NAMES = eINSTANCE.getMultiplePathNames_PathNames();

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
     * The meta object literal for the '<em><b>Contributions Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCLUDING_DEF__CONTRIBUTIONS_DEF = eINSTANCE.getOccludingDef_ContributionsDef();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionsDefImpl <em>Contributions Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionsDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContributionsDef()
     * @generated
     */
    EClass CONTRIBUTIONS_DEF = eINSTANCE.getContributionsDef();

    /**
     * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTIONS_DEF__CONTRIBUTIONS = eINSTANCE.getContributionsDef_Contributions();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl <em>Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ContributionImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getContribution()
     * @generated
     */
    EClass CONTRIBUTION = eINSTANCE.getContribution();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION__CHILD = eINSTANCE.getContribution_Child();

    /**
     * The meta object literal for the '<em><b>Is Preceding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__IS_PRECEDING = eINSTANCE.getContribution_IsPreceding();

    /**
     * The meta object literal for the '<em><b>Is Exported</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__IS_EXPORTED = eINSTANCE.getContribution_IsExported();

    /**
     * The meta object literal for the '<em><b>Type Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION__TYPE_REFS = eINSTANCE.getContribution_TypeRefs();

    /**
     * The meta object literal for the '<em><b>Is Loaded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__IS_LOADED = eINSTANCE.getContribution_IsLoaded();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION__EXPRESSION = eINSTANCE.getContribution_Expression();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeDeclImpl <em>Exported Scope Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeDeclImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportedScopeDecl()
     * @generated
     */
    EClass EXPORTED_SCOPE_DECL = eINSTANCE.getExportedScopeDecl();

    /**
     * The meta object literal for the '<em><b>Provision Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORTED_SCOPE_DECL__PROVISION_DEFS = eINSTANCE.getExportedScopeDecl_ProvisionDefs();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeProvisionDefImpl <em>Exported Scope Provision Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportedScopeProvisionDefImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getExportedScopeProvisionDef()
     * @generated
     */
    EClass EXPORTED_SCOPE_PROVISION_DEF = eINSTANCE.getExportedScopeProvisionDef();

    /**
     * The meta object literal for the '<em><b>Provisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS = eINSTANCE.getExportedScopeProvisionDef_Provisions();

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
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperClassImpl <em>Helper Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperClassImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperClass()
     * @generated
     */
    EClass HELPER_CLASS = eINSTANCE.getHelperClass();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_CLASS__CONTEXT = eINSTANCE.getHelperClass_Context();

    /**
     * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_CLASS__HELPERS = eINSTANCE.getHelperClass_Helpers();

    /**
     * The meta object literal for the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl <em>Helper Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl
     * @see uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslPackageImpl#getHelperOp()
     * @generated
     */
    EClass HELPER_OP = eINSTANCE.getHelperOp();

    /**
     * The meta object literal for the '<em><b>Owned Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_OP__OWNED_SIGNATURE = eINSTANCE.getHelperOp_OwnedSignature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER_OP__NAME = eINSTANCE.getHelperOp_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_OP__PARAMS = eINSTANCE.getHelperOp_Params();

    /**
     * The meta object literal for the '<em><b>Owned Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_OP__OWNED_TYPE = eINSTANCE.getHelperOp_OwnedType();

    /**
     * The meta object literal for the '<em><b>Helper Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_OP__HELPER_BODY = eINSTANCE.getHelperOp_HelperBody();

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
     * The meta object literal for the '<em><b>Is Exported</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP_EXP_CS__IS_EXPORTED = eINSTANCE.getLookupExpCS_IsExported();

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
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_ALL__EXCEPTIONS = eINSTANCE.getSelectionAll_Exceptions();

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
     * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_SPECIFIC__SELECTIONS = eINSTANCE.getSelectionSpecific_Selections();

  }

} //Cs2as_dslPackage
