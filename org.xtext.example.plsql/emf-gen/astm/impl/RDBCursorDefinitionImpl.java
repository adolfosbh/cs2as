/**
 */
package astm.impl;

import astm.AggregateTypeDefinition;
import astm.AstmPackage;
import astm.RDBCursorDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Cursor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBCursorDefinitionImpl#getSelectExpression <em>Select Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBCursorDefinitionImpl extends DefinitionImpl implements RDBCursorDefinition {
	/**
	 * The cached value of the '{@link #getSelectExpression() <em>Select Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectExpression()
	 * @generated
	 * @ordered
	 */
	protected AggregateTypeDefinition selectExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBCursorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBCursorDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateTypeDefinition getSelectExpression() {
		return selectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectExpression(AggregateTypeDefinition newSelectExpression, NotificationChain msgs) {
		AggregateTypeDefinition oldSelectExpression = selectExpression;
		selectExpression = newSelectExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION, oldSelectExpression, newSelectExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectExpression(AggregateTypeDefinition newSelectExpression) {
		if (newSelectExpression != selectExpression) {
			NotificationChain msgs = null;
			if (selectExpression != null)
				msgs = ((InternalEObject)selectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION, null, msgs);
			if (newSelectExpression != null)
				msgs = ((InternalEObject)newSelectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION, null, msgs);
			msgs = basicSetSelectExpression(newSelectExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION, newSelectExpression, newSelectExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION:
				return basicSetSelectExpression(null, msgs);
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
			case AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION:
				return getSelectExpression();
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
			case AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION:
				setSelectExpression((AggregateTypeDefinition)newValue);
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
			case AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION:
				setSelectExpression((AggregateTypeDefinition)null);
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
			case AstmPackage.RDB_CURSOR_DEFINITION__SELECT_EXPRESSION:
				return selectExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBCursorDefinition(this);
	}

} //RDBCursorDefinitionImpl
