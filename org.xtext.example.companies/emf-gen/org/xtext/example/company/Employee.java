/**
 */
package org.xtext.example.company;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.company.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.company.Employee#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.company.Employee#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.example.company.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link org.xtext.example.company.Employee#getMentor <em>Mentor</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.company.CompanyPackage#getEmployee()
 * @model superTypes="org.xtext.example.company.Visitable"
 * @generated
 */
public interface Employee extends EObject, Visitable {
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
	 * @see org.xtext.example.company.CompanyPackage#getEmployee_Name()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Employee!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.xtext.example.company.CompanyPackage#getEmployee_Address()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Employee!address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Employee#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see org.xtext.example.company.CompanyPackage#getEmployee_Salary()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Employee!salary'"
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

	/**
	 * Returns the value of the '<em><b>Mentor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mentor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mentor</em>' reference.
	 * @see #setMentor(Employee)
	 * @see org.xtext.example.company.CompanyPackage#getEmployee_Mentor()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Employee!mentor'"
	 * @generated
	 */
	Employee getMentor();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Employee#getMentor <em>Mentor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mentor</em>' reference.
	 * @see #getMentor()
	 * @generated
	 */
	void setMentor(Employee value);

} // Employee
