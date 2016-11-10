/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ByValueFormalParameterType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>By Value Formal Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ByValueFormalParameterTypeImpl extends FormalParameterTypeImpl implements ByValueFormalParameterType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByValueFormalParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getByValueFormalParameterType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitByValueFormalParameterType(this);
	}

} //ByValueFormalParameterTypeImpl
