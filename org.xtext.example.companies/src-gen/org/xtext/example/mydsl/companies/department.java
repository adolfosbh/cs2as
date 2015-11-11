/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.department#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.department#getDepartment_manager <em>Department manager</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.department#getDepartment_employees <em>Department employees</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.department#getDeparment <em>Deparment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment()
 * @model
 * @generated
 */
public interface department extends EObject
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
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.companies.department#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Department manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Department manager</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Department manager</em>' containment reference.
   * @see #setDepartment_manager(department_manager)
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_Department_manager()
   * @model containment="true"
   * @generated
   */
  department_manager getDepartment_manager();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.companies.department#getDepartment_manager <em>Department manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Department manager</em>' containment reference.
   * @see #getDepartment_manager()
   * @generated
   */
  void setDepartment_manager(department_manager value);

  /**
   * Returns the value of the '<em><b>Department employees</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.companies.department_employees}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Department employees</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Department employees</em>' containment reference list.
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_Department_employees()
   * @model containment="true"
   * @generated
   */
  EList<department_employees> getDepartment_employees();

  /**
   * Returns the value of the '<em><b>Deparment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.companies.department}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deparment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deparment</em>' containment reference list.
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_Deparment()
   * @model containment="true"
   * @generated
   */
  EList<department> getDeparment();

} // department
