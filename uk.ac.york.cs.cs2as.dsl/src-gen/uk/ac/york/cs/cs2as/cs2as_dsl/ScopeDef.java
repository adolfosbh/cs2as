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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getSelectionDef <em>Selection Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isEmptyScope <em>Empty Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isAlsoExports <em>Also Exports</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getScopingDefs <em>Scoping Defs</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef()
 * @model
 * @generated
 */
public interface ScopeDef extends ClassNameResolutionStmnt
{
  /**
   * Returns the value of the '<em><b>Selection Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Def</em>' containment reference.
   * @see #setSelectionDef(SelectionDef)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_SelectionDef()
   * @model containment="true"
   * @generated
   */
  SelectionDef getSelectionDef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#getSelectionDef <em>Selection Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Def</em>' containment reference.
   * @see #getSelectionDef()
   * @generated
   */
  void setSelectionDef(SelectionDef value);

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
   * Returns the value of the '<em><b>Empty Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Scope</em>' attribute.
   * @see #setEmptyScope(boolean)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_EmptyScope()
   * @model
   * @generated
   */
  boolean isEmptyScope();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef#isEmptyScope <em>Empty Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Scope</em>' attribute.
   * @see #isEmptyScope()
   * @generated
   */
  void setEmptyScope(boolean value);

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
   * Returns the value of the '<em><b>Scoping Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopingDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scoping Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scoping Defs</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getScopeDef_ScopingDefs()
   * @model containment="true"
   * @generated
   */
  EList<ScopingDef> getScopingDefs();

} // ScopeDef
