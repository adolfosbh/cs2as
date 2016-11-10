/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBCursorType;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Cursor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBCursorTypeImpl extends DataTypeImpl implements RDBCursorType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBCursorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBCursorType();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBCursorType(this);
	}

} //RDBCursorTypeImpl
