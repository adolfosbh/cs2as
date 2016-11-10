/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBCloseCursorStatement;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Close Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBCloseCursorStatementImpl extends RDBCursorStatementImpl implements RDBCloseCursorStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBCloseCursorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBCloseCursorStatement();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBCloseCursorStatement(this);
	}

} //RDBCloseCursorStatementImpl
