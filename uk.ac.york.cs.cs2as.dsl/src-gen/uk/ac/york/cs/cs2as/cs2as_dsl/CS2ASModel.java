/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS2AS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getMappingSect <em>Mapping Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getDisambiguationSect <em>Disambiguation Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getNameresoSect <em>Namereso Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getHelpersSect <em>Helpers Sect</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel()
 * @model
 * @generated
 */
public interface CS2ASModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(SourceDomain)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_Source()
   * @model containment="true"
   * @generated
   */
  SourceDomain getSource();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SourceDomain value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(TargetDomain)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_Target()
   * @model containment="true"
   * @generated
   */
  TargetDomain getTarget();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TargetDomain value);

  /**
   * Returns the value of the '<em><b>Mapping Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Sect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Sect</em>' containment reference.
   * @see #setMappingSect(MappingSect)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_MappingSect()
   * @model containment="true"
   * @generated
   */
  MappingSect getMappingSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getMappingSect <em>Mapping Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Sect</em>' containment reference.
   * @see #getMappingSect()
   * @generated
   */
  void setMappingSect(MappingSect value);

  /**
   * Returns the value of the '<em><b>Disambiguation Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disambiguation Sect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disambiguation Sect</em>' containment reference.
   * @see #setDisambiguationSect(DisambiguationSect)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_DisambiguationSect()
   * @model containment="true"
   * @generated
   */
  DisambiguationSect getDisambiguationSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getDisambiguationSect <em>Disambiguation Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disambiguation Sect</em>' containment reference.
   * @see #getDisambiguationSect()
   * @generated
   */
  void setDisambiguationSect(DisambiguationSect value);

  /**
   * Returns the value of the '<em><b>Namereso Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namereso Sect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namereso Sect</em>' containment reference.
   * @see #setNameresoSect(NameResolutionSect)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_NameresoSect()
   * @model containment="true"
   * @generated
   */
  NameResolutionSect getNameresoSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getNameresoSect <em>Namereso Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namereso Sect</em>' containment reference.
   * @see #getNameresoSect()
   * @generated
   */
  void setNameresoSect(NameResolutionSect value);

  /**
   * Returns the value of the '<em><b>Helpers Sect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helpers Sect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helpers Sect</em>' containment reference.
   * @see #setHelpersSect(HelpersSect)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCS2ASModel_HelpersSect()
   * @model containment="true"
   * @generated
   */
  HelpersSect getHelpersSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel#getHelpersSect <em>Helpers Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Helpers Sect</em>' containment reference.
   * @see #getHelpersSect()
   * @generated
   */
  void setHelpersSect(HelpersSect value);

} // CS2ASModel
