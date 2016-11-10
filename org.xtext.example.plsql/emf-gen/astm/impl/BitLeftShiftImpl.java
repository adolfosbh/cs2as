/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.BitLeftShift;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Left Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BitLeftShiftImpl extends BinaryOperatorImpl implements BitLeftShift {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitLeftShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getBitLeftShift();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitBitLeftShift(this);
	}

} //BitLeftShiftImpl
