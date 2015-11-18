/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.env;

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
 * @see uk.ac.york.cs.asbh.lang.cs2as.env.EnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import target='TargetMM1.ecore#/'"
 * @generated
 */
public interface EnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "env";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.ac.york.cs.asbh.lang.cs2as/env/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "env";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentPackage eINSTANCE = uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG <em>Env4 CG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getEnv4CG()
	 * @generated
	 */
	int ENV4_CG = 1;

	/**
	 * The number of structural features of the '<em>Env4 CG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV4_CG_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Final Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV4_CG___HAS_FINAL_RESULT = 0;

	/**
	 * The operation id for the '<em>Get Executor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV4_CG___GET_EXECUTOR = 1;

	/**
	 * The number of operations of the '<em>Env4 CG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV4_CG_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAMED_ELEMENTS = ENV4_CG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PARENT_ENV = ENV4_CG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = ENV4_CG_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Final Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___HAS_FINAL_RESULT = ENV4_CG___HAS_FINAL_RESULT;

	/**
	 * The operation id for the '<em>Get Executor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_EXECUTOR = ENV4_CG___GET_EXECUTOR;

	/**
	 * The operation id for the '<em>Add Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ADD_ELEMENTS__ELIST = ENV4_CG_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ADD_ELEMENT__NAMEDELEMENT = ENV4_CG_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = ENV4_CG_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.evaluation.Executor <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.evaluation.Executor
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 2;

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
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Named Elements</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getNamedElements()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_NamedElements();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getParentEnv <em>Parent Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Env</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Environment#getParentEnv()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ParentEnv();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#addElements(org.eclipse.emf.common.util.EList) <em>Add Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Elements</em>' operation.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Environment#addElements(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEnvironment__AddElements__EList();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Environment#addElement(uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Environment#addElement(uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement)
	 * @generated
	 */
	EOperation getEnvironment__AddElement__NamedElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG <em>Env4 CG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env4 CG</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG
	 * @generated
	 */
	EClass getEnv4CG();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG#hasFinalResult() <em>Has Final Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Final Result</em>' operation.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG#hasFinalResult()
	 * @generated
	 */
	EOperation getEnv4CG__HasFinalResult();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG#getExecutor() <em>Get Executor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Executor</em>' operation.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG#getExecutor()
	 * @generated
	 */
	EOperation getEnv4CG__GetExecutor();

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
	EnvironmentFactory getEnvironmentFactory();

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
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Named Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__NAMED_ELEMENTS = eINSTANCE.getEnvironment_NamedElements();

		/**
		 * The meta object literal for the '<em><b>Parent Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__PARENT_ENV = eINSTANCE.getEnvironment_ParentEnv();

		/**
		 * The meta object literal for the '<em><b>Add Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT___ADD_ELEMENTS__ELIST = eINSTANCE.getEnvironment__AddElements__EList();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT___ADD_ELEMENT__NAMEDELEMENT = eINSTANCE.getEnvironment__AddElement__NamedElement();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG <em>Env4 CG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.env.Env4CG
		 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getEnv4CG()
		 * @generated
		 */
		EClass ENV4_CG = eINSTANCE.getEnv4CG();

		/**
		 * The meta object literal for the '<em><b>Has Final Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENV4_CG___HAS_FINAL_RESULT = eINSTANCE.getEnv4CG__HasFinalResult();

		/**
		 * The meta object literal for the '<em><b>Get Executor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENV4_CG___GET_EXECUTOR = eINSTANCE.getEnv4CG__GetExecutor();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.evaluation.Executor <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.evaluation.Executor
		 * @see uk.ac.york.cs.asbh.lang.cs2as.env.impl.EnvironmentPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

	}

} //EnvironmentPackage
