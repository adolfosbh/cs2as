/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.formalParameters;
import org.xtext.example.delphi.delphi.functionHeading;
import org.xtext.example.delphi.delphi.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.functionHeadingImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.functionHeadingImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class functionHeadingImpl extends methodHeadingImpl implements functionHeading
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected formalParameters params;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected functionHeadingImpl()
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
    return DelphiPackage.Literals.FUNCTION_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameters getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(formalParameters newParams, NotificationChain msgs)
  {
    formalParameters oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.FUNCTION_HEADING__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(formalParameters newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.FUNCTION_HEADING__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.FUNCTION_HEADING__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.FUNCTION_HEADING__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.FUNCTION_HEADING__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.FUNCTION_HEADING__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.FUNCTION_HEADING__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.FUNCTION_HEADING__TYPE, newType, newType));
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
      case DelphiPackage.FUNCTION_HEADING__PARAMS:
        return basicSetParams(null, msgs);
      case DelphiPackage.FUNCTION_HEADING__TYPE:
        return basicSetType(null, msgs);
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
      case DelphiPackage.FUNCTION_HEADING__PARAMS:
        return getParams();
      case DelphiPackage.FUNCTION_HEADING__TYPE:
        return getType();
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
      case DelphiPackage.FUNCTION_HEADING__PARAMS:
        setParams((formalParameters)newValue);
        return;
      case DelphiPackage.FUNCTION_HEADING__TYPE:
        setType((type)newValue);
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
      case DelphiPackage.FUNCTION_HEADING__PARAMS:
        setParams((formalParameters)null);
        return;
      case DelphiPackage.FUNCTION_HEADING__TYPE:
        setType((type)null);
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
      case DelphiPackage.FUNCTION_HEADING__PARAMS:
        return params != null;
      case DelphiPackage.FUNCTION_HEADING__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //functionHeadingImpl
