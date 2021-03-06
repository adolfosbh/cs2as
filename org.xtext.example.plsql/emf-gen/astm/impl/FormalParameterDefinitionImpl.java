/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FormalParameterDefinition;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FormalParameterDefinitionImpl extends DataDefinitionImpl implements FormalParameterDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFormalParameterDefinition();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFormalParameterDefinition(this);
	}

} //FormalParameterDefinitionImpl
