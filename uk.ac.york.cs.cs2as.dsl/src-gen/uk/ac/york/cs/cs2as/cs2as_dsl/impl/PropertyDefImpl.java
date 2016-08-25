/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl#isRedefine <em>Redefine</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl#getPropRef <em>Prop Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.PropertyDefImpl#getPropInit <em>Prop Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDefImpl extends MinimalEObjectImpl.Container implements PropertyDef
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
   * The cached value of the '{@link #getPropRef() <em>Prop Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropRef()
   * @generated
   * @ordered
   */
  protected PathNameCS propRef;

  /**
   * The cached value of the '{@link #getPropInit() <em>Prop Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropInit()
   * @generated
   * @ordered
   */
  protected ExpCS propInit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDefImpl()
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
    return Cs2as_dslPackage.Literals.PROPERTY_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_DEF__REDEFINE, oldRedefine, redefine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNameCS getPropRef()
  {
    return propRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropRef(PathNameCS newPropRef, NotificationChain msgs)
  {
    PathNameCS oldPropRef = propRef;
    propRef = newPropRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_DEF__PROP_REF, oldPropRef, newPropRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropRef(PathNameCS newPropRef)
  {
    if (newPropRef != propRef)
    {
      NotificationChain msgs = null;
      if (propRef != null)
        msgs = ((InternalEObject)propRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_DEF__PROP_REF, null, msgs);
      if (newPropRef != null)
        msgs = ((InternalEObject)newPropRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_DEF__PROP_REF, null, msgs);
      msgs = basicSetPropRef(newPropRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_DEF__PROP_REF, newPropRef, newPropRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getPropInit()
  {
    return propInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropInit(ExpCS newPropInit, NotificationChain msgs)
  {
    ExpCS oldPropInit = propInit;
    propInit = newPropInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT, oldPropInit, newPropInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropInit(ExpCS newPropInit)
  {
    if (newPropInit != propInit)
    {
      NotificationChain msgs = null;
      if (propInit != null)
        msgs = ((InternalEObject)propInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT, null, msgs);
      if (newPropInit != null)
        msgs = ((InternalEObject)newPropInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT, null, msgs);
      msgs = basicSetPropInit(newPropInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT, newPropInit, newPropInit));
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
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_REF:
        return basicSetPropRef(null, msgs);
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT:
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
      case Cs2as_dslPackage.PROPERTY_DEF__REDEFINE:
        return isRedefine();
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_REF:
        return getPropRef();
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT:
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
      case Cs2as_dslPackage.PROPERTY_DEF__REDEFINE:
        setRedefine((Boolean)newValue);
        return;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_REF:
        setPropRef((PathNameCS)newValue);
        return;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT:
        setPropInit((ExpCS)newValue);
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
      case Cs2as_dslPackage.PROPERTY_DEF__REDEFINE:
        setRedefine(REDEFINE_EDEFAULT);
        return;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_REF:
        setPropRef((PathNameCS)null);
        return;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT:
        setPropInit((ExpCS)null);
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
      case Cs2as_dslPackage.PROPERTY_DEF__REDEFINE:
        return redefine != REDEFINE_EDEFAULT;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_REF:
        return propRef != null;
      case Cs2as_dslPackage.PROPERTY_DEF__PROP_INIT:
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

} //PropertyDefImpl
