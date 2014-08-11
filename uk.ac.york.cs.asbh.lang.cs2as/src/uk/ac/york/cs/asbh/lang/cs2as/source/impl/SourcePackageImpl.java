/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.cs.asbh.lang.cs2as.source.Root;
import uk.ac.york.cs.asbh.lang.cs2as.source.SourceFactory;
import uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcePackageImpl extends EPackageImpl implements SourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass y1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass y2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SourcePackageImpl() {
		super(eNS_URI, SourceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SourcePackage init() {
		if (isInited) return (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);

		// Obtain or create and register package
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SourcePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSourcePackage.createPackageContents();

		// Initialize created meta-data
		theSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SourcePackage.eNS_URI, theSourcePackage);
		return theSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX() {
		return xEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX_IsA1() {
		return (EAttribute)xEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX_OwnsY() {
		return (EReference)xEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getY() {
		return yEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getY_OwnsZ() {
		return (EReference)yEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getY_ToX() {
		return (EReference)yEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getY_Name() {
		return (EAttribute)yEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getY1() {
		return y1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getY2() {
		return y2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZ() {
		return zEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZ_ToY() {
		return (EReference)zEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZ_Name() {
		return (EAttribute)zEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_OwnedX() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFactory getSourceFactory() {
		return (SourceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xEClass = createEClass(X);
		createEAttribute(xEClass, X__IS_A1);
		createEReference(xEClass, X__OWNS_Y);

		yEClass = createEClass(Y);
		createEReference(yEClass, Y__OWNS_Z);
		createEReference(yEClass, Y__TO_X);
		createEAttribute(yEClass, Y__NAME);

		y1EClass = createEClass(Y1);

		y2EClass = createEClass(Y2);

		zEClass = createEClass(Z);
		createEReference(zEClass, Z__TO_Y);
		createEAttribute(zEClass, Z__NAME);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__OWNED_X);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		y1EClass.getESuperTypes().add(this.getY());
		y2EClass.getESuperTypes().add(this.getY());

		// Initialize classes, features, and operations; add parameters
		initEClass(xEClass, uk.ac.york.cs.asbh.lang.cs2as.source.X.class, "X", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX_IsA1(), ecorePackage.getEBoolean(), "isA1", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.X.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getX_OwnsY(), this.getY(), this.getY_ToX(), "ownsY", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.X.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEClass, uk.ac.york.cs.asbh.lang.cs2as.source.Y.class, "Y", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getY_OwnsZ(), this.getZ(), this.getZ_ToY(), "ownsZ", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getY_ToX(), this.getX(), this.getX_OwnsY(), "toX", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getY_Name(), ecorePackage.getEString(), "name", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(y1EClass, uk.ac.york.cs.asbh.lang.cs2as.source.Y1.class, "Y1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(y2EClass, uk.ac.york.cs.asbh.lang.cs2as.source.Y2.class, "Y2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zEClass, uk.ac.york.cs.asbh.lang.cs2as.source.Z.class, "Z", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZ_ToY(), this.getY(), this.getY_OwnsZ(), "toY", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZ_Name(), ecorePackage.getEString(), "name", null, 0, 1, uk.ac.york.cs.asbh.lang.cs2as.source.Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_OwnedX(), this.getX(), null, "ownedX", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SourcePackageImpl
