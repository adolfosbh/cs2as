/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ShortInteger;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ShortIntegerImpl extends PrimitiveTypeImpl implements ShortInteger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getShortInteger();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitShortInteger(this);
	}

} //ShortIntegerImpl
