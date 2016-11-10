/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.NotGreater;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Greater</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotGreaterImpl extends BinaryOperatorImpl implements NotGreater {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotGreaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getNotGreater();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitNotGreater(this);
	}

} //NotGreaterImpl
