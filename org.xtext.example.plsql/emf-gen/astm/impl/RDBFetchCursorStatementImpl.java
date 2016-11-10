/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBFetchCursorStatement;
import astm.RDBHostVariableReference;

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
 * An implementation of the model object '<em><b>RDB Fetch Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBFetchCursorStatementImpl#getInto <em>Into</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBFetchCursorStatementImpl extends RDBCursorStatementImpl implements RDBFetchCursorStatement {
	/**
	 * The cached value of the '{@link #getInto() <em>Into</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBHostVariableReference> into;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBFetchCursorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBFetchCursorStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBHostVariableReference> getInto() {
		if (into == null) {
			into = new EObjectContainmentEList<RDBHostVariableReference>(RDBHostVariableReference.class, this, AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO);
		}
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO:
				return ((InternalEList<?>)getInto()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO:
				return getInto();
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
			case AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO:
				getInto().clear();
				getInto().addAll((Collection<? extends RDBHostVariableReference>)newValue);
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
			case AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO:
				getInto().clear();
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
			case AstmPackage.RDB_FETCH_CURSOR_STATEMENT__INTO:
				return into != null && !into.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBFetchCursorStatement(this);
	}

} //RDBFetchCursorStatementImpl
