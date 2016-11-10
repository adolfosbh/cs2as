/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FunctionMemberAttribute;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Member Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionMemberAttributeImpl extends OtherSyntaxObjectImpl implements FunctionMemberAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionMemberAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFunctionMemberAttribute();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFunctionMemberAttribute(this);
	}

} //FunctionMemberAttributeImpl
