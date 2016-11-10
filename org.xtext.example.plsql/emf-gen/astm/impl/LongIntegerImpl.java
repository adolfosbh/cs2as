/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.LongInteger;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LongIntegerImpl extends PrimitiveTypeImpl implements LongInteger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getLongInteger();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitLongInteger(this);
	}

} //LongIntegerImpl
