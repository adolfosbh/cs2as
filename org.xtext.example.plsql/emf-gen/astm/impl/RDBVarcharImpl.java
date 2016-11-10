/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBVarchar;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Varchar</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBVarcharImpl extends RDBColumnTypeImpl implements RDBVarchar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBVarcharImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBVarchar();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBVarchar(this);
	}

} //RDBVarcharImpl
