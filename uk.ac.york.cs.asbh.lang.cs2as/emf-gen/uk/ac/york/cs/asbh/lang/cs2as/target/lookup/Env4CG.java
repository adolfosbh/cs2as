/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.lookup;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.evaluation.Executor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env4 CG</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage#getEnv4CG()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Env4CG extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"LookupEnvironment::hasFinalResult() has been created for CG purposes. Don\'t call this method\");'"
	 * @generated
	 */
	boolean hasFinalResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="uk.ac.york.cs.asbh.lang.cs2as.target.lookup.Executor"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"LookupEnvironment::getEvaluator() has been created for CG purposes. Don\'t call this method\");'"
	 * @generated
	 */
	Executor getExecutor();

} // Env4CG
