/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import java.lang.reflect.InvocationTargetException;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ToStringSwitch;
import ocldependencyanalysis.graph2.impl.NodeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisNodeImpl#getAssociatedPackage <em>Associated Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CS2ASAnalysisNodeImpl extends NodeImpl implements CS2ASAnalysisNode {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.Class context;

	/**
	 * The cached value of the '{@link #getAssociatedPackage() <em>Associated Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.pivot.Package associatedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS2ASAnalysisNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CS2ASAnalysisPackage.Literals.CS2AS_ANALYSIS_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (org.eclipse.ocl.pivot.Class)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Class basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(org.eclipse.ocl.pivot.Class newContext) {
		org.eclipse.ocl.pivot.Class oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Package getAssociatedPackage() {
		if (associatedPackage != null && associatedPackage.eIsProxy()) {
			InternalEObject oldAssociatedPackage = (InternalEObject)associatedPackage;
			associatedPackage = (org.eclipse.ocl.pivot.Package)eResolveProxy(oldAssociatedPackage);
			if (associatedPackage != oldAssociatedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE, oldAssociatedPackage, associatedPackage));
			}
		}
		return associatedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Package basicGetAssociatedPackage() {
		return associatedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedPackage(org.eclipse.ocl.pivot.Package newAssociatedPackage) {
		org.eclipse.ocl.pivot.Package oldAssociatedPackage = associatedPackage;
		associatedPackage = newAssociatedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE, oldAssociatedPackage, associatedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return ToStringSwitch.INSTANCE.doSwitch(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE:
				if (resolve) return getAssociatedPackage();
				return basicGetAssociatedPackage();
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
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT:
				setContext((org.eclipse.ocl.pivot.Class)newValue);
				return;
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE:
				setAssociatedPackage((org.eclipse.ocl.pivot.Package)newValue);
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
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT:
				setContext((org.eclipse.ocl.pivot.Class)null);
				return;
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE:
				setAssociatedPackage((org.eclipse.ocl.pivot.Package)null);
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
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__CONTEXT:
				return context != null;
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE__ASSOCIATED_PACKAGE:
				return associatedPackage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CS2ASAnalysisNodeImpl
