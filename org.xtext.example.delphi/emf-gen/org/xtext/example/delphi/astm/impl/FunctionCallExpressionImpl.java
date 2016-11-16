/**
 */
package org.xtext.example.delphi.astm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.delphi.astm.ActualParameter;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.FunctionCallExpression;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl#getCalledFunction <em>Called Function</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallExpressionImpl extends ExpressionImpl implements FunctionCallExpression {
	/**
	 * The cached value of the '{@link #getCalledFunction() <em>Called Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledFunction()
	 * @generated
	 * @ordered
	 */
	protected Expression calledFunction;

	/**
	 * The cached value of the '{@link #getActualParams() <em>Actual Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualParameter> actualParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.FUNCTION_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCalledFunction() {
		return calledFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalledFunction(Expression newCalledFunction, NotificationChain msgs) {
		Expression oldCalledFunction = calledFunction;
		calledFunction = newCalledFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, oldCalledFunction, newCalledFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledFunction(Expression newCalledFunction) {
		if (newCalledFunction != calledFunction) {
			NotificationChain msgs = null;
			if (calledFunction != null)
				msgs = ((InternalEObject)calledFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, null, msgs);
			if (newCalledFunction != null)
				msgs = ((InternalEObject)newCalledFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, null, msgs);
			msgs = basicSetCalledFunction(newCalledFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, newCalledFunction, newCalledFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParameter> getActualParams() {
		if (actualParams == null) {
			actualParams = new EObjectContainmentEList<ActualParameter>(ActualParameter.class, this, AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS);
		}
		return actualParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return basicSetCalledFunction(null, msgs);
			case AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return ((InternalEList<?>)getActualParams()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return getCalledFunction();
			case AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return getActualParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				setCalledFunction((Expression)newValue);
				return;
			case AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				getActualParams().clear();
				getActualParams().addAll((Collection<? extends ActualParameter>)newValue);
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
			case AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				setCalledFunction((Expression)null);
				return;
			case AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				getActualParams().clear();
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
			case AstmPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return calledFunction != null;
			case AstmPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return actualParams != null && !actualParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitFunctionCallExpression(this);
	}

} //FunctionCallExpressionImpl
