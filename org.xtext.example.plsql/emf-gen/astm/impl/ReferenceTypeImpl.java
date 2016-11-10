/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ReferenceType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReferenceTypeImpl extends ConstructedTypeImpl implements ReferenceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getReferenceType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitReferenceType(this);
	}

} //ReferenceTypeImpl
