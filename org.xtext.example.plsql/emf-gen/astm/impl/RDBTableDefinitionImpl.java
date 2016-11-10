/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBColumnDefinition;
import astm.RDBColumnReference;
import astm.RDBConstraint;
import astm.RDBIndex;
import astm.RDBTableDefinition;
import astm.RDBTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Table Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBTableDefinitionImpl#getPrimKey <em>Prim Key</em>}</li>
 *   <li>{@link astm.impl.RDBTableDefinitionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.impl.RDBTableDefinitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link astm.impl.RDBTableDefinitionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link astm.impl.RDBTableDefinitionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBTableDefinitionImpl extends DefinitionImpl implements RDBTableDefinition {
	/**
	 * The cached value of the '{@link #getPrimKey() <em>Prim Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBColumnReference> primKey;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBColumnDefinition> column;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBConstraint> constraint;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBIndex> index;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBTrigger> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTableDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTableDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBColumnReference> getPrimKey() {
		if (primKey == null) {
			primKey = new EObjectContainmentEList<RDBColumnReference>(RDBColumnReference.class, this, AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY);
		}
		return primKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBColumnDefinition> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<RDBColumnDefinition>(RDBColumnDefinition.class, this, AstmPackage.RDB_TABLE_DEFINITION__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<RDBConstraint>(RDBConstraint.class, this, AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBIndex> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<RDBIndex>(RDBIndex.class, this, AstmPackage.RDB_TABLE_DEFINITION__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBTrigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<RDBTrigger>(RDBTrigger.class, this, AstmPackage.RDB_TABLE_DEFINITION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY:
				return ((InternalEList<?>)getPrimKey()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TABLE_DEFINITION__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TABLE_DEFINITION__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TABLE_DEFINITION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY:
				return getPrimKey();
			case AstmPackage.RDB_TABLE_DEFINITION__COLUMN:
				return getColumn();
			case AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT:
				return getConstraint();
			case AstmPackage.RDB_TABLE_DEFINITION__INDEX:
				return getIndex();
			case AstmPackage.RDB_TABLE_DEFINITION__TRIGGER:
				return getTrigger();
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
			case AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY:
				getPrimKey().clear();
				getPrimKey().addAll((Collection<? extends RDBColumnReference>)newValue);
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends RDBColumnDefinition>)newValue);
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends RDBConstraint>)newValue);
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends RDBIndex>)newValue);
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends RDBTrigger>)newValue);
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
			case AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY:
				getPrimKey().clear();
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__COLUMN:
				getColumn().clear();
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__INDEX:
				getIndex().clear();
				return;
			case AstmPackage.RDB_TABLE_DEFINITION__TRIGGER:
				getTrigger().clear();
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
			case AstmPackage.RDB_TABLE_DEFINITION__PRIM_KEY:
				return primKey != null && !primKey.isEmpty();
			case AstmPackage.RDB_TABLE_DEFINITION__COLUMN:
				return column != null && !column.isEmpty();
			case AstmPackage.RDB_TABLE_DEFINITION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case AstmPackage.RDB_TABLE_DEFINITION__INDEX:
				return index != null && !index.isEmpty();
			case AstmPackage.RDB_TABLE_DEFINITION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTableDefinition(this);
	}

} //RDBTableDefinitionImpl
