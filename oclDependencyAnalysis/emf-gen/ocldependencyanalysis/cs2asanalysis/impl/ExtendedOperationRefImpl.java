/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ExtendedOperationRef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Operation Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.ExtendedOperationRefImpl#getOperationClass <em>Operation Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtendedOperationRefImpl extends OperationRefImpl implements ExtendedOperationRef {
	/**
	 * The cached value of the '{@link #getOperationClass() <em>Operation Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.Class operationClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedOperationRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.EXTENDED_OPERATION_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class getOperationClass() {
		if (operationClass != null && operationClass.eIsProxy()) {
			InternalEObject oldOperationClass = (InternalEObject)operationClass;
			operationClass = (org.eclipse.ocl.pivot.Class)eResolveProxy(oldOperationClass);
			if (operationClass != oldOperationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS, oldOperationClass, operationClass));
			}
		}
		return operationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class basicGetOperationClass() {
		return operationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationClass(org.eclipse.ocl.pivot.Class newOperationClass) {
		org.eclipse.ocl.pivot.Class oldOperationClass = operationClass;
		operationClass = newOperationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS, oldOperationClass, operationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS:
				if (resolve) return getOperationClass();
				return basicGetOperationClass();
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
			case CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS:
				setOperationClass((org.eclipse.ocl.pivot.Class)newValue);
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
			case CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS:
				setOperationClass((org.eclipse.ocl.pivot.Class)null);
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
			case CS2ASAnalysisPackage.EXTENDED_OPERATION_REF__OPERATION_CLASS:
				return operationClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtendedOperationRefImpl
