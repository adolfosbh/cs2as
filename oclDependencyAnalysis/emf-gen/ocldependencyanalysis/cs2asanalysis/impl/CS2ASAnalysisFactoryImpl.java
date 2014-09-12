/**
 */
package ocldependencyanalysis.cs2asanalysis.impl;

import ocldependencyanalysis.cs2asanalysis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CS2ASAnalysisFactoryImpl extends EFactoryImpl implements CS2ASAnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CS2ASAnalysisFactory init() {
		try {
			CS2ASAnalysisFactory theCS2ASAnalysisFactory = (CS2ASAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(CS2ASAnalysisPackage.eNS_URI);
			if (theCS2ASAnalysisFactory != null) {
				return theCS2ASAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CS2ASAnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisFactoryImpl() {
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
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_EDGE: return createCS2ASAnalysisEdge();
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_GRAPH: return createCS2ASAnalysisGraph();
			case CS2ASAnalysisPackage.CLASS_INFO: return createClassInfo();
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO: return createConstructorExpClassInfo();
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_ACTION: return createConstructorPartAction();
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO: return createConstructorPartPropertyInfo();
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_INFO: return createExtendedPropertyInfo();
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO: return createPropertyCallExpInfo();
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO: return createEnvironmentInfo();
			case CS2ASAnalysisPackage.MAPPING_ACTION: return createMappingAction();
			case CS2ASAnalysisPackage.ENVIRONMENT_ACTION: return createEnvironmentAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisEdge createCS2ASAnalysisEdge() {
		CS2ASAnalysisEdgeImpl cs2ASAnalysisEdge = new CS2ASAnalysisEdgeImpl();
		return cs2ASAnalysisEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisGraph createCS2ASAnalysisGraph() {
		CS2ASAnalysisGraphImpl cs2ASAnalysisGraph = new CS2ASAnalysisGraphImpl();
		return cs2ASAnalysisGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInfo createClassInfo() {
		ClassInfoImpl classInfo = new ClassInfoImpl();
		return classInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorExpClassInfo createConstructorExpClassInfo() {
		ConstructorExpClassInfoImpl constructorExpClassInfo = new ConstructorExpClassInfoImpl();
		return constructorExpClassInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorPartAction createConstructorPartAction() {
		ConstructorPartActionImpl constructorPartAction = new ConstructorPartActionImpl();
		return constructorPartAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorPartPropertyInfo createConstructorPartPropertyInfo() {
		ConstructorPartPropertyInfoImpl constructorPartPropertyInfo = new ConstructorPartPropertyInfoImpl();
		return constructorPartPropertyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPropertyInfo createExtendedPropertyInfo() {
		ExtendedPropertyInfoImpl extendedPropertyInfo = new ExtendedPropertyInfoImpl();
		return extendedPropertyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpInfo createPropertyCallExpInfo() {
		PropertyCallExpInfoImpl propertyCallExpInfo = new PropertyCallExpInfoImpl();
		return propertyCallExpInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentInfo createEnvironmentInfo() {
		EnvironmentInfoImpl environmentInfo = new EnvironmentInfoImpl();
		return environmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingAction createMappingAction() {
		MappingActionImpl mappingAction = new MappingActionImpl();
		return mappingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentAction createEnvironmentAction() {
		EnvironmentActionImpl environmentAction = new EnvironmentActionImpl();
		return environmentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisPackage getCS2ASAnalysisPackage() {
		return (CS2ASAnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CS2ASAnalysisPackage getPackage() {
		return CS2ASAnalysisPackage.eINSTANCE;
	}

} //CS2ASAnalysisFactoryImpl
