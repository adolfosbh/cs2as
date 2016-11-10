/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Expression;
import astm.RDBHostVariableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Host Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBHostVariableReferenceImpl#getBaseVariable <em>Base Variable</em>}</li>
 *   <li>{@link astm.impl.RDBHostVariableReferenceImpl#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBHostVariableReferenceImpl extends MinimalEObjectImpl.Container implements RDBHostVariableReference {
	/**
	 * The cached value of the '{@link #getBaseVariable() <em>Base Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVariable()
	 * @generated
	 * @ordered
	 */
	protected Expression baseVariable;

	/**
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected Expression indicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBHostVariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBHostVariableReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBaseVariable() {
		return baseVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVariable(Expression newBaseVariable, NotificationChain msgs) {
		Expression oldBaseVariable = baseVariable;
		baseVariable = newBaseVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE, oldBaseVariable, newBaseVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVariable(Expression newBaseVariable) {
		if (newBaseVariable != baseVariable) {
			NotificationChain msgs = null;
			if (baseVariable != null)
				msgs = ((InternalEObject)baseVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE, null, msgs);
			if (newBaseVariable != null)
				msgs = ((InternalEObject)newBaseVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE, null, msgs);
			msgs = basicSetBaseVariable(newBaseVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE, newBaseVariable, newBaseVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndicator() {
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicator(Expression newIndicator, NotificationChain msgs) {
		Expression oldIndicator = indicator;
		indicator = newIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR, oldIndicator, newIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicator(Expression newIndicator) {
		if (newIndicator != indicator) {
			NotificationChain msgs = null;
			if (indicator != null)
				msgs = ((InternalEObject)indicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR, null, msgs);
			if (newIndicator != null)
				msgs = ((InternalEObject)newIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR, null, msgs);
			msgs = basicSetIndicator(newIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR, newIndicator, newIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE:
				return basicSetBaseVariable(null, msgs);
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR:
				return basicSetIndicator(null, msgs);
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
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE:
				return getBaseVariable();
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR:
				return getIndicator();
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
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE:
				setBaseVariable((Expression)newValue);
				return;
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR:
				setIndicator((Expression)newValue);
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
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE:
				setBaseVariable((Expression)null);
				return;
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR:
				setIndicator((Expression)null);
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
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__BASE_VARIABLE:
				return baseVariable != null;
			case AstmPackage.RDB_HOST_VARIABLE_REFERENCE__INDICATOR:
				return indicator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBHostVariableReference(this);
	}

} //RDBHostVariableReferenceImpl
