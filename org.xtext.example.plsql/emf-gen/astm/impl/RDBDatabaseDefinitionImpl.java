/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBDatabaseDefinition;
import astm.RDBTableSpaceReference;

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
 * An implementation of the model object '<em><b>RDB Database Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBDatabaseDefinitionImpl#getTableSpace <em>Table Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBDatabaseDefinitionImpl extends DefinitionImpl implements RDBDatabaseDefinition {
	/**
	 * The cached value of the '{@link #getTableSpace() <em>Table Space</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBTableSpaceReference> tableSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDatabaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBDatabaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBTableSpaceReference> getTableSpace() {
		if (tableSpace == null) {
			tableSpace = new EObjectContainmentEList<RDBTableSpaceReference>(RDBTableSpaceReference.class, this, AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE);
		}
		return tableSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE:
				return ((InternalEList<?>)getTableSpace()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE:
				return getTableSpace();
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
			case AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE:
				getTableSpace().clear();
				getTableSpace().addAll((Collection<? extends RDBTableSpaceReference>)newValue);
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
			case AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE:
				getTableSpace().clear();
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
			case AstmPackage.RDB_DATABASE_DEFINITION__TABLE_SPACE:
				return tableSpace != null && !tableSpace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBDatabaseDefinition(this);
	}

} //RDBDatabaseDefinitionImpl
