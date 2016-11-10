/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.ForCheckAfterStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Check After Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForCheckAfterStatementImpl extends ForStatementImpl implements ForCheckAfterStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForCheckAfterStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getForCheckAfterStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitForCheckAfterStatement(this);
	}

} //ForCheckAfterStatementImpl
