/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.PostDecrement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Decrement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PostDecrementImpl extends UnaryOperatorImpl implements PostDecrement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostDecrementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getPostDecrement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitPostDecrement(this);
	}

} //PostDecrementImpl
