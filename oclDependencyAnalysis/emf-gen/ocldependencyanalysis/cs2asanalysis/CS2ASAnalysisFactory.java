/**
 */
package ocldependencyanalysis.cs2asanalysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage
 * @generated
 */
public interface CS2ASAnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CS2ASAnalysisFactory eINSTANCE = ocldependencyanalysis.cs2asanalysis.impl.CS2ASAnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	CS2ASAnalysisEdge createCS2ASAnalysisEdge();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	CS2ASAnalysisGraph createCS2ASAnalysisGraph();

	/**
	 * Returns a new object of class '<em>Class Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Info</em>'.
	 * @generated
	 */
	ClassInfo createClassInfo();

	/**
	 * Returns a new object of class '<em>Constructor Exp Class Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Exp Class Info</em>'.
	 * @generated
	 */
	ConstructorExpClassInfo createConstructorExpClassInfo();

	/**
	 * Returns a new object of class '<em>Constructor Part Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Part Action</em>'.
	 * @generated
	 */
	ConstructorPartAction createConstructorPartAction();

	/**
	 * Returns a new object of class '<em>Constructor Part Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Part Property Info</em>'.
	 * @generated
	 */
	ConstructorPartPropertyInfo createConstructorPartPropertyInfo();

	/**
	 * Returns a new object of class '<em>Extended Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Property Info</em>'.
	 * @generated
	 */
	ExtendedPropertyInfo createExtendedPropertyInfo();

	/**
	 * Returns a new object of class '<em>Property Call Exp Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Call Exp Info</em>'.
	 * @generated
	 */
	PropertyCallExpInfo createPropertyCallExpInfo();

	/**
	 * Returns a new object of class '<em>Environment Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Info</em>'.
	 * @generated
	 */
	EnvironmentInfo createEnvironmentInfo();

	/**
	 * Returns a new object of class '<em>Mapping Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Action</em>'.
	 * @generated
	 */
	MappingAction createMappingAction();

	/**
	 * Returns a new object of class '<em>Environment Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Action</em>'.
	 * @generated
	 */
	EnvironmentAction createEnvironmentAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CS2ASAnalysisPackage getCS2ASAnalysisPackage();

} //CS2ASAnalysisFactory
