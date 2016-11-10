/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Expression;
import astm.IncludeUnit;
import astm.NameSpaceDefinition;
import astm.RDBInsertStatement;

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
 * An implementation of the model object '<em><b>RDB Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBInsertStatementImpl#getIntoTable <em>Into Table</em>}</li>
 *   <li>{@link astm.impl.RDBInsertStatementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link astm.impl.RDBInsertStatementImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBInsertStatementImpl extends StatementImpl implements RDBInsertStatement {
	/**
	 * The cached value of the '{@link #getIntoTable() <em>Into Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntoTable()
	 * @generated
	 * @ordered
	 */
	protected EList<NameSpaceDefinition> intoTable;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeUnit> columns;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBInsertStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBInsertStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameSpaceDefinition> getIntoTable() {
		if (intoTable == null) {
			intoTable = new EObjectContainmentEList<NameSpaceDefinition>(NameSpaceDefinition.class, this, AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE);
		}
		return intoTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeUnit> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<IncludeUnit>(IncludeUnit.class, this, AstmPackage.RDB_INSERT_STATEMENT__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Expression>(Expression.class, this, AstmPackage.RDB_INSERT_STATEMENT__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE:
				return ((InternalEList<?>)getIntoTable()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_INSERT_STATEMENT__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_INSERT_STATEMENT__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE:
				return getIntoTable();
			case AstmPackage.RDB_INSERT_STATEMENT__COLUMNS:
				return getColumns();
			case AstmPackage.RDB_INSERT_STATEMENT__VALUES:
				return getValues();
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
			case AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE:
				getIntoTable().clear();
				getIntoTable().addAll((Collection<? extends NameSpaceDefinition>)newValue);
				return;
			case AstmPackage.RDB_INSERT_STATEMENT__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends IncludeUnit>)newValue);
				return;
			case AstmPackage.RDB_INSERT_STATEMENT__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Expression>)newValue);
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
			case AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE:
				getIntoTable().clear();
				return;
			case AstmPackage.RDB_INSERT_STATEMENT__COLUMNS:
				getColumns().clear();
				return;
			case AstmPackage.RDB_INSERT_STATEMENT__VALUES:
				getValues().clear();
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
			case AstmPackage.RDB_INSERT_STATEMENT__INTO_TABLE:
				return intoTable != null && !intoTable.isEmpty();
			case AstmPackage.RDB_INSERT_STATEMENT__COLUMNS:
				return columns != null && !columns.isEmpty();
			case AstmPackage.RDB_INSERT_STATEMENT__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBInsertStatement(this);
	}

} //RDBInsertStatementImpl
