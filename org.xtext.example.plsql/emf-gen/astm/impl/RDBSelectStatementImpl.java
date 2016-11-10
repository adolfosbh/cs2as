/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBHostVariableReference;
import astm.RDBSelectExpression;
import astm.RDBSelectStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBSelectStatementImpl#getSelectExpression <em>Select Expression</em>}</li>
 *   <li>{@link astm.impl.RDBSelectStatementImpl#getIntoVariable <em>Into Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBSelectStatementImpl extends StatementImpl implements RDBSelectStatement {
	/**
	 * The cached value of the '{@link #getSelectExpression() <em>Select Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectExpression()
	 * @generated
	 * @ordered
	 */
	protected RDBSelectExpression selectExpression;

	/**
	 * The cached value of the '{@link #getIntoVariable() <em>Into Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntoVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBHostVariableReference> intoVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBSelectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBSelectStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBSelectExpression getSelectExpression() {
		return selectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectExpression(RDBSelectExpression newSelectExpression, NotificationChain msgs) {
		RDBSelectExpression oldSelectExpression = selectExpression;
		selectExpression = newSelectExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION, oldSelectExpression, newSelectExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectExpression(RDBSelectExpression newSelectExpression) {
		if (newSelectExpression != selectExpression) {
			NotificationChain msgs = null;
			if (selectExpression != null)
				msgs = ((InternalEObject)selectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION, null, msgs);
			if (newSelectExpression != null)
				msgs = ((InternalEObject)newSelectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION, null, msgs);
			msgs = basicSetSelectExpression(newSelectExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION, newSelectExpression, newSelectExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBHostVariableReference> getIntoVariable() {
		if (intoVariable == null) {
			intoVariable = new EObjectContainmentEList<RDBHostVariableReference>(RDBHostVariableReference.class, this, AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE);
		}
		return intoVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION:
				return basicSetSelectExpression(null, msgs);
			case AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE:
				return ((InternalEList<?>)getIntoVariable()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION:
				return getSelectExpression();
			case AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE:
				return getIntoVariable();
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
			case AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION:
				setSelectExpression((RDBSelectExpression)newValue);
				return;
			case AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE:
				getIntoVariable().clear();
				getIntoVariable().addAll((Collection<? extends RDBHostVariableReference>)newValue);
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
			case AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION:
				setSelectExpression((RDBSelectExpression)null);
				return;
			case AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE:
				getIntoVariable().clear();
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
			case AstmPackage.RDB_SELECT_STATEMENT__SELECT_EXPRESSION:
				return selectExpression != null;
			case AstmPackage.RDB_SELECT_STATEMENT__INTO_VARIABLE:
				return intoVariable != null && !intoVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBSelectStatement(this);
	}

} //RDBSelectStatementImpl
