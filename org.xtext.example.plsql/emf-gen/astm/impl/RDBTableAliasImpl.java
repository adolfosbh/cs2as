/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.RDBTableAlias;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDB Table Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RDBTableAliasImpl extends IdentifierReferenceImpl implements RDBTableAlias {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTableAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTableAlias();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTableAlias(this);
	}

} //RDBTableAliasImpl
