/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Subtract;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtract</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubtractImpl extends BinaryOperatorImpl implements Subtract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.SUBTRACT;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSubtract(this);
	}

} //SubtractImpl
