/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.GASTMObject;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GASTM Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GASTMObjectImpl extends MinimalEObjectImpl.Container implements GASTMObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GASTMObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getGASTMObject();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitGASTMObject(this);
	}

} //GASTMObjectImpl
