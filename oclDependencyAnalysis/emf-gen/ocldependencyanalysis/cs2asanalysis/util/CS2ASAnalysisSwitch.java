/**
 */
package ocldependencyanalysis.cs2asanalysis.util;

import ocldependencyanalysis.cs2asanalysis.*;

import ocldependencyanalysis.graph2.Edge;
import ocldependencyanalysis.graph2.Graph;
import ocldependencyanalysis.graph2.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage
 * @generated
 */
public class CS2ASAnalysisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CS2ASAnalysisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisSwitch() {
		if (modelPackage == null) {
			modelPackage = CS2ASAnalysisPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_NODE: {
				CS2ASAnalysisNode cs2ASAnalysisNode = (CS2ASAnalysisNode)theEObject;
				T result = caseCS2ASAnalysisNode(cs2ASAnalysisNode);
				if (result == null) result = caseNode(cs2ASAnalysisNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_EDGE: {
				CS2ASAnalysisEdge cs2ASAnalysisEdge = (CS2ASAnalysisEdge)theEObject;
				T result = caseCS2ASAnalysisEdge(cs2ASAnalysisEdge);
				if (result == null) result = caseEdge(cs2ASAnalysisEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CS2AS_ANALYSIS_GRAPH: {
				CS2ASAnalysisGraph cs2ASAnalysisGraph = (CS2ASAnalysisGraph)theEObject;
				T result = caseCS2ASAnalysisGraph(cs2ASAnalysisGraph);
				if (result == null) result = caseGraph(cs2ASAnalysisGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.ACTION_NODE: {
				ActionNode actionNode = (ActionNode)theEObject;
				T result = caseActionNode(actionNode);
				if (result == null) result = caseCS2ASAnalysisNode(actionNode);
				if (result == null) result = caseNode(actionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.INFO_NODE: {
				InfoNode infoNode = (InfoNode)theEObject;
				T result = caseInfoNode(infoNode);
				if (result == null) result = caseCS2ASAnalysisNode(infoNode);
				if (result == null) result = caseNode(infoNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.OPERATION_REF: {
				OperationRef operationRef = (OperationRef)theEObject;
				T result = caseOperationRef(operationRef);
				if (result == null) result = caseCS2ASAnalysisNode(operationRef);
				if (result == null) result = caseNode(operationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.EXTENDED_OPERATION_REF: {
				ExtendedOperationRef extendedOperationRef = (ExtendedOperationRef)theEObject;
				T result = caseExtendedOperationRef(extendedOperationRef);
				if (result == null) result = caseOperationRef(extendedOperationRef);
				if (result == null) result = caseCS2ASAnalysisNode(extendedOperationRef);
				if (result == null) result = caseNode(extendedOperationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.PROPERTY_REF: {
				PropertyRef propertyRef = (PropertyRef)theEObject;
				T result = casePropertyRef(propertyRef);
				if (result == null) result = caseCS2ASAnalysisNode(propertyRef);
				if (result == null) result = caseNode(propertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_REF: {
				ExtendedPropertyRef extendedPropertyRef = (ExtendedPropertyRef)theEObject;
				T result = caseExtendedPropertyRef(extendedPropertyRef);
				if (result == null) result = casePropertyRef(extendedPropertyRef);
				if (result == null) result = caseCS2ASAnalysisNode(extendedPropertyRef);
				if (result == null) result = caseNode(extendedPropertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CLASS_REF: {
				ClassRef classRef = (ClassRef)theEObject;
				T result = caseClassRef(classRef);
				if (result == null) result = caseCS2ASAnalysisNode(classRef);
				if (result == null) result = caseNode(classRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROP_REF: {
				ConstructorPartPropRef constructorPartPropRef = (ConstructorPartPropRef)theEObject;
				T result = caseConstructorPartPropRef(constructorPartPropRef);
				if (result == null) result = casePropertyRef(constructorPartPropRef);
				if (result == null) result = caseCS2ASAnalysisNode(constructorPartPropRef);
				if (result == null) result = caseNode(constructorPartPropRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CLASS_INFO: {
				ClassInfo classInfo = (ClassInfo)theEObject;
				T result = caseClassInfo(classInfo);
				if (result == null) result = caseClassRef(classInfo);
				if (result == null) result = caseInfoNode(classInfo);
				if (result == null) result = caseCS2ASAnalysisNode(classInfo);
				if (result == null) result = caseNode(classInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CONSTRUCTOR_EXP_CLASS_INFO: {
				ConstructorExpClassInfo constructorExpClassInfo = (ConstructorExpClassInfo)theEObject;
				T result = caseConstructorExpClassInfo(constructorExpClassInfo);
				if (result == null) result = caseClassInfo(constructorExpClassInfo);
				if (result == null) result = caseClassRef(constructorExpClassInfo);
				if (result == null) result = caseInfoNode(constructorExpClassInfo);
				if (result == null) result = caseCS2ASAnalysisNode(constructorExpClassInfo);
				if (result == null) result = caseNode(constructorExpClassInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_ACTION: {
				ConstructorPartAction constructorPartAction = (ConstructorPartAction)theEObject;
				T result = caseConstructorPartAction(constructorPartAction);
				if (result == null) result = caseConstructorPartPropRef(constructorPartAction);
				if (result == null) result = caseActionNode(constructorPartAction);
				if (result == null) result = casePropertyRef(constructorPartAction);
				if (result == null) result = caseCS2ASAnalysisNode(constructorPartAction);
				if (result == null) result = caseNode(constructorPartAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.CONSTRUCTOR_PART_PROPERTY_INFO: {
				ConstructorPartPropertyInfo constructorPartPropertyInfo = (ConstructorPartPropertyInfo)theEObject;
				T result = caseConstructorPartPropertyInfo(constructorPartPropertyInfo);
				if (result == null) result = caseExtendedPropertyInfo(constructorPartPropertyInfo);
				if (result == null) result = caseConstructorPartPropRef(constructorPartPropertyInfo);
				if (result == null) result = caseExtendedPropertyRef(constructorPartPropertyInfo);
				if (result == null) result = caseInfoNode(constructorPartPropertyInfo);
				if (result == null) result = casePropertyRef(constructorPartPropertyInfo);
				if (result == null) result = caseCS2ASAnalysisNode(constructorPartPropertyInfo);
				if (result == null) result = caseNode(constructorPartPropertyInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.EXTENDED_PROPERTY_INFO: {
				ExtendedPropertyInfo extendedPropertyInfo = (ExtendedPropertyInfo)theEObject;
				T result = caseExtendedPropertyInfo(extendedPropertyInfo);
				if (result == null) result = caseExtendedPropertyRef(extendedPropertyInfo);
				if (result == null) result = caseInfoNode(extendedPropertyInfo);
				if (result == null) result = casePropertyRef(extendedPropertyInfo);
				if (result == null) result = caseCS2ASAnalysisNode(extendedPropertyInfo);
				if (result == null) result = caseNode(extendedPropertyInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.OPERATION_ACTION: {
				OperationAction operationAction = (OperationAction)theEObject;
				T result = caseOperationAction(operationAction);
				if (result == null) result = caseOperationRef(operationAction);
				if (result == null) result = caseActionNode(operationAction);
				if (result == null) result = caseCS2ASAnalysisNode(operationAction);
				if (result == null) result = caseNode(operationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.PROPERTY_CALL_EXP_INFO: {
				PropertyCallExpInfo propertyCallExpInfo = (PropertyCallExpInfo)theEObject;
				T result = casePropertyCallExpInfo(propertyCallExpInfo);
				if (result == null) result = caseExtendedPropertyInfo(propertyCallExpInfo);
				if (result == null) result = caseExtendedPropertyRef(propertyCallExpInfo);
				if (result == null) result = caseInfoNode(propertyCallExpInfo);
				if (result == null) result = casePropertyRef(propertyCallExpInfo);
				if (result == null) result = caseCS2ASAnalysisNode(propertyCallExpInfo);
				if (result == null) result = caseNode(propertyCallExpInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.ENVIRONMENT_INFO: {
				EnvironmentInfo environmentInfo = (EnvironmentInfo)theEObject;
				T result = caseEnvironmentInfo(environmentInfo);
				if (result == null) result = caseExtendedOperationRef(environmentInfo);
				if (result == null) result = caseInfoNode(environmentInfo);
				if (result == null) result = caseOperationRef(environmentInfo);
				if (result == null) result = caseCS2ASAnalysisNode(environmentInfo);
				if (result == null) result = caseNode(environmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.MAPPING_ACTION: {
				MappingAction mappingAction = (MappingAction)theEObject;
				T result = caseMappingAction(mappingAction);
				if (result == null) result = caseOperationAction(mappingAction);
				if (result == null) result = caseOperationRef(mappingAction);
				if (result == null) result = caseActionNode(mappingAction);
				if (result == null) result = caseCS2ASAnalysisNode(mappingAction);
				if (result == null) result = caseNode(mappingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CS2ASAnalysisPackage.ENVIRONMENT_ACTION: {
				EnvironmentAction environmentAction = (EnvironmentAction)theEObject;
				T result = caseEnvironmentAction(environmentAction);
				if (result == null) result = caseExtendedOperationRef(environmentAction);
				if (result == null) result = caseActionNode(environmentAction);
				if (result == null) result = caseOperationRef(environmentAction);
				if (result == null) result = caseCS2ASAnalysisNode(environmentAction);
				if (result == null) result = caseNode(environmentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS2ASAnalysisNode(CS2ASAnalysisNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS2ASAnalysisEdge(CS2ASAnalysisEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS2ASAnalysisGraph(CS2ASAnalysisGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionNode(ActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoNode(InfoNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationRef(OperationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Operation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Operation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedOperationRef(ExtendedOperationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRef(PropertyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Property Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedPropertyRef(ExtendedPropertyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassRef(ClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Part Prop Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Part Prop Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorPartPropRef(ConstructorPartPropRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInfo(ClassInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Exp Class Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Exp Class Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorExpClassInfo(ConstructorExpClassInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Part Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Part Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorPartAction(ConstructorPartAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Part Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Part Property Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorPartPropertyInfo(ConstructorPartPropertyInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Property Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedPropertyInfo(ExtendedPropertyInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAction(OperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Call Exp Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Call Exp Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCallExpInfo(PropertyCallExpInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentInfo(EnvironmentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingAction(MappingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentAction(EnvironmentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CS2ASAnalysisSwitch
