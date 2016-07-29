/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occluding Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.OccludingDefImpl#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccludingDefImpl extends MinimalEObjectImpl.Container implements OccludingDef
{
  /**
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected ContributionDef contribution;

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
  public ContributionDef getContribution()
  {
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContribution(ContributionDef newContribution, NotificationChain msgs)
  {
    ContributionDef oldContribution = contribution;
    contribution = newContribution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION, oldContribution, newContribution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContribution(ContributionDef newContribution)
  {
    if (newContribution != contribution)
    {
      NotificationChain msgs = null;
      if (contribution != null)
        msgs = ((InternalEObject)contribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION, null, msgs);
      if (newContribution != null)
        msgs = ((InternalEObject)newContribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION, null, msgs);
      msgs = basicSetContribution(newContribution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION, newContribution, newContribution));
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION:
        return basicSetContribution(null, msgs);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION:
        return getContribution();
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION:
        setContribution((ContributionDef)newValue);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION:
        setContribution((ContributionDef)null);
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
      case Cs2as_dslPackage.OCCLUDING_DEF__CONTRIBUTION:
        return contribution != null;
    }
    return super.eIsSet(featureID);
  }

} //OccludingDefImpl
