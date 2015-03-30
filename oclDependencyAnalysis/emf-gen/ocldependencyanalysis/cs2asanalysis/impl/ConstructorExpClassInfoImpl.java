/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ConstructorExpClassInfo;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Exp Class Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.ShadowExpClassInfoImpl#getShadowExp <em>Constructor Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorExpClassInfoImpl extends ClassInfoImpl implements ConstructorExpClassInfo {
	/**
	 * The cached value of the '{@link #getConstructorExp() <em>Constructor Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorExp()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.ShadowExp constructorExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorExpClassInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.CONSTRUCTOR_EXP_CLASS_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.ShadowExp getShadowExp() {
		if (constructorExp != null && constructorExp.eIsProxy()) {
			InternalEObject oldShadowExp = (InternalEObject)constructorExp;
			constructorExp = (org.eclipse.ocl.pivot.ShadowExp)eResolveProxy(oldShadowExp);
			if (constructorExp != oldShadowExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP, oldShadowExp, constructorExp));
			}
		}
		return constructorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.ShadowExp basicGetShadowExp() {
		return constructorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowExp(org.eclipse.ocl.pivot.ShadowExp newShadowExp) {
		org.eclipse.ocl.pivot.ShadowExp oldShadowExp = constructorExp;
		constructorExp = newShadowExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP, oldShadowExp, constructorExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP:
				if (resolve) return getShadowExp();
				return basicGetShadowExp();
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP:
				setShadowExp((org.eclipse.ocl.pivot.ShadowExp)newValue);
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP:
				setShadowExp((org.eclipse.ocl.pivot.ShadowExp)null);
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
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP:
				return constructorExp != null;
		}
		return super.eIsSet(featureID);
	}

} //ShadowExpClassInfoImpl
