/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ByReferenceFormalParameterType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

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
		return AstmPackage.eINSTANCE.getByReferenceFormalParameterType();
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
