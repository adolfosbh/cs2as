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
   * Returns a new object of class '<em>Class Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Map</em>'.
   * @generated
   */
  ClassMap createClassMap();

  /**
   * Returns a new object of class '<em>Disambiguation Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disambiguation Map</em>'.
   * @generated
   */
  DisambiguationMap createDisambiguationMap();

  /**
   * Returns a new object of class '<em>Simple Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Map</em>'.
   * @generated
   */
  SimpleMap createSimpleMap();

  /**
   * Returns a new object of class '<em>Property Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Map</em>'.
   * @generated
   */
  PropertyMap createPropertyMap();

  /**
   * Returns a new object of class '<em>Map Exp CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Exp CS</em>'.
   * @generated
   */
  MapExpCS createMapExpCS();

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
