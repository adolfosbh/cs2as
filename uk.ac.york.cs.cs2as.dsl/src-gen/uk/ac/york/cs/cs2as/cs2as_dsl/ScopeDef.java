/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isAlsoExports <em>Also Exports</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getContibution <em>Contibution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getOccludingDefs <em>Occluding Defs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getPropagationDef <em>Propagation Def</em>}</li>
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
   * Returns the value of the '<em><b>Also Exports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Also Exports</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Also Exports</em>' attribute.
   * @see #setAlsoExports(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_AlsoExports()
   * @model
   * @generated
   */
  boolean isAlsoExports();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isAlsoExports <em>Also Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Also Exports</em>' attribute.
   * @see #isAlsoExports()
   * @generated
   */
  void setAlsoExports(boolean value);

  /**
   * Returns the value of the '<em><b>Contibution</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contibution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contibution</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_Contibution()
   * @model containment="true"
   * @generated
   */
  EList<ElementsContribExp> getContibution();

  /**
   * Returns the value of the '<em><b>Occluding Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occluding Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occluding Defs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_OccludingDefs()
   * @model containment="true"
   * @generated
   */
  EList<OccludingDef> getOccludingDefs();

  /**
   * Returns the value of the '<em><b>Propagation Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propagation Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propagation Def</em>' containment reference.
   * @see #setPropagationDef(PropagationDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_PropagationDef()
   * @model containment="true"
   * @generated
   */
  PropagationDef getPropagationDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getPropagationDef <em>Propagation Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propagation Def</em>' containment reference.
   * @see #getPropagationDef()
   * @generated
   */
  void setPropagationDef(PropagationDef value);

} // ScopeDef
