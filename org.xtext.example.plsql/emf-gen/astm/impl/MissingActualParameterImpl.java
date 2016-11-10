/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.MissingActualParameter;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Missing Actual Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MissingActualParameterImpl extends ActualParameterImpl implements MissingActualParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissingActualParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getMissingActualParameter();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitMissingActualParameter(this);
	}

} //MissingActualParameterImpl
