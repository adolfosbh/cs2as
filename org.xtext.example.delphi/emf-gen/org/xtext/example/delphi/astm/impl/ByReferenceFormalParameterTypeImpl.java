/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.ByReferenceFormalParameterType;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>By Reference Formal Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ByReferenceFormalParameterTypeImpl extends FormalParameterTypeImpl implements ByReferenceFormalParameterType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByReferenceFormalParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.BY_REFERENCE_FORMAL_PARAMETER_TYPE;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitByReferenceFormalParameterType(this);
	}

} //ByReferenceFormalParameterTypeImpl
