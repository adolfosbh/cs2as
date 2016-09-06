/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Equal;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EqualImpl extends BinaryOperatorImpl implements Equal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.EQUAL;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitEqual(this);
	}

} //EqualImpl
