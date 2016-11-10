/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBDecimal;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBDecimalImpl extends RDBColumnTypeImpl implements RDBDecimal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDecimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBDecimal();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBDecimal(this);
	}

} //RDBDecimalImpl
