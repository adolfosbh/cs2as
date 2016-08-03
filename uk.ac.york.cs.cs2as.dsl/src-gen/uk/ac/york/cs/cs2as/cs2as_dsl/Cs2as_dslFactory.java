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
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>CS Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CS Decl</em>'.
   * @generated
   */
  CSDecl createCSDecl();

  /**
   * Returns a new object of class '<em>AS Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AS Decl</em>'.
   * @generated
   */
  ASDecl createASDecl();

  /**
   * Returns a new object of class '<em>Mapping Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Sect</em>'.
   * @generated
   */
  MappingSect createMappingSect();

  /**
   * Returns a new object of class '<em>Class Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Map</em>'.
   * @generated
   */
  ClassMap createClassMap();

  /**
   * Returns a new object of class '<em>Class Map Stmnt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Map Stmnt</em>'.
   * @generated
   */
  ClassMapStmnt createClassMapStmnt();

  /**
   * Returns a new object of class '<em>Property Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Map</em>'.
   * @generated
   */
  PropertyMap createPropertyMap();

  /**
   * Returns a new object of class '<em>Disambiguation Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Sect</em>'.
   * @generated
   */
  DisambiguationSect createDisambiguationSect();

  /**
   * Returns a new object of class '<em>Class Disambiguation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Disambiguation</em>'.
   * @generated
   */
  ClassDisambiguation createClassDisambiguation();

  /**
   * Returns a new object of class '<em>Class Disambiguation Stmnt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Disambiguation Stmnt</em>'.
   * @generated
   */
  ClassDisambiguationStmnt createClassDisambiguationStmnt();

  /**
   * Returns a new object of class '<em>Disambiguation Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Def</em>'.
   * @generated
   */
  DisambiguationDef createDisambiguationDef();

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
   * Returns a new object of class '<em>Provider Vars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider Vars</em>'.
   * @generated
   */
  ProviderVars createProviderVars();

  /**
   * Returns a new object of class '<em>Provider Stmnt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider Stmnt</em>'.
   * @generated
   */
  ProviderStmnt createProviderStmnt();

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
   * Returns a new object of class '<em>Elements Contrib Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elements Contrib Exp</em>'.
   * @generated
   */
  ElementsContribExp createElementsContribExp();

  /**
   * Returns a new object of class '<em>Scope Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope Def</em>'.
   * @generated
   */
  ScopeDef createScopeDef();

  /**
   * Returns a new object of class '<em>Selection Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Def</em>'.
   * @generated
   */
  SelectionDef createSelectionDef();

  /**
   * Returns a new object of class '<em>Provision Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provision Def</em>'.
   * @generated
   */
  ProvisionDef createProvisionDef();

  /**
   * Returns a new object of class '<em>Class Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Ref</em>'.
   * @generated
   */
  ClassRef createClassRef();

  /**
   * Returns a new object of class '<em>Multiple Class Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Class Ref</em>'.
   * @generated
   */
  MultipleClassRef createMultipleClassRef();

  /**
   * Returns a new object of class '<em>Occluding Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Occluding Def</em>'.
   * @generated
   */
  OccludingDef createOccludingDef();

  /**
   * Returns a new object of class '<em>Contribution Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution Def</em>'.
   * @generated
   */
  ContributionDef createContributionDef();

  /**
   * Returns a new object of class '<em>Export Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export Def</em>'.
   * @generated
   */
  ExportDef createExportDef();

  /**
   * Returns a new object of class '<em>Helpers Sect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helpers Sect</em>'.
   * @generated
   */
  HelpersSect createHelpersSect();

  /**
   * Returns a new object of class '<em>Class Helper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Helper</em>'.
   * @generated
   */
  ClassHelper createClassHelper();

  /**
   * Returns a new object of class '<em>Helper Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper Def</em>'.
   * @generated
   */
  HelperDef createHelperDef();

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
