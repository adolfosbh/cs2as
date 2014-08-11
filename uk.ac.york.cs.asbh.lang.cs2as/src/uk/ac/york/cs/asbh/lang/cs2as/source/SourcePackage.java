/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

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
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourceFactory
 * @model kind="package"
 * @generated
 */
public interface SourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "source";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ocldependencyanalysis/sourceMM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "source";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcePackage eINSTANCE = uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl <em>X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getX()
	 * @generated
	 */
	int X = 0;

	/**
	 * The feature id for the '<em><b>Is A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__IS_A1 = 0;

	/**
	 * The feature id for the '<em><b>Owns Y</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__OWNS_Y = 1;

	/**
	 * The number of structural features of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.YImpl <em>Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.YImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY()
	 * @generated
	 */
	int Y = 1;

	/**
	 * The feature id for the '<em><b>Owns Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__OWNS_Z = 0;

	/**
	 * The feature id for the '<em><b>To X</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__TO_X = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__NAME = 2;

	/**
	 * The number of structural features of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y1Impl <em>Y1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y1Impl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY1()
	 * @generated
	 */
	int Y1 = 2;

	/**
	 * The feature id for the '<em><b>Owns Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y1__OWNS_Z = Y__OWNS_Z;

	/**
	 * The feature id for the '<em><b>To X</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y1__TO_X = Y__TO_X;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y1__NAME = Y__NAME;

	/**
	 * The number of structural features of the '<em>Y1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y1_FEATURE_COUNT = Y_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Y1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y1_OPERATION_COUNT = Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y2Impl <em>Y2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y2Impl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY2()
	 * @generated
	 */
	int Y2 = 3;

	/**
	 * The feature id for the '<em><b>Owns Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y2__OWNS_Z = Y__OWNS_Z;

	/**
	 * The feature id for the '<em><b>To X</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y2__TO_X = Y__TO_X;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y2__NAME = Y__NAME;

	/**
	 * The number of structural features of the '<em>Y2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y2_FEATURE_COUNT = Y_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Y2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y2_OPERATION_COUNT = Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.ZImpl <em>Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.ZImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getZ()
	 * @generated
	 */
	int Z = 4;

	/**
	 * The feature id for the '<em><b>To Y</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z__TO_Y = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z__NAME = 1;

	/**
	 * The number of structural features of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.RootImpl
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 5;

	/**
	 * The feature id for the '<em><b>Owned X</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OWNED_X = 0;

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
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.X
	 * @generated
	 */
	EClass getX();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1 <em>Is A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is A1</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1()
	 * @see #getX()
	 * @generated
	 */
	EAttribute getX_IsA1();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY <em>Owns Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Y</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_OwnsY();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y
	 * @generated
	 */
	EClass getY();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ <em>Owns Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owns Z</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getOwnsZ()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_OwnsZ();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX <em>To X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To X</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_ToX();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getName()
	 * @see #getY()
	 * @generated
	 */
	EAttribute getY_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y1</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y1
	 * @generated
	 */
	EClass getY1();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y2</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y2
	 * @generated
	 */
	EClass getY2();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Z</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Z
	 * @generated
	 */
	EClass getZ();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY <em>To Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To Y</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Z#getToY()
	 * @see #getZ()
	 * @generated
	 */
	EReference getZ_ToY();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Z#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Z#getName()
	 * @see #getZ()
	 * @generated
	 */
	EAttribute getZ_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Root#getOwnedX <em>Owned X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned X</em>'.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Root#getOwnedX()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_OwnedX();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourceFactory getSourceFactory();

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
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl <em>X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.XImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getX()
		 * @generated
		 */
		EClass X = eINSTANCE.getX();

		/**
		 * The meta object literal for the '<em><b>Is A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X__IS_A1 = eINSTANCE.getX_IsA1();

		/**
		 * The meta object literal for the '<em><b>Owns Y</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__OWNS_Y = eINSTANCE.getX_OwnsY();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.YImpl <em>Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.YImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY()
		 * @generated
		 */
		EClass Y = eINSTANCE.getY();

		/**
		 * The meta object literal for the '<em><b>Owns Z</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__OWNS_Z = eINSTANCE.getY_OwnsZ();

		/**
		 * The meta object literal for the '<em><b>To X</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__TO_X = eINSTANCE.getY_ToX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Y__NAME = eINSTANCE.getY_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y1Impl <em>Y1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y1Impl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY1()
		 * @generated
		 */
		EClass Y1 = eINSTANCE.getY1();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y2Impl <em>Y2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.Y2Impl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getY2()
		 * @generated
		 */
		EClass Y2 = eINSTANCE.getY2();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.ZImpl <em>Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.ZImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getZ()
		 * @generated
		 */
		EClass Z = eINSTANCE.getZ();

		/**
		 * The meta object literal for the '<em><b>To Y</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Z__TO_Y = eINSTANCE.getZ_ToY();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Z__NAME = eINSTANCE.getZ_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.RootImpl
		 * @see uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourcePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Owned X</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__OWNED_X = eINSTANCE.getRoot_OwnedX();

	}

} //SourcePackage
