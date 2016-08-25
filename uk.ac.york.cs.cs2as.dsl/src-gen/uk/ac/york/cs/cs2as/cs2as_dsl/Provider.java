/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getVarsDecl <em>Vars Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getCurrentScope <em>Current Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getExportedScope <em>Exported Scope</em>}</li>
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
   * Returns the value of the '<em><b>Vars Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars Decl</em>' containment reference.
   * @see #setVarsDecl(ProviderVarsDecl)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider_VarsDecl()
   * @model containment="true"
   * @generated
   */
  ProviderVarsDecl getVarsDecl();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getVarsDecl <em>Vars Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars Decl</em>' containment reference.
   * @see #getVarsDecl()
   * @generated
   */
  void setVarsDecl(ProviderVarsDecl value);

  /**
   * Returns the value of the '<em><b>Current Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Scope</em>' containment reference.
   * @see #setCurrentScope(CurrentScopeDecl)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider_CurrentScope()
   * @model containment="true"
   * @generated
   */
  CurrentScopeDecl getCurrentScope();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getCurrentScope <em>Current Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Scope</em>' containment reference.
   * @see #getCurrentScope()
   * @generated
   */
  void setCurrentScope(CurrentScopeDecl value);

  /**
   * Returns the value of the '<em><b>Exported Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exported Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exported Scope</em>' containment reference.
   * @see #setExportedScope(ExportedScopeDecl)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getProvider_ExportedScope()
   * @model containment="true"
   * @generated
   */
  ExportedScopeDecl getExportedScope();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Provider#getExportedScope <em>Exported Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exported Scope</em>' containment reference.
   * @see #getExportedScope()
   * @generated
   */
  void setExportedScope(ExportedScopeDecl value);

} // Provider
