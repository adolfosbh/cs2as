/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.NonVirtual;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Virtual</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonVirtualImpl extends VirtualSpecificationImpl implements NonVirtual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonVirtualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getNonVirtual();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitNonVirtual(this);
	}

} //NonVirtualImpl
