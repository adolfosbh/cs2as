/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FunctionPersistent;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Persistent</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionPersistentImpl extends StorageSpecificationImpl implements FunctionPersistent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPersistentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFunctionPersistent();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFunctionPersistent(this);
	}

} //FunctionPersistentImpl
