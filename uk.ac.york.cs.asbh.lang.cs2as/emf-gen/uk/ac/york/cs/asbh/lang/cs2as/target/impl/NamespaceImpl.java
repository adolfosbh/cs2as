/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jdt.annotation.NonNull;

import uk.ac.york.cs.asbh.lang.cs2as.target.Namespace;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;

import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.NAMESPACE;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitNamespace(this);
	}

} //NamespaceImpl
