/**
 */
package astm.impl;

import astm.AggregateExpression;
import astm.AstmPackage;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregateExpressionImpl extends ExpressionImpl implements AggregateExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getAggregateExpression();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitAggregateExpression(this);
	}

} //AggregateExpressionImpl
