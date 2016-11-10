/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.Virtual;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VirtualImpl extends VirtualSpecificationImpl implements Virtual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getVirtual();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitVirtual(this);
	}

} //VirtualImpl
