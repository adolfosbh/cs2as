/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Call Exp Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.PropertyCallExpInfoImpl#getPropertyCallExp <em>Property Call Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyCallExpInfoImpl extends ExtendedPropertyInfoImpl implements PropertyCallExpInfo {
	/**
	 * The cached value of the '{@link #getPropertyCallExp() <em>Property Call Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyCallExp()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.PropertyCallExp propertyCallExp;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCallExpInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.PROPERTY_CALL_EXP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.PropertyCallExp getPropertyCallExp() {
		if (propertyCallExp != null && propertyCallExp.eIsProxy()) {
			InternalEObject oldPropertyCallExp = (InternalEObject)propertyCallExp;
			propertyCallExp = (org.eclipse.ocl.pivot.PropertyCallExp)eResolveProxy(oldPropertyCallExp);
			if (propertyCallExp != oldPropertyCallExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP, oldPropertyCallExp, propertyCallExp));
			}
		}
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.PropertyCallExp basicGetPropertyCallExp() {
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyCallExp(org.eclipse.ocl.pivot.PropertyCallExp newPropertyCallExp) {
		org.eclipse.ocl.pivot.PropertyCallExp oldPropertyCallExp = propertyCallExp;
		propertyCallExp = newPropertyCallExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP, oldPropertyCallExp, propertyCallExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP:
				if (resolve) return getPropertyCallExp();
				return basicGetPropertyCallExp();
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
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP:
				setPropertyCallExp((org.eclipse.ocl.pivot.PropertyCallExp)newValue);
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
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP:
				setPropertyCallExp((org.eclipse.ocl.pivot.PropertyCallExp)null);
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
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP:
				return propertyCallExp != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyCallExpInfoImpl
