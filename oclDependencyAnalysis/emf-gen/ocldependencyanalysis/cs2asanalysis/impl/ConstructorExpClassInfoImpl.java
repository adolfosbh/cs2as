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
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.ConstructorExpClassInfoImpl#getConstructorExp <em>Constructor Exp</em>}</li>
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
	protected org.eclipse.ocl.pivot.ConstructorExp constructorExp;

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
	public org.eclipse.ocl.pivot.ConstructorExp getConstructorExp() {
		if (constructorExp != null && constructorExp.eIsProxy()) {
			InternalEObject oldConstructorExp = (InternalEObject)constructorExp;
			constructorExp = (org.eclipse.ocl.pivot.ConstructorExp)eResolveProxy(oldConstructorExp);
			if (constructorExp != oldConstructorExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP, oldConstructorExp, constructorExp));
			}
		}
		return constructorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.ConstructorExp basicGetConstructorExp() {
		return constructorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorExp(org.eclipse.ocl.pivot.ConstructorExp newConstructorExp) {
		org.eclipse.ocl.pivot.ConstructorExp oldConstructorExp = constructorExp;
		constructorExp = newConstructorExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO__CONSTRUCTOR_EXP, oldConstructorExp, constructorExp));
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
				if (resolve) return getConstructorExp();
				return basicGetConstructorExp();
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
				setConstructorExp((org.eclipse.ocl.pivot.ConstructorExp)newValue);
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
				setConstructorExp((org.eclipse.ocl.pivot.ConstructorExp)null);
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

} //ConstructorExpClassInfoImpl
