/**
 */
package org.xtext.example.delphi.astm.lookup;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.delphi.astm.lookup.LookupFactory
 * @model kind="package"
 * @generated
 */
public interface LookupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lookup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xtext.eclipse.org/example/companies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lookup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LookupPackage eINSTANCE = org.xtext.example.delphi.astm.lookup.impl.LookupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl
	 * @see org.xtext.example.delphi.astm.lookup.impl.LookupPackageImpl#getLookupEnvironment()
	 * @generated
	 */
	int LOOKUP_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT__NAMED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Parent Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT__PARENT_ENV = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT___ADD_ELEMENTS__COLLECTION = 0;

	/**
	 * The operation id for the '<em>Add Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT___ADD_ELEMENTS__DEFINITION = 1;

	/**
	 * The operation id for the '<em>Has Final Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT___HAS_FINAL_RESULT = 2;

	/**
	 * The operation id for the '<em>Get Executor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT___GET_EXECUTOR = 3;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_ENVIRONMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.evaluation.Executor <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.evaluation.Executor
	 * @see org.xtext.example.delphi.astm.lookup.impl.LookupPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 1;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment
	 * @generated
	 */
	EClass getLookupEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Named Elements</em>'.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#getNamedElements()
	 * @see #getLookupEnvironment()
	 * @generated
	 */
	EReference getLookupEnvironment_NamedElements();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#getParentEnv <em>Parent Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Env</em>'.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#getParentEnv()
	 * @see #getLookupEnvironment()
	 * @generated
	 */
	EReference getLookupEnvironment_ParentEnv();

	/**
	 * Returns the meta object for the '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#addElements(java.util.Collection) <em>Add Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Elements</em>' operation.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#addElements(java.util.Collection)
	 * @generated
	 */
	EOperation getLookupEnvironment__AddElements__Collection();

	/**
	 * Returns the meta object for the '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#addElements(org.xtext.example.delphi.astm.Definition) <em>Add Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Elements</em>' operation.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#addElements(org.xtext.example.delphi.astm.Definition)
	 * @generated
	 */
	EOperation getLookupEnvironment__AddElements__Definition();

	/**
	 * Returns the meta object for the '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#hasFinalResult() <em>Has Final Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Final Result</em>' operation.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#hasFinalResult()
	 * @generated
	 */
	EOperation getLookupEnvironment__HasFinalResult();

	/**
	 * Returns the meta object for the '{@link org.xtext.example.delphi.astm.lookup.LookupEnvironment#getExecutor() <em>Get Executor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Executor</em>' operation.
	 * @see org.xtext.example.delphi.astm.lookup.LookupEnvironment#getExecutor()
	 * @generated
	 */
	EOperation getLookupEnvironment__GetExecutor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.pivot.evaluation.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see org.eclipse.ocl.pivot.evaluation.Executor
	 * @model instanceClass="org.eclipse.ocl.pivot.evaluation.Executor"
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LookupFactory getLookupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl
		 * @see org.xtext.example.delphi.astm.lookup.impl.LookupPackageImpl#getLookupEnvironment()
		 * @generated
		 */
		EClass LOOKUP_ENVIRONMENT = eINSTANCE.getLookupEnvironment();

		/**
		 * The meta object literal for the '<em><b>Named Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_ENVIRONMENT__NAMED_ELEMENTS = eINSTANCE.getLookupEnvironment_NamedElements();

		/**
		 * The meta object literal for the '<em><b>Parent Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_ENVIRONMENT__PARENT_ENV = eINSTANCE.getLookupEnvironment_ParentEnv();

		/**
		 * The meta object literal for the '<em><b>Add Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOOKUP_ENVIRONMENT___ADD_ELEMENTS__COLLECTION = eINSTANCE.getLookupEnvironment__AddElements__Collection();

		/**
		 * The meta object literal for the '<em><b>Add Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOOKUP_ENVIRONMENT___ADD_ELEMENTS__DEFINITION = eINSTANCE.getLookupEnvironment__AddElements__Definition();

		/**
		 * The meta object literal for the '<em><b>Has Final Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOOKUP_ENVIRONMENT___HAS_FINAL_RESULT = eINSTANCE.getLookupEnvironment__HasFinalResult();

		/**
		 * The meta object literal for the '<em><b>Get Executor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOOKUP_ENVIRONMENT___GET_EXECUTOR = eINSTANCE.getLookupEnvironment__GetExecutor();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.evaluation.Executor <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.evaluation.Executor
		 * @see org.xtext.example.delphi.astm.lookup.impl.LookupPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

	}

} //LookupPackage
