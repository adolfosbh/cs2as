/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage;
import uk.ac.york.cs.asbh.lang.cs2as.source.X;
import uk.ac.york.cs.asbh.lang.cs2as.source.Y;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl#isIsA1 <em>Is A1</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl#getOwnsY <em>Owns Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XImpl extends MinimalEObjectImpl.Container implements X {
	/**
	 * The default value of the '{@link #isIsA1() <em>Is A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsA1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_A1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsA1() <em>Is A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsA1()
	 * @generated
	 * @ordered
	 */
	protected boolean isA1 = IS_A1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnsY() <em>Owns Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsY()
	 * @generated
	 * @ordered
	 */
	protected Y ownsY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsA1() {
		return isA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsA1(boolean newIsA1) {
		boolean oldIsA1 = isA1;
		isA1 = newIsA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.X__IS_A1, oldIsA1, isA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Y getOwnsY() {
		return ownsY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnsY(Y newOwnsY, NotificationChain msgs) {
		Y oldOwnsY = ownsY;
		ownsY = newOwnsY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SourcePackage.X__OWNS_Y, oldOwnsY, newOwnsY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnsY(Y newOwnsY) {
		if (newOwnsY != ownsY) {
			NotificationChain msgs = null;
			if (ownsY != null)
				msgs = ((InternalEObject)ownsY).eInverseRemove(this, SourcePackage.Y__TO_X, Y.class, msgs);
			if (newOwnsY != null)
				msgs = ((InternalEObject)newOwnsY).eInverseAdd(this, SourcePackage.Y__TO_X, Y.class, msgs);
			msgs = basicSetOwnsY(newOwnsY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.X__OWNS_Y, newOwnsY, newOwnsY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.X__OWNS_Y:
				if (ownsY != null)
					msgs = ((InternalEObject)ownsY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SourcePackage.X__OWNS_Y, null, msgs);
				return basicSetOwnsY((Y)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.X__OWNS_Y:
				return basicSetOwnsY(null, msgs);
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
			case SourcePackage.X__IS_A1:
				return isIsA1();
			case SourcePackage.X__OWNS_Y:
				return getOwnsY();
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
			case SourcePackage.X__IS_A1:
				setIsA1((Boolean)newValue);
				return;
			case SourcePackage.X__OWNS_Y:
				setOwnsY((Y)newValue);
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
			case SourcePackage.X__IS_A1:
				setIsA1(IS_A1_EDEFAULT);
				return;
			case SourcePackage.X__OWNS_Y:
				setOwnsY((Y)null);
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
			case SourcePackage.X__IS_A1:
				return isA1 != IS_A1_EDEFAULT;
			case SourcePackage.X__OWNS_Y:
				return ownsY != null;
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
		result.append(" (isA1: ");
		result.append(isA1);
		result.append(')');
		return result.toString();
	}

} //XImpl
