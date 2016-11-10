/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.IncludeUnit;
import astm.RDBIndexColumn;

import java.lang.Character;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Index Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBIndexColumnImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.impl.RDBIndexColumnImpl#getAscendingOrDescending <em>Ascending Or Descending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBIndexColumnImpl extends OtherSyntaxObjectImpl implements RDBIndexColumn {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected IncludeUnit column;

	/**
	 * The default value of the '{@link #getAscendingOrDescending() <em>Ascending Or Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscendingOrDescending()
	 * @generated
	 * @ordered
	 */
	protected static final char ASCENDING_OR_DESCENDING_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getAscendingOrDescending() <em>Ascending Or Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscendingOrDescending()
	 * @generated
	 * @ordered
	 */
	protected char ascendingOrDescending = ASCENDING_OR_DESCENDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBIndexColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBIndexColumn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeUnit getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(IncludeUnit newColumn, NotificationChain msgs) {
		IncludeUnit oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_INDEX_COLUMN__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(IncludeUnit newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_INDEX_COLUMN__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_INDEX_COLUMN__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_INDEX_COLUMN__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getAscendingOrDescending() {
		return ascendingOrDescending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscendingOrDescending(char newAscendingOrDescending) {
		char oldAscendingOrDescending = ascendingOrDescending;
		ascendingOrDescending = newAscendingOrDescending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_INDEX_COLUMN__ASCENDING_OR_DESCENDING, oldAscendingOrDescending, ascendingOrDescending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_INDEX_COLUMN__COLUMN:
				return basicSetColumn(null, msgs);
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
			case AstmPackage.RDB_INDEX_COLUMN__COLUMN:
				return getColumn();
			case AstmPackage.RDB_INDEX_COLUMN__ASCENDING_OR_DESCENDING:
				return getAscendingOrDescending();
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
			case AstmPackage.RDB_INDEX_COLUMN__COLUMN:
				setColumn((IncludeUnit)newValue);
				return;
			case AstmPackage.RDB_INDEX_COLUMN__ASCENDING_OR_DESCENDING:
				setAscendingOrDescending((Character)newValue);
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
			case AstmPackage.RDB_INDEX_COLUMN__COLUMN:
				setColumn((IncludeUnit)null);
				return;
			case AstmPackage.RDB_INDEX_COLUMN__ASCENDING_OR_DESCENDING:
				setAscendingOrDescending(ASCENDING_OR_DESCENDING_EDEFAULT);
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
			case AstmPackage.RDB_INDEX_COLUMN__COLUMN:
				return column != null;
			case AstmPackage.RDB_INDEX_COLUMN__ASCENDING_OR_DESCENDING:
				return ascendingOrDescending != ASCENDING_OR_DESCENDING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AscendingOrDescending: ");
		result.append(ascendingOrDescending);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBIndexColumn(this);
	}

} //RDBIndexColumnImpl
