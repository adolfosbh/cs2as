/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.lookup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage
 * @generated
 */
public interface LookupEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LookupEnvironmentFactory eINSTANCE = uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl.LookupEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lookup Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Environment</em>'.
	 * @generated
	 */
	LookupEnvironment createLookupEnvironment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LookupEnvironmentPackage getLookupEnvironmentPackage();

} //LookupEnvironmentFactory
