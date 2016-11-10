/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.NamedTypeDefinition;
import astm.RDBConnectStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Connect Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBConnectStatementImpl#getConnectString <em>Connect String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBConnectStatementImpl extends StatementImpl implements RDBConnectStatement {
	/**
	 * The cached value of the '{@link #getConnectString() <em>Connect String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectString()
	 * @generated
	 * @ordered
	 */
	protected NamedTypeDefinition connectString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBConnectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBConnectStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeDefinition getConnectString() {
		return connectString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectString(NamedTypeDefinition newConnectString, NotificationChain msgs) {
		NamedTypeDefinition oldConnectString = connectString;
		connectString = newConnectString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING, oldConnectString, newConnectString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectString(NamedTypeDefinition newConnectString) {
		if (newConnectString != connectString) {
			NotificationChain msgs = null;
			if (connectString != null)
				msgs = ((InternalEObject)connectString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING, null, msgs);
			if (newConnectString != null)
				msgs = ((InternalEObject)newConnectString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING, null, msgs);
			msgs = basicSetConnectString(newConnectString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING, newConnectString, newConnectString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING:
				return basicSetConnectString(null, msgs);
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
			case AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING:
				return getConnectString();
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
			case AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING:
				setConnectString((NamedTypeDefinition)newValue);
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
			case AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING:
				setConnectString((NamedTypeDefinition)null);
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
			case AstmPackage.RDB_CONNECT_STATEMENT__CONNECT_STRING:
				return connectString != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBConnectStatement(this);
	}

} //RDBConnectStatementImpl
