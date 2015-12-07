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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl#getNamePoperty <em>Name Poperty</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NamedElementDefImpl#getQualifications <em>Qualifications</em>}</li>
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
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected FilterDef filter;

  /**
   * The cached value of the '{@link #getQualifications() <em>Qualifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifications()
   * @generated
   * @ordered
   */
  protected EList<QualificationDef> qualifications;

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
  public FilterDef getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(FilterDef newFilter, NotificationChain msgs)
  {
    FilterDef oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(FilterDef newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualificationDef> getQualifications()
  {
    if (qualifications == null)
    {
      qualifications = new EObjectContainmentEList<QualificationDef>(QualificationDef.class, this, Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS);
    }
    return qualifications;
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER:
        return basicSetFilter(null, msgs);
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS:
        return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER:
        return getFilter();
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS:
        return getQualifications();
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__NAME_POPERTY:
        setNamePoperty((NameExpCS)newValue);
        return;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER:
        setFilter((FilterDef)newValue);
        return;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS:
        getQualifications().clear();
        getQualifications().addAll((Collection<? extends QualificationDef>)newValue);
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER:
        setFilter((FilterDef)null);
        return;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS:
        getQualifications().clear();
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
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__FILTER:
        return filter != null;
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF__QUALIFICATIONS:
        return qualifications != null && !qualifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NamedElementDefImpl
