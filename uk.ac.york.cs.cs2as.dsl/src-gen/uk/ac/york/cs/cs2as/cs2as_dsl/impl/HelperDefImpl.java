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
import org.eclipse.emf.ecore.xcore.XParameter;

import org.eclipse.xtext.xbase.XExpression;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperDefImpl#getHelperBody <em>Helper Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperDefImpl extends MinimalEObjectImpl.Container implements HelperDef
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<XParameter> params;

  /**
   * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedType()
   * @generated
   * @ordered
   */
  protected XClass ownedType;

  /**
   * The cached value of the '{@link #getHelperBody() <em>Helper Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelperBody()
   * @generated
   * @ordered
   */
  protected XExpression helperBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelperDefImpl()
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
    return Cs2as_dslPackage.Literals.HELPER_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<XParameter>(XParameter.class, this, Cs2as_dslPackage.HELPER_DEF__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass getOwnedType()
  {
    if (ownedType != null && ownedType.eIsProxy())
    {
      InternalEObject oldOwnedType = (InternalEObject)ownedType;
      ownedType = (XClass)eResolveProxy(oldOwnedType);
      if (ownedType != oldOwnedType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE, oldOwnedType, ownedType));
      }
    }
    return ownedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass basicGetOwnedType()
  {
    return ownedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedType(XClass newOwnedType)
  {
    XClass oldOwnedType = ownedType;
    ownedType = newOwnedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE, oldOwnedType, ownedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getHelperBody()
  {
    return helperBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelperBody(XExpression newHelperBody, NotificationChain msgs)
  {
    XExpression oldHelperBody = helperBody;
    helperBody = newHelperBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_DEF__HELPER_BODY, oldHelperBody, newHelperBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelperBody(XExpression newHelperBody)
  {
    if (newHelperBody != helperBody)
    {
      NotificationChain msgs = null;
      if (helperBody != null)
        msgs = ((InternalEObject)helperBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_DEF__HELPER_BODY, null, msgs);
      if (newHelperBody != null)
        msgs = ((InternalEObject)newHelperBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_DEF__HELPER_BODY, null, msgs);
      msgs = basicSetHelperBody(newHelperBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_DEF__HELPER_BODY, newHelperBody, newHelperBody));
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
      case Cs2as_dslPackage.HELPER_DEF__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.HELPER_DEF__HELPER_BODY:
        return basicSetHelperBody(null, msgs);
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
      case Cs2as_dslPackage.HELPER_DEF__NAME:
        return getName();
      case Cs2as_dslPackage.HELPER_DEF__PARAMS:
        return getParams();
      case Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE:
        if (resolve) return getOwnedType();
        return basicGetOwnedType();
      case Cs2as_dslPackage.HELPER_DEF__HELPER_BODY:
        return getHelperBody();
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
      case Cs2as_dslPackage.HELPER_DEF__NAME:
        setName((String)newValue);
        return;
      case Cs2as_dslPackage.HELPER_DEF__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends XParameter>)newValue);
        return;
      case Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE:
        setOwnedType((XClass)newValue);
        return;
      case Cs2as_dslPackage.HELPER_DEF__HELPER_BODY:
        setHelperBody((XExpression)newValue);
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
      case Cs2as_dslPackage.HELPER_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Cs2as_dslPackage.HELPER_DEF__PARAMS:
        getParams().clear();
        return;
      case Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE:
        setOwnedType((XClass)null);
        return;
      case Cs2as_dslPackage.HELPER_DEF__HELPER_BODY:
        setHelperBody((XExpression)null);
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
      case Cs2as_dslPackage.HELPER_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Cs2as_dslPackage.HELPER_DEF__PARAMS:
        return params != null && !params.isEmpty();
      case Cs2as_dslPackage.HELPER_DEF__OWNED_TYPE:
        return ownedType != null;
      case Cs2as_dslPackage.HELPER_DEF__HELPER_BODY:
        return helperBody != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HelperDefImpl
