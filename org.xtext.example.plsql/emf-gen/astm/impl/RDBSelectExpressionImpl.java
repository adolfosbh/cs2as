/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Expression;
import astm.RDBColumnReference;
import astm.RDBSelectExpression;
import astm.RDBTableReference;

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
 * An implementation of the model object '<em><b>RDB Select Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBSelectExpressionImpl#getTable <em>Table</em>}</li>
 *   <li>{@link astm.impl.RDBSelectExpressionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link astm.impl.RDBSelectExpressionImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBSelectExpressionImpl extends ExpressionImpl implements RDBSelectExpression {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBTableReference> table;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBColumnReference> column;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBSelectExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBSelectExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBTableReference> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<RDBTableReference>(RDBTableReference.class, this, AstmPackage.RDB_SELECT_EXPRESSION__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBColumnReference> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<RDBColumnReference>(RDBColumnReference.class, this, AstmPackage.RDB_SELECT_EXPRESSION__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getWhere() {
		if (where == null) {
			where = new EObjectContainmentEList<Expression>(Expression.class, this, AstmPackage.RDB_SELECT_EXPRESSION__WHERE);
		}
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_SELECT_EXPRESSION__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_SELECT_EXPRESSION__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_SELECT_EXPRESSION__WHERE:
				return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_SELECT_EXPRESSION__TABLE:
				return getTable();
			case AstmPackage.RDB_SELECT_EXPRESSION__COLUMN:
				return getColumn();
			case AstmPackage.RDB_SELECT_EXPRESSION__WHERE:
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
			case AstmPackage.RDB_SELECT_EXPRESSION__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends RDBTableReference>)newValue);
				return;
			case AstmPackage.RDB_SELECT_EXPRESSION__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends RDBColumnReference>)newValue);
				return;
			case AstmPackage.RDB_SELECT_EXPRESSION__WHERE:
				getWhere().clear();
				getWhere().addAll((Collection<? extends Expression>)newValue);
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
			case AstmPackage.RDB_SELECT_EXPRESSION__TABLE:
				getTable().clear();
				return;
			case AstmPackage.RDB_SELECT_EXPRESSION__COLUMN:
				getColumn().clear();
				return;
			case AstmPackage.RDB_SELECT_EXPRESSION__WHERE:
				getWhere().clear();
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
			case AstmPackage.RDB_SELECT_EXPRESSION__TABLE:
				return table != null && !table.isEmpty();
			case AstmPackage.RDB_SELECT_EXPRESSION__COLUMN:
				return column != null && !column.isEmpty();
			case AstmPackage.RDB_SELECT_EXPRESSION__WHERE:
				return where != null && !where.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBSelectExpression(this);
	}

} //RDBSelectExpressionImpl
