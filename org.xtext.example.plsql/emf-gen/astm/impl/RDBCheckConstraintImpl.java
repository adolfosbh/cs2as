/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBCheckConstraint;

import java.lang.Character;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBCheckConstraintImpl#getRDBConstraintText <em>RDB Constraint Text</em>}</li>
 *   <li>{@link astm.impl.RDBCheckConstraintImpl#getRDBConstraintType <em>RDB Constraint Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBCheckConstraintImpl extends RDBConstraintImpl implements RDBCheckConstraint {
	/**
	 * The default value of the '{@link #getRDBConstraintText() <em>RDB Constraint Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDBConstraintText()
	 * @generated
	 * @ordered
	 */
	protected static final String RDB_CONSTRAINT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRDBConstraintText() <em>RDB Constraint Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDBConstraintText()
	 * @generated
	 * @ordered
	 */
	protected String rdbConstraintText = RDB_CONSTRAINT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDBConstraintType() <em>RDB Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDBConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final char RDB_CONSTRAINT_TYPE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getRDBConstraintType() <em>RDB Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDBConstraintType()
	 * @generated
	 * @ordered
	 */
	protected char rdbConstraintType = RDB_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBCheckConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBCheckConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRDBConstraintText() {
		return rdbConstraintText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDBConstraintText(String newRDBConstraintText) {
		String oldRDBConstraintText = rdbConstraintText;
		rdbConstraintText = newRDBConstraintText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TEXT, oldRDBConstraintText, rdbConstraintText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getRDBConstraintType() {
		return rdbConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDBConstraintType(char newRDBConstraintType) {
		char oldRDBConstraintType = rdbConstraintType;
		rdbConstraintType = newRDBConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TYPE, oldRDBConstraintType, rdbConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TEXT:
				return getRDBConstraintText();
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TYPE:
				return getRDBConstraintType();
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
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TEXT:
				setRDBConstraintText((String)newValue);
				return;
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TYPE:
				setRDBConstraintType((Character)newValue);
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
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TEXT:
				setRDBConstraintText(RDB_CONSTRAINT_TEXT_EDEFAULT);
				return;
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TYPE:
				setRDBConstraintType(RDB_CONSTRAINT_TYPE_EDEFAULT);
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
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TEXT:
				return RDB_CONSTRAINT_TEXT_EDEFAULT == null ? rdbConstraintText != null : !RDB_CONSTRAINT_TEXT_EDEFAULT.equals(rdbConstraintText);
			case AstmPackage.RDB_CHECK_CONSTRAINT__RDB_CONSTRAINT_TYPE:
				return rdbConstraintType != RDB_CONSTRAINT_TYPE_EDEFAULT;
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
		result.append(" (RDBConstraintText: ");
		result.append(rdbConstraintText);
		result.append(", RDBConstraintType: ");
		result.append(rdbConstraintType);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBCheckConstraint(this);
	}

} //RDBCheckConstraintImpl
