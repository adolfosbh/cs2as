/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBTableType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBTableTypeImpl extends DataTypeImpl implements RDBTableType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTableType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTableType(this);
	}

} //RDBTableTypeImpl
