/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.IntegerLiteral;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerLiteralImpl extends LiteralImpl implements IntegerLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.INTEGER_LITERAL;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitIntegerLiteral(this);
	}

} //IntegerLiteralImpl