/**
 */
package astm.impl;

import astm.AggregateTypeDefinition;
import astm.AstmPackage;
import astm.RDBViewDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB View Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBViewDefinitionImpl#getDefinedBy <em>Defined By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBViewDefinitionImpl extends DefinitionImpl implements RDBViewDefinition {
	/**
	 * The cached value of the '{@link #getDefinedBy() <em>Defined By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected AggregateTypeDefinition definedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBViewDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBViewDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateTypeDefinition getDefinedBy() {
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedBy(AggregateTypeDefinition newDefinedBy, NotificationChain msgs) {
		AggregateTypeDefinition oldDefinedBy = definedBy;
		definedBy = newDefinedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY, oldDefinedBy, newDefinedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedBy(AggregateTypeDefinition newDefinedBy) {
		if (newDefinedBy != definedBy) {
			NotificationChain msgs = null;
			if (definedBy != null)
				msgs = ((InternalEObject)definedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY, null, msgs);
			if (newDefinedBy != null)
				msgs = ((InternalEObject)newDefinedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY, null, msgs);
			msgs = basicSetDefinedBy(newDefinedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY, newDefinedBy, newDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY:
				return basicSetDefinedBy(null, msgs);
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
			case AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY:
				return getDefinedBy();
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
			case AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY:
				setDefinedBy((AggregateTypeDefinition)newValue);
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
			case AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY:
				setDefinedBy((AggregateTypeDefinition)null);
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
			case AstmPackage.RDB_VIEW_DEFINITION__DEFINED_BY:
				return definedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBViewDefinition(this);
	}

} //RDBViewDefinitionImpl
