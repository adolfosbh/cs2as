/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.PostIncrement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Increment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PostIncrementImpl extends UnaryOperatorImpl implements PostIncrement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostIncrementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getPostIncrement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitPostIncrement(this);
	}

} //PostIncrementImpl
