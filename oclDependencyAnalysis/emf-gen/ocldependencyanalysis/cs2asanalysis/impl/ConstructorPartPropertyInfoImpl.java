/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Part Property Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorPartPropertyInfoImpl#getConstructorPart <em>Constructor Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorPartPropertyInfoImpl extends ExtendedPropertyInfoImpl implements ConstructorPartPropertyInfo {
	/**
	 * The cached value of the '{@link #getConstructorPart() <em>Constructor Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorPart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.ConstructorPart constructorPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorPartPropertyInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.CONSTRUCTOR_PART_PROPERTY_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.ConstructorPart getConstructorPart() {
		if (constructorPart != null && constructorPart.eIsProxy()) {
			InternalEObject oldConstructorPart = (InternalEObject)constructorPart;
			constructorPart = (org.eclipse.ocl.pivot.ConstructorPart)eResolveProxy(oldConstructorPart);
			if (constructorPart != oldConstructorPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART, oldConstructorPart, constructorPart));
			}
		}
		return constructorPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.ConstructorPart basicGetConstructorPart() {
		return constructorPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorPart(org.eclipse.ocl.pivot.ConstructorPart newConstructorPart) {
		org.eclipse.ocl.pivot.ConstructorPart oldConstructorPart = constructorPart;
		constructorPart = newConstructorPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART, oldConstructorPart, constructorPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART:
				if (resolve) return getConstructorPart();
				return basicGetConstructorPart();
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART:
				setConstructorPart((org.eclipse.ocl.pivot.ConstructorPart)newValue);
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART:
				setConstructorPart((org.eclipse.ocl.pivot.ConstructorPart)null);
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART:
				return constructorPart != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConstructorPartPropRef.class) {
			switch (derivedFeatureID) {
				case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART: return CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConstructorPartPropRef.class) {
			switch (baseFeatureID) {
				case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART: return CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO__CONSTRUCTOR_PART;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstructorPartPropertyInfoImpl
