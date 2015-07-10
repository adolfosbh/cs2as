/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.env;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getParentEnv <em>Parent Env</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.env.EnvironmentPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Env4CG {
	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.EnvironmentPackage#getEnvironment_NamedElements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getNamedElements();

	/**
	 * Returns the value of the '<em><b>Parent Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Env</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Env</em>' reference.
	 * @see #setParentEnv(Environment)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.EnvironmentPackage#getEnvironment_ParentEnv()
	 * @model
	 * @generated
	 */
	Environment getParentEnv();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getParentEnv <em>Parent Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Env</em>' reference.
	 * @see #getParentEnv()
	 * @generated
	 */
	void setParentEnv(Environment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Environment{\n\t\t\t\t\t\tnamedElements = namedElements->includingAll(elements),\n\t\t\t\t\t\tparentEnv = parentEnv\t\n\t\t\t\t}'"
	 * @generated
	 */
	<NE extends NamedElement> Environment addElements(EList<NE> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Environment{\n\t\t\t\t\t\tnamedElements = namedElements->including(element),\n\t\t\t\t\t\tparentEnv = parentEnv\n\t\t\t\t\t}'"
	 * @generated
	 */
	Environment addElement(NamedElement element);

} // Environment
