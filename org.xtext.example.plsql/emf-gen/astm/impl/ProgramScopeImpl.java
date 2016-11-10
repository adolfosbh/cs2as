/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ProgramScope;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgramScopeImpl extends ScopeImpl implements ProgramScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getProgramScope();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitProgramScope(this);
	}

} //ProgramScopeImpl
