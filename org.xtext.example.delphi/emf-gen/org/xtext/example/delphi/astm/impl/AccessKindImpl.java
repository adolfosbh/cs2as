/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.xtext.example.delphi.astm.AccessKind;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.util.Visitor;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AccessKindImpl extends MinimalEObjectImpl.Container implements AccessKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.ACCESS_KIND;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitAccessKind(this);
	}

} //AccessKindImpl
