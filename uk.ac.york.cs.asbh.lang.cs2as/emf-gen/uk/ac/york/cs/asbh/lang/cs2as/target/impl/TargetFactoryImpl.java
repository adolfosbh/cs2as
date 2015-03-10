/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.asbh.lang.cs2as.target.A1;
import uk.ac.york.cs.asbh.lang.cs2as.target.A2;
import uk.ac.york.cs.asbh.lang.cs2as.target.A3;
import uk.ac.york.cs.asbh.lang.cs2as.target.B;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.D;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;
import uk.ac.york.cs.asbh.lang.cs2as.target.TRoot;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetFactory;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetFactoryImpl extends EFactoryImpl implements TargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetFactory init() {
		try {
			TargetFactory theTargetFactory = (TargetFactory)EPackage.Registry.INSTANCE.getEFactory(TargetPackage.eNS_URI);
			if (theTargetFactory != null) {
				return theTargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFactoryImpl() {
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
			case TargetPackage.A1: return createA1();
			case TargetPackage.A2: return createA2();
			case TargetPackage.A3: return createA3();
			case TargetPackage.B: return createB();
			case TargetPackage.C: return createC();
			case TargetPackage.D: return createD();
			case TargetPackage.TROOT: return createTRoot();
			case TargetPackage.NAMED_ELEMENT: return createNamedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A1 createA1() {
		A1Impl a1 = new A1Impl();
		return a1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A2 createA2() {
		A2Impl a2 = new A2Impl();
		return a2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3 createA3() {
		A3Impl a3 = new A3Impl();
		return a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C createC() {
		CImpl c = new CImpl();
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D createD() {
		DImpl d = new DImpl();
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRoot createTRoot() {
		TRootImpl tRoot = new TRootImpl();
		return tRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPackage getTargetPackage() {
		return (TargetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetPackage getPackage() {
		return TargetPackage.eINSTANCE;
	}

} //TargetFactoryImpl
