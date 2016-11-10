/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.SpecificSelectStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificSelectStatementImpl extends StatementImpl implements SpecificSelectStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificSelectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getSpecificSelectStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSpecificSelectStatement(this);
	}

} //SpecificSelectStatementImpl
