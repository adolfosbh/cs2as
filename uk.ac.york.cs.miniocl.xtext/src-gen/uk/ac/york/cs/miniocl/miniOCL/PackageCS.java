/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.PackageCS#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.PackageCS#getPackages <em>Packages</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.PackageCS#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getPackageCS()
 * @model
 * @generated
 */
public interface PackageCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getPackageCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.PackageCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.miniocl.miniOCL.PackageCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getPackageCS_Packages()
   * @model containment="true"
   * @generated
   */
  EList<PackageCS> getPackages();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.miniocl.miniOCL.ClassCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getPackageCS_Classes()
   * @model containment="true"
   * @generated
   */
  EList<ClassCS> getClasses();

} // PackageCS
