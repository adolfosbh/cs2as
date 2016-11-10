/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBDeleteStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBDeleteStatementImpl extends RDBModifyStatementImpl implements RDBDeleteStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDeleteStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBDeleteStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBDeleteStatement(this);
	}

} //RDBDeleteStatementImpl
