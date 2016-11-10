/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.SpecificLessEqual;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Less Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificLessEqualImpl extends BinaryOperatorImpl implements SpecificLessEqual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificLessEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getSpecificLessEqual();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitSpecificLessEqual(this);
	}

} //SpecificLessEqualImpl
