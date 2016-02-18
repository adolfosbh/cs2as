/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.employee#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.employee#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.employee#getMentor <em>Mentor</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getemployee()
 * @model
 * @generated
 */
public interface employee extends traceable
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
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getemployee_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.example.mydsl.companies.employee#getName <em>Name</em>}' attribute.
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
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getemployee_Address()
	 * @model
	 * @generated
	 */
  String getAddress();

  /**
	 * Sets the value of the '{@link org.xtext.example.mydsl.companies.employee#getAddress <em>Address</em>}' attribute.
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
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getemployee_Salary()
	 * @model
	 * @generated
	 */
  double getSalary();

  /**
	 * Sets the value of the '{@link org.xtext.example.mydsl.companies.employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
  void setSalary(double value);

  /**
	 * Returns the value of the '<em><b>Mentor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mentor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Mentor</em>' attribute.
	 * @see #setMentor(String)
	 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getemployee_Mentor()
	 * @model
	 * @generated
	 */
  String getMentor();

  /**
	 * Sets the value of the '{@link org.xtext.example.mydsl.companies.employee#getMentor <em>Mentor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mentor</em>' attribute.
	 * @see #getMentor()
	 * @generated
	 */
  void setMentor(String value);

} // employee
