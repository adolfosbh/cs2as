/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Method List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.classMethodList#getMetod <em>Metod</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getclassMethodList()
 * @model
 * @generated
 */
public interface classMethodList extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Metod</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.delphi.classMethod}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metod</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Metod</em>' containment reference list.
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getclassMethodList_Metod()
	 * @model containment="true"
	 * @generated
	 */
  EList<classMethod> getMetod();

} // classMethodList
