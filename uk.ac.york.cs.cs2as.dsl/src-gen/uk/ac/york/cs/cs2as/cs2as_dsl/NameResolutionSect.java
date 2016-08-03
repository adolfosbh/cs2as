/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Resolution Sect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getTargetsDef <em>Targets Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getInputsDef <em>Inputs Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getProvidersDef <em>Providers Def</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect()
 * @model
 * @generated
 */
public interface NameResolutionSect extends EObject
{
  /**
   * Returns the value of the '<em><b>Targets Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets Def</em>' containment reference.
   * @see #setTargetsDef(Targets)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_TargetsDef()
   * @model containment="true"
   * @generated
   */
  Targets getTargetsDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getTargetsDef <em>Targets Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targets Def</em>' containment reference.
   * @see #getTargetsDef()
   * @generated
   */
  void setTargetsDef(Targets value);

  /**
   * Returns the value of the '<em><b>Inputs Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs Def</em>' containment reference.
   * @see #setInputsDef(Inputs)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_InputsDef()
   * @model containment="true"
   * @generated
   */
  Inputs getInputsDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getInputsDef <em>Inputs Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs Def</em>' containment reference.
   * @see #getInputsDef()
   * @generated
   */
  void setInputsDef(Inputs value);

  /**
   * Returns the value of the '<em><b>Providers Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers Def</em>' containment reference.
   * @see #setProvidersDef(Providers)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_ProvidersDef()
   * @model containment="true"
   * @generated
   */
  Providers getProvidersDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getProvidersDef <em>Providers Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Providers Def</em>' containment reference.
   * @see #getProvidersDef()
   * @generated
   */
  void setProvidersDef(Providers value);

} // NameResolutionSect
