/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Dimension;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.DimensionImpl#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.DimensionImpl#getHighBound <em>High Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends OtherSyntaxObjectImpl implements Dimension {
	/**
	 * The cached value of the '{@link #getLowBound() <em>Low Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBound()
	 * @generated
	 * @ordered
	 */
	protected Expression lowBound;

	/**
	 * The cached value of the '{@link #getHighBound() <em>High Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBound()
	 * @generated
	 * @ordered
	 */
	protected Expression highBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLowBound() {
		return lowBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowBound(Expression newLowBound, NotificationChain msgs) {
		Expression oldLowBound = lowBound;
		lowBound = newLowBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.DIMENSION__LOW_BOUND, oldLowBound, newLowBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowBound(Expression newLowBound) {
		if (newLowBound != lowBound) {
			NotificationChain msgs = null;
			if (lowBound != null)
				msgs = ((InternalEObject)lowBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DIMENSION__LOW_BOUND, null, msgs);
			if (newLowBound != null)
				msgs = ((InternalEObject)newLowBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DIMENSION__LOW_BOUND, null, msgs);
			msgs = basicSetLowBound(newLowBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.DIMENSION__LOW_BOUND, newLowBound, newLowBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHighBound() {
		return highBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighBound(Expression newHighBound, NotificationChain msgs) {
		Expression oldHighBound = highBound;
		highBound = newHighBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.DIMENSION__HIGH_BOUND, oldHighBound, newHighBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighBound(Expression newHighBound) {
		if (newHighBound != highBound) {
			NotificationChain msgs = null;
			if (highBound != null)
				msgs = ((InternalEObject)highBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DIMENSION__HIGH_BOUND, null, msgs);
			if (newHighBound != null)
				msgs = ((InternalEObject)newHighBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DIMENSION__HIGH_BOUND, null, msgs);
			msgs = basicSetHighBound(newHighBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.DIMENSION__HIGH_BOUND, newHighBound, newHighBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.DIMENSION__LOW_BOUND:
				return basicSetLowBound(null, msgs);
			case AstmPackage.DIMENSION__HIGH_BOUND:
				return basicSetHighBound(null, msgs);
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
			case AstmPackage.DIMENSION__LOW_BOUND:
				return getLowBound();
			case AstmPackage.DIMENSION__HIGH_BOUND:
				return getHighBound();
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
			case AstmPackage.DIMENSION__LOW_BOUND:
				setLowBound((Expression)newValue);
				return;
			case AstmPackage.DIMENSION__HIGH_BOUND:
				setHighBound((Expression)newValue);
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
			case AstmPackage.DIMENSION__LOW_BOUND:
				setLowBound((Expression)null);
				return;
			case AstmPackage.DIMENSION__HIGH_BOUND:
				setHighBound((Expression)null);
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
			case AstmPackage.DIMENSION__LOW_BOUND:
				return lowBound != null;
			case AstmPackage.DIMENSION__HIGH_BOUND:
				return highBound != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitDimension(this);
	}

} //DimensionImpl
