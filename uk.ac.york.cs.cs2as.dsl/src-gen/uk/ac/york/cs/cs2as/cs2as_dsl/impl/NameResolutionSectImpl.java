/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.Inputs;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers;
import uk.ac.york.cs.cs2as.cs2as_dsl.Targets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Resolution Sect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getTargetsDef <em>Targets Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getInputsDef <em>Inputs Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getProvidersDef <em>Providers Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameResolutionSectImpl extends MinimalEObjectImpl.Container implements NameResolutionSect
{
  /**
   * The cached value of the '{@link #getTargetsDef() <em>Targets Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetsDef()
   * @generated
   * @ordered
   */
  protected Targets targetsDef;

  /**
   * The cached value of the '{@link #getInputsDef() <em>Inputs Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputsDef()
   * @generated
   * @ordered
   */
  protected Inputs inputsDef;

  /**
   * The cached value of the '{@link #getProvidersDef() <em>Providers Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidersDef()
   * @generated
   * @ordered
   */
  protected Providers providersDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameResolutionSectImpl()
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
    return Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Targets getTargetsDef()
  {
    return targetsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetsDef(Targets newTargetsDef, NotificationChain msgs)
  {
    Targets oldTargetsDef = targetsDef;
    targetsDef = newTargetsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF, oldTargetsDef, newTargetsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetsDef(Targets newTargetsDef)
  {
    if (newTargetsDef != targetsDef)
    {
      NotificationChain msgs = null;
      if (targetsDef != null)
        msgs = ((InternalEObject)targetsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF, null, msgs);
      if (newTargetsDef != null)
        msgs = ((InternalEObject)newTargetsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF, null, msgs);
      msgs = basicSetTargetsDef(newTargetsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF, newTargetsDef, newTargetsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inputs getInputsDef()
  {
    return inputsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputsDef(Inputs newInputsDef, NotificationChain msgs)
  {
    Inputs oldInputsDef = inputsDef;
    inputsDef = newInputsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF, oldInputsDef, newInputsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputsDef(Inputs newInputsDef)
  {
    if (newInputsDef != inputsDef)
    {
      NotificationChain msgs = null;
      if (inputsDef != null)
        msgs = ((InternalEObject)inputsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF, null, msgs);
      if (newInputsDef != null)
        msgs = ((InternalEObject)newInputsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF, null, msgs);
      msgs = basicSetInputsDef(newInputsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF, newInputsDef, newInputsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Providers getProvidersDef()
  {
    return providersDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvidersDef(Providers newProvidersDef, NotificationChain msgs)
  {
    Providers oldProvidersDef = providersDef;
    providersDef = newProvidersDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF, oldProvidersDef, newProvidersDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvidersDef(Providers newProvidersDef)
  {
    if (newProvidersDef != providersDef)
    {
      NotificationChain msgs = null;
      if (providersDef != null)
        msgs = ((InternalEObject)providersDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF, null, msgs);
      if (newProvidersDef != null)
        msgs = ((InternalEObject)newProvidersDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF, null, msgs);
      msgs = basicSetProvidersDef(newProvidersDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF, newProvidersDef, newProvidersDef));
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF:
        return basicSetTargetsDef(null, msgs);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF:
        return basicSetInputsDef(null, msgs);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF:
        return basicSetProvidersDef(null, msgs);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF:
        return getTargetsDef();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF:
        return getInputsDef();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF:
        return getProvidersDef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF:
        setTargetsDef((Targets)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF:
        setInputsDef((Inputs)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF:
        setProvidersDef((Providers)newValue);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF:
        setTargetsDef((Targets)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF:
        setInputsDef((Inputs)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF:
        setProvidersDef((Providers)null);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__TARGETS_DEF:
        return targetsDef != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__INPUTS_DEF:
        return inputsDef != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__PROVIDERS_DEF:
        return providersDef != null;
    }
    return super.eIsSet(featureID);
  }

} //NameResolutionSectImpl
