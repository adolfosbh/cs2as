/**
 */
package org.xtext.example.mydsl.companies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.companies.company#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.companies.company#getDeparment <em>Deparment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.companies.CompaniesPackage#getcompany()
 * @model
 * @generated
 */
public interface company extends EObject
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
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getcompany_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.companies.company#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.example.mydsl.companies.CompaniesPackage#getcompany_Deparment()
   * @model containment="true"
   * @generated
   */
  EList<department> getDeparment();

} // company
