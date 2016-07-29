/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xcore.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule <em>Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getSXQualifiedNametatements <em>SX Qualified Nametatements</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap()
 * @model
 * @generated
 */
public interface ClassMap extends EObject
{
  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(XClass)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_To()
   * @model
   * @generated
   */
  XClass getTo();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(XClass value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(XClass)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_From()
   * @model
   * @generated
   */
  XClass getFrom();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(XClass value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

  /**
   * Returns the value of the '<em><b>SX Qualified Nametatements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SX Qualified Nametatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SX Qualified Nametatements</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getClassMap_SXQualifiedNametatements()
   * @model containment="true"
   * @generated
   */
  EList<ClassMapStmnt> getSXQualifiedNametatements();

} // ClassMap
