/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.QualifiedOverPointer;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Over Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QualifiedOverPointerImpl extends QualifiedIdentifierReferenceImpl implements QualifiedOverPointer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedOverPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getQualifiedOverPointer();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitQualifiedOverPointer(this);
	}

} //QualifiedOverPointerImpl
