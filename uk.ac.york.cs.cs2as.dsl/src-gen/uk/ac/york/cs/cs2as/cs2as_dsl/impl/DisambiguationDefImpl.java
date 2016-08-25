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

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disambiguation Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DisambiguationDefImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisambiguationDefImpl extends MinimalEObjectImpl.Container implements DisambiguationDef
{
  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected PathNameCS classRef;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<DisambiguationRule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisambiguationDefImpl()
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
    return Cs2as_dslPackage.Literals.DISAMBIGUATION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNameCS getClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassRef(PathNameCS newClassRef, NotificationChain msgs)
  {
    PathNameCS oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF, oldClassRef, newClassRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(PathNameCS newClassRef)
  {
    if (newClassRef != classRef)
    {
      NotificationChain msgs = null;
      if (classRef != null)
        msgs = ((InternalEObject)classRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF, null, msgs);
      if (newClassRef != null)
        msgs = ((InternalEObject)newClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF, null, msgs);
      msgs = basicSetClassRef(newClassRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF, newClassRef, newClassRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DisambiguationRule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<DisambiguationRule>(DisambiguationRule.class, this, Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES);
    }
    return rules;
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
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF:
        return basicSetClassRef(null, msgs);
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF:
        return getClassRef();
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES:
        return getRules();
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
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF:
        setClassRef((PathNameCS)newValue);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends DisambiguationRule>)newValue);
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
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF:
        setClassRef((PathNameCS)null);
        return;
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES:
        getRules().clear();
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
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__CLASS_REF:
        return classRef != null;
      case Cs2as_dslPackage.DISAMBIGUATION_DEF__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DisambiguationDefImpl
