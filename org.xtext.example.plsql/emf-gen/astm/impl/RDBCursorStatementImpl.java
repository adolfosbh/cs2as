/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Expression;
import astm.RDBCursorStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBCursorStatementImpl#getCursor <em>Cursor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RDBCursorStatementImpl extends StatementImpl implements RDBCursorStatement {
	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected Expression cursor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBCursorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBCursorStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCursor(Expression newCursor, NotificationChain msgs) {
		Expression oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CURSOR_STATEMENT__CURSOR, oldCursor, newCursor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(Expression newCursor) {
		if (newCursor != cursor) {
			NotificationChain msgs = null;
			if (cursor != null)
				msgs = ((InternalEObject)cursor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CURSOR_STATEMENT__CURSOR, null, msgs);
			if (newCursor != null)
				msgs = ((InternalEObject)newCursor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CURSOR_STATEMENT__CURSOR, null, msgs);
			msgs = basicSetCursor(newCursor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CURSOR_STATEMENT__CURSOR, newCursor, newCursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_CURSOR_STATEMENT__CURSOR:
				return basicSetCursor(null, msgs);
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
			case AstmPackage.RDB_CURSOR_STATEMENT__CURSOR:
				return getCursor();
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
			case AstmPackage.RDB_CURSOR_STATEMENT__CURSOR:
				setCursor((Expression)newValue);
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
			case AstmPackage.RDB_CURSOR_STATEMENT__CURSOR:
				setCursor((Expression)null);
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
			case AstmPackage.RDB_CURSOR_STATEMENT__CURSOR:
				return cursor != null;
		}
		return super.eIsSet(featureID);
	}


} //RDBCursorStatementImpl
