/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disambiguation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationMapImpl#getMappingDef <em>Mapping Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisambiguationMapImpl extends MinimalEObjectImpl.Container implements DisambiguationMap
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected ExpCS rule;

  /**
   * The default value of the '{@link #getProduces() <em>Produces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduces()
   * @generated
   * @ordered
   */
  protected static final String PRODUCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduces()
   * @generated
   * @ordered
   */
  protected String produces = PRODUCES_EDEFAULT;

  /**
   * The cached value of the '{@link #getMappingDef() <em>Mapping Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingDef()
   * @generated
   * @ordered
   */
  protected SimpleMap mappingDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisambiguationMapImpl()
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
    return Cs2as_dslPackage.Literals.DISAMBIGUATION_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(ExpCS newRule, NotificationChain msgs)
  {
    ExpCS oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(ExpCS newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE, newRule, newRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProduces()
  {
    return produces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduces(String newProduces)
  {
    String oldProduces = produces;
    produces = newProduces;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_MAP__PRODUCES, oldProduces, produces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMap getMappingDef()
  {
    return mappingDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappingDef(SimpleMap newMappingDef, NotificationChain msgs)
  {
    SimpleMap oldMappingDef = mappingDef;
    mappingDef = newMappingDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF, oldMappingDef, newMappingDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingDef(SimpleMap newMappingDef)
  {
    if (newMappingDef != mappingDef)
    {
      NotificationChain msgs = null;
      if (mappingDef != null)
        msgs = ((InternalEObject)mappingDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF, null, msgs);
      if (newMappingDef != null)
        msgs = ((InternalEObject)newMappingDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF, null, msgs);
      msgs = basicSetMappingDef(newMappingDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF, newMappingDef, newMappingDef));
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
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE:
        return basicSetRule(null, msgs);
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF:
        return basicSetMappingDef(null, msgs);
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
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE:
        return getRule();
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__PRODUCES:
        return getProduces();
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF:
        return getMappingDef();
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
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE:
        setRule((ExpCS)newValue);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__PRODUCES:
        setProduces((String)newValue);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF:
        setMappingDef((SimpleMap)newValue);
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
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE:
        setRule((ExpCS)null);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__PRODUCES:
        setProduces(PRODUCES_EDEFAULT);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF:
        setMappingDef((SimpleMap)null);
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
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__RULE:
        return rule != null;
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__PRODUCES:
        return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
      case Cs2as_dslPackage.DISAMBIGUATION_MAP__MAPPING_DEF:
        return mappingDef != null;
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
    result.append(" (produces: ");
    result.append(produces);
    result.append(')');
    return result.toString();
  }

} //DisambiguationMapImpl
