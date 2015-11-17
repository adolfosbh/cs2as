/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameReferencer <em>Name Referencer</em>}</li>
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
   * Returns the value of the '<em><b>Named Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Element</em>' containment reference.
   * @see #setNamedElement(DefaultNamedElementDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NamedElement()
   * @model containment="true"
   * @generated
   */
  DefaultNamedElementDef getNamedElement();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNamedElement <em>Named Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named Element</em>' containment reference.
   * @see #getNamedElement()
   * @generated
   */
  void setNamedElement(DefaultNamedElementDef value);

  /**
   * Returns the value of the '<em><b>Name Referencer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Referencer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Referencer</em>' containment reference.
   * @see #setNameReferencer(DefaultNameReferencerDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameReferencer()
   * @model containment="true"
   * @generated
   */
  DefaultNameReferencerDef getNameReferencer();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameReferencer <em>Name Referencer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Referencer</em>' containment reference.
   * @see #getNameReferencer()
   * @generated
   */
  void setNameReferencer(DefaultNameReferencerDef value);

  /**
   * Returns the value of the '<em><b>Name Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Qualifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Qualifier</em>' containment reference.
   * @see #setNameQualifier(NameQualifierDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameResolutionSect_NameQualifier()
   * @model containment="true"
   * @generated
   */
  NameQualifierDef getNameQualifier();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect#getNameQualifier <em>Name Qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Qualifier</em>' containment reference.
   * @see #getNameQualifier()
   * @generated
   */
  void setNameQualifier(NameQualifierDef value);

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
