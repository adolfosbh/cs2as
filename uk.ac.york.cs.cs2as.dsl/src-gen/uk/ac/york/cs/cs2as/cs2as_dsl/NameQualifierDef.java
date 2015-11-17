/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Qualifier Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef#getNameQualifier <em>Name Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef#getSegmentsProp <em>Segments Prop</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameQualifierDef()
 * @model
 * @generated
 */
public interface NameQualifierDef extends EObject
{
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
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameQualifierDef_NameQualifier()
   * @model
   * @generated
   */
  String getNameQualifier();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef#getNameQualifier <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Qualifier</em>' attribute.
   * @see #getNameQualifier()
   * @generated
   */
  void setNameQualifier(String value);

  /**
   * Returns the value of the '<em><b>Segments Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments Prop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments Prop</em>' containment reference.
   * @see #setSegmentsProp(NameExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getNameQualifierDef_SegmentsProp()
   * @model containment="true"
   * @generated
   */
  NameExpCS getSegmentsProp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef#getSegmentsProp <em>Segments Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Segments Prop</em>' containment reference.
   * @see #getSegmentsProp()
   * @generated
   */
  void setSegmentsProp(NameExpCS value);

} // NameQualifierDef
