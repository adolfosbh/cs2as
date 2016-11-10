/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.DoWhileStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DoWhileStatementImpl extends LoopStatementImpl implements DoWhileStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoWhileStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getDoWhileStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitDoWhileStatement(this);
	}

} //DoWhileStatementImpl
