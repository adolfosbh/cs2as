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
			case CS2ASAnalysisPackage.CLASS_INFO: return createClassInfo();
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO: return createConstructorExpClassInfo();
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_ACTION: return createConstructorPartAction();
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO: return createConstructorPartPropertyInfo();
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_INFO: return createExtendedPropertyInfo();
			case CS2ASAnalysisPackage.OPERATION_ACTION: return createOperationAction();
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO: return createPropertyCallExpInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public OperationAction createOperationAction() {
		OperationActionImpl operationAction = new OperationActionImpl();
		return operationAction;
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
