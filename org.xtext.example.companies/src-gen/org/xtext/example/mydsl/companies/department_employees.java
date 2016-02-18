/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>department employees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.department_employees#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_employees()
 * @model
 * @generated
 */
public interface department_employees extends traceable
{
  /**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.mydsl.companies.employee}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getdepartment_employees_Employee()
	 * @model containment="true"
	 * @generated
	 */
  EList<employee> getEmployee();

} // department_employees
