/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.LongDouble;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LongDoubleImpl extends PrimitiveTypeImpl implements LongDouble {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongDoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.LONG_DOUBLE;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitLongDouble(this);
	}

} //LongDoubleImpl
