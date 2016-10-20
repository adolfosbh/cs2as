/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.BitRightShift;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Right Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BitRightShiftImpl extends BinaryOperatorImpl implements BitRightShift {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitRightShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.BIT_RIGHT_SHIFT;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitBitRightShift(this);
	}

} //BitRightShiftImpl