/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;

import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public class Cs2as_dslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Cs2as_dslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Cs2as_dslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cs2as_dslSwitch<Adapter> modelSwitch =
    new Cs2as_dslSwitch<Adapter>()
    {
      @Override
      public Adapter caseCS2ASModel(CS2ASModel object)
      {
        return createCS2ASModelAdapter();
      }
      @Override
      public Adapter caseSourceDomain(SourceDomain object)
      {
        return createSourceDomainAdapter();
      }
      @Override
      public Adapter caseTargetDomain(TargetDomain object)
      {
        return createTargetDomainAdapter();
      }
      @Override
      public Adapter caseMappingSect(MappingSect object)
      {
        return createMappingSectAdapter();
      }
      @Override
      public Adapter caseMappingDef(MappingDef object)
      {
        return createMappingDefAdapter();
      }
      @Override
      public Adapter caseMappingCreation(MappingCreation object)
      {
        return createMappingCreationAdapter();
      }
      @Override
      public Adapter casePropertyDef(PropertyDef object)
      {
        return createPropertyDefAdapter();
      }
      @Override
      public Adapter caseMappingReference(MappingReference object)
      {
        return createMappingReferenceAdapter();
      }
      @Override
      public Adapter caseDisambiguationSect(DisambiguationSect object)
      {
        return createDisambiguationSectAdapter();
      }
      @Override
      public Adapter caseDisambiguationDef(DisambiguationDef object)
      {
        return createDisambiguationDefAdapter();
      }
      @Override
      public Adapter caseDisambiguationRule(DisambiguationRule object)
      {
        return createDisambiguationRuleAdapter();
      }
      @Override
      public Adapter caseNameResolutionSect(NameResolutionSect object)
      {
        return createNameResolutionSectAdapter();
      }
      @Override
      public Adapter caseTargets(Targets object)
      {
        return createTargetsAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseEscapeSequenceDef(EscapeSequenceDef object)
      {
        return createEscapeSequenceDefAdapter();
      }
      @Override
      public Adapter caseEscapeSequence(EscapeSequence object)
      {
        return createEscapeSequenceAdapter();
      }
      @Override
      public Adapter caseInputs(Inputs object)
      {
        return createInputsAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseProviders(Providers object)
      {
        return createProvidersAdapter();
      }
      @Override
      public Adapter caseProvider(Provider object)
      {
        return createProviderAdapter();
      }
      @Override
      public Adapter caseProviderVarsDecl(ProviderVarsDecl object)
      {
        return createProviderVarsDeclAdapter();
      }
      @Override
      public Adapter caseFilterDef(FilterDef object)
      {
        return createFilterDefAdapter();
      }
      @Override
      public Adapter caseQualificationDef(QualificationDef object)
      {
        return createQualificationDefAdapter();
      }
      @Override
      public Adapter caseQualification(Qualification object)
      {
        return createQualificationAdapter();
      }
      @Override
      public Adapter caseCurrentScopeDecl(CurrentScopeDecl object)
      {
        return createCurrentScopeDeclAdapter();
      }
      @Override
      public Adapter caseCurrentScopeProvisionDef(CurrentScopeProvisionDef object)
      {
        return createCurrentScopeProvisionDefAdapter();
      }
      @Override
      public Adapter caseSelectionDef(SelectionDef object)
      {
        return createSelectionDefAdapter();
      }
      @Override
      public Adapter caseProvision(Provision object)
      {
        return createProvisionAdapter();
      }
      @Override
      public Adapter caseMultiplePathNames(MultiplePathNames object)
      {
        return createMultiplePathNamesAdapter();
      }
      @Override
      public Adapter caseOccludingDef(OccludingDef object)
      {
        return createOccludingDefAdapter();
      }
      @Override
      public Adapter caseContributionsDef(ContributionsDef object)
      {
        return createContributionsDefAdapter();
      }
      @Override
      public Adapter caseContribution(Contribution object)
      {
        return createContributionAdapter();
      }
      @Override
      public Adapter caseExportedScopeDecl(ExportedScopeDecl object)
      {
        return createExportedScopeDeclAdapter();
      }
      @Override
      public Adapter caseExportedScopeProvisionDef(ExportedScopeProvisionDef object)
      {
        return createExportedScopeProvisionDefAdapter();
      }
      @Override
      public Adapter caseHelpersSect(HelpersSect object)
      {
        return createHelpersSectAdapter();
      }
      @Override
      public Adapter caseHelperClass(HelperClass object)
      {
        return createHelperClassAdapter();
      }
      @Override
      public Adapter caseHelperOp(HelperOp object)
      {
        return createHelperOpAdapter();
      }
      @Override
      public Adapter caseTraceExpCS(TraceExpCS object)
      {
        return createTraceExpCSAdapter();
      }
      @Override
      public Adapter caseLookupExpCS(LookupExpCS object)
      {
        return createLookupExpCSAdapter();
      }
      @Override
      public Adapter caseSelectionAll(SelectionAll object)
      {
        return createSelectionAllAdapter();
      }
      @Override
      public Adapter caseSelectionSpecific(SelectionSpecific object)
      {
        return createSelectionSpecificAdapter();
      }
      @Override
      public Adapter caseVisitableCS(VisitableCS object)
      {
        return createVisitableCSAdapter();
      }
      @Override
      public Adapter caseElementCS(ElementCS object)
      {
        return createElementCSAdapter();
      }
      @Override
      public Adapter casePivotable(Pivotable object)
      {
        return createPivotableAdapter();
      }
      @Override
      public Adapter casePivotableElementCS(PivotableElementCS object)
      {
        return createPivotableElementCSAdapter();
      }
      @Override
      public Adapter caseModelElementCS(ModelElementCS object)
      {
        return createModelElementCSAdapter();
      }
      @Override
      public Adapter caseExpCS(ExpCS object)
      {
        return createExpCSAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel <em>CS2AS Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel
   * @generated
   */
  public Adapter createCS2ASModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain <em>Source Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain
   * @generated
   */
  public Adapter createSourceDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain <em>Target Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain
   * @generated
   */
  public Adapter createTargetDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect <em>Mapping Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect
   * @generated
   */
  public Adapter createMappingSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef <em>Mapping Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingDef
   * @generated
   */
  public Adapter createMappingDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation <em>Mapping Creation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingCreation
   * @generated
   */
  public Adapter createMappingCreationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef <em>Property Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef
   * @generated
   */
  public Adapter createPropertyDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference <em>Mapping Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingReference
   * @generated
   */
  public Adapter createMappingReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect <em>Disambiguation Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
   * @generated
   */
  public Adapter createDisambiguationSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef <em>Disambiguation Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
   * @generated
   */
  public Adapter createDisambiguationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule <em>Disambiguation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule
   * @generated
   */
  public Adapter createDisambiguationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect <em>Name Resolution Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect
   * @generated
   */
  public Adapter createNameResolutionSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Targets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Targets
   * @generated
   */
  public Adapter createTargetsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef <em>Escape Sequence Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequenceDef
   * @generated
   */
  public Adapter createEscapeSequenceDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence <em>Escape Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.EscapeSequence
   * @generated
   */
  public Adapter createEscapeSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Inputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Inputs
   * @generated
   */
  public Adapter createInputsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Providers <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Providers
   * @generated
   */
  public Adapter createProvidersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provider
   * @generated
   */
  public Adapter createProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl <em>Provider Vars Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVarsDecl
   * @generated
   */
  public Adapter createProviderVarsDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef <em>Filter Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef
   * @generated
   */
  public Adapter createFilterDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef <em>Qualification Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef
   * @generated
   */
  public Adapter createQualificationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Qualification <em>Qualification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Qualification
   * @generated
   */
  public Adapter createQualificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl <em>Current Scope Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeDecl
   * @generated
   */
  public Adapter createCurrentScopeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef <em>Current Scope Provision Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CurrentScopeProvisionDef
   * @generated
   */
  public Adapter createCurrentScopeProvisionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef <em>Selection Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef
   * @generated
   */
  public Adapter createSelectionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Provision
   * @generated
   */
  public Adapter createProvisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames <em>Multiple Path Names</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MultiplePathNames
   * @generated
   */
  public Adapter createMultiplePathNamesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef <em>Occluding Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef
   * @generated
   */
  public Adapter createOccludingDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef <em>Contributions Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef
   * @generated
   */
  public Adapter createContributionsDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Contribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Contribution
   * @generated
   */
  public Adapter createContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl <em>Exported Scope Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeDecl
   * @generated
   */
  public Adapter createExportedScopeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef <em>Exported Scope Provision Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportedScopeProvisionDef
   * @generated
   */
  public Adapter createExportedScopeProvisionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect <em>Helpers Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect
   * @generated
   */
  public Adapter createHelpersSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass <em>Helper Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass
   * @generated
   */
  public Adapter createHelperClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp <em>Helper Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp
   * @generated
   */
  public Adapter createHelperOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS <em>Trace Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS
   * @generated
   */
  public Adapter createTraceExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS <em>Lookup Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS
   * @generated
   */
  public Adapter createLookupExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll <em>Selection All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll
   * @generated
   */
  public Adapter createSelectionAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific <em>Selection Specific</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific
   * @generated
   */
  public Adapter createSelectionSpecificAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.util.VisitableCS <em>Visitable CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.util.VisitableCS
   * @generated
   */
  public Adapter createVisitableCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementCS <em>Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.ElementCS
   * @generated
   */
  public Adapter createElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Pivotable <em>Pivotable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.pivot.utilities.Pivotable
   * @generated
   */
  public Adapter createPivotableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PivotableElementCS <em>Pivotable Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.PivotableElementCS
   * @generated
   */
  public Adapter createPivotableElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ModelElementCS <em>Model Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.ModelElementCS
   * @generated
   */
  public Adapter createModelElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS <em>Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.essentialoclcs.ExpCS
   * @generated
   */
  public Adapter createExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Cs2as_dslAdapterFactory
