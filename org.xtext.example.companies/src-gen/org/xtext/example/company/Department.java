/**
 */
package org.xtext.example.company;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.company.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.company.Department#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.company.Department#getManager <em>Manager</em>}</li>
 *   <li>{@link org.xtext.example.company.Department#getSubdepts <em>Subdepts</em>}</li>
 *   <li>{@link org.xtext.example.company.Department#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.company.CompanyPackage#getDepartment()
 * @model superTypes="org.xtext.example.company.Visitable"
 * @generated
 */
public interface Department extends EObject, Visitable {
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
	 * @see org.xtext.example.company.CompanyPackage#getDepartment_Name()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Department!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' containment reference.
	 * @see #setManager(Employee)
	 * @see org.xtext.example.company.CompanyPackage#getDepartment_Manager()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Department!manager'"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Department#getManager <em>Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' containment reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Subdepts</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.company.Department}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdepts</em>' containment reference list.
	 * @see org.xtext.example.company.CompanyPackage#getDepartment_Subdepts()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Department!subdepts'"
	 * @generated
	 */
	EList<Department> getSubdepts();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see org.xtext.example.company.CompanyPackage#getDepartment_Employees()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Department!employees'"
	 * @generated
	 */
	EList<Employee> getEmployees();

} // Department
