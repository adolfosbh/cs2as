/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.EnvironmentInfo;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.EnvironmentInfoImpl#getLookupClass <em>Lookup Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentInfoImpl extends ExtendedOperationRefImpl implements EnvironmentInfo {
	/**
	 * The cached value of the '{@link #getLookupClass() <em>Lookup Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.Class lookupClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.ENVIRONMENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class getLookupClass() {
		if (lookupClass != null && lookupClass.eIsProxy()) {
			InternalEObject oldLookupClass = (InternalEObject)lookupClass;
			lookupClass = (org.eclipse.ocl.pivot.Class)eResolveProxy(oldLookupClass);
			if (lookupClass != oldLookupClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS, oldLookupClass, lookupClass));
			}
		}
		return lookupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class basicGetLookupClass() {
		return lookupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookupClass(org.eclipse.ocl.pivot.Class newLookupClass) {
		org.eclipse.ocl.pivot.Class oldLookupClass = lookupClass;
		lookupClass = newLookupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS, oldLookupClass, lookupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS:
				if (resolve) return getLookupClass();
				return basicGetLookupClass();
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
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS:
				setLookupClass((org.eclipse.ocl.pivot.Class)newValue);
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
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS:
				setLookupClass((org.eclipse.ocl.pivot.Class)null);
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
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO__LOOKUP_CLASS:
				return lookupClass != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentInfoImpl
