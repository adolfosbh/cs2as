/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LookupEnvironmentFactoryImpl extends EFactoryImpl implements LookupEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LookupEnvironmentFactory init() {
		try {
			LookupEnvironmentFactory theLookupEnvironmentFactory = (LookupEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(LookupEnvironmentPackage.eNS_URI);
			if (theLookupEnvironmentFactory != null) {
				return theLookupEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LookupEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT: return createLookupEnvironment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironment createLookupEnvironment() {
		LookupEnvironmentImpl lookupEnvironment = new LookupEnvironmentImpl();
		return lookupEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironmentPackage getLookupEnvironmentPackage() {
		return (LookupEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LookupEnvironmentPackage getPackage() {
		return LookupEnvironmentPackage.eINSTANCE;
	}

} //LookupEnvironmentFactoryImpl
