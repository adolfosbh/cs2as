/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.TerminateStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TerminateStatementImpl extends StatementImpl implements TerminateStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminateStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getTerminateStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitTerminateStatement(this);
	}

} //TerminateStatementImpl
