/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.XClass;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassHelperImpl#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassHelperImpl extends MinimalEObjectImpl.Container implements ClassHelper
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected XClass context;

  /**
   * The cached value of the '{@link #getHelpers() <em>Helpers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpers()
   * @generated
   * @ordered
   */
  protected EList<HelperDef> helpers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassHelperImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Cs2as_dslPackage.Literals.CLASS_HELPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (XClass)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.CLASS_HELPER__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(XClass newContext)
  {
    XClass oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_HELPER__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HelperDef> getHelpers()
  {
    if (helpers == null)
    {
      helpers = new EObjectContainmentEList<HelperDef>(HelperDef.class, this, Cs2as_dslPackage.CLASS_HELPER__HELPERS);
    }
    return helpers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CLASS_HELPER__HELPERS:
        return ((InternalEList<?>)getHelpers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CLASS_HELPER__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case Cs2as_dslPackage.CLASS_HELPER__HELPERS:
        return getHelpers();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CLASS_HELPER__CONTEXT:
        setContext((XClass)newValue);
        return;
      case Cs2as_dslPackage.CLASS_HELPER__HELPERS:
        getHelpers().clear();
        getHelpers().addAll((Collection<? extends HelperDef>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CLASS_HELPER__CONTEXT:
        setContext((XClass)null);
        return;
      case Cs2as_dslPackage.CLASS_HELPER__HELPERS:
        getHelpers().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CLASS_HELPER__CONTEXT:
        return context != null;
      case Cs2as_dslPackage.CLASS_HELPER__HELPERS:
        return helpers != null && !helpers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassHelperImpl
