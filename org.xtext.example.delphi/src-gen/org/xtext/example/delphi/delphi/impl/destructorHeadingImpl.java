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
import org.xtext.example.delphi.delphi.destructorHeading;
import org.xtext.example.delphi.delphi.formalParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>destructor Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.destructorHeadingImpl#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class destructorHeadingImpl extends methodHeadingImpl implements destructorHeading
{
  /**
   * The cached value of the '{@link #getFormalParams() <em>Formal Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParams()
   * @generated
   * @ordered
   */
  protected formalParameters formalParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected destructorHeadingImpl()
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
    return DelphiPackage.Literals.DESTRUCTOR_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameters getFormalParams()
  {
    return formalParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalParams(formalParameters newFormalParams, NotificationChain msgs)
  {
    formalParameters oldFormalParams = formalParams;
    formalParams = newFormalParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS, oldFormalParams, newFormalParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalParams(formalParameters newFormalParams)
  {
    if (newFormalParams != formalParams)
    {
      NotificationChain msgs = null;
      if (formalParams != null)
        msgs = ((InternalEObject)formalParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS, null, msgs);
      if (newFormalParams != null)
        msgs = ((InternalEObject)newFormalParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS, null, msgs);
      msgs = basicSetFormalParams(newFormalParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS, newFormalParams, newFormalParams));
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
      case DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS:
        return basicSetFormalParams(null, msgs);
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
      case DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS:
        return getFormalParams();
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
      case DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS:
        setFormalParams((formalParameters)newValue);
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
      case DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS:
        setFormalParams((formalParameters)null);
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
      case DelphiPackage.DESTRUCTOR_HEADING__FORMAL_PARAMS:
        return formalParams != null;
    }
    return super.eIsSet(featureID);
  }

} //destructorHeadingImpl
