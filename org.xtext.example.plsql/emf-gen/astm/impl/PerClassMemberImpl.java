/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.PerClassMember;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Class Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PerClassMemberImpl extends StorageSpecificationImpl implements PerClassMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerClassMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getPerClassMember();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitPerClassMember(this);
	}

} //PerClassMemberImpl
