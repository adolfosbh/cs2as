/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jdt.annotation.NonNull;

import uk.ac.york.cs.asbh.lang.cs2as.target.A3;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;

import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class A3Impl extends A2Impl implements A3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.A3;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitA3(this);
	}

} //A3Impl
