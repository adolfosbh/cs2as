/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.SpecificIn;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific In</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificInImpl extends BinaryOperatorImpl implements SpecificIn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getSpecificIn();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSpecificIn(this);
	}

} //SpecificInImpl
