/**
 */
package family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link family.Family#getChildren <em>Children</em>}</li>
 *   <li>{@link family.Family#getMother <em>Mother</em>}</li>
 *   <li>{@link family.Family#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @see family.FamilyPackage#getFamily()
 * @model annotation="spoofax.featureIndex 0='name' 1='mother' 2='father' 3='children'"
 * @generated
 */
public interface Family extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute list.
	 * @see family.FamilyPackage#getFamily_Children()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getChildren();

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' attribute.
	 * @see #setMother(String)
	 * @see family.FamilyPackage#getFamily_Mother()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMother();

	/**
	 * Sets the value of the '{@link family.Family#getMother <em>Mother</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' attribute.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(String value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' attribute.
	 * @see #setFather(String)
	 * @see family.FamilyPackage#getFamily_Father()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFather();

	/**
	 * Sets the value of the '{@link family.Family#getFather <em>Father</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' attribute.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(String value);

} // Family
