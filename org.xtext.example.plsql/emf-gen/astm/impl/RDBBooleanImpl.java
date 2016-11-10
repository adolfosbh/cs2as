/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBBoolean;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBBooleanImpl extends RDBColumnTypeImpl implements RDBBoolean {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBBoolean();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBBoolean(this);
	}

} //RDBBooleanImpl
