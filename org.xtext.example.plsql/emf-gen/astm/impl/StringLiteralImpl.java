/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.StringLiteral;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringLiteralImpl extends LiteralImpl implements StringLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getStringLiteral();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitStringLiteral(this);
	}

} //StringLiteralImpl
