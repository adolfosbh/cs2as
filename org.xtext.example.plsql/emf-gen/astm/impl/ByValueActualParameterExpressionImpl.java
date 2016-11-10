/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ByValueActualParameterExpression;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>By Value Actual Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ByValueActualParameterExpressionImpl extends ActualParameterExpressionImpl implements ByValueActualParameterExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByValueActualParameterExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getByValueActualParameterExpression();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitByValueActualParameterExpression(this);
	}

} //ByValueActualParameterExpressionImpl
