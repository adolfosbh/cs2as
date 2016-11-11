/**
 */
package org.xtext.example.macros.iMacros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.macros.iMacros.IMacrosPackage;
import org.xtext.example.macros.iMacros.Url;

import org.xtext.example.macros.iMacros.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.macros.iMacros.impl.UrlImpl#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UrlImpl extends InstructionImpl implements Url {
	/**
	 * The default value of the '{@link #getGoto() <em>Goto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoto()
	 * @generated
	 * @ordered
	 */
	protected static final String GOTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoto() <em>Goto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoto()
	 * @generated
	 * @ordered
	 */
	protected String goto_ = GOTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IMacrosPackage.Literals.URL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoto() {
		return goto_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoto(String newGoto) {
		String oldGoto = goto_;
		goto_ = newGoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IMacrosPackage.URL__GOTO, oldGoto, goto_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IMacrosPackage.URL__GOTO:
				return getGoto();
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
			case IMacrosPackage.URL__GOTO:
				setGoto((String)newValue);
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
			case IMacrosPackage.URL__GOTO:
				setGoto(GOTO_EDEFAULT);
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
			case IMacrosPackage.URL__GOTO:
				return GOTO_EDEFAULT == null ? goto_ != null : !GOTO_EDEFAULT.equals(goto_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (goto: ");
		result.append(goto_);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitUrl(this);
	}

} //UrlImpl
