/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.asbh.lang.cs2as.target.A1;
import uk.ac.york.cs.asbh.lang.cs2as.target.B;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A1Impl#getOwnsB <em>Owns B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class A1Impl extends AImpl implements A1 {
	/**
	 * The cached value of the '{@link #getOwnsB() <em>Owns B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsB()
	 * @generated
	 * @ordered
	 */
	protected B ownsB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.A1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B getOwnsB() {
		return ownsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnsB(B newOwnsB, NotificationChain msgs) {
		B oldOwnsB = ownsB;
		ownsB = newOwnsB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.A1__OWNS_B, oldOwnsB, newOwnsB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnsB(B newOwnsB) {
		if (newOwnsB != ownsB) {
			NotificationChain msgs = null;
			if (ownsB != null)
				msgs = ((InternalEObject)ownsB).eInverseRemove(this, TargetPackage.B__TO_A1, B.class, msgs);
			if (newOwnsB != null)
				msgs = ((InternalEObject)newOwnsB).eInverseAdd(this, TargetPackage.B__TO_A1, B.class, msgs);
			msgs = basicSetOwnsB(newOwnsB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.A1__OWNS_B, newOwnsB, newOwnsB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.A1__OWNS_B:
				if (ownsB != null)
					msgs = ((InternalEObject)ownsB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.A1__OWNS_B, null, msgs);
				return basicSetOwnsB((B)otherEnd, msgs);
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
			case TargetPackage.A1__OWNS_B:
				return basicSetOwnsB(null, msgs);
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
			case TargetPackage.A1__OWNS_B:
				return getOwnsB();
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
			case TargetPackage.A1__OWNS_B:
				setOwnsB((B)newValue);
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
			case TargetPackage.A1__OWNS_B:
				setOwnsB((B)null);
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
			case TargetPackage.A1__OWNS_B:
				return ownsB != null;
		}
		return super.eIsSet(featureID);
	}

} //A1Impl
