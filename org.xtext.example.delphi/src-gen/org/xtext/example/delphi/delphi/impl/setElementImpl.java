/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.expression;
import org.xtext.example.delphi.delphi.setElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>set Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.setElementImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.setElementImpl#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class setElementImpl extends MinimalEObjectImpl.Container implements setElement
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected expression first;

  /**
   * The cached value of the '{@link #getLast() <em>Last</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected expression last;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected setElementImpl()
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
    return DelphiPackage.Literals.SET_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirst(expression newFirst, NotificationChain msgs)
  {
    expression oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.SET_ELEMENT__FIRST, oldFirst, newFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(expression newFirst)
  {
    if (newFirst != first)
    {
      NotificationChain msgs = null;
      if (first != null)
        msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.SET_ELEMENT__FIRST, null, msgs);
      if (newFirst != null)
        msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.SET_ELEMENT__FIRST, null, msgs);
      msgs = basicSetFirst(newFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.SET_ELEMENT__FIRST, newFirst, newFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLast(expression newLast, NotificationChain msgs)
  {
    expression oldLast = last;
    last = newLast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DelphiPackage.SET_ELEMENT__LAST, oldLast, newLast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(expression newLast)
  {
    if (newLast != last)
    {
      NotificationChain msgs = null;
      if (last != null)
        msgs = ((InternalEObject)last).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.SET_ELEMENT__LAST, null, msgs);
      if (newLast != null)
        msgs = ((InternalEObject)newLast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DelphiPackage.SET_ELEMENT__LAST, null, msgs);
      msgs = basicSetLast(newLast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DelphiPackage.SET_ELEMENT__LAST, newLast, newLast));
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
      case DelphiPackage.SET_ELEMENT__FIRST:
        return basicSetFirst(null, msgs);
      case DelphiPackage.SET_ELEMENT__LAST:
        return basicSetLast(null, msgs);
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
      case DelphiPackage.SET_ELEMENT__FIRST:
        return getFirst();
      case DelphiPackage.SET_ELEMENT__LAST:
        return getLast();
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
      case DelphiPackage.SET_ELEMENT__FIRST:
        setFirst((expression)newValue);
        return;
      case DelphiPackage.SET_ELEMENT__LAST:
        setLast((expression)newValue);
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
      case DelphiPackage.SET_ELEMENT__FIRST:
        setFirst((expression)null);
        return;
      case DelphiPackage.SET_ELEMENT__LAST:
        setLast((expression)null);
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
      case DelphiPackage.SET_ELEMENT__FIRST:
        return first != null;
      case DelphiPackage.SET_ELEMENT__LAST:
        return last != null;
    }
    return super.eIsSet(featureID);
  }

} //setElementImpl
