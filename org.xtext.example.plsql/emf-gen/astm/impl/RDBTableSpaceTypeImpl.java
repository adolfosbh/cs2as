/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBTableSpaceType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Table Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBTableSpaceTypeImpl extends DataTypeImpl implements RDBTableSpaceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTableSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTableSpaceType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTableSpaceType(this);
	}

} //RDBTableSpaceTypeImpl
