/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs2as_dslFactoryImpl extends EFactoryImpl implements Cs2as_dslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Cs2as_dslFactory init()
  {
    try
    {
      Cs2as_dslFactory theCs2as_dslFactory = (Cs2as_dslFactory)EPackage.Registry.INSTANCE.getEFactory(Cs2as_dslPackage.eNS_URI);
      if (theCs2as_dslFactory != null)
      {
        return theCs2as_dslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Cs2as_dslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Cs2as_dslPackage.CS2AS_MODEL: return createCS2ASModel();
      case Cs2as_dslPackage.SOURCE_DOMAIN: return createSourceDomain();
      case Cs2as_dslPackage.TARGET_DOMAIN: return createTargetDomain();
      case Cs2as_dslPackage.MAPPING_SECT: return createMappingSect();
      case Cs2as_dslPackage.MAPPING_DEF: return createMappingDef();
      case Cs2as_dslPackage.MAPPING_CREATION: return createMappingCreation();
      case Cs2as_dslPackage.PROPERTY_DEF: return createPropertyDef();
      case Cs2as_dslPackage.MAPPING_REFERENCE: return createMappingReference();
      case Cs2as_dslPackage.DISAMBIGUATION_SECT: return createDisambiguationSect();
      case Cs2as_dslPackage.DISAMBIGUATION_DEF: return createDisambiguationDef();
      case Cs2as_dslPackage.DISAMBIGUATION_RULE: return createDisambiguationRule();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT: return createNameResolutionSect();
      case Cs2as_dslPackage.TARGETS: return createTargets();
      case Cs2as_dslPackage.TARGET: return createTarget();
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF: return createEscapeSequenceDef();
      case Cs2as_dslPackage.ESCAPE_SEQUENCE: return createEscapeSequence();
      case Cs2as_dslPackage.INPUTS: return createInputs();
      case Cs2as_dslPackage.INPUT: return createInput();
      case Cs2as_dslPackage.PROVIDERS: return createProviders();
      case Cs2as_dslPackage.PROVIDER: return createProvider();
      case Cs2as_dslPackage.PROVIDER_VARS_DECL: return createProviderVarsDecl();
      case Cs2as_dslPackage.FILTER_DEF: return createFilterDef();
      case Cs2as_dslPackage.QUALIFICATION_DEF: return createQualificationDef();
      case Cs2as_dslPackage.QUALIFICATION: return createQualification();
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL: return createCurrentScopeDecl();
      case Cs2as_dslPackage.CURRENT_SCOPE_PROVISION_DEF: return createCurrentScopeProvisionDef();
      case Cs2as_dslPackage.SELECTION_DEF: return createSelectionDef();
      case Cs2as_dslPackage.PROVISION: return createProvision();
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES: return createMultiplePathNames();
      case Cs2as_dslPackage.OCCLUDING_DEF: return createOccludingDef();
      case Cs2as_dslPackage.CONTRIBUTIONS_DEF: return createContributionsDef();
      case Cs2as_dslPackage.CONTRIBUTION: return createContribution();
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL: return createExportedScopeDecl();
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF: return createExportedScopeProvisionDef();
      case Cs2as_dslPackage.HELPERS_SECT: return createHelpersSect();
      case Cs2as_dslPackage.HELPER_CLASS: return createHelperClass();
      case Cs2as_dslPackage.HELPER_OP: return createHelperOp();
      case Cs2as_dslPackage.TRACE_EXP_CS: return createTraceExpCS();
      case Cs2as_dslPackage.LOOKUP_EXP_CS: return createLookupExpCS();
      case Cs2as_dslPackage.SELECTION_ALL: return createSelectionAll();
      case Cs2as_dslPackage.SELECTION_SPECIFIC: return createSelectionSpecific();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CS2ASModel createCS2ASModel()
  {
    CS2ASModelImpl cs2ASModel = new CS2ASModelImpl();
    return cs2ASModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceDomain createSourceDomain()
  {
    SourceDomainImpl sourceDomain = new SourceDomainImpl();
    return sourceDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetDomain createTargetDomain()
  {
    TargetDomainImpl targetDomain = new TargetDomainImpl();
    return targetDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingSect createMappingSect()
  {
    MappingSectImpl mappingSect = new MappingSectImpl();
    return mappingSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDef createMappingDef()
  {
    MappingDefImpl mappingDef = new MappingDefImpl();
    return mappingDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingCreation createMappingCreation()
  {
    MappingCreationImpl mappingCreation = new MappingCreationImpl();
    return mappingCreation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDef createPropertyDef()
  {
    PropertyDefImpl propertyDef = new PropertyDefImpl();
    return propertyDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingReference createMappingReference()
  {
    MappingReferenceImpl mappingReference = new MappingReferenceImpl();
    return mappingReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationSect createDisambiguationSect()
  {
    DisambiguationSectImpl disambiguationSect = new DisambiguationSectImpl();
    return disambiguationSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationDef createDisambiguationDef()
  {
    DisambiguationDefImpl disambiguationDef = new DisambiguationDefImpl();
    return disambiguationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationRule createDisambiguationRule()
  {
    DisambiguationRuleImpl disambiguationRule = new DisambiguationRuleImpl();
    return disambiguationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameResolutionSect createNameResolutionSect()
  {
    NameResolutionSectImpl nameResolutionSect = new NameResolutionSectImpl();
    return nameResolutionSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Targets createTargets()
  {
    TargetsImpl targets = new TargetsImpl();
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscapeSequenceDef createEscapeSequenceDef()
  {
    EscapeSequenceDefImpl escapeSequenceDef = new EscapeSequenceDefImpl();
    return escapeSequenceDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscapeSequence createEscapeSequence()
  {
    EscapeSequenceImpl escapeSequence = new EscapeSequenceImpl();
    return escapeSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inputs createInputs()
  {
    InputsImpl inputs = new InputsImpl();
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Providers createProviders()
  {
    ProvidersImpl providers = new ProvidersImpl();
    return providers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provider createProvider()
  {
    ProviderImpl provider = new ProviderImpl();
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderVarsDecl createProviderVarsDecl()
  {
    ProviderVarsDeclImpl providerVarsDecl = new ProviderVarsDeclImpl();
    return providerVarsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterDef createFilterDef()
  {
    FilterDefImpl filterDef = new FilterDefImpl();
    return filterDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualificationDef createQualificationDef()
  {
    QualificationDefImpl qualificationDef = new QualificationDefImpl();
    return qualificationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualification createQualification()
  {
    QualificationImpl qualification = new QualificationImpl();
    return qualification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentScopeDecl createCurrentScopeDecl()
  {
    CurrentScopeDeclImpl currentScopeDecl = new CurrentScopeDeclImpl();
    return currentScopeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentScopeProvisionDef createCurrentScopeProvisionDef()
  {
    CurrentScopeProvisionDefImpl currentScopeProvisionDef = new CurrentScopeProvisionDefImpl();
    return currentScopeProvisionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionDef createSelectionDef()
  {
    SelectionDefImpl selectionDef = new SelectionDefImpl();
    return selectionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provision createProvision()
  {
    ProvisionImpl provision = new ProvisionImpl();
    return provision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplePathNames createMultiplePathNames()
  {
    MultiplePathNamesImpl multiplePathNames = new MultiplePathNamesImpl();
    return multiplePathNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OccludingDef createOccludingDef()
  {
    OccludingDefImpl occludingDef = new OccludingDefImpl();
    return occludingDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionsDef createContributionsDef()
  {
    ContributionsDefImpl contributionsDef = new ContributionsDefImpl();
    return contributionsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contribution createContribution()
  {
    ContributionImpl contribution = new ContributionImpl();
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportedScopeDecl createExportedScopeDecl()
  {
    ExportedScopeDeclImpl exportedScopeDecl = new ExportedScopeDeclImpl();
    return exportedScopeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportedScopeProvisionDef createExportedScopeProvisionDef()
  {
    ExportedScopeProvisionDefImpl exportedScopeProvisionDef = new ExportedScopeProvisionDefImpl();
    return exportedScopeProvisionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelpersSect createHelpersSect()
  {
    HelpersSectImpl helpersSect = new HelpersSectImpl();
    return helpersSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelperClass createHelperClass()
  {
    HelperClassImpl helperClass = new HelperClassImpl();
    return helperClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelperOp createHelperOp()
  {
    HelperOpImpl helperOp = new HelperOpImpl();
    return helperOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceExpCS createTraceExpCS()
  {
    TraceExpCSImpl traceExpCS = new TraceExpCSImpl();
    return traceExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupExpCS createLookupExpCS()
  {
    LookupExpCSImpl lookupExpCS = new LookupExpCSImpl();
    return lookupExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionAll createSelectionAll()
  {
    SelectionAllImpl selectionAll = new SelectionAllImpl();
    return selectionAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionSpecific createSelectionSpecific()
  {
    SelectionSpecificImpl selectionSpecific = new SelectionSpecificImpl();
    return selectionSpecific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslPackage getCs2as_dslPackage()
  {
    return (Cs2as_dslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Cs2as_dslPackage getPackage()
  {
    return Cs2as_dslPackage.eINSTANCE;
  }

} //Cs2as_dslFactoryImpl
