/**
 */
package astm.impl;

import astm.AggregateScope;
import astm.AstmPackage;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregateScopeImpl extends ScopeImpl implements AggregateScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getAggregateScope();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitAggregateScope(this);
	}

} //AggregateScopeImpl
