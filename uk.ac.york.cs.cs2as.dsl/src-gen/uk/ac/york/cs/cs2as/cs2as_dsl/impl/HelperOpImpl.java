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

import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl#getOwnedSignature <em>Owned Signature</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.HelperOpImpl#getHelperBody <em>Helper Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperOpImpl extends MinimalEObjectImpl.Container implements HelperOp
{
  /**
   * The cached value of the '{@link #getOwnedSignature() <em>Owned Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSignature()
   * @generated
   * @ordered
   */
  protected TemplateSignatureCS ownedSignature;

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
  protected EList<ParameterCS> params;

  /**
   * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedType()
   * @generated
   * @ordered
   */
  protected TypedRefCS ownedType;

  /**
   * The cached value of the '{@link #getHelperBody() <em>Helper Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelperBody()
   * @generated
   * @ordered
   */
  protected ExpCS helperBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelperOpImpl()
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
    return Cs2as_dslPackage.Literals.HELPER_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignatureCS getOwnedSignature()
  {
    return ownedSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedSignature(TemplateSignatureCS newOwnedSignature, NotificationChain msgs)
  {
    TemplateSignatureCS oldOwnedSignature = ownedSignature;
    ownedSignature = newOwnedSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE, oldOwnedSignature, newOwnedSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedSignature(TemplateSignatureCS newOwnedSignature)
  {
    if (newOwnedSignature != ownedSignature)
    {
      NotificationChain msgs = null;
      if (ownedSignature != null)
        msgs = ((InternalEObject)ownedSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE, null, msgs);
      if (newOwnedSignature != null)
        msgs = ((InternalEObject)newOwnedSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE, null, msgs);
      msgs = basicSetOwnedSignature(newOwnedSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE, newOwnedSignature, newOwnedSignature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterCS> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ParameterCS>(ParameterCS.class, this, Cs2as_dslPackage.HELPER_OP__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedRefCS getOwnedType()
  {
    return ownedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedType(TypedRefCS newOwnedType, NotificationChain msgs)
  {
    TypedRefCS oldOwnedType = ownedType;
    ownedType = newOwnedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__OWNED_TYPE, oldOwnedType, newOwnedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedType(TypedRefCS newOwnedType)
  {
    if (newOwnedType != ownedType)
    {
      NotificationChain msgs = null;
      if (ownedType != null)
        msgs = ((InternalEObject)ownedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__OWNED_TYPE, null, msgs);
      if (newOwnedType != null)
        msgs = ((InternalEObject)newOwnedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__OWNED_TYPE, null, msgs);
      msgs = basicSetOwnedType(newOwnedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__OWNED_TYPE, newOwnedType, newOwnedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getHelperBody()
  {
    return helperBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelperBody(ExpCS newHelperBody, NotificationChain msgs)
  {
    ExpCS oldHelperBody = helperBody;
    helperBody = newHelperBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__HELPER_BODY, oldHelperBody, newHelperBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelperBody(ExpCS newHelperBody)
  {
    if (newHelperBody != helperBody)
    {
      NotificationChain msgs = null;
      if (helperBody != null)
        msgs = ((InternalEObject)helperBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__HELPER_BODY, null, msgs);
      if (newHelperBody != null)
        msgs = ((InternalEObject)newHelperBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.HELPER_OP__HELPER_BODY, null, msgs);
      msgs = basicSetHelperBody(newHelperBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.HELPER_OP__HELPER_BODY, newHelperBody, newHelperBody));
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
      case Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE:
        return basicSetOwnedSignature(null, msgs);
      case Cs2as_dslPackage.HELPER_OP__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.HELPER_OP__OWNED_TYPE:
        return basicSetOwnedType(null, msgs);
      case Cs2as_dslPackage.HELPER_OP__HELPER_BODY:
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
      case Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE:
        return getOwnedSignature();
      case Cs2as_dslPackage.HELPER_OP__NAME:
        return getName();
      case Cs2as_dslPackage.HELPER_OP__PARAMS:
        return getParams();
      case Cs2as_dslPackage.HELPER_OP__OWNED_TYPE:
        return getOwnedType();
      case Cs2as_dslPackage.HELPER_OP__HELPER_BODY:
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
      case Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE:
        setOwnedSignature((TemplateSignatureCS)newValue);
        return;
      case Cs2as_dslPackage.HELPER_OP__NAME:
        setName((String)newValue);
        return;
      case Cs2as_dslPackage.HELPER_OP__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ParameterCS>)newValue);
        return;
      case Cs2as_dslPackage.HELPER_OP__OWNED_TYPE:
        setOwnedType((TypedRefCS)newValue);
        return;
      case Cs2as_dslPackage.HELPER_OP__HELPER_BODY:
        setHelperBody((ExpCS)newValue);
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
      case Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE:
        setOwnedSignature((TemplateSignatureCS)null);
        return;
      case Cs2as_dslPackage.HELPER_OP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Cs2as_dslPackage.HELPER_OP__PARAMS:
        getParams().clear();
        return;
      case Cs2as_dslPackage.HELPER_OP__OWNED_TYPE:
        setOwnedType((TypedRefCS)null);
        return;
      case Cs2as_dslPackage.HELPER_OP__HELPER_BODY:
        setHelperBody((ExpCS)null);
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
      case Cs2as_dslPackage.HELPER_OP__OWNED_SIGNATURE:
        return ownedSignature != null;
      case Cs2as_dslPackage.HELPER_OP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Cs2as_dslPackage.HELPER_OP__PARAMS:
        return params != null && !params.isEmpty();
      case Cs2as_dslPackage.HELPER_OP__OWNED_TYPE:
        return ownedType != null;
      case Cs2as_dslPackage.HELPER_OP__HELPER_BODY:
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

} //HelperOpImpl
