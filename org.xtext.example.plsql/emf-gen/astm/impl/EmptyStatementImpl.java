/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.EmptyStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmptyStatementImpl extends StatementImpl implements EmptyStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getEmptyStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitEmptyStatement(this);
	}

} //EmptyStatementImpl
