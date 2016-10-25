/**
 */
package family.impl;

import family.Family;
import family.FamilyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link family.impl.FamilyImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link family.impl.FamilyImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link family.impl.FamilyImpl#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyImpl extends NamedElementImpl implements Family {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<String> children;

	/**
	 * The default value of the '{@link #getMother() <em>Mother</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected String mother = MOTHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFather() <em>Father</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected static final String FATHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected String father = FATHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChildren() {
		if (children == null) {
			children = new EDataTypeUniqueEList<String>(String.class, this, FamilyPackage.FAMILY__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(String newMother) {
		String oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FAMILY__MOTHER, oldMother, mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(String newFather) {
		String oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FAMILY__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.FAMILY__CHILDREN:
				return getChildren();
			case FamilyPackage.FAMILY__MOTHER:
				return getMother();
			case FamilyPackage.FAMILY__FATHER:
				return getFather();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FamilyPackage.FAMILY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends String>)newValue);
				return;
			case FamilyPackage.FAMILY__MOTHER:
				setMother((String)newValue);
				return;
			case FamilyPackage.FAMILY__FATHER:
				setFather((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FamilyPackage.FAMILY__CHILDREN:
				getChildren().clear();
				return;
			case FamilyPackage.FAMILY__MOTHER:
				setMother(MOTHER_EDEFAULT);
				return;
			case FamilyPackage.FAMILY__FATHER:
				setFather(FATHER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FamilyPackage.FAMILY__CHILDREN:
				return children != null && !children.isEmpty();
			case FamilyPackage.FAMILY__MOTHER:
				return MOTHER_EDEFAULT == null ? mother != null : !MOTHER_EDEFAULT.equals(mother);
			case FamilyPackage.FAMILY__FATHER:
				return FATHER_EDEFAULT == null ? father != null : !FATHER_EDEFAULT.equals(father);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (children: ");
		result.append(children);
		result.append(", mother: ");
		result.append(mother);
		result.append(", father: ");
		result.append(father);
		result.append(')');
		return result.toString();
	}

} //FamilyImpl
