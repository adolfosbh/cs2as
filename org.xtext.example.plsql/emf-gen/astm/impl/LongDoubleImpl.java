/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.LongDouble;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

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
		return AstmPackage.eINSTANCE.getLongDouble();
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
