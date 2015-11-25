/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl.LookupEnvironmentImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.lookup.impl.LookupEnvironmentImpl#getParentEnv <em>Parent Env</em>}</li>
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
	protected EList<NamedElement> namedElements;

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
		return LookupEnvironmentPackage.Literals.LOOKUP_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV, oldParentEnv, parentEnv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV, oldParentEnv, parentEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <NE extends NamedElement> LookupEnvironment addElements(final EList<NE> elements) {
		/**
		 * 
		 * LookupEnvironment{
		 *   namedElements = namedElements->includingAll(elements), parentEnv = parentEnv
		 * }
		 */
		final @NonNull /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final @NonNull /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final @NonNull /*@NonInvalid*/ Property CTORid_namedElements = idResolver.getProperty(LookupEnvironmentTables.PROPid_namedElements);
		final @NonNull /*@NonInvalid*/ Property CTORid_parentEnv = idResolver.getProperty(LookupEnvironmentTables.PROPid_parentEnv);
		final @NonNull /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(LookupEnvironmentTables.CLSSid_LookupEnvironment, null);
		final @NonNull /*@Thrown*/ LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
		@SuppressWarnings("null")
		final @NonNull /*@Thrown*/ List<NamedElement> namedElements = this.getNamedElements();
		final @NonNull /*@Thrown*/ OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(LookupEnvironmentTables.ORD_CLSSid_NamedElement, namedElements);
		final @NonNull /*@NonInvalid*/ OrderedSetValue BOXED_elements = idResolver.createOrderedSetOfAll(LookupEnvironmentTables.ORD_TMPLid_, elements);
		final @NonNull /*@Thrown*/ CollectionValue includingAll = CollectionIncludingAllOperation.INSTANCE.evaluate(BOXED_namedElements, BOXED_elements);
		final List<? extends Object> UNBOXED_includingAll = includingAll.asEcoreObjects(idResolver, Object.class);
		assert UNBOXED_includingAll != null;
		CTORid_namedElements.initValue(symbol_0, UNBOXED_includingAll);
		final @Nullable /*@Thrown*/ LookupEnvironment parentEnv = this.getParentEnv();
		CTORid_parentEnv.initValue(symbol_0, parentEnv);
		return symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupEnvironment addElement(final NamedElement element) {
		/**
		 * 
		 * LookupEnvironment{
		 *   namedElements = namedElements->including(element), parentEnv = parentEnv
		 * }
		 */
		final @NonNull /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final @NonNull /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final @NonNull /*@NonInvalid*/ Property CTORid_namedElements = idResolver.getProperty(LookupEnvironmentTables.PROPid_namedElements);
		final @NonNull /*@NonInvalid*/ Property CTORid_parentEnv = idResolver.getProperty(LookupEnvironmentTables.PROPid_parentEnv);
		final @NonNull /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(LookupEnvironmentTables.CLSSid_LookupEnvironment, null);
		final @NonNull /*@Thrown*/ LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
		@SuppressWarnings("null")
		final @NonNull /*@Thrown*/ List<NamedElement> namedElements = this.getNamedElements();
		final @NonNull /*@Thrown*/ OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(LookupEnvironmentTables.ORD_CLSSid_NamedElement, namedElements);
		final @NonNull /*@Thrown*/ OrderedSetValue including = (OrderedSetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_namedElements, element);
		final List<NamedElement> UNBOXED_including = including.asEcoreObjects(idResolver, NamedElement.class);
		assert UNBOXED_including != null;
		CTORid_namedElements.initValue(symbol_0, UNBOXED_including);
		final @Nullable /*@Thrown*/ LookupEnvironment parentEnv = this.getParentEnv();
		CTORid_parentEnv.initValue(symbol_0, parentEnv);
		return symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasFinalResult() {
		throw new UnsupportedOperationException("LookupEnvironment::hasFinalResult() has been created for CG purposes. Don't call this method");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		throw new UnsupportedOperationException("LookupEnvironment::getEvaluator() has been created for CG purposes. Don't call this method");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				return getNamedElements();
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
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
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
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
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
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
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT__PARENT_ENV:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT___ADD_ELEMENTS__ELIST:
				return addElements((EList)arguments.get(0));
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT___ADD_ELEMENT__NAMEDELEMENT:
				return addElement((NamedElement)arguments.get(0));
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT___HAS_FINAL_RESULT:
				return hasFinalResult();
			case LookupEnvironmentPackage.LOOKUP_ENVIRONMENT___GET_EXECUTOR:
				return getExecutor();
		}
		return super.eInvoke(operationID, arguments);
	}


} //LookupEnvironmentImpl
