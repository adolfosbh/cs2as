/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model#getMappings <em>Mappings</em>}</li>
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
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getModel_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<ClassMap> getMappings();

} // Model
