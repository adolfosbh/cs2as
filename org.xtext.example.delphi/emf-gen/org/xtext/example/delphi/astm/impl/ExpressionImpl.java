/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.ExpressionImpl#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends GASTMSyntaxObjectImpl implements Expression {
	/**
	 * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference expressionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getExpressionType() {
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionType(TypeReference newExpressionType, NotificationChain msgs) {
		TypeReference oldExpressionType = expressionType;
		expressionType = newExpressionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.EXPRESSION__EXPRESSION_TYPE, oldExpressionType, newExpressionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionType(TypeReference newExpressionType) {
		if (newExpressionType != expressionType) {
			NotificationChain msgs = null;
			if (expressionType != null)
				msgs = ((InternalEObject)expressionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.EXPRESSION__EXPRESSION_TYPE, null, msgs);
			if (newExpressionType != null)
				msgs = ((InternalEObject)newExpressionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.EXPRESSION__EXPRESSION_TYPE, null, msgs);
			msgs = basicSetExpressionType(newExpressionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.EXPRESSION__EXPRESSION_TYPE, newExpressionType, newExpressionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.EXPRESSION__EXPRESSION_TYPE:
				return basicSetExpressionType(null, msgs);
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
			case AstmPackage.EXPRESSION__EXPRESSION_TYPE:
				return getExpressionType();
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
			case AstmPackage.EXPRESSION__EXPRESSION_TYPE:
				setExpressionType((TypeReference)newValue);
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
			case AstmPackage.EXPRESSION__EXPRESSION_TYPE:
				setExpressionType((TypeReference)null);
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
			case AstmPackage.EXPRESSION__EXPRESSION_TYPE:
				return expressionType != null;
		}
		return super.eIsSet(featureID);
	}


} //ExpressionImpl
