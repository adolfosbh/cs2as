/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBFloat;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBFloatImpl extends RDBColumnTypeImpl implements RDBFloat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBFloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBFloat();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBFloat(this);
	}

} //RDBFloatImpl
