/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Resolution Sect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameProperty <em>Name Property</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameQualifier <em>Name Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameResolutions <em>Name Resolutions</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect()
 * @model
 * @generated
 */
public interface NameResolutionSect extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Element</em>' attribute.
   * @see #setNameElement(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameElement()
   * @model
   * @generated
   */
  String getNameElement();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameElement <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Element</em>' attribute.
   * @see #getNameElement()
   * @generated
   */
  void setNameElement(String value);

  /**
   * Returns the value of the '<em><b>Name Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Property</em>' containment reference.
   * @see #setNameProperty(NameExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameProperty()
   * @model containment="true"
   * @generated
   */
  NameExpCS getNameProperty();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameProperty <em>Name Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Property</em>' containment reference.
   * @see #getNameProperty()
   * @generated
   */
  void setNameProperty(NameExpCS value);

  /**
   * Returns the value of the '<em><b>Name Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Qualifier</em>' attribute.
   * @see #setNameQualifier(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameQualifier()
   * @model
   * @generated
   */
  String getNameQualifier();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameQualifier <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Qualifier</em>' attribute.
   * @see #getNameQualifier()
   * @generated
   */
  void setNameQualifier(String value);

  /**
   * Returns the value of the '<em><b>Name Resolutions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Resolutions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Resolutions</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameResolutions()
   * @model containment="true"
   * @generated
   */
  EList<ClassNameResolution> getNameResolutions();

} // NameResolutionSect
