/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>department manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.department_manager#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_manager()
 * @model
 * @generated
 */
public interface department_manager extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference.
	 * @see #setEmployee(employee)
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_manager_Employee()
	 * @model containment="true"
	 * @generated
	 */
  employee getEmployee();

  /**
	 * Sets the value of the '{@link org.xtext.example.mydsl.companies.department_manager#getEmployee <em>Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' containment reference.
	 * @see #getEmployee()
	 * @generated
	 */
  void setEmployee(employee value);

} // department_manager
