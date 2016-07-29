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

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getTo <em>To</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getSXQualifiedNametatements <em>SX Qualified Nametatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassMapImpl extends MinimalEObjectImpl.Container implements ClassMap
{
  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected XClass to;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected XClass from;

  /**
   * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected static final String RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected String rule = RULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSXQualifiedNametatements() <em>SX Qualified Nametatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSXQualifiedNametatements()
   * @generated
   * @ordered
   */
  protected EList<ClassMapStmnt> sXQualifiedNametatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassMapImpl()
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
    return Cs2as_dslPackage.Literals.CLASS_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (XClass)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.CLASS_MAP__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(XClass newTo)
  {
    XClass oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (XClass)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.CLASS_MAP__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(XClass newFrom)
  {
    XClass oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(String newRule)
  {
    String oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassMapStmnt> getSXQualifiedNametatements()
  {
    if (sXQualifiedNametatements == null)
    {
      sXQualifiedNametatements = new EObjectContainmentEList<ClassMapStmnt>(ClassMapStmnt.class, this, Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS);
    }
    return sXQualifiedNametatements;
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
      case Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS:
        return ((InternalEList<?>)getSXQualifiedNametatements()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.CLASS_MAP__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case Cs2as_dslPackage.CLASS_MAP__RULE:
        return getRule();
      case Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS:
        return getSXQualifiedNametatements();
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
      case Cs2as_dslPackage.CLASS_MAP__TO:
        setTo((XClass)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        setFrom((XClass)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__RULE:
        setRule((String)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS:
        getSXQualifiedNametatements().clear();
        getSXQualifiedNametatements().addAll((Collection<? extends ClassMapStmnt>)newValue);
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
      case Cs2as_dslPackage.CLASS_MAP__TO:
        setTo((XClass)null);
        return;
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        setFrom((XClass)null);
        return;
      case Cs2as_dslPackage.CLASS_MAP__RULE:
        setRule(RULE_EDEFAULT);
        return;
      case Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS:
        getSXQualifiedNametatements().clear();
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
      case Cs2as_dslPackage.CLASS_MAP__TO:
        return to != null;
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        return from != null;
      case Cs2as_dslPackage.CLASS_MAP__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
      case Cs2as_dslPackage.CLASS_MAP__SX_QUALIFIED_NAMETATEMENTS:
        return sXQualifiedNametatements != null && !sXQualifiedNametatements.isEmpty();
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
    result.append(" (rule: ");
    result.append(rule);
    result.append(')');
    return result.toString();
  }

} //ClassMapImpl
