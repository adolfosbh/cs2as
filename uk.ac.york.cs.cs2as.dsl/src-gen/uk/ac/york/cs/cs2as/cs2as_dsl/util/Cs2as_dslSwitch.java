/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;

import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public class Cs2as_dslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Cs2as_dslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Cs2as_dslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL:
      {
        CS2ASModel cs2ASModel = (CS2ASModel)theEObject;
        T result = caseCS2ASModel(cs2ASModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SOURCE_DOMAIN:
      {
        SourceDomain sourceDomain = (SourceDomain)theEObject;
        T result = caseSourceDomain(sourceDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TARGET_DOMAIN:
      {
        TargetDomain targetDomain = (TargetDomain)theEObject;
        T result = caseTargetDomain(targetDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAPPING_SECT:
      {
        MappingSect mappingSect = (MappingSect)theEObject;
        T result = caseMappingSect(mappingSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAPPING_DEF:
      {
        MappingDef mappingDef = (MappingDef)theEObject;
        T result = caseMappingDef(mappingDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAPPING_CREATION:
      {
        MappingCreation mappingCreation = (MappingCreation)theEObject;
        T result = caseMappingCreation(mappingCreation);
        if (result == null) result = caseMappingDef(mappingCreation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROPERTY_DEF:
      {
        PropertyDef propertyDef = (PropertyDef)theEObject;
        T result = casePropertyDef(propertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAPPING_REFERENCE:
      {
        MappingReference mappingReference = (MappingReference)theEObject;
        T result = caseMappingReference(mappingReference);
        if (result == null) result = caseMappingDef(mappingReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_SECT:
      {
        DisambiguationSect disambiguationSect = (DisambiguationSect)theEObject;
        T result = caseDisambiguationSect(disambiguationSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_DEF:
      {
        DisambiguationDef disambiguationDef = (DisambiguationDef)theEObject;
        T result = caseDisambiguationDef(disambiguationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_RULE:
      {
        DisambiguationRule disambiguationRule = (DisambiguationRule)theEObject;
        T result = caseDisambiguationRule(disambiguationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT:
      {
        NameResolutionSect nameResolutionSect = (NameResolutionSect)theEObject;
        T result = caseNameResolutionSect(nameResolutionSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TARGETS:
      {
        Targets targets = (Targets)theEObject;
        T result = caseTargets(targets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TARGET:
      {
        Target target = (Target)theEObject;
        T result = caseTarget(target);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.ESCAPE_SEQUENCE_DEF:
      {
        EscapeSequenceDef escapeSequenceDef = (EscapeSequenceDef)theEObject;
        T result = caseEscapeSequenceDef(escapeSequenceDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.ESCAPE_SEQUENCE:
      {
        EscapeSequence escapeSequence = (EscapeSequence)theEObject;
        T result = caseEscapeSequence(escapeSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.INPUTS:
      {
        Inputs inputs = (Inputs)theEObject;
        T result = caseInputs(inputs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROVIDERS:
      {
        Providers providers = (Providers)theEObject;
        T result = caseProviders(providers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROVIDER:
      {
        Provider provider = (Provider)theEObject;
        T result = caseProvider(provider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROVIDER_VARS_DECL:
      {
        ProviderVarsDecl providerVarsDecl = (ProviderVarsDecl)theEObject;
        T result = caseProviderVarsDecl(providerVarsDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.FILTER_DEF:
      {
        FilterDef filterDef = (FilterDef)theEObject;
        T result = caseFilterDef(filterDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.QUALIFICATION_DEF:
      {
        QualificationDef qualificationDef = (QualificationDef)theEObject;
        T result = caseQualificationDef(qualificationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.QUALIFICATION:
      {
        Qualification qualification = (Qualification)theEObject;
        T result = caseQualification(qualification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CURRENT_SCOPE_DECL:
      {
        CurrentScopeDecl currentScopeDecl = (CurrentScopeDecl)theEObject;
        T result = caseCurrentScopeDecl(currentScopeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CURRENT_SCOPE_PROVISION_DEF:
      {
        CurrentScopeProvisionDef currentScopeProvisionDef = (CurrentScopeProvisionDef)theEObject;
        T result = caseCurrentScopeProvisionDef(currentScopeProvisionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_DEF:
      {
        SelectionDef selectionDef = (SelectionDef)theEObject;
        T result = caseSelectionDef(selectionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROVISION:
      {
        Provision provision = (Provision)theEObject;
        T result = caseProvision(provision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MULTIPLE_PATH_NAMES:
      {
        MultiplePathNames multiplePathNames = (MultiplePathNames)theEObject;
        T result = caseMultiplePathNames(multiplePathNames);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.OCCLUDING_DEF:
      {
        OccludingDef occludingDef = (OccludingDef)theEObject;
        T result = caseOccludingDef(occludingDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CONTRIBUTIONS_DEF:
      {
        ContributionsDef contributionsDef = (ContributionsDef)theEObject;
        T result = caseContributionsDef(contributionsDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CONTRIBUTION:
      {
        Contribution contribution = (Contribution)theEObject;
        T result = caseContribution(contribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.EXPORTED_SCOPE_DECL:
      {
        ExportedScopeDecl exportedScopeDecl = (ExportedScopeDecl)theEObject;
        T result = caseExportedScopeDecl(exportedScopeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.EXPORTED_SCOPE_PROVISION_DEF:
      {
        ExportedScopeProvisionDef exportedScopeProvisionDef = (ExportedScopeProvisionDef)theEObject;
        T result = caseExportedScopeProvisionDef(exportedScopeProvisionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.HELPERS_SECT:
      {
        HelpersSect helpersSect = (HelpersSect)theEObject;
        T result = caseHelpersSect(helpersSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.HELPER_CLASS:
      {
        HelperClass helperClass = (HelperClass)theEObject;
        T result = caseHelperClass(helperClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.HELPER_OP:
      {
        HelperOp helperOp = (HelperOp)theEObject;
        T result = caseHelperOp(helperOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TRACE_EXP_CS:
      {
        TraceExpCS traceExpCS = (TraceExpCS)theEObject;
        T result = caseTraceExpCS(traceExpCS);
        if (result == null) result = caseExpCS(traceExpCS);
        if (result == null) result = caseModelElementCS(traceExpCS);
        if (result == null) result = casePivotableElementCS(traceExpCS);
        if (result == null) result = caseElementCS(traceExpCS);
        if (result == null) result = casePivotable(traceExpCS);
        if (result == null) result = caseVisitableCS(traceExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.LOOKUP_EXP_CS:
      {
        LookupExpCS lookupExpCS = (LookupExpCS)theEObject;
        T result = caseLookupExpCS(lookupExpCS);
        if (result == null) result = caseExpCS(lookupExpCS);
        if (result == null) result = caseModelElementCS(lookupExpCS);
        if (result == null) result = casePivotableElementCS(lookupExpCS);
        if (result == null) result = caseElementCS(lookupExpCS);
        if (result == null) result = casePivotable(lookupExpCS);
        if (result == null) result = caseVisitableCS(lookupExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_ALL:
      {
        SelectionAll selectionAll = (SelectionAll)theEObject;
        T result = caseSelectionAll(selectionAll);
        if (result == null) result = caseSelectionDef(selectionAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_SPECIFIC:
      {
        SelectionSpecific selectionSpecific = (SelectionSpecific)theEObject;
        T result = caseSelectionSpecific(selectionSpecific);
        if (result == null) result = caseSelectionDef(selectionSpecific);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CS2AS Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CS2AS Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCS2ASModel(CS2ASModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceDomain(SourceDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetDomain(TargetDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingSect(MappingSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingDef(MappingDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Creation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Creation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingCreation(MappingCreation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDef(PropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingReference(MappingReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationSect(DisambiguationSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationDef(DisambiguationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationRule(DisambiguationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Resolution Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Resolution Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameResolutionSect(NameResolutionSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Targets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Targets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargets(Targets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTarget(Target object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Escape Sequence Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Escape Sequence Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEscapeSequenceDef(EscapeSequenceDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Escape Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Escape Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEscapeSequence(EscapeSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inputs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inputs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputs(Inputs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Providers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Providers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProviders(Providers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvider(Provider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provider Vars Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provider Vars Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProviderVarsDecl(ProviderVarsDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterDef(FilterDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualification Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualification Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualificationDef(QualificationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualification(Qualification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Scope Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Scope Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentScopeDecl(CurrentScopeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Scope Provision Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Scope Provision Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentScopeProvisionDef(CurrentScopeProvisionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionDef(SelectionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvision(Provision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiple Path Names</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiple Path Names</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplePathNames(MultiplePathNames object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Occluding Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occluding Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOccludingDef(OccludingDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contributions Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contributions Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionsDef(ContributionsDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContribution(Contribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exported Scope Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exported Scope Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportedScopeDecl(ExportedScopeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exported Scope Provision Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exported Scope Provision Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportedScopeProvisionDef(ExportedScopeProvisionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helpers Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helpers Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelpersSect(HelpersSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelperClass(HelperClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelperOp(HelperOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trace Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trace Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceExpCS(TraceExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookupExpCS(LookupExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionAll(SelectionAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Specific</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Specific</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionSpecific(SelectionSpecific object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisitableCS(VisitableCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementCS(ElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePivotable(Pivotable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePivotableElementCS(PivotableElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElementCS(ModelElementCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpCS(ExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Cs2as_dslSwitch
