/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.companies.CompaniesFactory
 * @model kind="package"
 * @generated
 */
public interface CompaniesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "companies";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Companies";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "companies";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CompaniesPackage eINSTANCE = org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.companies.impl.companyImpl <em>company</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.companies.impl.companyImpl
   * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getcompany()
   * @generated
   */
  int COMPANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__NAME = 0;

  /**
   * The feature id for the '<em><b>Deparment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__DEPARMENT = 1;

  /**
   * The number of structural features of the '<em>company</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.companies.impl.departmentImpl <em>department</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.companies.impl.departmentImpl
   * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment()
   * @generated
   */
  int DEPARTMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Department manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__DEPARTMENT_MANAGER = 1;

  /**
   * The feature id for the '<em><b>Department employees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__DEPARTMENT_EMPLOYEES = 2;

  /**
   * The feature id for the '<em><b>Deparment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__DEPARMENT = 3;

  /**
   * The number of structural features of the '<em>department</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.companies.impl.department_managerImpl <em>department manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.companies.impl.department_managerImpl
   * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment_manager()
   * @generated
   */
  int DEPARTMENT_MANAGER = 2;

  /**
   * The feature id for the '<em><b>Employee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_MANAGER__EMPLOYEE = 0;

  /**
   * The number of structural features of the '<em>department manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_MANAGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.companies.impl.department_employeesImpl <em>department employees</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.companies.impl.department_employeesImpl
   * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment_employees()
   * @generated
   */
  int DEPARTMENT_EMPLOYEES = 3;

  /**
   * The feature id for the '<em><b>Employee</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_EMPLOYEES__EMPLOYEE = 0;

  /**
   * The number of structural features of the '<em>department employees</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_EMPLOYEES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.companies.impl.employeeImpl <em>employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.companies.impl.employeeImpl
   * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getemployee()
   * @generated
   */
  int EMPLOYEE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__NAME = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Salary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__SALARY = 2;

  /**
   * The feature id for the '<em><b>Mentor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__MENTOR = 3;

  /**
   * The number of structural features of the '<em>employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.companies.company <em>company</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>company</em>'.
   * @see org.xtext.example.mydsl.companies.company
   * @generated
   */
  EClass getcompany();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.company#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.companies.company#getName()
   * @see #getcompany()
   * @generated
   */
  EAttribute getcompany_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.companies.company#getDeparment <em>Deparment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deparment</em>'.
   * @see org.xtext.example.mydsl.companies.company#getDeparment()
   * @see #getcompany()
   * @generated
   */
  EReference getcompany_Deparment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.companies.department <em>department</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>department</em>'.
   * @see org.xtext.example.mydsl.companies.department
   * @generated
   */
  EClass getdepartment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.department#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.companies.department#getName()
   * @see #getdepartment()
   * @generated
   */
  EAttribute getdepartment_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.companies.department#getDepartment_manager <em>Department manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Department manager</em>'.
   * @see org.xtext.example.mydsl.companies.department#getDepartment_manager()
   * @see #getdepartment()
   * @generated
   */
  EReference getdepartment_Department_manager();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.companies.department#getDepartment_employees <em>Department employees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Department employees</em>'.
   * @see org.xtext.example.mydsl.companies.department#getDepartment_employees()
   * @see #getdepartment()
   * @generated
   */
  EReference getdepartment_Department_employees();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.companies.department#getDeparment <em>Deparment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deparment</em>'.
   * @see org.xtext.example.mydsl.companies.department#getDeparment()
   * @see #getdepartment()
   * @generated
   */
  EReference getdepartment_Deparment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.companies.department_manager <em>department manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>department manager</em>'.
   * @see org.xtext.example.mydsl.companies.department_manager
   * @generated
   */
  EClass getdepartment_manager();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.companies.department_manager#getEmployee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Employee</em>'.
   * @see org.xtext.example.mydsl.companies.department_manager#getEmployee()
   * @see #getdepartment_manager()
   * @generated
   */
  EReference getdepartment_manager_Employee();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.companies.department_employees <em>department employees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>department employees</em>'.
   * @see org.xtext.example.mydsl.companies.department_employees
   * @generated
   */
  EClass getdepartment_employees();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.companies.department_employees#getEmployee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Employee</em>'.
   * @see org.xtext.example.mydsl.companies.department_employees#getEmployee()
   * @see #getdepartment_employees()
   * @generated
   */
  EReference getdepartment_employees_Employee();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.companies.employee <em>employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>employee</em>'.
   * @see org.xtext.example.mydsl.companies.employee
   * @generated
   */
  EClass getemployee();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.employee#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.companies.employee#getName()
   * @see #getemployee()
   * @generated
   */
  EAttribute getemployee_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.employee#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.xtext.example.mydsl.companies.employee#getAddress()
   * @see #getemployee()
   * @generated
   */
  EAttribute getemployee_Address();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.employee#getSalary <em>Salary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Salary</em>'.
   * @see org.xtext.example.mydsl.companies.employee#getSalary()
   * @see #getemployee()
   * @generated
   */
  EAttribute getemployee_Salary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.companies.employee#getMentor <em>Mentor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mentor</em>'.
   * @see org.xtext.example.mydsl.companies.employee#getMentor()
   * @see #getemployee()
   * @generated
   */
  EAttribute getemployee_Mentor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CompaniesFactory getCompaniesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.companies.impl.companyImpl <em>company</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.companies.impl.companyImpl
     * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getcompany()
     * @generated
     */
    EClass COMPANY = eINSTANCE.getcompany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPANY__NAME = eINSTANCE.getcompany_Name();

    /**
     * The meta object literal for the '<em><b>Deparment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__DEPARMENT = eINSTANCE.getcompany_Deparment();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.companies.impl.departmentImpl <em>department</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.companies.impl.departmentImpl
     * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment()
     * @generated
     */
    EClass DEPARTMENT = eINSTANCE.getdepartment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPARTMENT__NAME = eINSTANCE.getdepartment_Name();

    /**
     * The meta object literal for the '<em><b>Department manager</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT__DEPARTMENT_MANAGER = eINSTANCE.getdepartment_Department_manager();

    /**
     * The meta object literal for the '<em><b>Department employees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT__DEPARTMENT_EMPLOYEES = eINSTANCE.getdepartment_Department_employees();

    /**
     * The meta object literal for the '<em><b>Deparment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT__DEPARMENT = eINSTANCE.getdepartment_Deparment();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.companies.impl.department_managerImpl <em>department manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.companies.impl.department_managerImpl
     * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment_manager()
     * @generated
     */
    EClass DEPARTMENT_MANAGER = eINSTANCE.getdepartment_manager();

    /**
     * The meta object literal for the '<em><b>Employee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT_MANAGER__EMPLOYEE = eINSTANCE.getdepartment_manager_Employee();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.companies.impl.department_employeesImpl <em>department employees</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.companies.impl.department_employeesImpl
     * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getdepartment_employees()
     * @generated
     */
    EClass DEPARTMENT_EMPLOYEES = eINSTANCE.getdepartment_employees();

    /**
     * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT_EMPLOYEES__EMPLOYEE = eINSTANCE.getdepartment_employees_Employee();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.companies.impl.employeeImpl <em>employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.companies.impl.employeeImpl
     * @see org.xtext.example.mydsl.companies.impl.CompaniesPackageImpl#getemployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getemployee();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__NAME = eINSTANCE.getemployee_Name();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__ADDRESS = eINSTANCE.getemployee_Address();

    /**
     * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__SALARY = eINSTANCE.getemployee_Salary();

    /**
     * The meta object literal for the '<em><b>Mentor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__MENTOR = eINSTANCE.getemployee_Mentor();

  }

} //CompaniesPackage
