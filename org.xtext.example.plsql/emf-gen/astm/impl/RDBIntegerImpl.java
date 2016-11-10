/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBInteger;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBIntegerImpl extends RDBColumnTypeImpl implements RDBInteger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBInteger();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBInteger(this);
	}

} //RDBIntegerImpl
