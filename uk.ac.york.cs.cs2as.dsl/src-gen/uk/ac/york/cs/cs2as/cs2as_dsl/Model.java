/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getCsDecl <em>Cs Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getAsDecl <em>As Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappingSect <em>Mapping Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getDisambiguationSect <em>Disambiguation Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getNameresoSect <em>Namereso Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getHelpersSect <em>Helpers Sect</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends ContextCS
{
  /**
   * Returns the value of the '<em><b>Cs Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cs Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cs Decl</em>' containment reference.
   * @see #setCsDecl(CSDecl)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_CsDecl()
   * @model containment="true"
   * @generated
   */
  CSDecl getCsDecl();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getCsDecl <em>Cs Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cs Decl</em>' containment reference.
   * @see #getCsDecl()
   * @generated
   */
  void setCsDecl(CSDecl value);

  /**
   * Returns the value of the '<em><b>As Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Decl</em>' containment reference.
   * @see #setAsDecl(ASDecl)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_AsDecl()
   * @model containment="true"
   * @generated
   */
  ASDecl getAsDecl();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getAsDecl <em>As Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Decl</em>' containment reference.
   * @see #getAsDecl()
   * @generated
   */
  void setAsDecl(ASDecl value);

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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_MappingSect()
   * @model containment="true"
   * @generated
   */
  MappingSect getMappingSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappingSect <em>Mapping Sect</em>}' containment reference.
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_DisambiguationSect()
   * @model containment="true"
   * @generated
   */
  DisambiguationSect getDisambiguationSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getDisambiguationSect <em>Disambiguation Sect</em>}' containment reference.
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_NameresoSect()
   * @model containment="true"
   * @generated
   */
  NameResolutionSect getNameresoSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getNameresoSect <em>Namereso Sect</em>}' containment reference.
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_HelpersSect()
   * @model containment="true"
   * @generated
   */
  HelpersSect getHelpersSect();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getHelpersSect <em>Helpers Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Helpers Sect</em>' containment reference.
   * @see #getHelpersSect()
   * @generated
   */
  void setHelpersSect(HelpersSect value);

} // Model
