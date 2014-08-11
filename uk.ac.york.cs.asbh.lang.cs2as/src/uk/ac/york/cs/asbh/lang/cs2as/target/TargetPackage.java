/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetFactory
 * @model kind="package"
 * @generated
 */
public interface TargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "target";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ocldependencyanalysis/targetMM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "target";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetPackage eINSTANCE = uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.AImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A1Impl <em>A1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A1Impl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA1()
	 * @generated
	 */
	int A1 = 1;

	/**
	 * The feature id for the '<em><b>Owns B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1__OWNS_B = A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1_FEATURE_COUNT = A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A2Impl <em>A2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A2Impl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA2()
	 * @generated
	 */
	int A2 = 2;

	/**
	 * The feature id for the '<em><b>Owns C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2__OWNS_C = A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2_FEATURE_COUNT = A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getB()
	 * @generated
	 */
	int B = 3;

	/**
	 * The feature id for the '<em><b>To A1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__TO_A1 = 0;

	/**
	 * The feature id for the '<em><b>Owns D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__OWNS_D = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__NAME = 2;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getC()
	 * @generated
	 */
	int C = 4;

	/**
	 * The feature id for the '<em><b>To A2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__TO_A2 = 0;

	/**
	 * The feature id for the '<em><b>Owns D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__OWNS_D = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__NAME = 2;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getD()
	 * @generated
	 */
	int D = 5;

	/**
	 * The feature id for the '<em><b>To C</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_C = 0;

	/**
	 * The feature id for the '<em><b>To B</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_B = 1;

	/**
	 * The feature id for the '<em><b>To A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_A = 2;

	/**
	 * The feature id for the '<em><b>Refs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__REFS_B = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__NAME = 4;

	/**
	 * The feature id for the '<em><b>Refs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__REFS_C = 5;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.RootImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 6;

	/**
	 * The feature id for the '<em><b>Owned A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OWNED_A = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A1</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A1
	 * @generated
	 */
	EClass getA1();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owns B</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB()
	 * @see #getA1()
	 * @generated
	 */
	EReference getA1_OwnsB();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A2 <em>A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A2</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A2
	 * @generated
	 */
	EClass getA2();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC <em>Owns C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owns C</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC()
	 * @see #getA2()
	 * @generated
	 */
	EReference getA2_OwnsC();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1 <em>To A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To A1</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getToA1()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_ToA1();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD <em>Owns D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owns D</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_OwnsD();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getName()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2 <em>To A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To A2</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C#getToA2()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_ToA2();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD <em>Owns D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owns D</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_OwnsD();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C#getName()
	 * @see #getC()
	 * @generated
	 */
	EAttribute getC_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D
	 * @generated
	 */
	EClass getD();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC <em>To C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To C</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_ToC();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB <em>To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To B</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_ToB();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToA <em>To A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To A</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getToA()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_ToA();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsB <em>Refs B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refs B</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsB()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_RefsB();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getName()
	 * @see #getD()
	 * @generated
	 */
	EAttribute getD_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsC <em>Refs C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refs C</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsC()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_RefsC();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.target.Root#getOwnedA <em>Owned A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned A</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.Root#getOwnedA()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_OwnedA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetFactory getTargetFactory();

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
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.AImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A1Impl <em>A1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A1Impl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA1()
		 * @generated
		 */
		EClass A1 = eINSTANCE.getA1();

		/**
		 * The meta object literal for the '<em><b>Owns B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A1__OWNS_B = eINSTANCE.getA1_OwnsB();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A2Impl <em>A2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A2Impl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA2()
		 * @generated
		 */
		EClass A2 = eINSTANCE.getA2();

		/**
		 * The meta object literal for the '<em><b>Owns C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A2__OWNS_C = eINSTANCE.getA2_OwnsC();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>To A1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B__TO_A1 = eINSTANCE.getB_ToA1();

		/**
		 * The meta object literal for the '<em><b>Owns D</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B__OWNS_D = eINSTANCE.getB_OwnsD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__NAME = eINSTANCE.getB_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '<em><b>To A2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C__TO_A2 = eINSTANCE.getC_ToA2();

		/**
		 * The meta object literal for the '<em><b>Owns D</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C__OWNS_D = eINSTANCE.getC_OwnsD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C__NAME = eINSTANCE.getC_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl <em>D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getD()
		 * @generated
		 */
		EClass D = eINSTANCE.getD();

		/**
		 * The meta object literal for the '<em><b>To C</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__TO_C = eINSTANCE.getD_ToC();

		/**
		 * The meta object literal for the '<em><b>To B</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__TO_B = eINSTANCE.getD_ToB();

		/**
		 * The meta object literal for the '<em><b>To A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__TO_A = eINSTANCE.getD_ToA();

		/**
		 * The meta object literal for the '<em><b>Refs B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__REFS_B = eINSTANCE.getD_RefsB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute D__NAME = eINSTANCE.getD_Name();

		/**
		 * The meta object literal for the '<em><b>Refs C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__REFS_C = eINSTANCE.getD_RefsC();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.RootImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Owned A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__OWNED_A = eINSTANCE.getRoot_OwnedA();

	}

} //TargetPackage
