/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ForCheckBeforeStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Check Before Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForCheckBeforeStatementImpl extends ForStatementImpl implements ForCheckBeforeStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForCheckBeforeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getForCheckBeforeStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitForCheckBeforeStatement(this);
	}

} //ForCheckBeforeStatementImpl
