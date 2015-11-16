/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty <em>Name Poperty</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef()
 * @model
 * @generated
 */
public interface NamedElementDef extends ClassNameResolutionStmnt
{
  /**
   * Returns the value of the '<em><b>Name Poperty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Poperty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Poperty</em>' containment reference.
   * @see #setNamePoperty(NameExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef_NamePoperty()
   * @model containment="true"
   * @generated
   */
  NameExpCS getNamePoperty();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getNamePoperty <em>Name Poperty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Poperty</em>' containment reference.
   * @see #getNamePoperty()
   * @generated
   */
  void setNamePoperty(NameExpCS value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see #setQualifier(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNamedElementDef_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

} // NamedElementDef
