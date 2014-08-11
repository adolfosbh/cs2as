/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.asbh.lang.cs2as.target.A2;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A2Impl#getOwnsC <em>Owns C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class A2Impl extends AImpl implements A2 {
	/**
	 * The cached value of the '{@link #getOwnsC() <em>Owns C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsC()
	 * @generated
	 * @ordered
	 */
	protected C ownsC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.A2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C getOwnsC() {
		return ownsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnsC(C newOwnsC, NotificationChain msgs) {
		C oldOwnsC = ownsC;
		ownsC = newOwnsC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.A2__OWNS_C, oldOwnsC, newOwnsC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnsC(C newOwnsC) {
		if (newOwnsC != ownsC) {
			NotificationChain msgs = null;
			if (ownsC != null)
				msgs = ((InternalEObject)ownsC).eInverseRemove(this, TargetPackage.C__TO_A2, C.class, msgs);
			if (newOwnsC != null)
				msgs = ((InternalEObject)newOwnsC).eInverseAdd(this, TargetPackage.C__TO_A2, C.class, msgs);
			msgs = basicSetOwnsC(newOwnsC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.A2__OWNS_C, newOwnsC, newOwnsC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.A2__OWNS_C:
				if (ownsC != null)
					msgs = ((InternalEObject)ownsC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.A2__OWNS_C, null, msgs);
				return basicSetOwnsC((C)otherEnd, msgs);
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
			case TargetPackage.A2__OWNS_C:
				return basicSetOwnsC(null, msgs);
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
			case TargetPackage.A2__OWNS_C:
				return getOwnsC();
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
			case TargetPackage.A2__OWNS_C:
				setOwnsC((C)newValue);
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
			case TargetPackage.A2__OWNS_C:
				setOwnsC((C)null);
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
			case TargetPackage.A2__OWNS_C:
				return ownsC != null;
		}
		return super.eIsSet(featureID);
	}

} //A2Impl
