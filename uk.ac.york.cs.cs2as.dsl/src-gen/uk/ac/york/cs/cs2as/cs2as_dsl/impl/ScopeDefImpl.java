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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getContributingProperty <em>Contributing Property</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isPropagatingAll <em>Propagating All</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isPropagatingNexts <em>Propagating Nexts</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getPropagatingProperties <em>Propagating Properties</em>}</li>
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
   * The cached value of the '{@link #getContributingProperty() <em>Contributing Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributingProperty()
   * @generated
   * @ordered
   */
  protected ExpCS contributingProperty;

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
   * The default value of the '{@link #isPropagatingAll() <em>Propagating All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropagatingAll()
   * @generated
   * @ordered
   */
  protected static final boolean PROPAGATING_ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPropagatingAll() <em>Propagating All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropagatingAll()
   * @generated
   * @ordered
   */
  protected boolean propagatingAll = PROPAGATING_ALL_EDEFAULT;

  /**
   * The default value of the '{@link #isPropagatingNexts() <em>Propagating Nexts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropagatingNexts()
   * @generated
   * @ordered
   */
  protected static final boolean PROPAGATING_NEXTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPropagatingNexts() <em>Propagating Nexts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropagatingNexts()
   * @generated
   * @ordered
   */
  protected boolean propagatingNexts = PROPAGATING_NEXTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropagatingProperties() <em>Propagating Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagatingProperties()
   * @generated
   * @ordered
   */
  protected EList<ExpCS> propagatingProperties;

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
  public ExpCS getContributingProperty()
  {
    return contributingProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributingProperty(ExpCS newContributingProperty, NotificationChain msgs)
  {
    ExpCS oldContributingProperty = contributingProperty;
    contributingProperty = newContributingProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY, oldContributingProperty, newContributingProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContributingProperty(ExpCS newContributingProperty)
  {
    if (newContributingProperty != contributingProperty)
    {
      NotificationChain msgs = null;
      if (contributingProperty != null)
        msgs = ((InternalEObject)contributingProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY, null, msgs);
      if (newContributingProperty != null)
        msgs = ((InternalEObject)newContributingProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY, null, msgs);
      msgs = basicSetContributingProperty(newContributingProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY, newContributingProperty, newContributingProperty));
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
  public boolean isPropagatingAll()
  {
    return propagatingAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropagatingAll(boolean newPropagatingAll)
  {
    boolean oldPropagatingAll = propagatingAll;
    propagatingAll = newPropagatingAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_ALL, oldPropagatingAll, propagatingAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPropagatingNexts()
  {
    return propagatingNexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropagatingNexts(boolean newPropagatingNexts)
  {
    boolean oldPropagatingNexts = propagatingNexts;
    propagatingNexts = newPropagatingNexts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_NEXTS, oldPropagatingNexts, propagatingNexts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpCS> getPropagatingProperties()
  {
    if (propagatingProperties == null)
    {
      propagatingProperties = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES);
    }
    return propagatingProperties;
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY:
        return basicSetContributingProperty(null, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return basicSetTypeFilter(null, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES:
        return ((InternalEList<?>)getPropagatingProperties()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY:
        return getContributingProperty();
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return getTypeFilter();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_ALL:
        return isPropagatingAll();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_NEXTS:
        return isPropagatingNexts();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES:
        return getPropagatingProperties();
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY:
        setContributingProperty((ExpCS)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        setTypeFilter((TypedRefCS)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_ALL:
        setPropagatingAll((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_NEXTS:
        setPropagatingNexts((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES:
        getPropagatingProperties().clear();
        getPropagatingProperties().addAll((Collection<? extends ExpCS>)newValue);
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY:
        setContributingProperty((ExpCS)null);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        setTypeFilter((TypedRefCS)null);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_ALL:
        setPropagatingAll(PROPAGATING_ALL_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_NEXTS:
        setPropagatingNexts(PROPAGATING_NEXTS_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES:
        getPropagatingProperties().clear();
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTRIBUTING_PROPERTY:
        return contributingProperty != null;
      case Cs2as_dslPackage.SCOPE_DEF__TYPE_FILTER:
        return typeFilter != null;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_ALL:
        return propagatingAll != PROPAGATING_ALL_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_NEXTS:
        return propagatingNexts != PROPAGATING_NEXTS_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATING_PROPERTIES:
        return propagatingProperties != null && !propagatingProperties.isEmpty();
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
    result.append(", propagatingAll: ");
    result.append(propagatingAll);
    result.append(", propagatingNexts: ");
    result.append(propagatingNexts);
    result.append(')');
    return result.toString();
  }

} //ScopeDefImpl
