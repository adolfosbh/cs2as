/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disambiguation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getRule <em>Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getProduces <em>Produces</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getMappingDef <em>Mapping Def</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDisambiguationMap()
 * @model
 * @generated
 */
public interface DisambiguationMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(ExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDisambiguationMap_Rule()
   * @model containment="true"
   * @generated
   */
  ExpCS getRule();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(ExpCS value);

  /**
   * Returns the value of the '<em><b>Produces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produces</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produces</em>' attribute.
   * @see #setProduces(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDisambiguationMap_Produces()
   * @model
   * @generated
   */
  String getProduces();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getProduces <em>Produces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Produces</em>' attribute.
   * @see #getProduces()
   * @generated
   */
  void setProduces(String value);

  /**
   * Returns the value of the '<em><b>Mapping Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Def</em>' containment reference.
   * @see #setMappingDef(SimpleMap)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDisambiguationMap_MappingDef()
   * @model containment="true"
   * @generated
   */
  SimpleMap getMappingDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap#getMappingDef <em>Mapping Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Def</em>' containment reference.
   * @see #getMappingDef()
   * @generated
   */
  void setMappingDef(SimpleMap value);

} // DisambiguationMap
