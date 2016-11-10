/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.IntegerlLiteral;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integerl Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerlLiteralImpl extends LiteralImpl implements IntegerlLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerlLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getIntegerlLiteral();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitIntegerlLiteral(this);
	}

} //IntegerlLiteralImpl
