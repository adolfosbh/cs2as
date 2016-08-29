/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel;
import uk.ac.york.cs.cs2as.cs2as_dsl.Contribution;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslFactory;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence;
import uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Input;
import uk.ac.york.cs.cs2as.cs2as_dsl.Inputs;
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provision;
import uk.ac.york.cs.cs2as.cs2as_dsl.Qualification;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.Target;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.Targets;
import uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs2as_dslPackageImpl extends EPackageImpl implements Cs2as_dslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cs2ASModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingCreationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disambiguationSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disambiguationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disambiguationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameResolutionSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass escapeSequenceDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass escapeSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providerVarsDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualificationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentScopeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentScopeProvisionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass provisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplePathNamesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass occludingDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionsDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportedScopeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportedScopeProvisionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helpersSectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookupExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionSpecificEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Cs2as_dslPackageImpl()
  {
    super(eNS_URI, Cs2as_dslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Cs2as_dslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Cs2as_dslPackage init()
  {
    if (isInited) return (Cs2as_dslPackage)EPackage.Registry.INSTANCE.getEPackage(Cs2as_dslPackage.eNS_URI);

    // Obtain or create and register package
    Cs2as_dslPackageImpl theCs2as_dslPackage = (Cs2as_dslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cs2as_dslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cs2as_dslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EssentialOCLCSPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCs2as_dslPackage.createPackageContents();

    // Initialize created meta-data
    theCs2as_dslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCs2as_dslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Cs2as_dslPackage.eNS_URI, theCs2as_dslPackage);
    return theCs2as_dslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCS2ASModel()
  {
    return cs2ASModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_Source()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_Target()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_MappingSect()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_DisambiguationSect()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_NameresoSect()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS2ASModel_HelpersSect()
  {
    return (EReference)cs2ASModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceDomain()
  {
    return sourceDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceDomain_Metamodels()
  {
    return (EReference)sourceDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetDomain()
  {
    return targetDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetDomain_Metamodels()
  {
    return (EReference)targetDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingSect()
  {
    return mappingSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingSect_Mappings()
  {
    return (EReference)mappingSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingDef()
  {
    return mappingDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDef_To()
  {
    return (EReference)mappingDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDef_From()
  {
    return (EReference)mappingDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingCreation()
  {
    return mappingCreationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingCreation_Rule()
  {
    return (EAttribute)mappingCreationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingCreation_IsFallback()
  {
    return (EAttribute)mappingCreationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingCreation_Properties()
  {
    return (EReference)mappingCreationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDef()
  {
    return propertyDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDef_Redefine()
  {
    return (EAttribute)propertyDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDef_PropRef()
  {
    return (EReference)propertyDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDef_PropInit()
  {
    return (EReference)propertyDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingReference()
  {
    return mappingReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingReference_Expression()
  {
    return (EReference)mappingReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisambiguationSect()
  {
    return disambiguationSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationSect_Disambiguations()
  {
    return (EReference)disambiguationSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisambiguationDef()
  {
    return disambiguationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationDef_ClassRef()
  {
    return (EReference)disambiguationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationDef_Rules()
  {
    return (EReference)disambiguationDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisambiguationRule()
  {
    return disambiguationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisambiguationRule_Name()
  {
    return (EAttribute)disambiguationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisambiguationRule_Exp()
  {
    return (EReference)disambiguationRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameResolutionSect()
  {
    return nameResolutionSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_TargetsDef()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_InputsDef()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameResolutionSect_ProvidersDef()
  {
    return (EReference)nameResolutionSectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargets()
  {
    return targetsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargets_Targets()
  {
    return (EReference)targetsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTarget()
  {
    return targetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_ClassRef()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_PropRef()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTarget_IgnoreCase()
  {
    return (EAttribute)targetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_EscapeSeqDef()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_Filter()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_Qualification()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEscapeSequenceDef()
  {
    return escapeSequenceDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEscapeSequenceDef_Escapes()
  {
    return (EReference)escapeSequenceDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEscapeSequence()
  {
    return escapeSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEscapeSequence_Prefix()
  {
    return (EAttribute)escapeSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEscapeSequence_Suffix()
  {
    return (EAttribute)escapeSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputs()
  {
    return inputsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputs_Inputs()
  {
    return (EReference)inputsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Qualifier()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_TypeRef()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_PropRef()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProviders()
  {
    return providersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProviders_Providers()
  {
    return (EReference)providersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvider()
  {
    return providerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvider_ClassRef()
  {
    return (EReference)providerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvider_VarsDecl()
  {
    return (EReference)providerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvider_CurrentScope()
  {
    return (EReference)providerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvider_ExportedScope()
  {
    return (EReference)providerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProviderVarsDecl()
  {
    return providerVarsDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProviderVarsDecl_VarDecl()
  {
    return (EReference)providerVarsDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterDef()
  {
    return filterDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterDef_Params()
  {
    return (EReference)filterDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterDef_Expression()
  {
    return (EReference)filterDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualificationDef()
  {
    return qualificationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualificationDef_Qualifications()
  {
    return (EReference)qualificationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualification()
  {
    return qualificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualification_QualifiedClasses()
  {
    return (EReference)qualificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualification_Contributions()
  {
    return (EReference)qualificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentScopeDecl()
  {
    return currentScopeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurrentScopeDecl_ProvisionDefs()
  {
    return (EReference)currentScopeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentScopeProvisionDef()
  {
    return currentScopeProvisionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurrentScopeProvisionDef_SelectionDef()
  {
    return (EReference)currentScopeProvisionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentScopeProvisionDef_SameScope()
  {
    return (EAttribute)currentScopeProvisionDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentScopeProvisionDef_EmptyScope()
  {
    return (EAttribute)currentScopeProvisionDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurrentScopeProvisionDef_Provisions()
  {
    return (EReference)currentScopeProvisionDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionDef()
  {
    return selectionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvision()
  {
    return provisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvision_ProvidedClasses()
  {
    return (EReference)provisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvision_ContributionsDef()
  {
    return (EReference)provisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvision_OccludingDefs()
  {
    return (EReference)provisionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplePathNames()
  {
    return multiplePathNamesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplePathNames_PathNames()
  {
    return (EReference)multiplePathNamesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOccludingDef()
  {
    return occludingDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOccludingDef_ContributionsDef()
  {
    return (EReference)occludingDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionsDef()
  {
    return contributionsDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionsDef_Contributions()
  {
    return (EReference)contributionsDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContribution()
  {
    return contributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContribution_Child()
  {
    return (EReference)contributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_IsPreceding()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_IsExported()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContribution_TypeRefs()
  {
    return (EReference)contributionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_IsLoaded()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContribution_Expression()
  {
    return (EReference)contributionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportedScopeDecl()
  {
    return exportedScopeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportedScopeDecl_ProvisionDefs()
  {
    return (EReference)exportedScopeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportedScopeProvisionDef()
  {
    return exportedScopeProvisionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportedScopeProvisionDef_Provisions()
  {
    return (EReference)exportedScopeProvisionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelpersSect()
  {
    return helpersSectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelpersSect_ClassHelpers()
  {
    return (EReference)helpersSectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelperClass()
  {
    return helperClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperClass_Context()
  {
    return (EReference)helperClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperClass_Helpers()
  {
    return (EReference)helperClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelperOp()
  {
    return helperOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperOp_OwnedSignature()
  {
    return (EReference)helperOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelperOp_Name()
  {
    return (EAttribute)helperOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperOp_Params()
  {
    return (EReference)helperOpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperOp_OwnedType()
  {
    return (EReference)helperOpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelperOp_HelperBody()
  {
    return (EReference)helperOpEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraceExpCS()
  {
    return traceExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookupExpCS()
  {
    return lookupExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookupExpCS_IsExported()
  {
    return (EAttribute)lookupExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLookupExpCS_Args()
  {
    return (EReference)lookupExpCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionAll()
  {
    return selectionAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionAll_Exceptions()
  {
    return (EReference)selectionAllEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionSpecific()
  {
    return selectionSpecificEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionSpecific_Selections()
  {
    return (EReference)selectionSpecificEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslFactory getCs2as_dslFactory()
  {
    return (Cs2as_dslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cs2ASModelEClass = createEClass(CS2AS_MODEL);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__SOURCE);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__TARGET);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__MAPPING_SECT);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__DISAMBIGUATION_SECT);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__NAMERESO_SECT);
    createEReference(cs2ASModelEClass, CS2AS_MODEL__HELPERS_SECT);

    sourceDomainEClass = createEClass(SOURCE_DOMAIN);
    createEReference(sourceDomainEClass, SOURCE_DOMAIN__METAMODELS);

    targetDomainEClass = createEClass(TARGET_DOMAIN);
    createEReference(targetDomainEClass, TARGET_DOMAIN__METAMODELS);

    mappingSectEClass = createEClass(MAPPING_SECT);
    createEReference(mappingSectEClass, MAPPING_SECT__MAPPINGS);

    mappingDefEClass = createEClass(MAPPING_DEF);
    createEReference(mappingDefEClass, MAPPING_DEF__TO);
    createEReference(mappingDefEClass, MAPPING_DEF__FROM);

    mappingCreationEClass = createEClass(MAPPING_CREATION);
    createEAttribute(mappingCreationEClass, MAPPING_CREATION__RULE);
    createEAttribute(mappingCreationEClass, MAPPING_CREATION__IS_FALLBACK);
    createEReference(mappingCreationEClass, MAPPING_CREATION__PROPERTIES);

    propertyDefEClass = createEClass(PROPERTY_DEF);
    createEAttribute(propertyDefEClass, PROPERTY_DEF__REDEFINE);
    createEReference(propertyDefEClass, PROPERTY_DEF__PROP_REF);
    createEReference(propertyDefEClass, PROPERTY_DEF__PROP_INIT);

    mappingReferenceEClass = createEClass(MAPPING_REFERENCE);
    createEReference(mappingReferenceEClass, MAPPING_REFERENCE__EXPRESSION);

    disambiguationSectEClass = createEClass(DISAMBIGUATION_SECT);
    createEReference(disambiguationSectEClass, DISAMBIGUATION_SECT__DISAMBIGUATIONS);

    disambiguationDefEClass = createEClass(DISAMBIGUATION_DEF);
    createEReference(disambiguationDefEClass, DISAMBIGUATION_DEF__CLASS_REF);
    createEReference(disambiguationDefEClass, DISAMBIGUATION_DEF__RULES);

    disambiguationRuleEClass = createEClass(DISAMBIGUATION_RULE);
    createEAttribute(disambiguationRuleEClass, DISAMBIGUATION_RULE__NAME);
    createEReference(disambiguationRuleEClass, DISAMBIGUATION_RULE__EXP);

    nameResolutionSectEClass = createEClass(NAME_RESOLUTION_SECT);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__TARGETS_DEF);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__INPUTS_DEF);
    createEReference(nameResolutionSectEClass, NAME_RESOLUTION_SECT__PROVIDERS_DEF);

    targetsEClass = createEClass(TARGETS);
    createEReference(targetsEClass, TARGETS__TARGETS);

    targetEClass = createEClass(TARGET);
    createEReference(targetEClass, TARGET__CLASS_REF);
    createEReference(targetEClass, TARGET__PROP_REF);
    createEAttribute(targetEClass, TARGET__IGNORE_CASE);
    createEReference(targetEClass, TARGET__ESCAPE_SEQ_DEF);
    createEReference(targetEClass, TARGET__FILTER);
    createEReference(targetEClass, TARGET__QUALIFICATION);

    escapeSequenceDefEClass = createEClass(ESCAPE_SEQUENCE_DEF);
    createEReference(escapeSequenceDefEClass, ESCAPE_SEQUENCE_DEF__ESCAPES);

    escapeSequenceEClass = createEClass(ESCAPE_SEQUENCE);
    createEAttribute(escapeSequenceEClass, ESCAPE_SEQUENCE__PREFIX);
    createEAttribute(escapeSequenceEClass, ESCAPE_SEQUENCE__SUFFIX);

    inputsEClass = createEClass(INPUTS);
    createEReference(inputsEClass, INPUTS__INPUTS);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__QUALIFIER);
    createEReference(inputEClass, INPUT__TYPE_REF);
    createEReference(inputEClass, INPUT__PROP_REF);

    providersEClass = createEClass(PROVIDERS);
    createEReference(providersEClass, PROVIDERS__PROVIDERS);

    providerEClass = createEClass(PROVIDER);
    createEReference(providerEClass, PROVIDER__CLASS_REF);
    createEReference(providerEClass, PROVIDER__VARS_DECL);
    createEReference(providerEClass, PROVIDER__CURRENT_SCOPE);
    createEReference(providerEClass, PROVIDER__EXPORTED_SCOPE);

    providerVarsDeclEClass = createEClass(PROVIDER_VARS_DECL);
    createEReference(providerVarsDeclEClass, PROVIDER_VARS_DECL__VAR_DECL);

    filterDefEClass = createEClass(FILTER_DEF);
    createEReference(filterDefEClass, FILTER_DEF__PARAMS);
    createEReference(filterDefEClass, FILTER_DEF__EXPRESSION);

    qualificationDefEClass = createEClass(QUALIFICATION_DEF);
    createEReference(qualificationDefEClass, QUALIFICATION_DEF__QUALIFICATIONS);

    qualificationEClass = createEClass(QUALIFICATION);
    createEReference(qualificationEClass, QUALIFICATION__QUALIFIED_CLASSES);
    createEReference(qualificationEClass, QUALIFICATION__CONTRIBUTIONS);

    currentScopeDeclEClass = createEClass(CURRENT_SCOPE_DECL);
    createEReference(currentScopeDeclEClass, CURRENT_SCOPE_DECL__PROVISION_DEFS);

    currentScopeProvisionDefEClass = createEClass(CURRENT_SCOPE_PROVISION_DEF);
    createEReference(currentScopeProvisionDefEClass, CURRENT_SCOPE_PROVISION_DEF__SELECTION_DEF);
    createEAttribute(currentScopeProvisionDefEClass, CURRENT_SCOPE_PROVISION_DEF__SAME_SCOPE);
    createEAttribute(currentScopeProvisionDefEClass, CURRENT_SCOPE_PROVISION_DEF__EMPTY_SCOPE);
    createEReference(currentScopeProvisionDefEClass, CURRENT_SCOPE_PROVISION_DEF__PROVISIONS);

    selectionDefEClass = createEClass(SELECTION_DEF);

    provisionEClass = createEClass(PROVISION);
    createEReference(provisionEClass, PROVISION__PROVIDED_CLASSES);
    createEReference(provisionEClass, PROVISION__CONTRIBUTIONS_DEF);
    createEReference(provisionEClass, PROVISION__OCCLUDING_DEFS);

    multiplePathNamesEClass = createEClass(MULTIPLE_PATH_NAMES);
    createEReference(multiplePathNamesEClass, MULTIPLE_PATH_NAMES__PATH_NAMES);

    occludingDefEClass = createEClass(OCCLUDING_DEF);
    createEReference(occludingDefEClass, OCCLUDING_DEF__CONTRIBUTIONS_DEF);

    contributionsDefEClass = createEClass(CONTRIBUTIONS_DEF);
    createEReference(contributionsDefEClass, CONTRIBUTIONS_DEF__CONTRIBUTIONS);

    contributionEClass = createEClass(CONTRIBUTION);
    createEReference(contributionEClass, CONTRIBUTION__CHILD);
    createEAttribute(contributionEClass, CONTRIBUTION__IS_PRECEDING);
    createEAttribute(contributionEClass, CONTRIBUTION__IS_EXPORTED);
    createEReference(contributionEClass, CONTRIBUTION__TYPE_REFS);
    createEAttribute(contributionEClass, CONTRIBUTION__IS_LOADED);
    createEReference(contributionEClass, CONTRIBUTION__EXPRESSION);

    exportedScopeDeclEClass = createEClass(EXPORTED_SCOPE_DECL);
    createEReference(exportedScopeDeclEClass, EXPORTED_SCOPE_DECL__PROVISION_DEFS);

    exportedScopeProvisionDefEClass = createEClass(EXPORTED_SCOPE_PROVISION_DEF);
    createEReference(exportedScopeProvisionDefEClass, EXPORTED_SCOPE_PROVISION_DEF__PROVISIONS);

    helpersSectEClass = createEClass(HELPERS_SECT);
    createEReference(helpersSectEClass, HELPERS_SECT__CLASS_HELPERS);

    helperClassEClass = createEClass(HELPER_CLASS);
    createEReference(helperClassEClass, HELPER_CLASS__CONTEXT);
    createEReference(helperClassEClass, HELPER_CLASS__HELPERS);

    helperOpEClass = createEClass(HELPER_OP);
    createEReference(helperOpEClass, HELPER_OP__OWNED_SIGNATURE);
    createEAttribute(helperOpEClass, HELPER_OP__NAME);
    createEReference(helperOpEClass, HELPER_OP__PARAMS);
    createEReference(helperOpEClass, HELPER_OP__OWNED_TYPE);
    createEReference(helperOpEClass, HELPER_OP__HELPER_BODY);

    traceExpCSEClass = createEClass(TRACE_EXP_CS);

    lookupExpCSEClass = createEClass(LOOKUP_EXP_CS);
    createEAttribute(lookupExpCSEClass, LOOKUP_EXP_CS__IS_EXPORTED);
    createEReference(lookupExpCSEClass, LOOKUP_EXP_CS__ARGS);

    selectionAllEClass = createEClass(SELECTION_ALL);
    createEReference(selectionAllEClass, SELECTION_ALL__EXCEPTIONS);

    selectionSpecificEClass = createEClass(SELECTION_SPECIFIC);
    createEReference(selectionSpecificEClass, SELECTION_SPECIFIC__SELECTIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mappingCreationEClass.getESuperTypes().add(this.getMappingDef());
    mappingReferenceEClass.getESuperTypes().add(this.getMappingDef());
    traceExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
    lookupExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
    selectionAllEClass.getESuperTypes().add(this.getSelectionDef());
    selectionSpecificEClass.getESuperTypes().add(this.getSelectionDef());

    // Initialize classes and features; add operations and parameters
    initEClass(cs2ASModelEClass, CS2ASModel.class, "CS2ASModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCS2ASModel_Source(), this.getSourceDomain(), null, "source", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS2ASModel_Target(), this.getTargetDomain(), null, "target", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS2ASModel_MappingSect(), this.getMappingSect(), null, "mappingSect", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS2ASModel_DisambiguationSect(), this.getDisambiguationSect(), null, "disambiguationSect", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS2ASModel_NameresoSect(), this.getNameResolutionSect(), null, "nameresoSect", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS2ASModel_HelpersSect(), this.getHelpersSect(), null, "helpersSect", null, 0, 1, CS2ASModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceDomainEClass, SourceDomain.class, "SourceDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSourceDomain_Metamodels(), theBaseCSPackage.getImportCS(), null, "metamodels", null, 0, -1, SourceDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetDomainEClass, TargetDomain.class, "TargetDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTargetDomain_Metamodels(), theBaseCSPackage.getImportCS(), null, "metamodels", null, 0, -1, TargetDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingSectEClass, MappingSect.class, "MappingSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingSect_Mappings(), this.getMappingDef(), null, "mappings", null, 0, -1, MappingSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingDefEClass, MappingDef.class, "MappingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingDef_To(), theBaseCSPackage.getPathNameCS(), null, "to", null, 0, 1, MappingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingDef_From(), theBaseCSPackage.getPathNameCS(), null, "from", null, 0, 1, MappingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingCreationEClass, MappingCreation.class, "MappingCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingCreation_Rule(), theEcorePackage.getEString(), "rule", null, 0, 1, MappingCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingCreation_IsFallback(), theEcorePackage.getEBoolean(), "isFallback", null, 0, 1, MappingCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingCreation_Properties(), this.getPropertyDef(), null, "properties", null, 0, -1, MappingCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefEClass, PropertyDef.class, "PropertyDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDef_Redefine(), theEcorePackage.getEBoolean(), "redefine", null, 0, 1, PropertyDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDef_PropRef(), theBaseCSPackage.getPathNameCS(), null, "propRef", null, 0, 1, PropertyDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDef_PropInit(), theEssentialOCLCSPackage.getExpCS(), null, "propInit", null, 0, 1, PropertyDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingReferenceEClass, MappingReference.class, "MappingReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingReference_Expression(), theEssentialOCLCSPackage.getExpCS(), null, "expression", null, 0, 1, MappingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disambiguationSectEClass, DisambiguationSect.class, "DisambiguationSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisambiguationSect_Disambiguations(), this.getDisambiguationDef(), null, "disambiguations", null, 0, -1, DisambiguationSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disambiguationDefEClass, DisambiguationDef.class, "DisambiguationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisambiguationDef_ClassRef(), theBaseCSPackage.getPathNameCS(), null, "classRef", null, 0, 1, DisambiguationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisambiguationDef_Rules(), this.getDisambiguationRule(), null, "rules", null, 0, -1, DisambiguationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disambiguationRuleEClass, DisambiguationRule.class, "DisambiguationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisambiguationRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DisambiguationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisambiguationRule_Exp(), theEssentialOCLCSPackage.getExpCS(), null, "exp", null, 0, 1, DisambiguationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameResolutionSectEClass, NameResolutionSect.class, "NameResolutionSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameResolutionSect_TargetsDef(), this.getTargets(), null, "targetsDef", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameResolutionSect_InputsDef(), this.getInputs(), null, "inputsDef", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameResolutionSect_ProvidersDef(), this.getProviders(), null, "providersDef", null, 0, 1, NameResolutionSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetsEClass, Targets.class, "Targets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTargets_Targets(), this.getTarget(), null, "targets", null, 0, -1, Targets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTarget_ClassRef(), theBaseCSPackage.getPathNameCS(), null, "classRef", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTarget_PropRef(), theBaseCSPackage.getPathNameCS(), null, "propRef", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTarget_IgnoreCase(), theEcorePackage.getEBoolean(), "ignoreCase", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTarget_EscapeSeqDef(), this.getEscapeSequenceDef(), null, "escapeSeqDef", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTarget_Filter(), this.getFilterDef(), null, "filter", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTarget_Qualification(), this.getQualificationDef(), null, "qualification", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(escapeSequenceDefEClass, EscapeSequenceDef.class, "EscapeSequenceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEscapeSequenceDef_Escapes(), this.getEscapeSequence(), null, "escapes", null, 0, -1, EscapeSequenceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(escapeSequenceEClass, EscapeSequence.class, "EscapeSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEscapeSequence_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, EscapeSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEscapeSequence_Suffix(), theEcorePackage.getEString(), "suffix", null, 0, 1, EscapeSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputsEClass, Inputs.class, "Inputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputs_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Inputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Qualifier(), theEcorePackage.getEBoolean(), "qualifier", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_TypeRef(), theBaseCSPackage.getPathNameCS(), null, "typeRef", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_PropRef(), theBaseCSPackage.getPathNameCS(), null, "propRef", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providersEClass, Providers.class, "Providers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProviders_Providers(), this.getProvider(), null, "providers", null, 0, -1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProvider_ClassRef(), theBaseCSPackage.getPathNameCS(), null, "classRef", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvider_VarsDecl(), this.getProviderVarsDecl(), null, "varsDecl", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvider_CurrentScope(), this.getCurrentScopeDecl(), null, "currentScope", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvider_ExportedScope(), this.getExportedScopeDecl(), null, "exportedScope", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providerVarsDeclEClass, ProviderVarsDecl.class, "ProviderVarsDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProviderVarsDecl_VarDecl(), theEssentialOCLCSPackage.getLetVariableCS(), null, "varDecl", null, 0, -1, ProviderVarsDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterDefEClass, FilterDef.class, "FilterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterDef_Params(), theBaseCSPackage.getParameterCS(), null, "params", null, 0, -1, FilterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterDef_Expression(), theEssentialOCLCSPackage.getExpCS(), null, "expression", null, 0, 1, FilterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualificationDefEClass, QualificationDef.class, "QualificationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualificationDef_Qualifications(), this.getQualification(), null, "qualifications", null, 0, -1, QualificationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualificationEClass, Qualification.class, "Qualification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualification_QualifiedClasses(), this.getMultiplePathNames(), null, "qualifiedClasses", null, 0, 1, Qualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualification_Contributions(), theEssentialOCLCSPackage.getExpCS(), null, "contributions", null, 0, -1, Qualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentScopeDeclEClass, CurrentScopeDecl.class, "CurrentScopeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCurrentScopeDecl_ProvisionDefs(), this.getCurrentScopeProvisionDef(), null, "provisionDefs", null, 0, -1, CurrentScopeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentScopeProvisionDefEClass, CurrentScopeProvisionDef.class, "CurrentScopeProvisionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCurrentScopeProvisionDef_SelectionDef(), this.getSelectionDef(), null, "selectionDef", null, 0, 1, CurrentScopeProvisionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCurrentScopeProvisionDef_SameScope(), theEcorePackage.getEBoolean(), "sameScope", null, 0, 1, CurrentScopeProvisionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCurrentScopeProvisionDef_EmptyScope(), theEcorePackage.getEBoolean(), "emptyScope", null, 0, 1, CurrentScopeProvisionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCurrentScopeProvisionDef_Provisions(), this.getProvision(), null, "provisions", null, 0, -1, CurrentScopeProvisionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionDefEClass, SelectionDef.class, "SelectionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(provisionEClass, Provision.class, "Provision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProvision_ProvidedClasses(), this.getMultiplePathNames(), null, "providedClasses", null, 0, 1, Provision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvision_ContributionsDef(), this.getContributionsDef(), null, "contributionsDef", null, 0, 1, Provision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvision_OccludingDefs(), this.getOccludingDef(), null, "occludingDefs", null, 0, -1, Provision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplePathNamesEClass, MultiplePathNames.class, "MultiplePathNames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplePathNames_PathNames(), theBaseCSPackage.getPathNameCS(), null, "pathNames", null, 0, -1, MultiplePathNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(occludingDefEClass, OccludingDef.class, "OccludingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOccludingDef_ContributionsDef(), this.getContributionsDef(), null, "contributionsDef", null, 0, 1, OccludingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionsDefEClass, ContributionsDef.class, "ContributionsDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContributionsDef_Contributions(), this.getContribution(), null, "contributions", null, 0, -1, ContributionsDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContribution_Child(), theBaseCSPackage.getParameterCS(), null, "child", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContribution_IsPreceding(), theEcorePackage.getEBoolean(), "isPreceding", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContribution_IsExported(), theEcorePackage.getEBoolean(), "isExported", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContribution_TypeRefs(), theBaseCSPackage.getPathNameCS(), null, "typeRefs", null, 0, -1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContribution_IsLoaded(), theEcorePackage.getEBoolean(), "isLoaded", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContribution_Expression(), theEssentialOCLCSPackage.getExpCS(), null, "expression", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportedScopeDeclEClass, ExportedScopeDecl.class, "ExportedScopeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExportedScopeDecl_ProvisionDefs(), this.getExportedScopeProvisionDef(), null, "provisionDefs", null, 0, -1, ExportedScopeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportedScopeProvisionDefEClass, ExportedScopeProvisionDef.class, "ExportedScopeProvisionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExportedScopeProvisionDef_Provisions(), this.getProvision(), null, "provisions", null, 0, -1, ExportedScopeProvisionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helpersSectEClass, HelpersSect.class, "HelpersSect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHelpersSect_ClassHelpers(), this.getHelperClass(), null, "classHelpers", null, 0, -1, HelpersSect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperClassEClass, HelperClass.class, "HelperClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHelperClass_Context(), theBaseCSPackage.getPathNameCS(), null, "context", null, 0, 1, HelperClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperClass_Helpers(), this.getHelperOp(), null, "helpers", null, 0, -1, HelperClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperOpEClass, HelperOp.class, "HelperOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHelperOp_OwnedSignature(), theBaseCSPackage.getTemplateSignatureCS(), null, "ownedSignature", null, 0, 1, HelperOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelperOp_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HelperOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperOp_Params(), theBaseCSPackage.getParameterCS(), null, "params", null, 0, -1, HelperOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperOp_OwnedType(), theBaseCSPackage.getTypedRefCS(), null, "ownedType", null, 0, 1, HelperOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperOp_HelperBody(), theEssentialOCLCSPackage.getExpCS(), null, "helperBody", null, 0, 1, HelperOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traceExpCSEClass, TraceExpCS.class, "TraceExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lookupExpCSEClass, LookupExpCS.class, "LookupExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookupExpCS_IsExported(), theEcorePackage.getEBoolean(), "isExported", null, 0, 1, LookupExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupExpCS_Args(), theEssentialOCLCSPackage.getExpCS(), null, "args", null, 0, -1, LookupExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionAllEClass, SelectionAll.class, "SelectionAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionAll_Exceptions(), theBaseCSPackage.getPathNameCS(), null, "exceptions", null, 0, -1, SelectionAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionSpecificEClass, SelectionSpecific.class, "SelectionSpecific", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionSpecific_Selections(), theBaseCSPackage.getPathNameCS(), null, "selections", null, 0, -1, SelectionSpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Cs2as_dslPackageImpl
