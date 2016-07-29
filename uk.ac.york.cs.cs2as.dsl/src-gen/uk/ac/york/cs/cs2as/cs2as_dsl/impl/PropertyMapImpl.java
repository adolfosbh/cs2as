/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.xcore.XStructuralFeature;

import org.eclipse.xtext.xbase.XExpression;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl#isRedefine <em>Redefine</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyMapImpl#getPropInit <em>Prop Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyMapImpl extends ClassMapStmntImpl implements PropertyMap
{
  /**
   * The default value of the '{@link #isRedefine() <em>Redefine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRedefine()
   * @generated
   * @ordered
   */
  protected static final boolean REDEFINE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRedefine() <em>Redefine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRedefine()
   * @generated
   * @ordered
   */
  protected boolean redefine = REDEFINE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropName() <em>Prop Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropName()
   * @generated
   * @ordered
   */
  protected XStructuralFeature propName;

  /**
   * The cached value of the '{@link #getPropInit() <em>Prop Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropInit()
   * @generated
   * @ordered
   */
  protected XExpression propInit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyMapImpl()
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
    return Cs2as_dslPackage.Literals.PROPERTY_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRedefine()
  {
    return redefine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRedefine(boolean newRedefine)
  {
    boolean oldRedefine = redefine;
    redefine = newRedefine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_MAP__REDEFINE, oldRedefine, redefine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XStructuralFeature getPropName()
  {
    if (propName != null && propName.eIsProxy())
    {
      InternalEObject oldPropName = (InternalEObject)propName;
      propName = (XStructuralFeature)eResolveProxy(oldPropName);
      if (propName != oldPropName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME, oldPropName, propName));
      }
    }
    return propName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XStructuralFeature basicGetPropName()
  {
    return propName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropName(XStructuralFeature newPropName)
  {
    XStructuralFeature oldPropName = propName;
    propName = newPropName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME, oldPropName, propName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPropInit()
  {
    return propInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropInit(XExpression newPropInit, NotificationChain msgs)
  {
    XExpression oldPropInit = propInit;
    propInit = newPropInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT, oldPropInit, newPropInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropInit(XExpression newPropInit)
  {
    if (newPropInit != propInit)
    {
      NotificationChain msgs = null;
      if (propInit != null)
        msgs = ((InternalEObject)propInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT, null, msgs);
      if (newPropInit != null)
        msgs = ((InternalEObject)newPropInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT, null, msgs);
      msgs = basicSetPropInit(newPropInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT, newPropInit, newPropInit));
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
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT:
        return basicSetPropInit(null, msgs);
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
      case Cs2as_dslPackage.PROPERTY_MAP__REDEFINE:
        return isRedefine();
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME:
        if (resolve) return getPropName();
        return basicGetPropName();
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT:
        return getPropInit();
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
      case Cs2as_dslPackage.PROPERTY_MAP__REDEFINE:
        setRedefine((Boolean)newValue);
        return;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME:
        setPropName((XStructuralFeature)newValue);
        return;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT:
        setPropInit((XExpression)newValue);
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
      case Cs2as_dslPackage.PROPERTY_MAP__REDEFINE:
        setRedefine(REDEFINE_EDEFAULT);
        return;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME:
        setPropName((XStructuralFeature)null);
        return;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT:
        setPropInit((XExpression)null);
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
      case Cs2as_dslPackage.PROPERTY_MAP__REDEFINE:
        return redefine != REDEFINE_EDEFAULT;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_NAME:
        return propName != null;
      case Cs2as_dslPackage.PROPERTY_MAP__PROP_INIT:
        return propInit != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (redefine: ");
    result.append(redefine);
    result.append(')');
    return result.toString();
  }

} //PropertyMapImpl
