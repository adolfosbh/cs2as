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

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Helper</b></em>'.
 * <!-- end-user-doc -->
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
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected PathNameCS context;

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
  public PathNameCS getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(PathNameCS newContext, NotificationChain msgs)
  {
    PathNameCS oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_HELPER__CONTEXT, oldContext, newContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(PathNameCS newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_HELPER__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_HELPER__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_HELPER__CONTEXT, newContext, newContext));
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
      case Cs2as_dslPackage.CLASS_HELPER__CONTEXT:
        return basicSetContext(null, msgs);
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
        return getContext();
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
        setContext((PathNameCS)newValue);
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
        setContext((PathNameCS)null);
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
