/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBDataBaseType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Data Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBDataBaseTypeImpl extends DataTypeImpl implements RDBDataBaseType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDataBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBDataBaseType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBDataBaseType(this);
	}

} //RDBDataBaseTypeImpl
