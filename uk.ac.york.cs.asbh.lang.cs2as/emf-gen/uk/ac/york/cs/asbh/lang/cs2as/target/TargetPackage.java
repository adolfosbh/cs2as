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
	String eNS_URI = "http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0";

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
	 * The feature id for the '<em><b>Owns B</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Owns C</b></em>' containment reference list.
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
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A3Impl <em>A3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A3Impl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA3()
	 * @generated
	 */
	int A3 = 3;

	/**
	 * The feature id for the '<em><b>Owns C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A3__OWNS_C = A2__OWNS_C;

	/**
	 * The number of structural features of the '<em>A3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A3_FEATURE_COUNT = A2_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A3_OPERATION_COUNT = A2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.NamedElementImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.BImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getB()
	 * @generated
	 */
	int B = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>To A1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__TO_A1 = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owns D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__OWNS_D = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.CImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getC()
	 * @generated
	 */
	int C = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>To A2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__TO_A2 = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owns D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__OWNS_D = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.DImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getD()
	 * @generated
	 */
	int D = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>To C</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_C = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To B</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_B = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__TO_A = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__REFS_B = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__REFS_C = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.TRootImpl <em>TRoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TRootImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getTRoot()
	 * @generated
	 */
	int TROOT = 7;

	/**
	 * The feature id for the '<em><b>Owned A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT__OWNED_A = 0;

	/**
	 * The number of structural features of the '<em>TRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A1#getOwnsB <em>Owns B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns B</em>'.
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
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC <em>Owns C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns C</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A2#getOwnsC()
	 * @see #getA2()
	 * @generated
	 */
	EReference getA2_OwnsC();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.A3 <em>A3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A3</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.A3
	 * @generated
	 */
	EClass getA3();

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
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.TRoot <em>TRoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRoot</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TRoot
	 * @generated
	 */
	EClass getTRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.target.TRoot#getOwnedA <em>Owned A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned A</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TRoot#getOwnedA()
	 * @see #getTRoot()
	 * @generated
	 */
	EReference getTRoot_OwnedA();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

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
		 * The meta object literal for the '<em><b>Owns B</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Owns C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A2__OWNS_C = eINSTANCE.getA2_OwnsC();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.A3Impl <em>A3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.A3Impl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getA3()
		 * @generated
		 */
		EClass A3 = eINSTANCE.getA3();

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
		 * The meta object literal for the '<em><b>Refs C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__REFS_C = eINSTANCE.getD_RefsC();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.TRootImpl <em>TRoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TRootImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getTRoot()
		 * @generated
		 */
		EClass TROOT = eINSTANCE.getTRoot();

		/**
		 * The meta object literal for the '<em><b>Owned A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROOT__OWNED_A = eINSTANCE.getTRoot_OwnedA();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.NamedElementImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.target.impl.TargetPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //TargetPackage
