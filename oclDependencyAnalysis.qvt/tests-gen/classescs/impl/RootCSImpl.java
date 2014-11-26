/**
 */
package classescs.impl;

import classescs.ClassescsPackage;
import classescs.PackageCS;
import classescs.RootCS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link classescs.impl.RootCSImpl#getOwnedPackage <em>Owned Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootCSImpl extends ElementCSImpl implements RootCS {
	/**
	 * The cached value of the '{@link #getOwnedPackage() <em>Owned Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageCS ownedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassescsPackage.Literals.ROOT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageCS getOwnedPackage() {
		return ownedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPackage(PackageCS newOwnedPackage, NotificationChain msgs) {
		PackageCS oldOwnedPackage = ownedPackage;
		ownedPackage = newOwnedPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassescsPackage.ROOT_CS__OWNED_PACKAGE, oldOwnedPackage, newOwnedPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPackage(PackageCS newOwnedPackage) {
		if (newOwnedPackage != ownedPackage) {
			NotificationChain msgs = null;
			if (ownedPackage != null)
				msgs = ((InternalEObject)ownedPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassescsPackage.ROOT_CS__OWNED_PACKAGE, null, msgs);
			if (newOwnedPackage != null)
				msgs = ((InternalEObject)newOwnedPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassescsPackage.ROOT_CS__OWNED_PACKAGE, null, msgs);
			msgs = basicSetOwnedPackage(newOwnedPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassescsPackage.ROOT_CS__OWNED_PACKAGE, newOwnedPackage, newOwnedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassescsPackage.ROOT_CS__OWNED_PACKAGE:
				return basicSetOwnedPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassescsPackage.ROOT_CS__OWNED_PACKAGE:
				return getOwnedPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassescsPackage.ROOT_CS__OWNED_PACKAGE:
				setOwnedPackage((PackageCS)newValue);
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
			case ClassescsPackage.ROOT_CS__OWNED_PACKAGE:
				setOwnedPackage((PackageCS)null);
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
			case ClassescsPackage.ROOT_CS__OWNED_PACKAGE:
				return ownedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //RootCSImpl
