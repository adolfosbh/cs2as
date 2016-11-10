/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FormalParameterDeclaration;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FormalParameterDeclarationImpl extends DeclarationImpl implements FormalParameterDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFormalParameterDeclaration();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFormalParameterDeclaration(this);
	}

} //FormalParameterDeclarationImpl
