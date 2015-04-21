/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage
 * @generated
 */
public interface SourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourceFactory eINSTANCE = uk.ac.york.cs.asbh.lang.cs2as.source.impl.SourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X</em>'.
	 * @generated
	 */
	X createX();

	/**
	 * Returns a new object of class '<em>Y1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Y1</em>'.
	 * @generated
	 */
	Y1 createY1();

	/**
	 * Returns a new object of class '<em>Y2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Y2</em>'.
	 * @generated
	 */
	Y2 createY2();

	/**
	 * Returns a new object of class '<em>Z</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Z</em>'.
	 * @generated
	 */
	Z createZ();

	/**
	 * Returns a new object of class '<em>SRoot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRoot</em>'.
	 * @generated
	 */
	SRoot createSRoot();

	/**
	 * Returns a new object of class '<em>SElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SElement</em>'.
	 * @generated
	 */
	SElement createSElement();

	/**
	 * Returns a new object of class '<em>Path Name CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Name CS</em>'.
	 * @generated
	 */
	PathNameCS createPathNameCS();

	/**
	 * Returns a new object of class '<em>Path Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Element CS</em>'.
	 * @generated
	 */
	PathElementCS createPathElementCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SourcePackage getSourcePackage();

} //SourceFactory
