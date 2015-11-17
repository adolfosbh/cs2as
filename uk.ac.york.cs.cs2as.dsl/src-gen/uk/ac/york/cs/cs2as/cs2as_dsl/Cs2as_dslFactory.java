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
   * Returns a new object of class '<em>Default Named Element Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Named Element Def</em>'.
   * @generated
   */
  DefaultNamedElementDef createDefaultNamedElementDef();

  /**
   * Returns a new object of class '<em>Default Name Referencer Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Name Referencer Def</em>'.
   * @generated
   */
  DefaultNameReferencerDef createDefaultNameReferencerDef();

  /**
   * Returns a new object of class '<em>Name Qualifier Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Qualifier Def</em>'.
   * @generated
   */
  NameQualifierDef createNameQualifierDef();

  /**
   * Returns a new object of class '<em>Class Name Resolution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Name Resolution</em>'.
   * @generated
   */
  ClassNameResolution createClassNameResolution();

  /**
   * Returns a new object of class '<em>Class Name Resolution Stmnt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Name Resolution Stmnt</em>'.
   * @generated
   */
  ClassNameResolutionStmnt createClassNameResolutionStmnt();

  /**
   * Returns a new object of class '<em>Named Element Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Element Def</em>'.
   * @generated
   */
  NamedElementDef createNamedElementDef();

  /**
   * Returns a new object of class '<em>Scope Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope Def</em>'.
   * @generated
   */
  ScopeDef createScopeDef();

  /**
   * Returns a new object of class '<em>Resolve Exp CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resolve Exp CS</em>'.
   * @generated
   */
  ResolveExpCS createResolveExpCS();

  /**
   * Returns a new object of class '<em>Lookup Exp CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Exp CS</em>'.
   * @generated
   */
  LookupExpCS createLookupExpCS();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Cs2as_dslPackage getCs2as_dslPackage();

} //Cs2as_dslFactory