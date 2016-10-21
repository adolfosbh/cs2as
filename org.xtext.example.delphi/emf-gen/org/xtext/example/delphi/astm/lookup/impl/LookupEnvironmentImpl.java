/**
 */
package org.xtext.example.delphi.astm.lookup.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.xtext.example.delphi.astm.Definition;
import org.xtext.example.delphi.astm.VariableDefinition;

import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.lookup.LookupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.lookup.impl.LookupEnvironmentImpl#getParentEnv <em>Parent Env</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupEnvironmentImpl extends MinimalEObjectImpl.Container implements LookupEnvironment {
	/**
	 * The cached value of the '{@link #getNamedElements() <em>Named Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> namedElements;

	/**
	 * The cached value of the '{@link #getParentEnv() <em>Parent Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEnv()
	 * @generated
	 * @ordered
	 */
	protected LookupEnvironment parentEnv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LookupPackage.Literals.LOOKUP_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectResolvingEList<Definition>(Definition.class, this, LookupPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS);
		}
		return namedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironment getParentEnv() {
		if (parentEnv != null && parentEnv.eIsProxy()) {
			InternalEObject oldParentEnv = (InternalEObject)parentEnv;
			parentEnv = (LookupEnvironment)eResolveProxy(oldParentEnv);
			if (parentEnv != oldParentEnv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV, oldParentEnv, parentEnv));
			}
		}
		return parentEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironment basicGetParentEnv() {
		return parentEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEnv(LookupEnvironment newParentEnv) {
		LookupEnvironment oldParentEnv = parentEnv;
		parentEnv = newParentEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV, oldParentEnv, parentEnv));
	}

	/**
	 * The cached invocation delegate for the '{@link #addElements(java.util.Collection) <em>Add Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #addElements(java.util.Collection)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ADD_ELEMENTS_COLLECTION__EINVOCATION_DELEGATE = ((EOperation.Internal)LookupPackage.Literals.LOOKUP_ENVIRONMENT___ADD_ELEMENTS__COLLECTION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <NE extends Definition> LookupEnvironment addElements(Collection<NE> elements) {
		try {
			return (LookupEnvironment)ADD_ELEMENTS_COLLECTION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{elements}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #addElements(org.xtext.example.delphi.astm.Definition) <em>Add Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #addElements(org.xtext.example.delphi.astm.Definition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ADD_ELEMENTS_DEFINITION__EINVOCATION_DELEGATE = ((EOperation.Internal)LookupPackage.Literals.LOOKUP_ENVIRONMENT___ADD_ELEMENTS__DEFINITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironment addElements(Definition element) {
		try {
			return (LookupEnvironment)ADD_ELEMENTS_DEFINITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasFinalResult() {
		throw new UnsupportedOperationException("Enviroment::hasFinalResult() has been created for CG purposes. Don't call this method");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		throw new UnsupportedOperationException("Enviroment::getEvaluator() has been created for CG purposes. Don't call this method");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LookupPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				return getNamedElements();
			case LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
				if (resolve) return getParentEnv();
				return basicGetParentEnv();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LookupPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends Definition>)newValue);
				return;
			case LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
				setParentEnv((LookupEnvironment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LookupPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
				setParentEnv((LookupEnvironment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LookupPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case LookupPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
				return parentEnv != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LookupPackage.LOOKUP_ENVIRONMENT___ADD_ELEMENTS__COLLECTION:
				return addElements((Collection)arguments.get(0));
			case LookupPackage.LOOKUP_ENVIRONMENT___ADD_ELEMENTS__DEFINITION:
				return addElements((Definition)arguments.get(0));
			case LookupPackage.LOOKUP_ENVIRONMENT___HAS_FINAL_RESULT:
				return hasFinalResult();
			case LookupPackage.LOOKUP_ENVIRONMENT___GET_EXECUTOR:
				return getExecutor();
		}
		return super.eInvoke(operationID, arguments);
	}


} //LookupEnvironmentImpl
