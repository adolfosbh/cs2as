/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.QualifiedOverData;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Over Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QualifiedOverDataImpl extends QualifiedIdentifierReferenceImpl implements QualifiedOverData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedOverDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getQualifiedOverData();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitQualifiedOverData(this);
	}

} //QualifiedOverDataImpl
