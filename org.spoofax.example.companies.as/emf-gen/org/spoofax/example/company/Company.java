/**
 */
package org.spoofax.example.company;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spoofax.example.company.Company#getName <em>Name</em>}</li>
 *   <li>{@link org.spoofax.example.company.Company#getDepts <em>Depts</em>}</li>
 * </ul>
 *
 * @see org.spoofax.example.company.CompanyPackage#getCompany()
 * @model annotation="spoofax.featureIndex 0='name' 1='depts'"
 * @generated
 */
public interface Company extends EObject {
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
	 * @see org.spoofax.example.company.CompanyPackage#getCompany_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spoofax.example.company.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Depts</b></em>' containment reference list.
	 * The list contents are of type {@link org.spoofax.example.company.Department}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depts</em>' containment reference list.
	 * @see org.spoofax.example.company.CompanyPackage#getCompany_Depts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Department> getDepts();

} // Company
