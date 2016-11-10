/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.BitRightShift;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

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
		return AstmPackage.eINSTANCE.getBitRightShift();
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
