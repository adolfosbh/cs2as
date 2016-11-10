/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.CharLiteral;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CharLiteralImpl extends LiteralImpl implements CharLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getCharLiteral();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitCharLiteral(this);
	}

} //CharLiteralImpl
