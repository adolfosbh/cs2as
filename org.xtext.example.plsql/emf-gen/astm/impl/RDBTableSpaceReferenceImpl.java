/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBTableSpaceReference;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Table Space Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBTableSpaceReferenceImpl extends MinimalEObjectImpl.Container implements RDBTableSpaceReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTableSpaceReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTableSpaceReference();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTableSpaceReference(this);
	}

} //RDBTableSpaceReferenceImpl
