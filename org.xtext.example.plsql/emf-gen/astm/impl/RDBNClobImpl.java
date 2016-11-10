/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBNClob;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDBN Clob</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBNClobImpl extends RDBColumnTypeImpl implements RDBNClob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBNClobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBNClob();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBNClob(this);
	}

} //RDBNClobImpl
