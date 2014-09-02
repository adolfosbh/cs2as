/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.ActionNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisFactory;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode;
import ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage;
import ocldependencyanalysis.cs2asanalysis.ConstructorExpTypeInfo;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartAction;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef;
import ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo;
import ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo;
import ocldependencyanalysis.cs2asanalysis.InfoNode;
import ocldependencyanalysis.cs2asanalysis.Node;
import ocldependencyanalysis.cs2asanalysis.OperationAction;
import ocldependencyanalysis.cs2asanalysis.OperationRef;
import ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo;
import ocldependencyanalysis.cs2asanalysis.PropertyRef;
import ocldependencyanalysis.cs2asanalysis.TypeInfo;
import ocldependencyanalysis.cs2asanalysis.TypeRef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CS2ASAnalysisPackageImpl extends EPackageImpl implements CS2ASAnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cs2ASAnalysisNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorPartPropRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorExpTypeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorPartActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorPartPropertyInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedPropertyInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCallExpInfoEClass = null;

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
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CS2ASAnalysisPackageImpl() {
		super(eNS_URI, CS2ASAnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CS2ASAnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CS2ASAnalysisPackage init() {
		if (isInited) return (CS2ASAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(CS2ASAnalysisPackage.eNS_URI);

		// Obtain or create and register package
		CS2ASAnalysisPackageImpl theCS2ASAnalysisPackage = (CS2ASAnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CS2ASAnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CS2ASAnalysisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PivotPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCS2ASAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theCS2ASAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCS2ASAnalysisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CS2ASAnalysisPackage.eNS_URI, theCS2ASAnalysisPackage);
		return theCS2ASAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS2ASAnalysisNode() {
		return cs2ASAnalysisNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCS2ASAnalysisNode_Context() {
		return (EReference)cs2ASAnalysisNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCS2ASAnalysisNode_ReferredElement() {
		return (EReference)cs2ASAnalysisNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionNode() {
		return actionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoNode() {
		return infoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationRef() {
		return operationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationRef_Operation() {
		return (EReference)operationRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRef() {
		return propertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRef_Property() {
		return (EReference)propertyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRef() {
		return typeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeRef_Type() {
		return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorPartPropRef() {
		return constructorPartPropRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorPartPropRef_ConstructorPart() {
		return (EReference)constructorPartPropRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeInfo() {
		return typeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorExpTypeInfo() {
		return constructorExpTypeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorExpTypeInfo_ConstructorExp() {
		return (EReference)constructorExpTypeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorPartAction() {
		return constructorPartActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorPartPropertyInfo() {
		return constructorPartPropertyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedPropertyInfo() {
		return extendedPropertyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedPropertyInfo_PropertyType() {
		return (EReference)extendedPropertyInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAction() {
		return operationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCallExpInfo() {
		return propertyCallExpInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCallExpInfo_PropertyCallExp() {
		return (EReference)propertyCallExpInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisFactory getCS2ASAnalysisFactory() {
		return (CS2ASAnalysisFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);

		cs2ASAnalysisNodeEClass = createEClass(CS2AS_ANALYSIS_NODE);
		createEReference(cs2ASAnalysisNodeEClass, CS2AS_ANALYSIS_NODE__CONTEXT);
		createEReference(cs2ASAnalysisNodeEClass, CS2AS_ANALYSIS_NODE__REFERRED_ELEMENT);

		actionNodeEClass = createEClass(ACTION_NODE);

		infoNodeEClass = createEClass(INFO_NODE);

		operationRefEClass = createEClass(OPERATION_REF);
		createEReference(operationRefEClass, OPERATION_REF__OPERATION);

		propertyRefEClass = createEClass(PROPERTY_REF);
		createEReference(propertyRefEClass, PROPERTY_REF__PROPERTY);

		typeRefEClass = createEClass(TYPE_REF);
		createEReference(typeRefEClass, TYPE_REF__TYPE);

		constructorPartPropRefEClass = createEClass(CONSTRUCTOR_PART_PROP_REF);
		createEReference(constructorPartPropRefEClass, CONSTRUCTOR_PART_PROP_REF__CONSTRUCTOR_PART);

		typeInfoEClass = createEClass(TYPE_INFO);

		constructorExpTypeInfoEClass = createEClass(CONSTRUCTOR_EXP_TYPE_INFO);
		createEReference(constructorExpTypeInfoEClass, CONSTRUCTOR_EXP_TYPE_INFO__CONSTRUCTOR_EXP);

		constructorPartActionEClass = createEClass(CONSTRUCTOR_PART_ACTION);

		constructorPartPropertyInfoEClass = createEClass(CONSTRUCTOR_PART_PROPERTY_INFO);

		extendedPropertyInfoEClass = createEClass(EXTENDED_PROPERTY_INFO);
		createEReference(extendedPropertyInfoEClass, EXTENDED_PROPERTY_INFO__PROPERTY_TYPE);

		operationActionEClass = createEClass(OPERATION_ACTION);

		propertyCallExpInfoEClass = createEClass(PROPERTY_CALL_EXP_INFO);
		createEReference(propertyCallExpInfoEClass, PROPERTY_CALL_EXP_INFO__PROPERTY_CALL_EXP);
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

		// Obtain other dependent packages
		PivotPackage thePivotPackage = (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cs2ASAnalysisNodeEClass.getESuperTypes().add(this.getNode());
		actionNodeEClass.getESuperTypes().add(this.getNode());
		infoNodeEClass.getESuperTypes().add(this.getNode());
		operationRefEClass.getESuperTypes().add(this.getCS2ASAnalysisNode());
		propertyRefEClass.getESuperTypes().add(this.getCS2ASAnalysisNode());
		typeRefEClass.getESuperTypes().add(this.getCS2ASAnalysisNode());
		constructorPartPropRefEClass.getESuperTypes().add(this.getPropertyRef());
		typeInfoEClass.getESuperTypes().add(this.getTypeRef());
		typeInfoEClass.getESuperTypes().add(this.getInfoNode());
		constructorExpTypeInfoEClass.getESuperTypes().add(this.getTypeInfo());
		constructorPartActionEClass.getESuperTypes().add(this.getConstructorPartPropRef());
		constructorPartActionEClass.getESuperTypes().add(this.getActionNode());
		constructorPartPropertyInfoEClass.getESuperTypes().add(this.getExtendedPropertyInfo());
		constructorPartPropertyInfoEClass.getESuperTypes().add(this.getConstructorPartPropRef());
		extendedPropertyInfoEClass.getESuperTypes().add(this.getPropertyRef());
		extendedPropertyInfoEClass.getESuperTypes().add(this.getInfoNode());
		operationActionEClass.getESuperTypes().add(this.getOperationRef());
		operationActionEClass.getESuperTypes().add(this.getActionNode());
		propertyCallExpInfoEClass.getESuperTypes().add(this.getPropertyRef());
		propertyCallExpInfoEClass.getESuperTypes().add(this.getInfoNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cs2ASAnalysisNodeEClass, CS2ASAnalysisNode.class, "CS2ASAnalysisNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCS2ASAnalysisNode_Context(), thePivotPackage.getType(), null, "context", null, 1, 1, CS2ASAnalysisNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCS2ASAnalysisNode_ReferredElement(), thePivotPackage.getElement(), null, "referredElement", null, 0, 1, CS2ASAnalysisNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionNodeEClass, ActionNode.class, "ActionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infoNodeEClass, InfoNode.class, "InfoNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationRefEClass, OperationRef.class, "OperationRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationRef_Operation(), thePivotPackage.getOperation(), null, "operation", null, 1, 1, OperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyRefEClass, PropertyRef.class, "PropertyRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyRef_Property(), thePivotPackage.getProperty(), null, "property", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef_Type(), thePivotPackage.getType(), null, "type", null, 1, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorPartPropRefEClass, ConstructorPartPropRef.class, "ConstructorPartPropRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructorPartPropRef_ConstructorPart(), thePivotPackage.getConstructorPart(), null, "constructorPart", null, 0, 1, ConstructorPartPropRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeInfoEClass, TypeInfo.class, "TypeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorExpTypeInfoEClass, ConstructorExpTypeInfo.class, "ConstructorExpTypeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructorExpTypeInfo_ConstructorExp(), thePivotPackage.getConstructorExp(), null, "constructorExp", null, 1, 1, ConstructorExpTypeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorPartActionEClass, ConstructorPartAction.class, "ConstructorPartAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorPartPropertyInfoEClass, ConstructorPartPropertyInfo.class, "ConstructorPartPropertyInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendedPropertyInfoEClass, ExtendedPropertyInfo.class, "ExtendedPropertyInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedPropertyInfo_PropertyType(), thePivotPackage.getType(), null, "propertyType", null, 1, 1, ExtendedPropertyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationActionEClass, OperationAction.class, "OperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyCallExpInfoEClass, PropertyCallExpInfo.class, "PropertyCallExpInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCallExpInfo_PropertyCallExp(), thePivotPackage.getPropertyCallExp(), null, "propertyCallExp", null, 1, 1, PropertyCallExpInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CS2ASAnalysisPackageImpl