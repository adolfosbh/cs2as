/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.DefaultBlock;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultBlockImpl extends SwitchCaseImpl implements DefaultBlock {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getDefaultBlock();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitDefaultBlock(this);
	}

} //DefaultBlockImpl
