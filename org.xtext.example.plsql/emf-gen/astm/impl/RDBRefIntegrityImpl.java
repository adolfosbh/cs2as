/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBColumnReference;
import astm.RDBRefIntegrity;
import astm.RDBTableReference;

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
 * An implementation of the model object '<em><b>RDB Ref Integrity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBRefIntegrityImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link astm.impl.RDBRefIntegrityImpl#getParentKey <em>Parent Key</em>}</li>
 *   <li>{@link astm.impl.RDBRefIntegrityImpl#getParentTable <em>Parent Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBRefIntegrityImpl extends RDBConstraintImpl implements RDBRefIntegrity {
	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBColumnReference> foreignKey;

	/**
	 * The cached value of the '{@link #getParentKey() <em>Parent Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBColumnReference> parentKey;

	/**
	 * The cached value of the '{@link #getParentTable() <em>Parent Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTable()
	 * @generated
	 * @ordered
	 */
	protected RDBTableReference parentTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBRefIntegrityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBRefIntegrity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBColumnReference> getForeignKey() {
		if (foreignKey == null) {
			foreignKey = new EObjectContainmentEList<RDBColumnReference>(RDBColumnReference.class, this, AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY);
		}
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBColumnReference> getParentKey() {
		if (parentKey == null) {
			parentKey = new EObjectContainmentEList<RDBColumnReference>(RDBColumnReference.class, this, AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY);
		}
		return parentKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBTableReference getParentTable() {
		return parentTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTable(RDBTableReference newParentTable, NotificationChain msgs) {
		RDBTableReference oldParentTable = parentTable;
		parentTable = newParentTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE, oldParentTable, newParentTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTable(RDBTableReference newParentTable) {
		if (newParentTable != parentTable) {
			NotificationChain msgs = null;
			if (parentTable != null)
				msgs = ((InternalEObject)parentTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE, null, msgs);
			if (newParentTable != null)
				msgs = ((InternalEObject)newParentTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE, null, msgs);
			msgs = basicSetParentTable(newParentTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE, newParentTable, newParentTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY:
				return ((InternalEList<?>)getForeignKey()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY:
				return ((InternalEList<?>)getParentKey()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE:
				return basicSetParentTable(null, msgs);
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
			case AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY:
				return getForeignKey();
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY:
				return getParentKey();
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE:
				return getParentTable();
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
			case AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY:
				getForeignKey().clear();
				getForeignKey().addAll((Collection<? extends RDBColumnReference>)newValue);
				return;
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY:
				getParentKey().clear();
				getParentKey().addAll((Collection<? extends RDBColumnReference>)newValue);
				return;
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE:
				setParentTable((RDBTableReference)newValue);
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
			case AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY:
				getForeignKey().clear();
				return;
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY:
				getParentKey().clear();
				return;
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE:
				setParentTable((RDBTableReference)null);
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
			case AstmPackage.RDB_REF_INTEGRITY__FOREIGN_KEY:
				return foreignKey != null && !foreignKey.isEmpty();
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_KEY:
				return parentKey != null && !parentKey.isEmpty();
			case AstmPackage.RDB_REF_INTEGRITY__PARENT_TABLE:
				return parentTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBRefIntegrity(this);
	}

} //RDBRefIntegrityImpl
