/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.GlobalScope;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlobalScopeImpl extends ScopeImpl implements GlobalScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getGlobalScope();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitGlobalScope(this);
	}

} //GlobalScopeImpl
