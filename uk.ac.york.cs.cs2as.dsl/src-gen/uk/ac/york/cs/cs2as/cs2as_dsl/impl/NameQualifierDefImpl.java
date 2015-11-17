/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Qualifier Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameQualifierDefImpl#getNameQualifier <em>Name Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameQualifierDefImpl#getSegmentsProp <em>Segments Prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameQualifierDefImpl extends MinimalEObjectImpl.Container implements NameQualifierDef
{
  /**
   * The default value of the '{@link #getNameQualifier() <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameQualifier()
   * @generated
   * @ordered
   */
  protected static final String NAME_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameQualifier() <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameQualifier()
   * @generated
   * @ordered
   */
  protected String nameQualifier = NAME_QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSegmentsProp() <em>Segments Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegmentsProp()
   * @generated
   * @ordered
   */
  protected NameExpCS segmentsProp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameQualifierDefImpl()
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
    return Cs2as_dslPackage.Literals.NAME_QUALIFIER_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameQualifier()
  {
    return nameQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameQualifier(String newNameQualifier)
  {
    String oldNameQualifier = nameQualifier;
    nameQualifier = newNameQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_QUALIFIER_DEF__NAME_QUALIFIER, oldNameQualifier, nameQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpCS getSegmentsProp()
  {
    return segmentsProp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSegmentsProp(NameExpCS newSegmentsProp, NotificationChain msgs)
  {
    NameExpCS oldSegmentsProp = segmentsProp;
    segmentsProp = newSegmentsProp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP, oldSegmentsProp, newSegmentsProp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSegmentsProp(NameExpCS newSegmentsProp)
  {
    if (newSegmentsProp != segmentsProp)
    {
      NotificationChain msgs = null;
      if (segmentsProp != null)
        msgs = ((InternalEObject)segmentsProp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP, null, msgs);
      if (newSegmentsProp != null)
        msgs = ((InternalEObject)newSegmentsProp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP, null, msgs);
      msgs = basicSetSegmentsProp(newSegmentsProp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP, newSegmentsProp, newSegmentsProp));
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
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP:
        return basicSetSegmentsProp(null, msgs);
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
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__NAME_QUALIFIER:
        return getNameQualifier();
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP:
        return getSegmentsProp();
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
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__NAME_QUALIFIER:
        setNameQualifier((String)newValue);
        return;
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP:
        setSegmentsProp((NameExpCS)newValue);
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
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__NAME_QUALIFIER:
        setNameQualifier(NAME_QUALIFIER_EDEFAULT);
        return;
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP:
        setSegmentsProp((NameExpCS)null);
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
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__NAME_QUALIFIER:
        return NAME_QUALIFIER_EDEFAULT == null ? nameQualifier != null : !NAME_QUALIFIER_EDEFAULT.equals(nameQualifier);
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF__SEGMENTS_PROP:
        return segmentsProp != null;
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
    result.append(" (nameQualifier: ");
    result.append(nameQualifier);
    result.append(')');
    return result.toString();
  }

} //NameQualifierDefImpl
