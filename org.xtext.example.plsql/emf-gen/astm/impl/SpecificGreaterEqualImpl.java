/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.SpecificGreaterEqual;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Greater Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificGreaterEqualImpl extends BinaryOperatorImpl implements SpecificGreaterEqual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificGreaterEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getSpecificGreaterEqual();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSpecificGreaterEqual(this);
	}

} //SpecificGreaterEqualImpl
