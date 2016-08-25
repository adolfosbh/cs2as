/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionsDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occluding Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl#getContributionsDef <em>Contributions Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccludingDefImpl extends MinimalEObjectImpl.Container implements OccludingDef
{
  /**
   * The cached value of the '{@link #getContributionsDef() <em>Contributions Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributionsDef()
   * @generated
   * @ordered
   */
  protected ContributionsDef contributionsDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccludingDefImpl()
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
    return Cs2as_dslPackage.Literals.OCCLUDING_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionsDef getContributionsDef()
  {
    return contributionsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributionsDef(ContributionsDef newContributionsDef, NotificationChain msgs)
  {
    ContributionsDef oldContributionsDef = contributionsDef;
    contributionsDef = newContributionsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF, oldContributionsDef, newContributionsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContributionsDef(ContributionsDef newContributionsDef)
  {
    if (newContributionsDef != contributionsDef)
    {
      NotificationChain msgs = null;
      if (contributionsDef != null)
        msgs = ((InternalEObject)contributionsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF, null, msgs);
      if (newContributionsDef != null)
        msgs = ((InternalEObject)newContributionsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF, null, msgs);
      msgs = basicSetContributionsDef(newContributionsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF, newContributionsDef, newContributionsDef));
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF:
        return basicSetContributionsDef(null, msgs);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF:
        return getContributionsDef();
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF:
        setContributionsDef((ContributionsDef)newValue);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF:
        setContributionsDef((ContributionsDef)null);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTIONS_DEF:
        return contributionsDef != null;
    }
    return super.eIsSet(featureID);
  }

} //OccludingDefImpl
