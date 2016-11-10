/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.UnaryPlus;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnaryPlusImpl extends UnaryOperatorImpl implements UnaryPlus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryPlusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getUnaryPlus();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitUnaryPlus(this);
	}

} //UnaryPlusImpl
