/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBTimestamp;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBTimestampImpl extends RDBColumnTypeImpl implements RDBTimestamp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTimestampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTimestamp();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTimestamp(this);
	}

} //RDBTimestampImpl
