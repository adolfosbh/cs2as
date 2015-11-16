/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl#getNamePoperty <em>Name Poperty</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementDefImpl extends ClassNameResolutionStmntImpl implements NamedElementDef
{
  /**
   * The cached value of the '{@link #getNamePoperty() <em>Name Poperty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePoperty()
   * @generated
   * @ordered
   */
  protected NameExpCS namePoperty;

  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected String qualifier = QUALIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedElementDefImpl()
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
    return Cs2as_dslPackage.Literals.NAMED_ELEMENT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpCS getNamePoperty()
  {
    return namePoperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamePoperty(NameExpCS newNamePoperty, NotificationChain msgs)
  {
    NameExpCS oldNamePoperty = namePoperty;
    namePoperty = newNamePoperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY, oldNamePoperty, newNamePoperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamePoperty(NameExpCS newNamePoperty)
  {
    if (newNamePoperty != namePoperty)
    {
      NotificationChain msgs = null;
      if (namePoperty != null)
        msgs = ((InternalEObject)namePoperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY, null, msgs);
      if (newNamePoperty != null)
        msgs = ((InternalEObject)newNamePoperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY, null, msgs);
      msgs = basicSetNamePoperty(newNamePoperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY, newNamePoperty, newNamePoperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(String newQualifier)
  {
    String oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFIER, oldQualifier, qualifier));
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        return basicSetNamePoperty(null, msgs);
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        return getNamePoperty();
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFIER:
        return getQualifier();
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        setNamePoperty((NameExpCS)newValue);
        return;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFIER:
        setQualifier((String)newValue);
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        setNamePoperty((NameExpCS)null);
        return;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        return namePoperty != null;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFIER:
        return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
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

} //NamedElementDefImpl
