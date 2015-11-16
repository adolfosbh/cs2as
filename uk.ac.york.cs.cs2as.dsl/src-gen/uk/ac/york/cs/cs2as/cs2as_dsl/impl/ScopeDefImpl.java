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

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getContributingProp <em>Contributing Prop</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getPropagatingProp <em>Propagating Prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeDefImpl extends ClassNameResolutionStmntImpl implements ScopeDef
{
  /**
   * The default value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected static final boolean SAME_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected boolean sameScope = SAME_SCOPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContributingProp() <em>Contributing Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributingProp()
   * @generated
   * @ordered
   */
  protected ExpCS contributingProp;

  /**
   * The cached value of the '{@link #getTypeFilter() <em>Type Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeFilter()
   * @generated
   * @ordered
   */
  protected TypedRefCS typeFilter;

  /**
   * The cached value of the '{@link #getPropagatingProp() <em>Propagating Prop</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagatingProp()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> propagatingProp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeDefImpl()
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
    return Cs2as_dslPackage.Literals.SCOPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSameScope()
  {
    return sameScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSameScope(boolean newSameScope)
  {
    boolean oldSameScope = sameScope;
    sameScope = newSameScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE, oldSameScope, sameScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getContributingProp()
  {
    return contributingProp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributingProp(ExpCS newContributingProp, NotificationChain msgs)
  {
    ExpCS oldContributingProp = contributingProp;
    contributingProp = newContributingProp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP, oldContributingProp, newContributingProp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContributingProp(ExpCS newContributingProp)
  {
    if (newContributingProp != contributingProp)
    {
      NotificationChain msgs = null;
      if (contributingProp != null)
        msgs = ((InternalEObject)contributingProp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP, null, msgs);
      if (newContributingProp != null)
        msgs = ((InternalEObject)newContributingProp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP, null, msgs);
      msgs = basicSetContributingProp(newContributingProp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP, newContributingProp, newContributingProp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedRefCS getTypeFilter()
  {
    return typeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeFilter(TypedRefCS newTypeFilter, NotificationChain msgs)
  {
    TypedRefCS oldTypeFilter = typeFilter;
    typeFilter = newTypeFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER, oldTypeFilter, newTypeFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeFilter(TypedRefCS newTypeFilter)
  {
    if (newTypeFilter != typeFilter)
    {
      NotificationChain msgs = null;
      if (typeFilter != null)
        msgs = ((InternalEObject)typeFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER, null, msgs);
      if (newTypeFilter != null)
        msgs = ((InternalEObject)newTypeFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER, null, msgs);
      msgs = basicSetTypeFilter(newTypeFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER, newTypeFilter, newTypeFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getPropagatingProp()
  {
    if (propagatingProp == null)
    {
      propagatingProp = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP);
    }
    return propagatingProp;
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP:
        return basicSetContributingProp(null, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return basicSetTypeFilter(null, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP:
        return ((InternalEList<?>)getPropagatingProp()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return isSameScope();
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP:
        return getContributingProp();
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return getTypeFilter();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP:
        return getPropagatingProp();
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP:
        setContributingProp((ExpCS)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        setTypeFilter((TypedRefCS)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP:
        getPropagatingProp().clear();
        getPropagatingProp().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope(SAME_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP:
        setContributingProp((ExpCS)null);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        setTypeFilter((TypedRefCS)null);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP:
        getPropagatingProp().clear();
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return sameScope != SAME_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROP:
        return contributingProp != null;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return typeFilter != null;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROP:
        return propagatingProp != null && !propagatingProp.isEmpty();
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
    result.append(" (sameScope: ");
    result.append(sameScope);
    result.append(')');
    return result.toString();
  }

} //ScopeDefImpl
