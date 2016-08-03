/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Ref</em>' containment reference.
   * @see #setClassRef(PathNameCS)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider_ClassRef()
   * @model containment="true"
   * @generated
   */
  PathNameCS getClassRef();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getClassRef <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' containment reference.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(PathNameCS value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.ProviderStmnt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider_Statements()
   * @model containment="true"
   * @generated
   */
  EList<ProviderStmnt> getStatements();

} // Provider
