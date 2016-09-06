/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.ByReferenceActualParameterExpression;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>By Reference Actual Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ByReferenceActualParameterExpressionImpl extends ActualParameterExpressionImpl implements ByReferenceActualParameterExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByReferenceActualParameterExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitByReferenceActualParameterExpression(this);
	}

} //ByReferenceActualParameterExpressionImpl
