/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.SpecificConcatString;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Concat String</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificConcatStringImpl extends BinaryOperatorImpl implements SpecificConcatString {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificConcatStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getSpecificConcatString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSpecificConcatString(this);
	}

} //SpecificConcatStringImpl
