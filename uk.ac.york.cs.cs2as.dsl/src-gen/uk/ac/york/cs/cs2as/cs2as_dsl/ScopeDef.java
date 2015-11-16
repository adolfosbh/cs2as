/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getContributingProp <em>Contributing Prop</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getPropagatingProp <em>Propagating Prop</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef()
 * @model
 * @generated
 */
public interface ScopeDef extends ClassNameResolutionStmnt
{
  /**
   * Returns the value of the '<em><b>Same Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Scope</em>' attribute.
   * @see #setSameScope(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_SameScope()
   * @model
   * @generated
   */
  boolean isSameScope();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isSameScope <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Same Scope</em>' attribute.
   * @see #isSameScope()
   * @generated
   */
  void setSameScope(boolean value);

  /**
   * Returns the value of the '<em><b>Contributing Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributing Prop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributing Prop</em>' containment reference.
   * @see #setContributingProp(ExpCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_ContributingProp()
   * @model containment="true"
   * @generated
   */
  ExpCS getContributingProp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getContributingProp <em>Contributing Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contributing Prop</em>' containment reference.
   * @see #getContributingProp()
   * @generated
   */
  void setContributingProp(ExpCS value);

  /**
   * Returns the value of the '<em><b>Type Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Filter</em>' containment reference.
   * @see #setTypeFilter(TypedRefCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_TypeFilter()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getTypeFilter();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getTypeFilter <em>Type Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Filter</em>' containment reference.
   * @see #getTypeFilter()
   * @generated
   */
  void setTypeFilter(TypedRefCS value);

  /**
   * Returns the value of the '<em><b>Propagating Prop</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propagating Prop</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propagating Prop</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_PropagatingProp()
   * @model containment="true"
   * @generated
   */
  EList<ExpCS> getPropagatingProp();

} // ScopeDef
