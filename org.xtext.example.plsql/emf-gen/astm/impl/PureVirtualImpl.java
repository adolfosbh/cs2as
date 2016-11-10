/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.PureVirtual;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure Virtual</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PureVirtualImpl extends VirtualSpecificationImpl implements PureVirtual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PureVirtualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getPureVirtual();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitPureVirtual(this);
	}

} //PureVirtualImpl
