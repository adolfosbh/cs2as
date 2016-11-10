/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Expression;
import astm.NameSpaceDefinition;
import astm.RDBModifyStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Modify Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBModifyStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link astm.impl.RDBModifyStatementImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RDBModifyStatementImpl extends StatementImpl implements RDBModifyStatement {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<NameSpaceDefinition> table;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Expression where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBModifyStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBModifyStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameSpaceDefinition> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<NameSpaceDefinition>(NameSpaceDefinition.class, this, AstmPackage.RDB_MODIFY_STATEMENT__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		Expression oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_MODIFY_STATEMENT__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_MODIFY_STATEMENT__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_MODIFY_STATEMENT__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_MODIFY_STATEMENT__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_MODIFY_STATEMENT__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_MODIFY_STATEMENT__WHERE:
				return basicSetWhere(null, msgs);
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
			case AstmPackage.RDB_MODIFY_STATEMENT__TABLE:
				return getTable();
			case AstmPackage.RDB_MODIFY_STATEMENT__WHERE:
				return getWhere();
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
			case AstmPackage.RDB_MODIFY_STATEMENT__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends NameSpaceDefinition>)newValue);
				return;
			case AstmPackage.RDB_MODIFY_STATEMENT__WHERE:
				setWhere((Expression)newValue);
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
			case AstmPackage.RDB_MODIFY_STATEMENT__TABLE:
				getTable().clear();
				return;
			case AstmPackage.RDB_MODIFY_STATEMENT__WHERE:
				setWhere((Expression)null);
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
			case AstmPackage.RDB_MODIFY_STATEMENT__TABLE:
				return table != null && !table.isEmpty();
			case AstmPackage.RDB_MODIFY_STATEMENT__WHERE:
				return where != null;
		}
		return super.eIsSet(featureID);
	}


} //RDBModifyStatementImpl
