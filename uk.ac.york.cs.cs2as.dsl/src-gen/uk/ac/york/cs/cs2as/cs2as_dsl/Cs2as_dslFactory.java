/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public interface Cs2as_dslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Cs2as_dslFactory eINSTANCE = uk.ac.york.cs.cs2as.cs2as_dsl.impl.Cs2as_dslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>CS2AS Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CS2AS Model</em>'.
   * @generated
   */
  CS2ASModel createCS2ASModel();

  /**
   * Returns a new object of class '<em>Source Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Domain</em>'.
   * @generated
   */
  SourceDomain createSourceDomain();

  /**
   * Returns a new object of class '<em>Target Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Domain</em>'.
   * @generated
   */
  TargetDomain createTargetDomain();

  /**
   * Returns a new object of class '<em>Mapping Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Sect</em>'.
   * @generated
   */
  MappingSect createMappingSect();

  /**
   * Returns a new object of class '<em>Mapping Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Def</em>'.
   * @generated
   */
  MappingDef createMappingDef();

  /**
   * Returns a new object of class '<em>Mapping Creation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Creation</em>'.
   * @generated
   */
  MappingCreation createMappingCreation();

  /**
   * Returns a new object of class '<em>Property Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Def</em>'.
   * @generated
   */
  PropertyDef createPropertyDef();

  /**
   * Returns a new object of class '<em>Mapping Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Reference</em>'.
   * @generated
   */
  MappingReference createMappingReference();

  /**
   * Returns a new object of class '<em>Disambiguation Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Sect</em>'.
   * @generated
   */
  DisambiguationSect createDisambiguationSect();

  /**
   * Returns a new object of class '<em>Disambiguation Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Def</em>'.
   * @generated
   */
  DisambiguationDef createDisambiguationDef();

  /**
   * Returns a new object of class '<em>Disambiguation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Rule</em>'.
   * @generated
   */
  DisambiguationRule createDisambiguationRule();

  /**
   * Returns a new object of class '<em>Name Resolution Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Resolution Sect</em>'.
   * @generated
   */
  NameResolutionSect createNameResolutionSect();

  /**
   * Returns a new object of class '<em>Targets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Targets</em>'.
   * @generated
   */
  Targets createTargets();

  /**
   * Returns a new object of class '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target</em>'.
   * @generated
   */
  Target createTarget();

  /**
   * Returns a new object of class '<em>Escape Sequence Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Escape Sequence Def</em>'.
   * @generated
   */
  EscapeSequenceDef createEscapeSequenceDef();

  /**
   * Returns a new object of class '<em>Escape Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Escape Sequence</em>'.
   * @generated
   */
  EscapeSequence createEscapeSequence();

  /**
   * Returns a new object of class '<em>Inputs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inputs</em>'.
   * @generated
   */
  Inputs createInputs();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Providers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Providers</em>'.
   * @generated
   */
  Providers createProviders();

  /**
   * Returns a new object of class '<em>Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider</em>'.
   * @generated
   */
  Provider createProvider();

  /**
   * Returns a new object of class '<em>Provider Vars Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider Vars Decl</em>'.
   * @generated
   */
  ProviderVarsDecl createProviderVarsDecl();

  /**
   * Returns a new object of class '<em>Filter Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Def</em>'.
   * @generated
   */
  FilterDef createFilterDef();

  /**
   * Returns a new object of class '<em>Qualification Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualification Def</em>'.
   * @generated
   */
  QualificationDef createQualificationDef();

  /**
   * Returns a new object of class '<em>Qualification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualification</em>'.
   * @generated
   */
  Qualification createQualification();

  /**
   * Returns a new object of class '<em>Current Scope Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Scope Decl</em>'.
   * @generated
   */
  CurrentScopeDecl createCurrentScopeDecl();

  /**
   * Returns a new object of class '<em>Current Scope Provision Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Scope Provision Def</em>'.
   * @generated
   */
  CurrentScopeProvisionDef createCurrentScopeProvisionDef();

  /**
   * Returns a new object of class '<em>Selection Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Def</em>'.
   * @generated
   */
  SelectionDef createSelectionDef();

  /**
   * Returns a new object of class '<em>Provision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provision</em>'.
   * @generated
   */
  Provision createProvision();

  /**
   * Returns a new object of class '<em>Multiple Path Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Path Names</em>'.
   * @generated
   */
  MultiplePathNames createMultiplePathNames();

  /**
   * Returns a new object of class '<em>Occluding Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Occluding Def</em>'.
   * @generated
   */
  OccludingDef createOccludingDef();

  /**
   * Returns a new object of class '<em>Contributions Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contributions Def</em>'.
   * @generated
   */
  ContributionsDef createContributionsDef();

  /**
   * Returns a new object of class '<em>Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution</em>'.
   * @generated
   */
  Contribution createContribution();

  /**
   * Returns a new object of class '<em>Exported Scope Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exported Scope Decl</em>'.
   * @generated
   */
  ExportedScopeDecl createExportedScopeDecl();

  /**
   * Returns a new object of class '<em>Exported Scope Provision Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exported Scope Provision Def</em>'.
   * @generated
   */
  ExportedScopeProvisionDef createExportedScopeProvisionDef();

  /**
   * Returns a new object of class '<em>Helpers Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helpers Sect</em>'.
   * @generated
   */
  HelpersSect createHelpersSect();

  /**
   * Returns a new object of class '<em>Helper Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper Class</em>'.
   * @generated
   */
  HelperClass createHelperClass();

  /**
   * Returns a new object of class '<em>Helper Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper Op</em>'.
   * @generated
   */
  HelperOp createHelperOp();

  /**
   * Returns a new object of class '<em>Trace Exp CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trace Exp CS</em>'.
   * @generated
   */
  TraceExpCS createTraceExpCS();

  /**
   * Returns a new object of class '<em>Lookup Exp CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Exp CS</em>'.
   * @generated
   */
  LookupExpCS createLookupExpCS();

  /**
   * Returns a new object of class '<em>Selection All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection All</em>'.
   * @generated
   */
  SelectionAll createSelectionAll();

  /**
   * Returns a new object of class '<em>Selection Specific</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Specific</em>'.
   * @generated
   */
  SelectionSpecific createSelectionSpecific();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Cs2as_dslPackage getCs2as_dslPackage();

} //Cs2as_dslFactory
