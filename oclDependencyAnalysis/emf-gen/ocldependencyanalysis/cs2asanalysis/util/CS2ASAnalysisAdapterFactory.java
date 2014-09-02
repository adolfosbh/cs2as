/**
 */
package ocldependencyanalysis.cs2asanalysis.util;

import ocldependencyanalysis.cs2asanalysis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage
 * @generated
 */
public class CS2ASAnalysisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CS2ASAnalysisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS2ASAnalysisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CS2ASAnalysisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS2ASAnalysisSwitch<Adapter> modelSwitch =
		new CS2ASAnalysisSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseCS2ASAnalysisNode(CS2ASAnalysisNode object) {
				return createCS2ASAnalysisNodeAdapter();
			}
			@Override
			public Adapter caseActionNode(ActionNode object) {
				return createActionNodeAdapter();
			}
			@Override
			public Adapter caseInfoNode(InfoNode object) {
				return createInfoNodeAdapter();
			}
			@Override
			public Adapter caseOperationRef(OperationRef object) {
				return createOperationRefAdapter();
			}
			@Override
			public Adapter casePropertyRef(PropertyRef object) {
				return createPropertyRefAdapter();
			}
			@Override
			public Adapter caseTypeRef(TypeRef object) {
				return createTypeRefAdapter();
			}
			@Override
			public Adapter caseConstructorPartPropRef(ConstructorPartPropRef object) {
				return createConstructorPartPropRefAdapter();
			}
			@Override
			public Adapter caseTypeInfo(TypeInfo object) {
				return createTypeInfoAdapter();
			}
			@Override
			public Adapter caseConstructorExpTypeInfo(ConstructorExpTypeInfo object) {
				return createConstructorExpTypeInfoAdapter();
			}
			@Override
			public Adapter caseConstructorPartAction(ConstructorPartAction object) {
				return createConstructorPartActionAdapter();
			}
			@Override
			public Adapter caseConstructorPartPropertyInfo(ConstructorPartPropertyInfo object) {
				return createConstructorPartPropertyInfoAdapter();
			}
			@Override
			public Adapter caseExtendedPropertyInfo(ExtendedPropertyInfo object) {
				return createExtendedPropertyInfoAdapter();
			}
			@Override
			public Adapter caseOperationAction(OperationAction object) {
				return createOperationActionAdapter();
			}
			@Override
			public Adapter casePropertyCallExpInfo(PropertyCallExpInfo object) {
				return createPropertyCallExpInfoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisNode
	 * @generated
	 */
	public Adapter createCS2ASAnalysisNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ActionNode
	 * @generated
	 */
	public Adapter createActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.InfoNode <em>Info Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.InfoNode
	 * @generated
	 */
	public Adapter createInfoNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.OperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.OperationRef
	 * @generated
	 */
	public Adapter createOperationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyRef
	 * @generated
	 */
	public Adapter createPropertyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef <em>Constructor Part Prop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartPropRef
	 * @generated
	 */
	public Adapter createConstructorPartPropRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.TypeInfo <em>Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.TypeInfo
	 * @generated
	 */
	public Adapter createTypeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorExpTypeInfo <em>Constructor Exp Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorExpTypeInfo
	 * @generated
	 */
	public Adapter createConstructorExpTypeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartAction <em>Constructor Part Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartAction
	 * @generated
	 */
	public Adapter createConstructorPartActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo <em>Constructor Part Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ConstructorPartPropertyInfo
	 * @generated
	 */
	public Adapter createConstructorPartPropertyInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo <em>Extended Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.ExtendedPropertyInfo
	 * @generated
	 */
	public Adapter createExtendedPropertyInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.OperationAction
	 * @generated
	 */
	public Adapter createOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo <em>Property Call Exp Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocldependencyanalysis.cs2asanalysis.PropertyCallExpInfo
	 * @generated
	 */
	public Adapter createPropertyCallExpInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CS2ASAnalysisAdapterFactory