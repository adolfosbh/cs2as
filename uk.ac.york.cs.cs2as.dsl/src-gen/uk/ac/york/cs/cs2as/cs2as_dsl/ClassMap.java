/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getMappingDef <em>Mapping Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getDisambiguationRules <em>Disambiguation Rules</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap()
 * @model
 * @generated
 */
public interface ClassMap extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_MappingDef()
   * @model containment="true"
   * @generated
   */
  SimpleMap getMappingDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getMappingDef <em>Mapping Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Def</em>' containment reference.
   * @see #getMappingDef()
   * @generated
   */
  void setMappingDef(SimpleMap value);

  /**
   * Returns the value of the '<em><b>Disambiguation Rules</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disambiguation Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disambiguation Rules</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_DisambiguationRules()
   * @model containment="true"
   * @generated
   */
  EList<DisambiguationMap> getDisambiguationRules();

} // ClassMap
