/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ExtendedPropertyRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Property Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedPropertyRefImpl#getPropertyClass <em>Property Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExtendedPropertyRefImpl extends PropertyRefImpl implements ExtendedPropertyRef {
	/**
	 * The cached value of the '{@link #getPropertyClass() <em>Property Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.examples.pivot.Class propertyClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedPropertyRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.EXTENDED_PROPERTY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Class getPropertyClass() {
		if (propertyClass != null && ((EObject)propertyClass).eIsProxy()) {
			InternalEObject oldPropertyClass = (InternalEObject)propertyClass;
			propertyClass = (org.eclipse.ocl.examples.pivot.Class)eResolveProxy(oldPropertyClass);
			if (propertyClass != oldPropertyClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS, oldPropertyClass, propertyClass));
			}
		}
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Class basicGetPropertyClass() {
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyClass(org.eclipse.ocl.examples.pivot.Class newPropertyClass) {
		org.eclipse.ocl.examples.pivot.Class oldPropertyClass = propertyClass;
		propertyClass = newPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS, oldPropertyClass, propertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS:
				if (resolve) return getPropertyClass();
				return basicGetPropertyClass();
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
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS:
				setPropertyClass((org.eclipse.ocl.examples.pivot.Class)newValue);
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
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS:
				setPropertyClass((org.eclipse.ocl.examples.pivot.Class)null);
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
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF__PROPERTY_CLASS:
				return propertyClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtendedPropertyRefImpl
