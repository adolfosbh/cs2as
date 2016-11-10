/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FunctionScope;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionScopeImpl extends ScopeImpl implements FunctionScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFunctionScope();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFunctionScope(this);
	}

} //FunctionScopeImpl
