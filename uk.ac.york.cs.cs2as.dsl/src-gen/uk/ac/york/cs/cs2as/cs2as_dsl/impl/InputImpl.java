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

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.Input;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl#isQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.InputImpl#getPropRef <em>Prop Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input
{
  /**
   * The default value of the '{@link #isQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQualifier()
   * @generated
   * @ordered
   */
  protected static final boolean QUALIFIER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQualifier()
   * @generated
   * @ordered
   */
  protected boolean qualifier = QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected ClassRef classRef;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
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
    return Cs2as_dslPackage.Literals.INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(boolean newQualifier)
  {
    boolean oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.INPUT__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassRef getClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassRef(ClassRef newClassRef, NotificationChain msgs)
  {
    ClassRef oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.INPUT__CLASS_REF, oldClassRef, newClassRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(ClassRef newClassRef)
  {
    if (newClassRef != classRef)
    {
      NotificationChain msgs = null;
      if (classRef != null)
        msgs = ((InternalEObject)classRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.INPUT__CLASS_REF, null, msgs);
      if (newClassRef != null)
        msgs = ((InternalEObject)newClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.INPUT__CLASS_REF, null, msgs);
      msgs = basicSetClassRef(newClassRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.INPUT__CLASS_REF, newClassRef, newClassRef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.INPUT__PROP_REF, oldPropRef, newPropRef);
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
        msgs = ((InternalEObject)propRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.INPUT__PROP_REF, null, msgs);
      if (newPropRef != null)
        msgs = ((InternalEObject)newPropRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.INPUT__PROP_REF, null, msgs);
      msgs = basicSetPropRef(newPropRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.INPUT__PROP_REF, newPropRef, newPropRef));
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
      case Cs2as_dslPackage.INPUT__CLASS_REF:
        return basicSetClassRef(null, msgs);
      case Cs2as_dslPackage.INPUT__PROP_REF:
        return basicSetPropRef(null, msgs);
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
      case Cs2as_dslPackage.INPUT__QUALIFIER:
        return isQualifier();
      case Cs2as_dslPackage.INPUT__CLASS_REF:
        return getClassRef();
      case Cs2as_dslPackage.INPUT__PROP_REF:
        return getPropRef();
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
      case Cs2as_dslPackage.INPUT__QUALIFIER:
        setQualifier((Boolean)newValue);
        return;
      case Cs2as_dslPackage.INPUT__CLASS_REF:
        setClassRef((ClassRef)newValue);
        return;
      case Cs2as_dslPackage.INPUT__PROP_REF:
        setPropRef((PathNameCS)newValue);
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
      case Cs2as_dslPackage.INPUT__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
      case Cs2as_dslPackage.INPUT__CLASS_REF:
        setClassRef((ClassRef)null);
        return;
      case Cs2as_dslPackage.INPUT__PROP_REF:
        setPropRef((PathNameCS)null);
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
      case Cs2as_dslPackage.INPUT__QUALIFIER:
        return qualifier != QUALIFIER_EDEFAULT;
      case Cs2as_dslPackage.INPUT__CLASS_REF:
        return classRef != null;
      case Cs2as_dslPackage.INPUT__PROP_REF:
        return propRef != null;
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
    result.append(" (qualifier: ");
    result.append(qualifier);
    result.append(')');
    return result.toString();
  }

} //InputImpl
