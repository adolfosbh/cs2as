/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getImportedObject <em>Imported Object</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCSDecl()
 * @model
 * @generated
 */
public interface CSDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCSDecl_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Imported Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Object</em>' reference.
   * @see #setImportedObject(EObject)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getCSDecl_ImportedObject()
   * @model
   * @generated
   */
  EObject getImportedObject();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl#getImportedObject <em>Imported Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Object</em>' reference.
   * @see #getImportedObject()
   * @generated
   */
  void setImportedObject(EObject value);

} // CSDecl
