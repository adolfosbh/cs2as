/**
 */
package org.xtext.example.mydsl.companies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.companies.CompaniesPackage;
import org.xtext.example.mydsl.companies.department_employees;
import org.xtext.example.mydsl.companies.employee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>department employees</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.impl.department_employeesImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class department_employeesImpl extends traceableImpl implements department_employees
{
  /**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
  protected EList<employee> employee;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected department_employeesImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return CompaniesPackage.Literals.DEPARTMENT_EMPLOYEES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<employee> getEmployee()
  {
		if (employee == null) {
			employee = new EObjectContainmentEList<employee>(employee.class, this, CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE);
		}
		return employee;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE:
				return ((InternalEList<?>)getEmployee()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE:
				return getEmployee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE:
				getEmployee().clear();
				getEmployee().addAll((Collection<? extends employee>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE:
				getEmployee().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CompaniesPackage.DEPARTMENT_EMPLOYEES__EMPLOYEE:
				return employee != null && !employee.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //department_employeesImpl
