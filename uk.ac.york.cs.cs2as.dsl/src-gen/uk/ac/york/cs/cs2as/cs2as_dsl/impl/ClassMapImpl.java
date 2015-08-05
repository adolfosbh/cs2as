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

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getTo <em>To</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getMappingDef <em>Mapping Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ClassMapImpl#getDisambiguationRules <em>Disambiguation Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassMapImpl extends MinimalEObjectImpl.Container implements ClassMap
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

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
   * The cached value of the '{@link #getDisambiguationRules() <em>Disambiguation Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisambiguationRules()
   * @generated
   * @ordered
   */
  protected EList<DisambiguationMap> disambiguationRules;

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
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__TO, oldTo, to));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF, oldMappingDef, newMappingDef);
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
        msgs = ((InternalEObject)mappingDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF, null, msgs);
      if (newMappingDef != null)
        msgs = ((InternalEObject)newMappingDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF, null, msgs);
      msgs = basicSetMappingDef(newMappingDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF, newMappingDef, newMappingDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DisambiguationMap> getDisambiguationRules()
  {
    if (disambiguationRules == null)
    {
      disambiguationRules = new EObjectContainmentEList<DisambiguationMap>(DisambiguationMap.class, this, Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES);
    }
    return disambiguationRules;
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
      case Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF:
        return basicSetMappingDef(null, msgs);
      case Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES:
        return ((InternalEList<?>)getDisambiguationRules()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        return getFrom();
      case Cs2as_dslPackage.CLASS_MAP__TO:
        return getTo();
      case Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF:
        return getMappingDef();
      case Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES:
        return getDisambiguationRules();
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
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        setFrom((String)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__TO:
        setTo((String)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF:
        setMappingDef((SimpleMap)newValue);
        return;
      case Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES:
        getDisambiguationRules().clear();
        getDisambiguationRules().addAll((Collection<? extends DisambiguationMap>)newValue);
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
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case Cs2as_dslPackage.CLASS_MAP__TO:
        setTo(TO_EDEFAULT);
        return;
      case Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF:
        setMappingDef((SimpleMap)null);
        return;
      case Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES:
        getDisambiguationRules().clear();
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
      case Cs2as_dslPackage.CLASS_MAP__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case Cs2as_dslPackage.CLASS_MAP__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
      case Cs2as_dslPackage.CLASS_MAP__MAPPING_DEF:
        return mappingDef != null;
      case Cs2as_dslPackage.CLASS_MAP__DISAMBIGUATION_RULES:
        return disambiguationRules != null && !disambiguationRules.isEmpty();
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
    result.append(" (from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(')');
    return result.toString();
  }

} //ClassMapImpl
