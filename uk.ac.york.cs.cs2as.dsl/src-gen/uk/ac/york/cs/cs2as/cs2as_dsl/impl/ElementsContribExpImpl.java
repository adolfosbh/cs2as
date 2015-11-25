/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements Contrib Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#isFollowing <em>Following</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ElementsContribExpImpl#getTypeFilter <em>Type Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementsContribExpImpl extends MinimalEObjectImpl.Container implements ElementsContribExp
{
  /**
   * The default value of the '{@link #isFollowing() <em>Following</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFollowing()
   * @generated
   * @ordered
   */
  protected static final boolean FOLLOWING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFollowing() <em>Following</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFollowing()
   * @generated
   * @ordered
   */
  protected boolean following = FOLLOWING_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected ExpCS expression;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementsContribExpImpl()
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
    return Cs2as_dslPackage.Literals.ELEMENTS_CONTRIB_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFollowing()
  {
    return following;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFollowing(boolean newFollowing)
  {
    boolean oldFollowing = following;
    following = newFollowing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__FOLLOWING, oldFollowing, following));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(ExpCS newExpression, NotificationChain msgs)
  {
    ExpCS oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(ExpCS newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER, oldTypeFilter, newTypeFilter);
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
        msgs = ((InternalEObject)typeFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER, null, msgs);
      if (newTypeFilter != null)
        msgs = ((InternalEObject)newTypeFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER, null, msgs);
      msgs = basicSetTypeFilter(newTypeFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER, newTypeFilter, newTypeFilter));
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return basicSetExpression(null, msgs);
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER:
        return basicSetTypeFilter(null, msgs);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__FOLLOWING:
        return isFollowing();
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return getExpression();
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER:
        return getTypeFilter();
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__FOLLOWING:
        setFollowing((Boolean)newValue);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        setExpression((ExpCS)newValue);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER:
        setTypeFilter((TypedRefCS)newValue);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__FOLLOWING:
        setFollowing(FOLLOWING_EDEFAULT);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        setExpression((ExpCS)null);
        return;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER:
        setTypeFilter((TypedRefCS)null);
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
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__FOLLOWING:
        return following != FOLLOWING_EDEFAULT;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__EXPRESSION:
        return expression != null;
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP__TYPE_FILTER:
        return typeFilter != null;
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
    result.append(" (following: ");
    result.append(following);
    result.append(')');
    return result.toString();
  }

} //ElementsContribExpImpl
