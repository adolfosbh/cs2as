/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBHostVariableExpression;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Host Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBHostVariableExpressionImpl extends ExpressionImpl implements RDBHostVariableExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBHostVariableExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBHostVariableExpression();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBHostVariableExpression(this);
	}

} //RDBHostVariableExpressionImpl
