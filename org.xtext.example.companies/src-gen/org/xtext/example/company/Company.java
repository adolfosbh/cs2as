/**
 */
package org.xtext.example.company;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.company.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.company.Company#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.company.Company#getDepts <em>Depts</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.company.CompanyPackage#getCompany()
 * @model superTypes="org.xtext.example.company.Visitable"
 * @generated
 */
public interface Company extends EObject, Visitable {
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
	 * @see org.xtext.example.company.CompanyPackage#getCompany_Name()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Company!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Depts</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.company.Department}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depts</em>' containment reference list.
	 * @see org.xtext.example.company.CompanyPackage#getCompany_Depts()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.company.com!Company!depts'"
	 * @generated
	 */
	EList<Department> getDepts();

} // Company
