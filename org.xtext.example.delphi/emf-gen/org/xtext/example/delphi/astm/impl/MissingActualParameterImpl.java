/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.MissingActualParameter;
import org.xtext.example.delphi.astm.util.Visitor;

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
		return AstmPackage.Literals.MISSING_ACTUAL_PARAMETER;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitMissingActualParameter(this);
	}

} //MissingActualParameterImpl
